package ru.ifmo.rain.astrans.asttomodel.bootstrap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.MappedEClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;
import ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS;
import ru.ifmo.rain.astrans.astransast.EPackageReference;
import ru.ifmo.rain.astrans.astransast.QualifiedName;

public interface IAstransastToAstransResolver {
	// caseMappedEClassAS
	EClass resolveMappedEClassProto(QualifiedName proto, MappedEClass contextObject);

	// caseTranslateReferencesAS
	EClass resolveTranslateReferencesModelReferenceTypeProto(QualifiedName modelReferenceTypeProto, TranslateReferences contextObject);
	EClassifierReference resolveTranslateReferencesTextualReferenceType(EClassifierReferenceAS textualReferenceType, TranslateReferences contextObject);

	// caseCreateClassAS
	EClassReference resolveCreateClassSuperclasses(EClassifierReferenceAS superclasses, CreateClass contextObject);

	// caseAttributeAS
	EDataType resolveAttributeType(QualifiedName type, Attribute contextObject);

	// caseReferenceAS
	EClassReference resolveReferenceType(EClassifierReferenceAS type, Reference contextObject);

	// caseChangeInheritanceAS
	EClassReference resolveChangeInheritanceSuperclasses(EClassifierReferenceAS superclasses, ChangeInheritance contextObject);

	// caseSkipClassAS
	EClass resolveSkipClassTargetProto(QualifiedName targetProto, SkipClass contextObject);

	// caseTransformationAS
	EPackage resolveTransformationInput(EPackageReference input, Transformation contextObject);
	EClass resolveTransformationInputModelRoot(QualifiedName inputModelRoot, Transformation contextObject);
	EClassReference resolveTransformationAstRoot(EClassifierReferenceAS astRoot, Transformation contextObject);


}