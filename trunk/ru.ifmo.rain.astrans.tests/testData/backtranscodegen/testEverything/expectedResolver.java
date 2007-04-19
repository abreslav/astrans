package ru.astrans;

import org.eclipse.emf.ecore.EPackage;

import ru.ifmo.rain.astrans.astransast.Action;
import ru.ifmo.rain.astrans.astransast.ActionAS;
import ru.ifmo.rain.astrans.astransast.EPackageReference;

public interface ITEResolver {
	// caseTransformationAS
	EPackage resolveTransformationInput(EPackageReference packageReference);
	EPackage resolveSomething(EPackageReference packageReference);
	EPackage resolveSomething1(short someAS);

	// caseMyAbstractClass
	Action resolveReferenceToMyAbstractClass(ActionAS actionAS);
	

}