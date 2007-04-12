package ru.ifmo.rain.astrans.asttomodel.bootstrap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS;
import ru.ifmo.rain.astrans.astransast.EPackageReference;
import ru.ifmo.rain.astrans.astransast.QualifiedName;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;

public interface IResolver {

	EClassifierReference resolveTranslateReferencesTextualReferenceType(
			EClassifierReferenceAS textualReferenceType);

	EClass resolveTranslateReferencesModelReferenceTypeProto(
			QualifiedName modelReferenceTypeProto);

	EClass resolveSkipClassTargetProto(QualifiedName targetProto);

	EClassReference resolveCreateClassSuperclass(
			EClassifierReferenceAS superClassQN);

	EClassReference resolveReferenceType(EClassifierReferenceAS type);

	EDataType resolveAttributeType(QualifiedName type);

	EClass resolveChangeInheritanceTargetProto(QualifiedName targetProto);

	EClassReference resolveChangeInheritanceSuperclass(
			EClassifierReferenceAS superclass);

	EPackage resolveTransformationInput(EPackageReference inputAS);

}