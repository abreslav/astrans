package ru.ifmo.rain.astrans.interpreter.backtrans;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;

import ru.ifmo.rain.astrans.astransformation.AssignAttribute;
import ru.ifmo.rain.astrans.astransformation.AssignReference;
import ru.ifmo.rain.astrans.astransformation.AstransformationFactory;
import ru.ifmo.rain.astrans.astransformation.MappingRule;
import ru.ifmo.rain.astrans.astransformation.ResolveObject;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.trace.ClassMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMappingType;

public class BacktransCreator {

	@SuppressWarnings("unchecked")
	public static Transformation createBackTransformation(TraceAdapter trace, GenPackage protoGM, GenPackage imageGM) {
		Transformation backTransformation = AstransformationFactory.eINSTANCE.createTransformation();
		String name = uppercaseFirstLetter(trace.getOutput().getName()) + "To" + uppercaseFirstLetter(trace.getInput().getName());
		backTransformation.setName(name + "Transformation");
		backTransformation.setResolverClassName("I" + name + "Resolver");
		backTransformation.setTraceClassName("I" + name + "Trace");
	
		Collection<ClassMapping> mappings = trace.getClassMappings();
		for (ClassMapping mapping : mappings) {
			MappingRule rule = AstransformationFactory.eINSTANCE.createMappingRule();
			backTransformation.getMappingRules().add(rule);
			rule.setName("case" + mapping.getImage().getName());

			rule.setResult(AstransformationFactory.eINSTANCE.createParameter());
			rule.getResult().setName(lowercaseFirstLetter(mapping.getProto().getName()));
			rule.getResult().setType(mapping.getProto().getName());
			
			rule.setParameter(AstransformationFactory.eINSTANCE.createParameter());
			rule.getParameter().setType(mapping.getImage().getName());
			rule.getParameter().setName(lowercaseFirstLetter(mapping.getImage().getName()));
			
			rule.setWriteTraceStatement(AstransformationFactory.eINSTANCE.createWriteTrace());
			rule.getWriteTraceStatement().setTraceMethodName(lowercaseFirstLetter(mapping.getProto().getName()) + "Created");
			
			if (mapping.getProto() == trace.getInputRoot() && mapping.getImage() == trace.getOutputRoot()) {
				backTransformation.setMain(rule);
			}
		
			EList allAttributes = mapping.getProto().getEAllAttributes();
			for (Iterator iter = allAttributes.iterator(); iter.hasNext();) {
				EAttribute attribute = (EAttribute) iter.next();
				AssignAttribute assignAttribute = AstransformationFactory.eINSTANCE.createAssignAttribute();
				assignAttribute.setSetterName(attribute.getName());
				assignAttribute.setGetterName(trace.getAttributeMapping(attribute).getImage().getName());
				rule.getAssignAttributeStatements().add(assignAttribute);
			}
			
			EList allReferences = mapping.getProto().getEAllReferences();
			for (Iterator iter = allReferences.iterator(); iter.hasNext();) {
				EReference reference = (EReference) iter.next();
				ReferenceMapping referenceMapping = trace.getReferenceMapping(reference);
				if (referenceMapping.getType() == ReferenceMappingType.TRANSLATED_LITERAL) {
					ResolveObject resolveObject = AstransformationFactory.eINSTANCE.createResolveObject();
					resolveObject.setDest(reference);
					resolveObject.setSource(referenceMapping.getImage());
					resolveObject.setResolverMethodName("resolve" + mapping.getProto().getName() + uppercaseFirstLetter(reference.getName()));
					rule.getResolveObjectStatements().add(resolveObject);
				} else {
					AssignReference assignReference = AstransformationFactory.eINSTANCE.createAssignReference();
					assignReference.setDest(reference);
					assignReference.setSource((EReference) referenceMapping.getImage());
					assignReference.setMappingNeeded(referenceMapping.getType() != ReferenceMappingType.NONE_LITERAL);
					rule.getAssignReferenceStatements().add(assignReference);
				}
			}
		}
		
		return backTransformation;
	}

	private static String lowercaseFirstLetter(String name) {
//		return Character.toLowerCase(name.charAt(0)) + name.substring(1);
		return CodeGenUtil.uncapName(name);
	}
	
	private static String uppercaseFirstLetter(String name) {
//		return Character.toUpperCase(name.charAt(0)) + name.substring(1);
		return CodeGenUtil.capName(name);
	}
}