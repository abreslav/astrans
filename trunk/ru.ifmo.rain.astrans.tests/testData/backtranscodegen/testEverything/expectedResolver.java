package ru.astrans;

import org.eclipse.emf.ecore.EPackage;

import ru.ifmo.rain.astrans.astrans.Transformation;

import ru.ifmo.rain.astrans.astransast.EPackageReference;

public interface ITEResolver {
	// caseTransformationAS
	EPackage resolveTransformationInput(EPackageReference packageReference, Transformation contextObject);
	EPackage resolveSomething(EPackageReference packageReference, Transformation contextObject);
	EPackage resolveSomething1(short someAS, Transformation contextObject);


}