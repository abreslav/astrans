package ru.astrans;

import org.eclipse.emf.ecore.EPackage;

import ru.ifmo.rain.astrans.astransast.EPackageReference;

public interface ITEResolver {
	EPackage resolveTransformationInput(EPackageReference packageReference);

	EPackage resolveSomething(EPackageReference packageReference);

	EPackage resolveSomething1(short someAS);
}