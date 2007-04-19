package ru.ifmo.rain.astrans;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astransast.AttributeAS;
import ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS;
import ru.ifmo.rain.astrans.astransast.CreateClassAS;
import ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS;
import ru.ifmo.rain.astrans.astransast.ReferenceAS;
import ru.ifmo.rain.astrans.astransast.SkipClassAS;
import ru.ifmo.rain.astrans.astransast.TransformationAS;
import ru.ifmo.rain.astrans.astransast.TranslateReferencesAS;

import ru.ifmo.rain.astrans.astransast.util.AstransastSwitch;

import ru.ifmo.rain.astrans.asttomodel.ASTToModelTransformation;
import ru.ifmo.rain.astrans.asttomodel.ITransformationContextFactory;

public class AstransastToAstransTransformation extends ASTToModelTransformation<IAstransastToAstransResolver, IAstransastToAstransTrace> {
	private final AstransastSwitch transformer = new AstransastSwitch() {
		public void doSwitch(EList target, EList source) {
			for (Iterator i = source.iterator(); i.hasNext(); ) {
				target.add(doSwitch((EObject) i.next()));
			}
		}
	
		public TranslateReferences caseTranslateReferencesAS(final TranslateReferencesAS translateReferencesAS) {
			final TranslateReferences translateReferences = AstransFactory.eINSTANCE.createTranslateReferences();
		
			translateReferences.setIncludeDescendants(translateReferencesAS.isIncludeDescendants());
			translateReferences.setTextualReferenceType((EClassifierReference) doSwitch(translateReferencesAS.getTextualReferenceType()));
			getTrace().translateReferencesCreated(translateReferencesAS, translateReferences);
		
			addCommand(new Runnable() {
				public void run() {
					translateReferences.setModelReferenceTypeProto(getResolver().resolveTranslateReferencesModelReferenceTypeProto(translateReferencesAS.getModelReferenceTypeProto()));
				}
			});
		
			return translateReferences;
		}

		public CreateClass caseCreateClassAS(final CreateClassAS createClassAS) {
			final CreateClass createClass = AstransFactory.eINSTANCE.createCreateClass();
		
			createClass.setName(createClassAS.getName());
			createClass.setAbstract(createClassAS.isAbstract());
			doSwitch(createClass.getStructuralFeatures(), createClassAS.getStructuralFeatures());
			getTrace().createClassCreated(createClassAS, createClass);
		
			addCommand(new Runnable() {
				public void run() {
					for (Iterator i = createClass.getSuperclasses().iterator(); i.hasNext(); ) {
						createClass.getSuperclasses().add(getResolver().resolveCreateClassSuperclasses((EClassifierReferenceAS) i.next()));
					}
				}
			});
		
			return createClass;
		}

		public Attribute caseAttributeAS(final AttributeAS attributeAS) {
			final Attribute attribute = AstransFactory.eINSTANCE.createAttribute();
		
			attribute.setName(attributeAS.getName());
			attribute.setLowerBound(attributeAS.getLowerBound());
			attribute.setUpperBound(attributeAS.getUpperBound());
			getTrace().attributeCreated(attributeAS, attribute);
		
			addCommand(new Runnable() {
				public void run() {
					attribute.setType(getResolver().resolveAttributeType(attributeAS.getType()));
				}
			});
		
			return attribute;
		}

		public Reference caseReferenceAS(final ReferenceAS referenceAS) {
			final Reference reference = AstransFactory.eINSTANCE.createReference();
		
			reference.setName(referenceAS.getName());
			reference.setLowerBound(referenceAS.getLowerBound());
			reference.setUpperBound(referenceAS.getUpperBound());
			reference.setContainment(referenceAS.isContainment());
			getTrace().referenceCreated(referenceAS, reference);
		
			addCommand(new Runnable() {
				public void run() {
					reference.setType(getResolver().resolveReferenceType(referenceAS.getType()));
				}
			});
		
			return reference;
		}

		public ChangeInheritance caseChangeInheritanceAS(final ChangeInheritanceAS changeInheritanceAS) {
			final ChangeInheritance changeInheritance = AstransFactory.eINSTANCE.createChangeInheritance();
		
			getTrace().changeInheritanceCreated(changeInheritanceAS, changeInheritance);
		
			addCommand(new Runnable() {
				public void run() {
					changeInheritance.setTargetProto(getResolver().resolveChangeInheritanceTargetProto(changeInheritanceAS.getTargetProto()));
					for (Iterator i = changeInheritance.getSuperclasses().iterator(); i.hasNext(); ) {
						changeInheritance.getSuperclasses().add(getResolver().resolveChangeInheritanceSuperclasses((EClassifierReferenceAS) i.next()));
					}
				}
			});
		
			return changeInheritance;
		}

		public SkipClass caseSkipClassAS(final SkipClassAS skipClassAS) {
			final SkipClass skipClass = AstransFactory.eINSTANCE.createSkipClass();
		
			skipClass.setIncludeDescendants(skipClassAS.isIncludeDescendants());
			getTrace().skipClassCreated(skipClassAS, skipClass);
		
			addCommand(new Runnable() {
				public void run() {
					skipClass.setTargetProto(getResolver().resolveSkipClassTargetProto(skipClassAS.getTargetProto()));
				}
			});
		
			return skipClass;
		}

		public Transformation caseTransformationAS(final TransformationAS transformationAS) {
			final Transformation transformation = AstransFactory.eINSTANCE.createTransformation();
		
			transformation.setOutputName(transformationAS.getOutputName());
			transformation.setOutputNsURI(transformationAS.getOutputNsURI());
			doSwitch(transformation.getCreateClassActions(), transformationAS.getCreateClassActions());
			doSwitch(transformation.getTranslateReferencesActions(), transformationAS.getTranslateReferencesActions());
			doSwitch(transformation.getChangeInheritanceActions(), transformationAS.getChangeInheritanceActions());
			doSwitch(transformation.getSkipClassActions(), transformationAS.getSkipClassActions());
			getTrace().transformationCreated(transformationAS, transformation);
		
			addCommand(new Runnable() {
				public void run() {
					transformation.setInput(getResolver().resolveTransformationInput(transformationAS.getInput()));
					transformation.setInputModelRoot(getResolver().resolveTransformationInputModelRoot(transformationAS.getInputModelRoot()));
					transformation.setAstRoot(getResolver().resolveTransformationAstRoot(transformationAS.getAstRoot()));
				}
			});
		
			return transformation;
		}
	};

	protected AstransastToAstransTransformation(ITransformationContextFactory<IAstransastToAstransResolver, IAstransastToAstransTrace> contextFactory) {
		super(contextFactory);
	}
}