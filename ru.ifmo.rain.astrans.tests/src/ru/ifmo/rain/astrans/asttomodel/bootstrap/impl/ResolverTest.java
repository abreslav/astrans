package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Before;
import org.junit.Test;

import ru.ifmo.rain.astrans.AstransFactory;
import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.CreatedEClass;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.ExistingEClass;
import ru.ifmo.rain.astrans.ExistingEDataType;
import ru.ifmo.rain.astrans.astransast.AstransastFactory;
import ru.ifmo.rain.astrans.astransast.EPackagePath;
import ru.ifmo.rain.astrans.astransast.EPackageUri;
import ru.ifmo.rain.astrans.astransast.QualifiedName;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.IAstransastToAstransResolver;
import utils.QNUtils;

public class ResolverTest {

	private IAstransastToAstransResolver resolver;
	private QualifiedName actionQN;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		actionQN = QNUtils.createQN("astrans.Action");
		
		TraceImpl trace = new TraceImpl();
		CreateClass b = AstransFactory.eINSTANCE.createCreateClass();
		b.setName("B");
		trace.createClassCreated(null, b);
		resolver = new ResolverImpl(trace, new FileResolver("."));
		EPackageUri uri = AstransastFactory.eINSTANCE.createEPackageUri();
		EPackage.Registry.INSTANCE.put(AstransPackage.eNS_URI, AstransPackage.eINSTANCE);
		uri.setUri(AstransPackage.eNS_URI);
		resolver.resolveTransformationInput(uri);
	}

	@Test
	public final void testResolveTranslateReferencesTextualReferenceType() {
		EClassifierReference reference = resolver.resolveTranslateReferencesTextualReferenceType(QNUtils.createQN("ecore.EString"));
		assertEquals(EcorePackage.eINSTANCE.getEString(), ((ExistingEDataType) reference).getEDataType());
	}
	
	@Test
	public final void testResolveTranslateReferencesModelReferenceTypeProto() {
		EClass eClass = resolver.resolveTranslateReferencesModelReferenceTypeProto(actionQN);
		assertEquals(AstransPackage.eINSTANCE.getAction(), eClass);
	}

	@Test
	public final void testResolveSkipClassTargetProto() {
		EClass eClass = resolver.resolveSkipClassTargetProto(actionQN);
		assertEquals(AstransPackage.eINSTANCE.getAction(), eClass);
	}

	@Test
	public final void testResolveCreateClassSuperclass() {
		EClassReference reference = resolver.resolveCreateClassSuperclasses(QNUtils.createQN("ecore.EClass"));
		assertEquals(EcorePackage.eINSTANCE.getEClass(), ((ExistingEClass) reference).getEClass());
	}

	@Test
	public final void testResolveReferenceType() {
		EClassReference reference = resolver.resolveReferenceType(QNUtils.createQN("B"));
		assertEquals("B", ((CreatedEClass) reference).getCreate().getName());
	}

	@Test
	public final void testResolveReferenceTypeExistringEClass() {
		EClassReference reference = resolver.resolveReferenceType(QNUtils.createQN("ecore.EClass"));
		assertEquals(EcorePackage.eINSTANCE.getEClass(), ((ExistingEClass) reference).getEClass());
	}

	@Test
	public final void testResolveAttributeType() {
		EDataType type = resolver.resolveAttributeType(QNUtils.createQN("ecore.EInt"));
		assertEquals(EcorePackage.eINSTANCE.getEInt(), type);
	}

	@Test
	public void testResolveTransformationInputUri() {
		EPackageUri uri = AstransastFactory.eINSTANCE.createEPackageUri();
		uri.setUri("http://www.eclipse.org/emf/2002/Ecore");
		EPackage input = resolver.resolveTransformationInput(uri);
		assertEquals(EcorePackage.eINSTANCE, input);
	}

	@Test
	public void testResolveTransformationInputPath() {
		EPackagePath path = AstransastFactory.eINSTANCE.createEPackagePath();
		path.setPath("testdata/test.ecore");
		EPackage input = resolver.resolveTransformationInput(path);
		assertEquals(input.getNsURI(), "http:///test");
	}
}
