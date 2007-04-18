package ru.ifmo.rain.astrans.interpreter.backtrans;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
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
		
		assertEqualFiles(dataDir + "/expected.java", dataDir + "/" + transformation.getName() + ".java");
		assertEqualFiles(dataDir + "/expectedTrace.java", dataDir + "/" + transformation.getTraceClassName().getName() + ".java");
		assertEqualFiles(dataDir + "/expectedResolver.java", dataDir + "/" + transformation.getResolverClassName().getName() + ".java");
	}

	@Test
	public void testIM() {
		ImportManager manager = new ImportManager("ru");
		manager.addImport("ru.amse.SomeClass");
		manager.addImport("SomeClass");
		assertEquals("SomeClass", manager.getImportedName("SomeClass"));
		assertEquals("SomeClass", manager.getImportedName("ru.amse.SomeClass"));
	}

	private static void assertEqualFiles(String expectedFile, String resultFile) throws FileNotFoundException, IOException {
		Reader expectedTransformation = new FileReader(expectedFile);
		Reader result = new FileReader(resultFile);
		int i = 0;
		int resultC;
		int expectedC;
		do {
			resultC = result.read();
			expectedC = expectedTransformation.read();
			assertEquals("transformation" + ": " + i, expectedC, resultC);
			if (expectedC == -1 || resultC == -1) {
				break;
			}
			i++;
		} while (expectedC == -1 || resultC == -1);
	}
}
