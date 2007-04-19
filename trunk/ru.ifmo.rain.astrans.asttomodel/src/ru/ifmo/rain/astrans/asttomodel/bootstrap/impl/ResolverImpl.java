package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;


import java.io.IOException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

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
import ru.ifmo.rain.astrans.AstransFactory;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.ExistingEClass;
import ru.ifmo.rain.astrans.ExistingEDataType;
import ru.ifmo.rain.astrans.MappedEClass;

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
	private final EPackageResolver proto;
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

	
	public ResolverImpl(EPackage sourceEPackage, TraceImpl trace, FileResolver fileResolver) {
		this.createdClasses = trace.getCreatedClasses();
		this.proto = new EPackageResolver(sourceEPackage);
		this.fileResolver = fileResolver;
	}

	public EClassifierReference resolveReferenceToEClassifierReference(EClassifierReferenceAS textualReferenceType) {
		return (EClassifierReference) classifierReferenceResolver.doSwitch(textualReferenceType);
	}

	public EClass resolveTranslateReferencesModelReferenceTypeProto(QualifiedName modelReferenceTypeProto) {
		return lookupProtoClass(modelReferenceTypeProto);
	}

	public EClass resolveSkipClassTargetProto(QualifiedName targetProto) {
		return lookupProtoClass(targetProto);
	}

	public EClassReference resolveCreateClassSuperclasses(EClassifierReferenceAS superClassQN) {
		return lookupClass(superClassQN);
	}

	public EClassReference resolveReferenceType(EClassifierReferenceAS type) {
		return lookupClass(type);
	}

	public EDataType resolveAttributeType(QualifiedName type) {
		ExistingEDataType ref = OR
			.get(ecore.getExistingEDataType(type))
			.or(proto.getExistingEDataType(type))
			.getObj();
		return ref == null ? null : ref.getEDataType();
	}

	public EClass resolveChangeInheritanceTargetProto(QualifiedName targetProto) {
		return lookupProtoClass(targetProto);
	}

	public EClassReference resolveChangeInheritanceSuperclasses(EClassifierReferenceAS superclass) {
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

	public EPackage resolveTransformationInput(EPackageReference inputAS) {
		return (EPackage) inputEPackageResolver.doSwitch(inputAS);
	}

	public EClassReference resolveTransformationAstRoot(EClassifierReferenceAS astRoot) {
		// TODO Auto-generated method stub
		return null;
	}

	public EClass resolveTransformationInputModelRoot(QualifiedName inputModelRoot) {
		// TODO Auto-generated method stub
		return null;
	}
	
}