package ru.ifmo.rain.astrans.interpreter.backtrans;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import ru.ifmo.rain.astrans.astransformation.AssignAttribute;
import ru.ifmo.rain.astrans.astransformation.AssignFeature;
import ru.ifmo.rain.astrans.astransformation.AssignReference;
import ru.ifmo.rain.astrans.astransformation.AstransformationFactory;
import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.BasicType;
import ru.ifmo.rain.astrans.astransformation.BasicTypeName;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.MappingRule;
import ru.ifmo.rain.astrans.astransformation.ResolveObject;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.astransformation.TypeName;
import ru.ifmo.rain.astrans.trace.AttributeMapping;
import ru.ifmo.rain.astrans.trace.ClassMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMappingType;

public class BacktransCreator {

	public static Transformation createBackTransformation(TraceAdapter trace, GenPackage protoGM, GenPackage imageGM) {
		Transformation backTransformation = AstransformationFactory.eINSTANCE.createTransformation();
		
		String name = CodeGenUtil.capName(trace.getOutput().getName()) + "To" + CodeGenUtil.capName(trace.getInput().getName());
		backTransformation.setName(name + "Transformation");
		backTransformation.setResolverClassName("I" + name + "Resolver");
		backTransformation.setTraceClassName("I" + name + "Trace");
		backTransformation.setSwitchClassName(createClassName(imageGM.getQualifiedSwitchClassName()));
	
		processMappings(trace, protoGM, imageGM, backTransformation);
		
		return backTransformation;
	}

