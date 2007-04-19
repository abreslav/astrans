package ru.ifmo.rain.astrans.interpreter.backtrans;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;

import org.antlr.stringtemplate.AttributeRenderer;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astransformation.BasicTypeName;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.astransformation.impl.BasicTypeNameImpl;
import ru.ifmo.rain.astrans.astransformation.impl.ClassNameImpl;

public class BacktransCodeGenerator {

	private static abstract class Generator {

		public final void generate(Transformation transformation, String targetPackage, String outputDirectory) throws IOException {
			Reader reader = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(getTemplatePath()));
			StringTemplateGroup group = new StringTemplateGroup(reader);
			StringTemplate mainTemplate = group.getInstanceOf("main");
			mainTemplate.setAttribute("transformation", transformation);

			final ImportManager importManager = new ImportManager(targetPackage);
			mainTemplate.registerRenderer(ClassNameImpl.class, new AttributeRenderer() {
				public String toString(Object o) {
					String name = ((ClassName) o).getName();
					importManager.addImport(name);
					return importManager.getImportedName(name);
				}
			});
			mainTemplate.registerRenderer(BasicTypeNameImpl.class, new AttributeRenderer() {
				public String toString(Object o) {
					return ((BasicTypeName) o).getType().getName();
				}
			});
			
			importManager.addImport(targetPackage + "." + transformation.getName());
			importManager.addImport(targetPackage + "." + transformation.getResolverClassName());
			importManager.addImport(targetPackage + "." + transformation.getTraceClassName());
			addCustomImports(importManager, transformation);
			
			FileWriter writer = null;
			try {
				writer = new FileWriter(outputDirectory + "/" + getFileName(transformation, importManager));
				writer.write("package " + targetPackage + ";\n");
				String code = mainTemplate.toString();
				writer.write(importManager.computeSortedImports());
				writer.write(code);
			} finally {
				if (writer != null) {
					writer.close();
				}
			}		
		}

		protected void addCustomImports(final ImportManager importManager, Transformation transformation) {
			
		}

		protected abstract String getTemplatePath();
		protected abstract String getFileName(Transformation transformation, ImportManager importManager);

	}
	
	private static class TransformationGenerator extends Generator {

		private static final String TEMPLATE = "ru/ifmo/rain/astrans/interpreter/backtrans/backtrans.stg";

		@Override
		protected void addCustomImports(ImportManager importManager, Transformation transformation) {
			importManager.addImport(Iterator.class.getCanonicalName());
			importManager.addImport(Runnable.class.getCanonicalName());
			importManager.addImport(EList.class.getCanonicalName());
			importManager.addImport(EObject.class.getCanonicalName());
			importManager.addImport("ru.ifmo.rain.astrans.asttomodel.ITransformationContextFactory");
			importManager.addImport("ru.ifmo.rain.astrans.asttomodel.ASTToModelTransformation");
		}

		@Override
		protected String getFileName(Transformation transformation, ImportManager importManager) {
			return transformation.getName() + ".java";
		}

		@Override
		protected String getTemplatePath() {
			return TEMPLATE;
		}
		
	}
	
	private static class TraceGenerator extends Generator {

		private static final String TEMPLATE = "ru/ifmo/rain/astrans/interpreter/backtrans/trace.stg";

		@Override
		protected String getFileName(Transformation transformation, ImportManager importManager) {
			return transformation.getTraceClassName() + ".java";
		}

		@Override
		protected String getTemplatePath() {
			return TEMPLATE;
		}
		
	}
	
	private static class ResolverGenerator extends Generator {

		private static final String TEMPLATE = "ru/ifmo/rain/astrans/interpreter/backtrans/resolver.stg";

		@Override
		protected String getFileName(Transformation transformation, ImportManager importManager) {
			return transformation.getResolverClassName() + ".java";
		}

		@Override
		protected String getTemplatePath() {
			return TEMPLATE;
		}
		
	}
	
	public static void generate(Transformation transformation, String targetPackage, String outputDirectory) throws IOException {
		new TransformationGenerator().generate(transformation, targetPackage, outputDirectory);
		new TraceGenerator().generate(transformation, targetPackage, outputDirectory);
		new ResolverGenerator().generate(transformation, targetPackage, outputDirectory);
	}
}
