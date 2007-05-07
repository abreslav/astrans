package ru.ifmo.rain.astrans.interpreter.backtrans;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel;
import ru.ifmo.rain.astrans.backtrans.dependencies.adapter.DependencyProvider;
import ru.ifmo.rain.astrans.backtrans.dependencies.adapter.IncorrectGraphException;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.tests.utils.FileUtils;
import ru.ifmo.rain.tests.utils.IFileProcessor;
import ru.ifmo.rain.tests.utils.emf.Difference;
import ru.ifmo.rain.tests.utils.emf.EMFComparator;
import utils.LoadUtils;

@RunWith(Parameterized.class)
public class BacktransCreatorTest {


	@Parameters
	public static Collection<Object[]> parameters() {
		return FileUtils.processDirectory("testData/backtrans", new IFileProcessor() {
			public Object[] process(File file) {
				return new Object[] {
						/*file.getPath() + */"/trace.xmi",
						"/result.xmi",
						"/expected.xmi",
						file
				};
			}
		});
	}
	
	private String traceFileName;
	private String resultFileName;
	private String expectedFileName;
	private File testDir;
	
	public BacktransCreatorTest(String traceFileName, String resultFileName, String expectedFileName, File testDir) {
		this.traceFileName = traceFileName;
		this.resultFileName = resultFileName;
		this.expectedFileName = expectedFileName;
		this.testDir = testDir;
	}

	@SuppressWarnings("unchecked")
	@Test
	public final void testCreateBackTransformation() throws IOException, IncorrectGraphException {
		ResourceSet resourceSet = LoadUtils.createResourceSet(testDir);
		
		Resource resource = resourceSet.createResource(URI.createURI(traceFileName));
		resource.load(null);
		Trace trace = (Trace) resource.getContents().get(0);
		EcoreUtil.resolveAll(trace);

		resource = resourceSet.createResource(URI.createURI(expectedFileName));
		resource.load(null);
		Transformation expected = (Transformation) resource.getContents().get(0);
		
		resource = resourceSet.createResource(URI.createURI("ast.genmodel"));
		resource.load(null);
		GenModel astGenModel = (GenModel) resource.getContents().get(0);

		resource = resourceSet.createResource(URI.createURI("model.genmodel"));
		resource.load(null);
		GenModel genModel = (GenModel) resource.getContents().get(0);

		resource = resourceSet.createResource(URI.createURI("DependencyModel.xmi"));
		resource.load(null);
		DependencyModel dependencyModel = (DependencyModel) resource.getContents().get(0);

		IDependencyProvider dependencyProvider = new DependencyProvider(dependencyModel);
		BacktransCreator backtransCreator = new BacktransCreator(new TraceAdapter(trace), (GenPackage) genModel.getGenPackages().get(0), (GenPackage) astGenModel.getGenPackages().get(0), dependencyProvider);
		Transformation transformation = backtransCreator.createBackTransformation();
		resource = resourceSet.createResource(URI.createURI(resultFileName));
		resource.getContents().add(transformation);
		resource.save(null);
		
		Difference difference = EMFComparator.compare(expected, transformation);
		assertTrue(difference.toString(), difference.areEqual());
	}

}
