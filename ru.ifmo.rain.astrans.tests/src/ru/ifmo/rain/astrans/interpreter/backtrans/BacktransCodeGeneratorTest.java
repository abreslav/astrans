package ru.ifmo.rain.astrans.interpreter.backtrans;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.utils.EMFHelper;
import utils.FileUtils;
import utils.IFileProcessor;

@RunWith(Parameterized.class)
public class BacktransCodeGeneratorTest {
	@Parameters
	public static Collection<Object[]> parameters() {
		return FileUtils.processDirectory("testData/backtranscodegen", new IFileProcessor() {
			public Object[] process(File file) {
				return new Object[] {
						file.getPath() + "/Transformation.xmi",
						file.getPath(),
					};
			}
		});
	}
	
	private String transformationFileName;
	private String dataDir;
	
	public BacktransCodeGeneratorTest(String transformationFileName, String resultFileName) {
		super();
		this.transformationFileName = transformationFileName;
		this.dataDir = resultFileName;
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testRun() throws IOException {
		Resource transfomationResource = EMFHelper.getXMIResource(AstransformationPackage.eINSTANCE, transformationFileName);
		EMFHelper.loadResourceFromFile(transfomationResource, transformationFileName);
		Transformation transformation = (Transformation) transfomationResource.getContents().get(0);
		
		BacktransCodeGenerator.generate(transformation, "ru.astrans", dataDir);

		FileUtils.assertEqualFiles("transformation", dataDir + "/expected.java", dataDir + "/" + transformation.getName() + ".java");
		FileUtils.assertEqualFiles("trace", dataDir + "/expectedTrace.java", dataDir + "/" + transformation.getTraceClassName() + ".java");
		FileUtils.assertEqualFiles("resolver", dataDir + "/expectedResolver.java", dataDir + "/" + transformation.getResolverClassName() + ".java");
	}

	@Test
	public void testIM() {
		ImportManager manager = new ImportManager("ru");
		manager.addImport("ru.SomeClass");
		manager.addImport("ru.amse.SomeClass");
		assertEquals("SomeClass", manager.getImportedName("ru.SomeClass"));
		assertEquals("ru.amse.SomeClass", manager.getImportedName("ru.amse.SomeClass"));
	}
}
