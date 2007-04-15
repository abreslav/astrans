package ru.ifmo.rain.astrans.interpreter.backtrans;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.astrans.trace.TracePackage;
import ru.ifmo.rain.astrans.utils.Difference;
import ru.ifmo.rain.astrans.utils.EMFComparator;
import ru.ifmo.rain.astrans.utils.EMFHelper;
import utils.FileUtils;
import utils.IFileProcessor;

@RunWith(Parameterized.class)
public class BacktransCodeGeneratorTest {

	@Parameters
	public static Collection<Object[]> parameters() {
		return FileUtils.processDirectory("testData/backtrans", new IFileProcessor() {
			public Object[] process(File file) {
				return new Object[] {
						file.getPath() + "/trace.xmi",
						"/result.xmi",
						file.getPath() + "/expected.xmi",
						file
				};
			}
		});
	}
	
	private String traceFileName;
	private String resultFileName;
	private String expectedFileName;
	private File testDir;
	
	public BacktransCodeGeneratorTest(String traceFileName, String resultFileName, String expectedFileName, File testDir) {
		this.traceFileName = traceFileName;
		this.resultFileName = resultFileName;
		this.expectedFileName = expectedFileName;
		this.testDir = testDir;
	}

	@SuppressWarnings("unchecked")
	@Test
	public final void testCreateBackTransformation() throws IOException {
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		resourceSetImpl.setURIResourceMap(new HashMap());
		ResourceSet resourceSet = resourceSetImpl;
		resourceSet.setPackageRegistry(EPackage.Registry.INSTANCE);
		EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI, TracePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(AstransformationPackage.eNS_URI, AstransformationPackage.eINSTANCE);
		EPackage package1 = EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		assertNotNull(package1);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		resourceSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		resourceSet.setURIConverter(new URIConverterImpl() {
			@Override
			public URI normalize(URI uri) {
				String scheme = uri.scheme();
				if (scheme == null) {
					String absolutePath = new File(testDir, uri.toFileString()).getAbsolutePath();
					return URI.createFileURI(absolutePath);
				}
				return super.normalize(uri);
			}
		});
		Resource resource = resourceSet.createResource(URI.createURI(traceFileName));
		EMFHelper.loadResourceFromFile(resource, traceFileName);
		Trace trace = (Trace) resource.getContents().get(0);

		resource = resourceSet.createResource(URI.createURI(expectedFileName));
		EMFHelper.loadResourceFromFile(resource, expectedFileName);
		Transformation expected = (Transformation) resource.getContents().get(0);		

		Transformation transformation = BacktransCreator.createBackTransformation(new TraceAdapter(trace));
		resource = resourceSet.createResource(URI.createURI(resultFileName));
		resource.getContents().add(transformation);
		resource.save(null);
		
		Difference difference = EMFComparator.compare(expected, transformation);
		assertTrue(difference.toString(), difference.areEqual());
		
	}

}
