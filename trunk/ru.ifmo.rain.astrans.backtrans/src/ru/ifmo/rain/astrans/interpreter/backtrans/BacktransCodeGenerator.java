package ru.ifmo.rain.astrans.interpreter.backtrans;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;

import org.antlr.stringtemplate.AttributeRenderer;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateErrorListener;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astransformation.AssignReference;
import ru.ifmo.rain.astrans.astransformation.BasicTypeName;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.ResolveObjects;
import ru.ifmo.rain.astrans.astransformation.Transformation;

public class BacktransCodeGenerator {

	private static abstract class Generator {
		
		private static final StringTemplateErrorListener ERROR_LISTENER = new StringTemplateErrorListener() {
			public void error(String msg, Throwable e) {
				throw new RuntimeException(msg, e); 
			}
			public void warning(String msg) {
				throw new RuntimeException(msg); 
			}
		};

		public final void generate(Transformation transformation, String targetPackage, String outputDirectory) throws IOException {
			Reader reader = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(getTemplatePath()));
			StringTemplateGroup group = new StringTemplateGroup(reader);

			group.setErrorListener(ERROR_LISTENER);
			
			final ImportManager importManager = new ImportManager(targetPackage);
			group.registerRenderer(ClassName.class, new AttributeRenderer() {
				public String toString(Object o) {
					String name = ((ClassName) o).getName();
					importManager.addImport(name);
					return importManager.getImportedName(name);
				}
			});
			group.registerRenderer(BasicTypeName.class, new AttributeRenderer() {
				public String toString(Object o) {
					return ((BasicTypeName) o).getType().getName();
				}
			});
			registerAdditionalRenderers(group);
			
			importManager.addImport(targetPackage + "." + transformation.getName());
			importManager.addImport(targetPackage + "." + transformation.getResolverClassName());
			importManager.addImport(targetPackage + "." + transformation.getTraceClassName());
			addCustomImports(importManager, transformation);
			
			StringTemplate mainTemplate = group.getInstanceOf("main");
			mainTemplate.setAttribute("transformation", transformation);
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

		protected void registerAdditionalRenderers(StringTemplateGroup group) {
			
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
		
		@Override
		protected void registerAdditionalRenderers(final StringTemplateGroup group) {
			group.registerRenderer(AssignReference.class, new TemplateAttributeRenderer(group, "renderAssignReference") {
				@Override
				protected void setAdditionalAttributes(Object o, StringTemplate template) {
					template.setAttribute("rule", ((AssignReference) o).eContainer());
				}
			});
			group.registerRenderer(ResolveObjects.class, new TemplateAttributeRenderer(group, "renderResolveObjects") {
				@Override
				protected void setAdditionalAttributes(Object o, StringTemplate template) {
					template.setAttribute("rule", ((ResolveObjects) o).eContainer());
				}
			});
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
