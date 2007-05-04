package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;


import java.io.IOException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

import ru.ifmo.rain.astrans.AstransFactory;
import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.ExistingEClass;
import ru.ifmo.rain.astrans.ExistingEDataType;
import ru.ifmo.rain.astrans.MappedEClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;
import ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS;
import ru.ifmo.rain.astrans.astransast.EPackagePath;
import ru.ifmo.rain.astrans.astransast.EPackageReference;
import ru.ifmo.rain.astrans.astransast.EPackageUri;
import ru.ifmo.rain.astrans.astransast.MappedEClassAS;
import ru.ifmo.rain.astrans.astransast.QualifiedName;
import ru.ifmo.rain.astrans.astransast.util.AstransastSwitch;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.IAstransastToAstransResolver;
import ru.ifmo.rain.astrans.utils.EMFHelper;
import ru.ifmo.rain.astrans.utils.OR;

public class ResolverImpl implements IAstransastToAstransResolver {		
	
	private class ClassifierReferenceResolver extends AstransastSwitch {
		@Override
		public MappedEClass caseMappedEClassAS(MappedEClassAS object) {
			EClass proto = lookupProtoClass(object.getProto());
			MappedEClass mappedEClass = AstransFactory.eINSTANCE.createMappedEClass();
			mappedEClass.setProto(proto);
			return mappedEClass;
		}

		@Override
		public EClassifierReference caseQualifiedName(QualifiedName object) {
			// Any class
			return OR.<EClassReference>get(proto.getExistingEClass(object))
				.or(ecore.getExistingEClass(object))
				.or(createdClasses.getReference(object))
				.getObj();
		}
	}

	private final AstransastSwitch classReferenceResolver = new ClassifierReferenceResolver();
	private final AstransastSwitch classifierReferenceResolver = new ClassifierReferenceResolver() {
		@Override
		public EClassifierReference caseQualifiedName(QualifiedName qn) {
			// Any classifier
			return OR.<EClassifierReference>get(proto.getEClassifierReference(qn))
				.or(ecore.getEClassifierReference(qn))
				.or(createdClasses.getReference(qn))
				.getObj();
		}
	};
	
	private final CreatedClasses createdClasses;
	private final EPackageResolver ecore = new EPackageResolver(EcorePackage.eINSTANCE);
	private EPackageResolver proto;
	private final FileResolver fileResolver;
	private final AstransastSwitch inputEPackageResolver = new AstransastSwitch() {
		@Override
		public Object caseEPackageUri(EPackageUri object) {
			return EPackage.Registry.INSTANCE.getEPackage(object.getUri());
		}
		
		@Override
		public Object caseEPackagePath(EPackagePath object) {
			Resource resource = EMFHelper.getXMIResource(EcorePackage.eINSTANCE, object.getPath());
			try {
				EMFHelper.loadResourceFromFile(resource, fileResolver.getFile(object.getPath()));
			} catch (IOException e) {
				throw new IllegalArgumentException(e);
			}
			return resource.getContents().get(0);
		}
	};			

	
	public ResolverImpl(TraceImpl trace, FileResolver fileResolver) {
		this.createdClasses = trace.getCreatedClasses();
		this.fileResolver = fileResolver;
	}

	public EClass resolveTranslateReferencesModelReferenceTypeProto(QualifiedName modelReferenceTypeProto, TranslateReferences contextObject) {
		return lookupProtoClass(modelReferenceTypeProto);
	}

	public EClass resolveSkipClassTargetProto(QualifiedName targetProto, SkipClass contextObject) {
		return lookupProtoClass(targetProto);
	}

	public EClassReference resolveCreateClassSuperclasses(EClassifierReferenceAS superClassQN, CreateClass contextObject) {
		return lookupClass(superClassQN);
	}

	public EClassReference resolveReferenceType(EClassifierReferenceAS type, Reference contextObject) {
		return lookupClass(type);
	}

	public EDataType resolveAttributeType(QualifiedName type, Attribute contextObject) {
		ExistingEDataType ref = OR
			.get(ecore.getExistingEDataType(type))
			.or(proto.getExistingEDataType(type))
			.getObj();
		return ref == null ? null : ref.getEDataType();
	}

	public EClassReference resolveChangeInheritanceSuperclasses(EClassifierReferenceAS superclass, ChangeInheritance contextObject) {
		return lookupClass(superclass);
	}
	
	private EClass lookupProtoClass(QualifiedName modelReferenceTypeProto) {
		/* 
		 * We lookup in Ecore due to problems with determinig input model 
		 * bounds.
		 * To behave exactly right we must treat input package and all the
		 * packages it depends on as input class set.
		 * This simple hack assumes that input depends on no package
		 * except for Ecore and that Ecore classes are always skipped
		 * and never have AST images.
		 */
		ExistingEClass ref = 
			OR.<ExistingEClass>get(proto.getExistingEClass(modelReferenceTypeProto))
			.or(ecore.getExistingEClass(modelReferenceTypeProto))
			.getObj();
		return ref == null ? null : ref.getEClass();
	}

	private EClassReference lookupClass(EClassifierReferenceAS classifierReferenceAS) {
		return (EClassReference) classReferenceResolver.doSwitch(classifierReferenceAS);
	}

	public EPackage resolveTransformationInput(EPackageReference inputAS, Transformation contextObject) {
		EPackage inputPackage = (EPackage) inputEPackageResolver.doSwitch(inputAS);
		this.proto = new EPackageResolver(inputPackage);
		return inputPackage;
	}

	public EClassReference resolveTransformationAstRoot(EClassifierReferenceAS astRoot, Transformation contextObject) {
		return lookupClass(astRoot);
	}

	public EClass resolveTransformationInputModelRoot(QualifiedName inputModelRoot, Transformation contextObject) {
		return lookupProtoClass(inputModelRoot);
	}

	public EClass resolveMappedEClassProto(QualifiedName proto, MappedEClass contextObject) {
		return lookupProtoClass(proto);
	}

	public EClassifierReference resolveTranslateReferencesTextualReferenceType(EClassifierReferenceAS textualReferenceType, TranslateReferences contextObject) {
		return (EClassifierReference) classifierReferenceResolver.doSwitch(textualReferenceType);
	}
	
}