package ru.ifmo.rain.astrans.asttomodel.bootstrap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;

import ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS;
import ru.ifmo.rain.astrans.astransast.EPackageReference;
import ru.ifmo.rain.astrans.astransast.QualifiedName;

public interface IAstransastToAstransResolver {
	// caseEClassifierReferenceAS
	EClassifierReference resolveReferenceToEClassifierReference(EClassifierReferenceAS eClassifierReferenceAS);
	
	// caseTranslateReferencesAS
	EClass resolveTranslateReferencesModelReferenceTypeProto(QualifiedName modelReferenceTypeProto);

	// caseCreateClassAS
	EClassReference resolveCreateClassSuperclasses(EClassifierReferenceAS superclasses);

	// caseAttributeAS
	EDataType resolveAttributeType(QualifiedName type);

	// caseReferenceAS
	EClassReference resolveReferenceType(EClassifierReferenceAS type);

	// caseChangeInheritanceAS
	EClass resolveChangeInheritanceTargetProto(QualifiedName targetProto);
	EClassReference resolveChangeInheritanceSuperclasses(EClassifierReferenceAS superclasses);

	// caseSkipClassAS
	EClass resolveSkipClassTargetProto(QualifiedName targetProto);

	// caseTransformationAS
	EPackage resolveTransformationInput(EPackageReference input);
	EClass resolveTransformationInputModelRoot(QualifiedName inputModelRoot);
	EClassReference resolveTransformationAstRoot(EClassifierReferenceAS astRoot);


}