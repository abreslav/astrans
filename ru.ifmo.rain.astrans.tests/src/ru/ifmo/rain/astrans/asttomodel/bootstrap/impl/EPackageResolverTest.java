package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Before;
import org.junit.Test;

import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.astransast.AstransastFactory;
import ru.ifmo.rain.astrans.astransast.QualifiedName;
import utils.QNUtils;

public class EPackageResolverTest {

	private QualifiedName ecore;
	private QualifiedName astrans;
	private QualifiedName transformation;
	private EPackageResolver resolver;
	private EPackage a;
	private EPackage b;
	private EClass c;
	
	@Before
	@SuppressWarnings("unchecked")
	public void setUp() {
		a = EcoreFactory.eINSTANCE.createEPackage();
		a.setName("a");
		b = EcoreFactory.eINSTANCE.createEPackage();
		b.setName("b");
		a.getESubpackages().add(b);
		c = EcoreFactory.eINSTANCE.createEClass();
		c.setName("c");
		b.getEClassifiers().add(c);
		resolver = new EPackageResolver(EcorePackage.eINSTANCE, AstransPackage.eINSTANCE, a);
	}

	@Test
	public void testGetEPackage() {
		ecore = AstransastFactory.eINSTANCE.createQualifiedName();
		ecore.setName("ecore");
		assertEquals(EcorePackage.eINSTANCE, resolver.getEPackage(ecore));
	}

	@Test
	public void testGetEClassifier() {
		astrans = AstransastFactory.eINSTANCE.createQualifiedName();
		astrans.setName("astrans");
		transformation = AstransastFactory.eINSTANCE.createQualifiedName();
		transformation.setName("Transformation");
		
		astrans.setSubQN(transformation);
		assertEquals(AstransPackage.eINSTANCE.getTransformation(), resolver.getEClassifier(astrans));
	}

	@Test
	public void testGetClassifierTwoPackages() {
		QualifiedName qn = QNUtils.createQN("a.b.c");
		EClassifier classifier = resolver.getEClassifier(qn);
		assertSame(c, classifier);
	}
	
	@Test
	public void testGetEClassifierNameOnUnexistentPackage() {
		EClassifier classifier = resolver.getEClassifier(QNUtils.createQN("a.b"));
		assertNull(classifier);
	}
	
	@Test
	public void testGetExistingEDataTypeNullResult() {
		assertNull(resolver.getExistingEDataType(QNUtils.createQN("a.b.c")));
	}
}
