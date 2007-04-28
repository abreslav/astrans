package ru.ifmo.rain.astrans.asttomodel;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.astransast.AstransastPackage;
import ru.ifmo.rain.astrans.astransast.TransformationAS;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.AstransastToAstransTransformation;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.impl.ContextFactoryImpl;
import ru.ifmo.rain.astrans.utils.Difference;
import ru.ifmo.rain.astrans.utils.EMFComparator;
import ru.ifmo.rain.astrans.utils.EMFHelper;
import utils.FileUtils;
import utils.IFileProcessor;

@RunWith(Parameterized.class)
public class AstransASTToModelTransformationTest {

	private TransformationAS input;
	private Transformation expectedResult;
	private AstransastToAstransTransformation transformation;
	private String expectedResultFileName;
	private String inputFileName;
	private String resultFileName;
	private String testDir;
	
	@Parameters
	public static Collection<Object[]> parameters() {
		return FileUtils.processDirectory("testData/asttomodel", new IFileProcessor() {
			public Object[] process(File file) {
				return new String[] {
					file.getPath() + "/input.xmi",
					file.getPath() + "/expected.xmi",
					file.getPath() + "/result.xmi",
					file.getPath()
				};
			}
		});
	}

	public AstransASTToModelTransformationTest(String inputFN, String expectedFN, String resultFN, String testD) {
		inputFileName = inputFN;
		expectedResultFileName = expectedFN;
		resultFileName = resultFN;
		testDir = testD;
		
	}	
	
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		Resource resource = EMFHelper.getXMIResource(AstransastPackage.eINSTANCE, inputFileName);
		EMFHelper.loadResourceFromFile(resource, inputFileName);
		input = (TransformationAS) resource.getContents().get(0);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResources().add(resource);
		resourceSet.setPackageRegistry(EPackage.Registry.INSTANCE);
		EcoreUtil.resolve(input, resourceSet);
		
		resource = EMFHelper.getXMIResource(AstransPackage.eINSTANCE, expectedResultFileName);
		EMFHelper.loadResourceFromFile(resource, expectedResultFileName);
		expectedResult = (Transformation) resource.getContents().get(0);
		
		transformation = new AstransastToAstransTransformation(new ContextFactoryImpl(testDir));
	}
	

	@Test
	public final void testRun() throws IOException {
		Transformation result = transformation.run(input);
		EMFHelper.saveEObjectToFile(result, resultFileName);
		Difference difference = EMFComparator.compare(result, expectedResult);
		assertTrue(difference.toString(), difference.areEqual());
	}

}