	private static void processMappings(TraceAdapter trace, GenPackage protoGM, GenPackage imageGM, Transformation backTransformation) {
		Collection<ClassMapping> mappings = trace.getClassMappings();
		for (ClassMapping mapping : mappings) {
			if (!mapping.getProto().isAbstract()) {
				MappingRule rule = AstransformationFactory.eINSTANCE.createMappingRule();
				initMappingRule(protoGM, imageGM, backTransformation, mapping, rule, trace);
				
				rule.setFactoryClassName(createClassName(protoGM.getQualifiedFactoryInterfaceName()));
				rule.setFactoryMethodName("create" + mapping.getProto().getName()); 
				rule.setWriteTraceStatement(AstransformationFactory.eINSTANCE.createWriteTrace());
				rule.getWriteTraceStatement().setTraceMethodName(CodeGenUtil.uncapName(mapping.getProto().getName()) + "Created");
				processAttributes(trace, protoGM, imageGM, mapping, rule);
				processReferences(trace, protoGM, imageGM, mapping, rule);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static void initMappingRule(GenPackage protoGM, GenPackage imageGM, Transformation backTransformation, ClassMapping mapping, MappingRule rule, TraceAdapter trace) {
		backTransformation.getMappingRules().add(rule);

		rule.setName("case" + mapping.getImage().getName());

		rule.setResult(AstransformationFactory.eINSTANCE.createParameter());
		rule.getResult().setName(CodeGenUtil.uncapName(mapping.getProto().getName()));
		rule.getResult().setType((ClassName) getTypeName(protoGM, mapping.getProto()));
		
		rule.setParameter(AstransformationFactory.eINSTANCE.createParameter());
		rule.getParameter().setType((ClassName) getTypeName(imageGM, mapping.getImage()));
		rule.getParameter().setName(CodeGenUtil.uncapName(mapping.getImage().getName()));

		if (mapping.getProto() == trace.getInputRoot() && mapping.getImage() == trace.getOutputRoot()) {
			backTransformation.setMain(rule);
		}		
	}

	@SuppressWarnings("unchecked")
	private static void processReferences(TraceAdapter trace, GenPackage protoGM, GenPackage imageGM, ClassMapping mapping, MappingRule rule) {
		EList allReferences = mapping.getProto().getEAllReferences();
		for (Iterator iter = allReferences.iterator(); iter.hasNext();) {
			EReference reference = (EReference) iter.next();
			ReferenceMapping referenceMapping = trace.getReferenceMapping(reference);
			if (referenceMapping == null) {
				continue;
			}
			EStructuralFeature imageReference = referenceMapping.getImage();
			if (referenceMapping.getType() == ReferenceMappingType.TRANSLATED_LITERAL) {
				ResolveObject resolveObject = AstransformationFactory.eINSTANCE.createResolveObject();
				initAssignFeature(resolveObject, reference, imageReference, protoGM, imageGM);
				resolveObject.setResolverMethodName("resolve" + mapping.getProto().getName() + CodeGenUtil.capName(reference.getName()));
				
				resolveObject.setParameterName(imageReference.getName());
				resolveObject.setParameterType(getTypeName(imageGM, imageReference.getEType()));
				resolveObject.setType((ClassName) getTypeName(protoGM, reference.getEReferenceType()));
				rule.getResolveObjectStatements().add(resolveObject);
			} else {
				AssignReference assignReference = AstransformationFactory.eINSTANCE.createAssignReference();
				initAssignFeature(assignReference, reference, imageReference, protoGM, imageGM);
				assignReference.setMappingNeeded(referenceMapping.getType() != ReferenceMappingType.NONE_LITERAL);
				assignReference.setType((ClassName) getTypeName(protoGM, reference.getEType()));
				rule.getAssignReferenceStatements().add(assignReference);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static void processAttributes(TraceAdapter trace, GenPackage protoGM, GenPackage imageGM, ClassMapping mapping, MappingRule rule) {
		EList allAttributes = mapping.getProto().getEAllAttributes();
		for (Iterator iter = allAttributes.iterator(); iter.hasNext();) {
			EAttribute attribute = (EAttribute) iter.next();
			AssignAttribute assignAttribute = AstransformationFactory.eINSTANCE.createAssignAttribute();
			AttributeMapping attributeMapping = trace.getAttributeMapping(attribute);
			if (attributeMapping != null) {
				EAttribute imageAttribute = attributeMapping.getImage();
				initAssignFeature(assignAttribute, attribute, imageAttribute, protoGM, imageGM);
				
				rule.getAssignAttributeStatements().add(assignAttribute);
			}
		}
	}

	private static String getSetterName(GenFeature genFeature) {
		return genFeature.getEcoreFeature().isMany() 
			? genFeature.getGetAccessor()
			: "set" + genFeature.getAccessorName();
	}

	private static GenFeature getGenFeature(GenPackage genPackage, EStructuralFeature feature) {
		GenClassifier genClassifier = getGenClassifier(genPackage, feature.getEContainingClass());
		if (genClassifier instanceof GenClass == false) {
			throw new IllegalArgumentException("GenClass not found for " + feature.getEContainingClass().getName());
		}
		GenClass genClass = (GenClass) genClassifier;
		
		List allGenFeatures = genClass.getAllGenFeatures();
		for (Iterator iter = allGenFeatures.iterator(); iter.hasNext();) {
			GenFeature genFeature = (GenFeature) iter.next();
			if (genFeature.getEcoreFeature() == feature) {
				return genFeature;
			}
		}
		throw new IllegalArgumentException("GenFeature not found for " + feature.getEContainingClass().getName() + "." + feature.getName());
	}

	private static TypeName getTypeName(GenPackage genPackage, EClassifier eClassifier) {
		GenClassifier genClassifier = getGenClassifier(genPackage, eClassifier);
		if (genClassifier == null) {
			if (eClassifier.getInstanceClassName() != null) {
				return createTypeName(eClassifier.getInstanceClassName());
			}
			throw new IllegalArgumentException("GenClass not found for " + eClassifier.getName());
		}
		if (genClassifier instanceof GenClass) {
			GenClass genClass = (GenClass) genClassifier;
			return createClassName(genClass.getQualifiedInterfaceName());
		}
		if (genClassifier instanceof GenDataType) {
			GenDataType genDataType = (GenDataType) genClassifier;
			String name = genDataType.getQualifiedInstanceClassName();
			
			TypeName typeName = createTypeName(name);
			if (typeName != null) {
				return typeName;
			}
			return createClassName(name);
		}
		throw new IllegalStateException();
	}

	private static TypeName createTypeName(String name) {
		EEnumLiteral enumLiteral = AstransformationPackage.eINSTANCE.getBasicType().getEEnumLiteral(name);
		if (enumLiteral != null) {
			BasicTypeName typeName = AstransformationFactory.eINSTANCE.createBasicTypeName();
			typeName.setType((BasicType) enumLiteral.getInstance());
			return typeName;
		}
		return null;
	}

	private static GenClassifier getGenClassifier(GenPackage genPackage, EClassifier eClass) {
		GenClassifier found = lookupGenClass(genPackage, eClass);
		if (found == null) {
			GenModel genModel = genPackage.getGenModel();
			GenPackage externalPackage = genModel.findGenPackage(eClass.getEPackage());
			found = lookupGenClass(externalPackage, eClass);
		}
		return found;
	}

	private static GenClassifier lookupGenClass(GenPackage genPackage, EClassifier eClassifier) {
		EList genClassifiers = genPackage.getGenClassifiers();
		for (Iterator iter = genClassifiers.iterator(); iter.hasNext();) {
			GenClassifier genClassifier = (GenClassifier) iter.next();
			if (genClassifier.getEcoreClassifier() == eClassifier) {
				return genClassifier;
			}
		}
		return null;
	}
	
	private static void initAssignFeature(AssignFeature assignFeature, EStructuralFeature proto, EStructuralFeature image, GenPackage protoGM, GenPackage imageGM) {
		assignFeature.setSetterName(getSetterName(getGenFeature(protoGM, proto)));
		assignFeature.setGetterName(getGenFeature(imageGM, image).getGetAccessor());
		assignFeature.setMany(proto.isMany());
	}
	
	private static ClassName createClassName(String className) {
		ClassName result = AstransformationFactory.eINSTANCE.createClassName();
		result.setName(className);
		return result;
	}
}
 