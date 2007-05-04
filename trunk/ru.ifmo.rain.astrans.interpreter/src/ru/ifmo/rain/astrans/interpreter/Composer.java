package ru.ifmo.rain.astrans.interpreter;

import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ru.ifmo.rain.astrans.trace.ReferenceMappingType;

import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.StructuralFeature;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.util.AstransSwitch;
import ru.ifmo.rain.astrans.util.EClassMap;
import ru.ifmo.rain.astrans.util.EClassSet;

class Composer {

	private final EClassMap<TranslateReferenceRecord> translatedTypes;
	private final AstransInterpreterTrace trace;
	private final EClassSet skippedClasses;
	private final ReferenceResolver referenceResolver;
	private final AstransSwitch  featureCreator = new AstransSwitch() {
		@Override
		public EAttribute caseAttribute(Attribute attribute) {
			assert attribute != null;
			
			EAttribute result = EcoreFactory.eINSTANCE.createEAttribute();
			result.setName(attribute.getName());
			result.setLowerBound(attribute.getLowerBound());
			result.setUpperBound(attribute.getUpperBound());
			result.setEType(attribute.getType());
			return result;
		}

		@Override
		public EStructuralFeature caseReference(Reference reference) {
			assert reference != null;
		
			EClass resolvedType = (EClass) referenceResolver.resolveEClassifierReference(reference.getType());
			EReference result = EcoreFactory.eINSTANCE.createEReference();
			result.setEType(resolvedType);
			result.setContainment(reference.isContainment());
			
			result.setName(reference.getName());
			result.setLowerBound(reference.getLowerBound());
			result.setUpperBound(reference.getUpperBound());
			
			return result;
		}
	};

	public Composer(final EClassMap<TranslateReferenceRecord> translatedTypes, final AstransInterpreterTrace trace, final EClassSet skippedClasses, final ReferenceResolver referenceResolver) {
		this.translatedTypes = translatedTypes;
		this.trace = trace;
		this.skippedClasses = skippedClasses;
		this.referenceResolver = referenceResolver;
	}

	private EClassifier translateReferenceType(EReference reference) {
		EClassifier translatedType = getTranslatedType(reference);
		if (translatedType != null) {
			return translatedType;
		}
		
		EClass eClass = reference.getEReferenceType();		
		EClassifier result = trace.getMappedClass(eClass);
		if (result == null) {
			if (!skippedClasses.contains(eClass)) {
				result = eClass;
			}
		}
		
		return result;
	}

	private EClassifier getTranslatedType(EReference reference) {
		TranslateReferenceRecord translateReferenceRecord = translatedTypes.get(reference.getEReferenceType());
		if (translateReferenceRecord != null) {
			if (!reference.isContainment() || !translateReferenceRecord.crossReferencesOnly) {
				return translateReferenceRecord.type;
			}
		}
		return null;
	}
	
	public void run(Transformation transformation) {
		for (Iterator iter = transformation.getCreateClassActions().iterator(); iter.hasNext();) {
			CreateClass action = (CreateClass) iter.next();
			composeCreatedClass(action, trace);
		}
		for (Entry<EClass, EClass> mapping : trace.getMappings()) {
			composeMappedClass(mapping.getKey(), trace);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void composeMappedClass(EClass proto, AstransInterpreterTrace trace) {
		assert proto != null;

		EClass image = trace.getMappedClass(proto);
		assert image != null;			
		
		image.setName(proto.getName() + "AS");
		image.setAbstract(proto.isAbstract());

		EList attributes = proto.getEAttributes();
		for (Iterator iter = attributes.iterator(); iter.hasNext();) {
			EAttribute attribute = (EAttribute) iter.next();
			if (attribute.isChangeable()) {
				EAttribute copy = (EAttribute) EcoreUtil.copy(attribute);
				image.getEStructuralFeatures().add(copy);
				trace.registerAttribute(attribute, copy);
			}
		}
		
		EList references = proto.getEReferences();
		for (Iterator iter = references.iterator(); iter.hasNext();) {
			EReference eReference = (EReference) iter.next();
			if (eReference.isChangeable()) {
				EStructuralFeature feature = createReferenceFeature(eReference);
				image.getEStructuralFeatures().add(feature);
				
				trace.registerReference(eReference, feature, getMappingType(eReference));
			}
		}
		
		EList superTypes = proto.getESuperTypes();
		for (Iterator iter = superTypes.iterator(); iter.hasNext();) {
			EClass eClass = (EClass) iter.next();
			if (!skippedClasses.contains(eClass)) {
				EClass mappedSuperClass = trace.getMappedClass(eClass);
				image.getESuperTypes().add(mappedSuperClass != null ? mappedSuperClass : eClass);
			}
		}
	}

	private ReferenceMappingType getMappingType(EReference eReference) {
		ReferenceMappingType mappingType;
		if (getTranslatedType(eReference) != null) {
			mappingType = ReferenceMappingType.TRANSLATED_LITERAL;
		} else {
			mappingType = skippedClasses.contains(eReference.getEReferenceType()) 
				? ReferenceMappingType.NONE_LITERAL
				: ReferenceMappingType.MAPPED_LITERAL;
		}
		return mappingType;
	}

	@SuppressWarnings("unchecked")
	public void composeCreatedClass(CreateClass action, AstransInterpreterTrace trace) {
		EClass result = trace.getCreatedClass(action);
		assert result != null;			
		
		result.setName(action.getName());
		result.setAbstract(action.isAbstract());
		
		EList structuralFeatures = action.getStructuralFeatures();
		for (Iterator iter = structuralFeatures.iterator(); iter.hasNext();) {
			StructuralFeature feature = (StructuralFeature) iter.next();
			result.getEStructuralFeatures().add(featureCreator.doSwitch(feature));
		}
		
		EList superclasses = action.getSuperclasses();
		for (Iterator iter = superclasses.iterator(); iter.hasNext();) {
			EClassifierReference reference = (EClassifierReference) iter.next();
			result.getESuperTypes().add(referenceResolver.resolveEClassifierReference(reference));
		}
	}

	private EStructuralFeature createReferenceFeature(EReference reference) {
		EClassifier calculatedType = translateReferenceType(reference);
		
		EStructuralFeature result;
		if (calculatedType instanceof EClass || calculatedType == null) {
			EReference ref = EcoreFactory.eINSTANCE.createEReference();
			ref.setContainment(true); // AST has no cross-references
			result = ref;
		} else {
			result = EcoreFactory.eINSTANCE.createEAttribute();
		}
		assert result != null;
		result.setEType(calculatedType);
		result.setName(reference.getName());
		result.setLowerBound(reference.getLowerBound());
		result.setUpperBound(reference.getUpperBound());
		return result;
	}

}