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

import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.astransformation.impl.ClassNameImpl;

public class BacktransCodeGenerator {
	
	public static void generate(Transformation transformation, String targetPackage, String resultFileName) throws IOException {
		
		Reader reader = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("ru/ifmo/rain/astrans/interpreter/backtrans/backtrans.stg"));
		StringTemplateGroup group = new StringTemplateGroup(reader);
		StringTemplate mainTemplate = group.getInstanceOf("main");
		mainTemplate.setAttribute("transformation", transformation);
		mainTemplate.setAttribute("package", targetPackage);

		final ImportManager importManager = new ImportManager(targetPackage);
		mainTemplate.registerRenderer(ClassNameImpl.class, new AttributeRenderer() {
			public String toString(Object o) {
				String name = ((ClassName) o).getName();
				importManager.addImport(name);
				return importManager.getImportedName(name);
			}
		});
		
		importManager.addImport(Iterator.class.getCanonicalName());
		importManager.addImport(Runnable.class.getCanonicalName());
		importManager.addImport(EList.class.getCanonicalName());
		importManager.addImport(EObject.class.getCanonicalName());
		importManager.addImport("ru.ifmo.rain.astrans.asttomodel.ASTToModelTransformation");
		
		FileWriter writer = null;
		try {
			writer = new FileWriter(resultFileName);
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
}
