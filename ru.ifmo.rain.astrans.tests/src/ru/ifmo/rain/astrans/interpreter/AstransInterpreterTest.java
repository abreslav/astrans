package ru.ifmo.rain.astrans.interpreter;


import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.astrans.trace.TraceFactory;
import ru.ifmo.rain.astrans.trace.TracePackage;
import ru.ifmo.rain.astrans.utils.Difference;
import ru.ifmo.rain.astrans.utils.EMFComparator;
import ru.ifmo.rain.astrans.utils.EMFHelper;
import utils.FileUtils;
import utils.IFileProcessor;

@RunWith(Parameterized.class)
public class AstransInterpreterTest {

	private String inputFileName;
	private String transformationFileName;
	private String outputFileName;
	private String expectedFileName;
	private String traceFileName;
	private String expectedTraceFileName;
	
	@Parameters
	public static Collection<Object[]> parameters() {
		return FileUtils.processDirectory("testData/interpreter", new IFileProcessor() {
			public Object[] process(File file) {
				return new Object[] {
						file.getPath() + "/input.ecore",
						file.getPath() + "/Transformation.xmi",
						file.getPath() + "/output.ecore",
						file.getPath() + "/expected.ecore",
						file.getPath() + "/trace.xmi",
						file.getPath() + "/expected_trace.xmi",
					};
			}
		});
	}
	
	public AstransInterpreterTest(String inputFileName, final String transformationFileName, final String outputFileName, final String expectedFileName, final String traceFileName, final String expectedTraceFileName) {
		this.inputFileName = inputFileName;
		this.transformationFileName = transformationFileName;
		this.outputFileName = outputFileName;
		this.expectedFileName = expectedFileName;
		this.traceFileName = traceFileName;
		this.expectedTraceFileName = expectedTraceFileName;
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testRun() throws IOException {
		Resource transfomationResource = EMFHelper.getXMIResource(AstransPackage.eINSTANCE, "Transformation.xmi");
		EMFHelper.loadResourceFromFile(transfomationResource, transformationFileName);
		Transformation transformation = (Transformation) transfomationResource.getContents().get(0);
		
		Resource expectedResource = EMFHelper.getXMIResource(EcorePackage.eINSTANCE, "expected.ecore");
		EMFHelper.loadResourceFromFile(expectedResource, expectedFileName);
		EPackage expected = (EPackage) expectedResource.getContents().get(0);

		Resource inputResource = EMFHelper.getXMIResource(EcorePackage.eINSTANCE, "input.ecore");
		EMFHelper.loadResourceFromFile(inputResource, inputFileName);

		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResources().add(transfomationResource);
		resourceSet.getResources().add(inputResource);
		
		EcoreUtil.resolve(transformation.getInput(), resourceSet);
		Trace trace = TraceFactory.eINSTANCE.createTrace();
		EPackage output = AstransInterpreter.run(transformation, trace);
		
		Resource resource = EMFHelper.wrapIntoXMIResource(output, "output.ecore");
		EMFHelper.saveResourceToFile(resource, outputFileName);
		resourceSet.getResources().add(resource);
		Resource traceResource = EMFHelper.wrapIntoXMIResource(trace, "trace.xmi");
		resourceSet.getResources().add(traceResource);
		EMFHelper.saveResourceToFile(traceResource, traceFileName);

		Difference resultDifference = EMFComparator.compare(expected, output);
		
		assertTrue("model: " + resultDifference.toString(), resultDifference.areEqual());
		
		Resource expectedTraceResource = EMFHelper.getXMIResource(TracePackage.eINSTANCE, expectedTraceFileName);
		EMFHelper.loadResourceFromFile(expectedTraceResource, expectedTraceFileName);
		Trace expectedTrace = (Trace) expectedTraceResource.getContents().get(0);
		resourceSet.getResources().add(expectedTraceResource);
		
		Difference traceDifference = EMFComparator.compare(expectedTrace, trace);
		assertTrue("trace: " + traceDifference.toString(), traceDifference.areEqual());
	}
	
}
