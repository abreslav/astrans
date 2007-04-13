package ru.ifmo.rain.astrans.interpreter.backtrans;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;

import ru.ifmo.rain.astrans.utils.EMFHelper;
import ru.ifmo.rain.astrans.trace.AttributeMapping;
import ru.ifmo.rain.astrans.trace.ClassMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMappingType;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.astrans.trace.TracePackage;

public class TraceAdapterTest {

	private TraceAdapter adapter;

	@Before
	public void setUp() throws Exception {
		Resource resource = EMFHelper.getXMIResource(TracePackage.eINSTANCE, "trace.xmi");
		EMFHelper.loadResourceFromFile(resource, "testData/trace.xmi");
		Trace trace = (Trace) resource.getContents().get(0);
		adapter = new TraceAdapter(trace);
		
	}

	@Test
	public final void testGetClassMappings() {
		assertEquals(1, adapter.getClassMappings().size());
		ClassMapping mapping = adapter.getClassMappings().iterator().next();
		EcoreUtil.resolveAll(mapping);
		assertEquals(mapping.getProto(), EcorePackage.eINSTANCE.getEReference());
		assertEquals(mapping.getImage(), EcorePackage.eINSTANCE.getEAnnotation());
	}

	@Test
	public final void testGetAttributeMapping() {
		AttributeMapping attributeMapping = adapter.getAttributeMapping(EcorePackage.eINSTANCE.getEClassifier_InstanceClass());
		assertEquals(attributeMapping.getProto(), EcorePackage.eINSTANCE.getEClassifier_InstanceClass());
		assertEquals(attributeMapping.getImage(), EcorePackage.eINSTANCE.getEClassifier_InstanceClassName());
	}

	@Test
	public final void testGetReferenceMapping() {
		ReferenceMapping referenceMapping = adapter.getReferenceMapping(EcorePackage.eINSTANCE.getEEnumLiteral_EEnum());
		assertEquals(referenceMapping.getProto(), EcorePackage.eINSTANCE.getEEnumLiteral_EEnum());
		assertEquals(referenceMapping.getImage(), EcorePackage.eINSTANCE.getEClassifier_DefaultValue());
		assertEquals(referenceMapping.getType(), ReferenceMappingType.TRANSLATED_LITERAL);
	}
	
	@Test
	public void testGetInput() {
		assertEquals(adapter.getInput(), EcorePackage.eINSTANCE);
	}

	@Test
	public void testGetOutput() {
		assertEquals(adapter.getOutput(), EcorePackage.eINSTANCE);
	}

	@Test
	public void testGetOutputRoot() {
		assertEquals(adapter.getOutputRoot(), EcorePackage.eINSTANCE.getEAnnotation());
	}

	@Test
	public void testGetInputRoot() {
		assertEquals(adapter.getInputRoot(), EcorePackage.eINSTANCE.getEClass());
	}
}
