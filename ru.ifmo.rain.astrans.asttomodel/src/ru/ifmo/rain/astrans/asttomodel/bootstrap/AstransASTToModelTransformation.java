package ru.ifmo.rain.astrans.asttomodel.bootstrap;

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
import ru.ifmo.rain.astrans.AstransFactory;
import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;

public class AstransASTToModelTransformation extends ASTToModelTransformation<IResolver, ITrace> {

	private final AstransastSwitch creator = new AstransastSwitch() {
		@Override
		public Transformation caseTransformationAS(final TransformationAS transformationAS) {
			final Transformation transformation = AstransFactory.eINSTANCE.createTransformation();
			
			transformation.setOutputName(transformationAS.getOutputName());
			transformation.setOutputNsURI(transformationAS.getOutputNsURI());
			
			addEListImageToAnotherEList(
					transformationAS.getCreateClassActions(), 
					transformation.getCreateClassActions());
			addEListImageToAnotherEList(
					transformationAS.getSkipClassActions(), 
					transformation.getSkipClassActions());
			addEListImageToAnotherEList(
					transformationAS.getTranslateReferencesActions(), 
					transformation.getTranslateReferencesActions());
			addEListImageToAnotherEList(
					transformationAS.getChangeInheritanceActions(), 
					transformation.getChangeInheritanceActions());

			getTrace().transformationCreated(transformationAS, transformation);
			
			addCommand(new Runnable() {
				public void run() {
					transformation.setInput(getResolver()
							.resolveTransformationInput(transformationAS
									.getInput()));
				}
			});
			return transformation;
		}
		
		@Override
		public Attribute caseAttributeAS(final AttributeAS attributeAS) {
			final Attribute attribute = AstransFactory.eINSTANCE.createAttribute();
			
			attribute.setLowerBound(attributeAS.getLowerBound());
			attribute.setUpperBound(attributeAS.getUpperBound());
			attribute.setName(attributeAS.getName());
			
			getTrace().attributeCreated(attributeAS, attribute);
			
			addCommand(new Runnable() {
				public void run() {
					attribute.setType(getResolver().resolveAttributeType(attributeAS
							.getType()));
				}
			});
			return attribute;
		}
		
		@Override
		public Reference caseReferenceAS(final ReferenceAS referenceAS) {
			final Reference reference = AstransFactory.eINSTANCE.createReference();
			
			reference.setLowerBound(referenceAS.getLowerBound());
			reference.setUpperBound(referenceAS.getUpperBound());
			reference.setName(referenceAS.getName());
			reference.setContainment(referenceAS.isContainment());

			getTrace().referenceCreated(referenceAS, reference);
			
			addCommand(new Runnable() {
				public void run() {
					reference.setType(getResolver().resolveReferenceType(referenceAS
							.getType()));
				}
			});			
			return reference;
		}
		
		@Override
		public CreateClass caseCreateClassAS(final CreateClassAS createClassAS) {
			final CreateClass createClass = AstransFactory.eINSTANCE.createCreateClass();
			
			createClass.setName(createClassAS.getName());
			createClass.setAbstract(createClassAS.isAbstract());
			
			addEListImageToAnotherEList(createClassAS.getStructuralFeatures(), createClass.getStructuralFeatures());
			
			getTrace().createClassCreated(createClassAS, createClass);

			addCommand(new Runnable() {
				@SuppressWarnings("unchecked")
				public void run() {
					EList superclasses = createClassAS.getSuperclasses();
					for (Iterator iter = superclasses.iterator(); iter.hasNext();) {
						EClassifierReferenceAS superClassQN = (EClassifierReferenceAS) iter.next();

						createClass.getSuperclasses().add(getResolver().resolveCreateClassSuperclass(superClassQN));
					}
				}
			});				
			return createClass;
		}
		
		@Override
		public SkipClass caseSkipClassAS(final SkipClassAS skipClassAS) {
			final SkipClass skipClass = AstransFactory.eINSTANCE.createSkipClass();
			
			skipClass.setIncludeDescendants(skipClassAS.isIncludeDescendants());
			
			getTrace().skipClassCreated(skipClassAS, skipClass);
			
			addCommand(new Runnable() {
				public void run() {
					skipClass.setTargetProto(getResolver()
							.resolveSkipClassTargetProto(skipClassAS
									.getTargetProto()));
				}
			});			
			return skipClass ;
		}
		
		@Override
		public TranslateReferences caseTranslateReferencesAS(final TranslateReferencesAS translateReferencesAS) {
			final TranslateReferences translateReferences = AstransFactory.eINSTANCE.createTranslateReferences();
			
			translateReferences.setIncludeDescendants(translateReferencesAS.isIncludeDescendants());
			
			getTrace().translateReferencesCreated(translateReferencesAS, translateReferences);
			
			addCommand(new Runnable() {
				public void run() {
					translateReferences
							.setModelReferenceTypeProto(getResolver()
									.resolveTranslateReferencesModelReferenceTypeProto(translateReferencesAS
											.getModelReferenceTypeProto()));
					translateReferences
							.setTextualReferenceType(getResolver()
									.resolveTranslateReferencesTextualReferenceType(translateReferencesAS
											.getTextualReferenceType()));
				}
			});			
			return translateReferences;
		}
		
		@Override
		public ChangeInheritance caseChangeInheritanceAS(final ChangeInheritanceAS changeInheritanceAS) {
			final ChangeInheritance changeInheritance = AstransFactory.eINSTANCE.createChangeInheritance();
			
			getTrace().changeInheritanceCreated(changeInheritanceAS, changeInheritance);
			
			addCommand(new Runnable() {
				@SuppressWarnings("unchecked")
				public void run() {
					changeInheritance.setTargetProto(
							getResolver().resolveChangeInheritanceTargetProto(
									changeInheritanceAS.getTargetProto()));
					EList superclasses = changeInheritanceAS.getSuperclasses();
					for (Iterator iter = superclasses.iterator(); iter.hasNext();) {
						EClassifierReferenceAS superclass = (EClassifierReferenceAS) iter.next();
						changeInheritance.getSuperclasses().add(getResolver().resolveChangeInheritanceSuperclass(superclass));
					}
				}
			});			
			return changeInheritance;
		}

		@SuppressWarnings("unchecked")
		private void addEListImageToAnotherEList(EList source, EList dest) {
			for (Iterator iter = source.iterator(); iter.hasNext();) {
				EObject element = (EObject) iter.next();
				dest.add(doSwitch(element));
			}
		}
		
	};
	
	public AstransASTToModelTransformation(ITransformationContextFactory<IResolver, ITrace> contextFactory) {
		super(contextFactory);
	}

	public Transformation run(TransformationAS transformationAS) {
		Transformation transformation = (Transformation) creator.doSwitch(transformationAS);
		performAllCommands();
		return transformation;
	}
}
