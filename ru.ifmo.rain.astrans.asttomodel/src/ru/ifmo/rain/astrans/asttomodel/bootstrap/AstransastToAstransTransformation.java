package ru.ifmo.rain.astrans.asttomodel.bootstrap;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.AstransFactory;
import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.MappedEClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;
import ru.ifmo.rain.astrans.astransast.AttributeAS;
import ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS;
import ru.ifmo.rain.astrans.astransast.CreateClassAS;
import ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS;
import ru.ifmo.rain.astrans.astransast.MappedEClassAS;
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
	
		public MappedEClass caseMappedEClassAS(final MappedEClassAS mappedEClassAS) {
			final MappedEClass mappedEClass = AstransFactory.eINSTANCE.createMappedEClass();
			
			addCommand(new Runnable() {
				public void run() {
					mappedEClass.setProto(getResolver().resolveMappedEClassProto(mappedEClassAS.getProto()));
				}
			});
		
			
			getTrace().mappedEClassCreated(mappedEClassAS, mappedEClass);
		
			return mappedEClass;
		}

		public TranslateReferences caseTranslateReferencesAS(final TranslateReferencesAS translateReferencesAS) {
			final TranslateReferences translateReferences = AstransFactory.eINSTANCE.createTranslateReferences();
			
			addCommand(new Runnable() {
				public void run() {
					translateReferences.setModelReferenceTypeProto(getResolver().resolveTranslateReferencesModelReferenceTypeProto(translateReferencesAS.getModelReferenceTypeProto()));
					translateReferences.setTextualReferenceType(getResolver().resolveTranslateReferencesTextualReferenceType(translateReferencesAS.getTextualReferenceType()));
				}
			});
		
			
			translateReferences.setCrossReferencesOnly(translateReferencesAS.isCrossReferencesOnly());
			translateReferences.setIncludeDescendants(translateReferencesAS.isIncludeDescendants());
			
			getTrace().translateReferencesCreated(translateReferencesAS, translateReferences);
		
			return translateReferences;
		}

		public CreateClass caseCreateClassAS(final CreateClassAS createClassAS) {
			final CreateClass createClass = AstransFactory.eINSTANCE.createCreateClass();
			
			addCommand(new Runnable() {
				public void run() {
					for (Iterator i = createClassAS.getSuperclasses().iterator(); i.hasNext(); ) {
						createClass.getSuperclasses().add(getResolver().resolveCreateClassSuperclasses((EClassifierReferenceAS) i.next()));
					}
				}
			});
		
			
			createClass.setName(createClassAS.getName());
			createClass.setAbstract(createClassAS.isAbstract());
			
			doSwitch(createClass.getStructuralFeatures(), createClassAS.getStructuralFeatures());
			
			getTrace().createClassCreated(createClassAS, createClass);
		
			return createClass;
		}

		public Attribute caseAttributeAS(final AttributeAS attributeAS) {
			final Attribute attribute = AstransFactory.eINSTANCE.createAttribute();
			
			addCommand(new Runnable() {
				public void run() {
					attribute.setType(getResolver().resolveAttributeType(attributeAS.getType()));
				}
			});
		
			
			attribute.setName(attributeAS.getName());
			attribute.setLowerBound(attributeAS.getLowerBound());
			attribute.setUpperBound(attributeAS.getUpperBound());
			
			getTrace().attributeCreated(attributeAS, attribute);
		
			return attribute;
		}

		public Reference caseReferenceAS(final ReferenceAS referenceAS) {
			final Reference reference = AstransFactory.eINSTANCE.createReference();
			
			addCommand(new Runnable() {
				public void run() {
					reference.setType(getResolver().resolveReferenceType(referenceAS.getType()));
				}
			});
		
			
			reference.setName(referenceAS.getName());
			reference.setLowerBound(referenceAS.getLowerBound());
			reference.setUpperBound(referenceAS.getUpperBound());
			reference.setContainment(referenceAS.isContainment());
			
			getTrace().referenceCreated(referenceAS, reference);
		
			return reference;
		}

		public ChangeInheritance caseChangeInheritanceAS(final ChangeInheritanceAS changeInheritanceAS) {
			final ChangeInheritance changeInheritance = AstransFactory.eINSTANCE.createChangeInheritance();
			
			addCommand(new Runnable() {
				public void run() {
					for (Iterator i = changeInheritanceAS.getSuperclasses().iterator(); i.hasNext(); ) {
						changeInheritance.getSuperclasses().add(getResolver().resolveChangeInheritanceSuperclasses((EClassifierReferenceAS) i.next()));
					}
				}
			});
		
			
			changeInheritance.setSubject((MappedEClass) doSwitch(changeInheritanceAS.getSubject()));
			
			getTrace().changeInheritanceCreated(changeInheritanceAS, changeInheritance);
		
			return changeInheritance;
		}

		public SkipClass caseSkipClassAS(final SkipClassAS skipClassAS) {
			final SkipClass skipClass = AstransFactory.eINSTANCE.createSkipClass();
			
			addCommand(new Runnable() {
				public void run() {
					skipClass.setTargetProto(getResolver().resolveSkipClassTargetProto(skipClassAS.getTargetProto()));
				}
			});
		
			
			skipClass.setIncludeDescendants(skipClassAS.isIncludeDescendants());
			
			getTrace().skipClassCreated(skipClassAS, skipClass);
		
			return skipClass;
		}

		public Transformation caseTransformationAS(final TransformationAS transformationAS) {
			final Transformation transformation = AstransFactory.eINSTANCE.createTransformation();
			
			addCommand(new Runnable() {
				public void run() {
					transformation.setInput(getResolver().resolveTransformationInput(transformationAS.getInput()));
					transformation.setInputModelRoot(getResolver().resolveTransformationInputModelRoot(transformationAS.getInputModelRoot()));
					transformation.setAstRoot(getResolver().resolveTransformationAstRoot(transformationAS.getAstRoot()));
				}
			});
		
			
			transformation.setOutputName(transformationAS.getOutputName());
			transformation.setOutputNsURI(transformationAS.getOutputNsURI());
			
			doSwitch(transformation.getCreateClassActions(), transformationAS.getCreateClassActions());
			doSwitch(transformation.getTranslateReferencesActions(), transformationAS.getTranslateReferencesActions());
			doSwitch(transformation.getChangeInheritanceActions(), transformationAS.getChangeInheritanceActions());
			doSwitch(transformation.getSkipClassActions(), transformationAS.getSkipClassActions());
			
			getTrace().transformationCreated(transformationAS, transformation);
		
			return transformation;
		}
	};

	public AstransastToAstransTransformation(ITransformationContextFactory<IAstransastToAstransResolver, IAstransastToAstransTrace> contextFactory) {
		super(contextFactory);
	}
	
	public Transformation run(TransformationAS transformationAS) {
		Transformation transformation = (Transformation) this.transformer.doSwitch(transformationAS);
		performAllCommands();
		return transformation;
	}	
}