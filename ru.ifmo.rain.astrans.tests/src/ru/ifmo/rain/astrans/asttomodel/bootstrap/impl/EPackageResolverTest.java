package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.eclipse.emf.ecore.EClassifier;
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
	
	@Before
	public void setUp() {
		resolver = new EPackageResolver(EcorePackage.eINSTANCE, AstransPackage.eINSTANCE);
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
	public void testGetEClassifierNameOnUnexistentPackage() {
		EClassifier classifier = resolver.getEClassifier(QNUtils.createQN("a.b"));
		assertNull(classifier);
	}
}
