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
import org.eclipse.emf.ecore.EClass;
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
import ru.ifmo.rain.astrans.astransformation.CustomMainMethod;
import ru.ifmo.rain.astrans.astransformation.MappingRule;
import ru.ifmo.rain.astrans.astransformation.Parameter;
import ru.ifmo.rain.astrans.astransformation.ResolveObject;
import ru.ifmo.rain.astrans.astransformation.ResolveObjects;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.astransformation.TypeName;
import ru.ifmo.rain.astrans.trace.AttributeMapping;
import ru.ifmo.rain.astrans.trace.ClassMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMappingType;

public class BacktransCreator {

	private final TraceAdapter trace;
	private final GenPackage protoGP;
	private final GenPackage imageGP;
	private final IReferenceOrderProvider orderProvider;
	
	public BacktransCreator(final TraceAdapter trace, final GenPackage protoGP, final GenPackage imageGP, final IReferenceOrderProvider orderProvider) {
		this.trace = trace;
		this.protoGP = protoGP;
		this.imageGP = imageGP;
		this.orderProvider = orderProvider;
	}

	public Transformation createBackTransformation() {
		Transformation backTransformation = AstransformationFactory.eINSTANCE.createTransformation();
		
		String name = CodeGenUtil.capName(trace.getOutput().getName()) + "To" + CodeGenUtil.capName(trace.getInput().getName());
		backTransformation.setName(name + "Transformation");
		backTransformation.setResolverClassName("I" + name + "Resolver");
		backTransformation.setTraceClassName("I" + name + "Trace");
		backTransformation.setSwitchClassName(createClassName(imageGP.getQualifiedSwitchClassName()));
	
		processMappings(backTransformation);
		
		if (backTransformation.getMain() == null) {
			CustomMainMethod method = AstransformationFactory.eINSTANCE.createCustomMainMethod();
			method.setName("run");
			method.setParameter(createParameter(trace.getOutputRoot(), imageGP));
			method.setResult(createParameter(trace.getInputRoot(), protoGP));
			method.setResolverMethodName("runTransformation");
			backTransformation.setCustomMain(method);
		}
		
		return backTransformation;
	}

	private void processMappings(Transformation backTransformation) {
		Collection<ClassMapping> mappings = trace.getClassMappings();
		for (ClassMapping mapping : mappings) {
			if (!mapping.getProto().isAbstract()) {
				MappingRule rule = AstransformationFactory.eINSTANCE.createMappingRule();
				initMappingRule(backTransformation, mapping, rule);
				
				rule.setFactoryClassName(createClassName(protoGP.getQualifiedFactoryInterfaceName()));
				rule.setFactoryMethodName("create" + mapping.getProto().getName()); 
				rule.setWriteTraceStatement(AstransformationFactory.eINSTANCE.createWriteTrace());
				rule.getWriteTraceStatement().setTraceMethodName(CodeGenUtil.uncapName(mapping.getProto().getName()) + "Created");
				processAttributes(mapping, rule);
				processReferences(mapping, rule);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void initMappingRule(Transformation backTransformation, ClassMapping mapping, MappingRule rule) {
		backTransformation.getMappingRules().add(rule);

		rule.setName("case" + mapping.getImage().getName());

		rule.setResult(createParameter(mapping.getProto(), protoGP));
		rule.setParameter(createParameter(mapping.getImage(), imageGP));

		if (mapping.getProto() == trace.getInputRoot() && mapping.getImage() == trace.getOutputRoot()) {
			backTransformation.setMain(rule);
		}		
	}

	@SuppressWarnings("unchecked")
	private void processReferences(ClassMapping mapping, MappingRule rule) {
		ResolveObjects resolveObjects = null;
		for (EReference reference : orderProvider.getReferenceOrder(mapping.getProto())) {
			ReferenceMapping referenceMapping = trace.getReferenceMapping(reference);
			if (referenceMapping == null) {
				continue;
			}
			EStructuralFeature imageReference = referenceMapping.getImage();
			if (referenceMapping.getType() == ReferenceMappingType.TRANSLATED_LITERAL) {
				ResolveObject resolveObject = AstransformationFactory.eINSTANCE.createResolveObject();
				initAssignFeature(resolveObject, reference, imageReference, protoGP, imageGP);
				resolveObject.setResolverMethodName("resolve" + mapping.getProto().getName() + CodeGenUtil.capName(reference.getName()));
				
				resolveObject.setParameterName(imageReference.getName());
				resolveObject.setParameterType(getTypeName(imageGP, imageReference.getEType()));
				resolveObject.setType((ClassName) getTypeName(protoGP, reference.getEReferenceType()));
				if (resolveObjects == null) {
					resolveObjects = AstransformationFactory.eINSTANCE.createResolveObjects();
					rule.getAssignReferenceStatements().add(resolveObjects);
				}
				resolveObjects.getResolveObjectStatements().add(resolveObject);
			} else {
				resolveObjects = null;
				
				AssignReference assignReference = AstransformationFactory.eINSTANCE.createAssignReference();
				initAssignFeature(assignReference, reference, imageReference, protoGP, imageGP);
				assignReference.setMappingNeeded(referenceMapping.getType() != ReferenceMappingType.NONE_LITERAL);
				assignReference.setType((ClassName) getTypeName(protoGP, reference.getEType()));
				rule.getAssignReferenceStatements().add(assignReference);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void processAttributes(ClassMapping mapping, MappingRule rule) {
		EList allAttributes = mapping.getProto().getEAllAttributes();
		for (Iterator iter = allAttributes.iterator(); iter.hasNext();) {
			EAttribute attribute = (EAttribute) iter.next();
			AssignAttribute assignAttribute = AstransformationFactory.eINSTANCE.createAssignAttribute();
			AttributeMapping attributeMapping = trace.getAttributeMapping(attribute);
			if (attributeMapping != null) {
				EAttribute imageAttribute = attributeMapping.getImage();
				initAssignFeature(assignAttribute, attribute, imageAttribute, protoGP, imageGP);
				
				rule.getAssignAttributeStatements().add(assignAttribute);
			}
		}
	}

	// UTILITIES
	
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
	
	private static void initAssignFeature(AssignFeature assignFeature, EStructuralFeature proto, EStructuralFeature image, GenPackage protoGP, GenPackage imageGP) {
		assignFeature.setSetterName(getSetterName(getGenFeature(protoGP, proto)));
		assignFeature.setGetterName(getGenFeature(imageGP, image).getGetAccessor());
		assignFeature.setMany(proto.isMany());
	}
	
	private static ClassName createClassName(String className) {
		ClassName result = AstransformationFactory.eINSTANCE.createClassName();
		result.setName(className);
		return result;
	}
	
	private static Parameter createParameter(EClass type, GenPackage genPackage) {
		Parameter parameter = AstransformationFactory.eINSTANCE.createParameter();
		parameter.setName(CodeGenUtil.uncapName(type.getName()));
		parameter.setType((ClassName) getTypeName(genPackage, type));
		return parameter;
	}
}
 