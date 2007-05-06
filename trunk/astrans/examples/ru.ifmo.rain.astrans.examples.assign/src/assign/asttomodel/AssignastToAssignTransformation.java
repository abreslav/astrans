package assign.asttomodel;

import assign.AssignFactory;
import assign.AssignModel;
import assign.BooleanLiteral;
import assign.CopyObject;
import assign.CreateInstance;
import assign.DynamicEClassReference;
import assign.EClassReference;
import assign.EObjectReference;
import assign.EnumLiteral;
import assign.Expression;
import assign.FeatureAccess;
import assign.ManyFeatureAppend;
import assign.SingleFeatureAssignment;
import assign.StaticEClassReference;
import assign.StringLiteral;
import assign.Variable;
import assign.VariableAssignment;

import assignast.AssignModelAS;
import assignast.BooleanLiteralAS;
import assignast.CopyObjectAS;
import assignast.CreateInstanceAS;
import assignast.DynamicEClassReferenceAS;
import assignast.EObjectReferenceAS;
import assignast.EnumLiteralAS;
import assignast.FeatureAccessAS;
import assignast.ManyFeatureAppendAS;
import assignast.SingleFeatureAssignmentAS;
import assignast.StaticEClassReferenceAS;
import assignast.StringLiteralAS;
import assignast.Unit;
import assignast.VariableAS;
import assignast.VariableAssignmentAS;

import assignast.util.AssignastSwitch;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.asttomodel.ASTToModelTransformation;
import ru.ifmo.rain.astrans.asttomodel.ITransformationContextFactory;

public class AssignastToAssignTransformation extends ASTToModelTransformation<IAssignastToAssignResolver, IAssignastToAssignTrace> {
	private final AssignastSwitch transformer = new AssignastSwitch() {
		public void doSwitch(EList target, EList source) {
			for (Iterator i = source.iterator(); i.hasNext(); ) {
				target.add(doSwitch((EObject) i.next()));
			}
		}
	
		public AssignModel caseAssignModelAS(final AssignModelAS assignModelAS) {
			final AssignModel assignModel = AssignFactory.eINSTANCE.createAssignModel();
		
			
			doSwitch(assignModel.getAssignments(), assignModelAS.getAssignments());
			
			getTrace().assignModelCreated(assignModelAS, assignModel);
		
			return assignModel;
		}

		public VariableAssignment caseVariableAssignmentAS(final VariableAssignmentAS variableAssignmentAS) {
			final VariableAssignment variableAssignment = AssignFactory.eINSTANCE.createVariableAssignment();
		
			
			variableAssignment.setVariableName(variableAssignmentAS.getVariableName());
			variableAssignment.setReturned(variableAssignmentAS.isReturned());
			
			variableAssignment.setExpression((Expression) doSwitch(variableAssignmentAS.getExpression()));
			
			getTrace().variableAssignmentCreated(variableAssignmentAS, variableAssignment);
		
			return variableAssignment;
		}

		public ManyFeatureAppend caseManyFeatureAppendAS(final ManyFeatureAppendAS manyFeatureAppendAS) {
			final ManyFeatureAppend manyFeatureAppend = AssignFactory.eINSTANCE.createManyFeatureAppend();
		
			
			manyFeatureAppend.setExpression((Expression) doSwitch(manyFeatureAppendAS.getExpression()));
			manyFeatureAppend.setObject((FeatureAccess) doSwitch(manyFeatureAppendAS.getObject()));
			
			getTrace().manyFeatureAppendCreated(manyFeatureAppendAS, manyFeatureAppend);
		
			return manyFeatureAppend;
		}

		public SingleFeatureAssignment caseSingleFeatureAssignmentAS(final SingleFeatureAssignmentAS singleFeatureAssignmentAS) {
			final SingleFeatureAssignment singleFeatureAssignment = AssignFactory.eINSTANCE.createSingleFeatureAssignment();
		
			
			singleFeatureAssignment.setExpression((Expression) doSwitch(singleFeatureAssignmentAS.getExpression()));
			singleFeatureAssignment.setObject((FeatureAccess) doSwitch(singleFeatureAssignmentAS.getObject()));
			
			getTrace().singleFeatureAssignmentCreated(singleFeatureAssignmentAS, singleFeatureAssignment);
		
			return singleFeatureAssignment;
		}

		public Variable caseVariableAS(final VariableAS variableAS) {
			final Variable variable = AssignFactory.eINSTANCE.createVariable();
			
			addCommand(new Runnable() {
				public void run() {
					variable.setVariableAssignment(getResolver().resolveVariableVariableAssignment(variableAS.getVariableAssignment(), variable));
				}
			});
		
			
			getTrace().variableCreated(variableAS, variable);
		
			return variable;
		}

		public FeatureAccess caseFeatureAccessAS(final FeatureAccessAS featureAccessAS) {
			final FeatureAccess featureAccess = AssignFactory.eINSTANCE.createFeatureAccess();
			
			featureAccess.setObject((Expression) doSwitch(featureAccessAS.getObject()));
			
			addCommand(new Runnable() {
				public void run() {
					featureAccess.setFeature(getResolver().resolveFeatureAccessFeature(featureAccessAS.getFeature(), featureAccess));
				}
			});
		
			
			getTrace().featureAccessCreated(featureAccessAS, featureAccess);
		
			return featureAccess;
		}

		public EObjectReference caseEObjectReferenceAS(final EObjectReferenceAS eObjectReferenceAS) {
			final EObjectReference eObjectReference = AssignFactory.eINSTANCE.createEObjectReference();
			
			addCommand(new Runnable() {
				public void run() {
					eObjectReference.setObject(getResolver().resolveEObjectReferenceObject(eObjectReferenceAS.getObject(), eObjectReference));
				}
			});
		
			
			getTrace().eObjectReferenceCreated(eObjectReferenceAS, eObjectReference);
		
			return eObjectReference;
		}

		public CreateInstance caseCreateInstanceAS(final CreateInstanceAS createInstanceAS) {
			final CreateInstance createInstance = AssignFactory.eINSTANCE.createCreateInstance();
		
			
			createInstance.setEClassReference((EClassReference) doSwitch(createInstanceAS.getEClassReference()));
			
			getTrace().createInstanceCreated(createInstanceAS, createInstance);
		
			return createInstance;
		}

		public StaticEClassReference caseStaticEClassReferenceAS(final StaticEClassReferenceAS staticEClassReferenceAS) {
			final StaticEClassReference staticEClassReference = AssignFactory.eINSTANCE.createStaticEClassReference();
			
			addCommand(new Runnable() {
				public void run() {
					staticEClassReference.setEClass(getResolver().resolveStaticEClassReferenceEClass(staticEClassReferenceAS.getEClass(), staticEClassReference));
				}
			});
		
			
			getTrace().staticEClassReferenceCreated(staticEClassReferenceAS, staticEClassReference);
		
			return staticEClassReference;
		}

		public DynamicEClassReference caseDynamicEClassReferenceAS(final DynamicEClassReferenceAS dynamicEClassReferenceAS) {
			final DynamicEClassReference dynamicEClassReference = AssignFactory.eINSTANCE.createDynamicEClassReference();
		
			
			dynamicEClassReference.setEClass((Expression) doSwitch(dynamicEClassReferenceAS.getEClass()));
			
			getTrace().dynamicEClassReferenceCreated(dynamicEClassReferenceAS, dynamicEClassReference);
		
			return dynamicEClassReference;
		}

		public CopyObject caseCopyObjectAS(final CopyObjectAS copyObjectAS) {
			final CopyObject copyObject = AssignFactory.eINSTANCE.createCopyObject();
		
			
			copyObject.setObject((Expression) doSwitch(copyObjectAS.getObject()));
			
			getTrace().copyObjectCreated(copyObjectAS, copyObject);
		
			return copyObject;
		}

		public StringLiteral caseStringLiteralAS(final StringLiteralAS stringLiteralAS) {
			final StringLiteral stringLiteral = AssignFactory.eINSTANCE.createStringLiteral();
		
			
			stringLiteral.setValue(stringLiteralAS.getValue());
			
			getTrace().stringLiteralCreated(stringLiteralAS, stringLiteral);
		
			return stringLiteral;
		}

		public BooleanLiteral caseBooleanLiteralAS(final BooleanLiteralAS booleanLiteralAS) {
			final BooleanLiteral booleanLiteral = AssignFactory.eINSTANCE.createBooleanLiteral();
		
			
			booleanLiteral.setValue(booleanLiteralAS.isValue());
			
			getTrace().booleanLiteralCreated(booleanLiteralAS, booleanLiteral);
		
			return booleanLiteral;
		}

		public EnumLiteral caseEnumLiteralAS(final EnumLiteralAS enumLiteralAS) {
			final EnumLiteral enumLiteral = AssignFactory.eINSTANCE.createEnumLiteral();
			
			addCommand(new Runnable() {
				public void run() {
					enumLiteral.setLiteral(getResolver().resolveEnumLiteralLiteral(enumLiteralAS.getLiteral(), enumLiteral));
				}
			});
		
			
			getTrace().enumLiteralCreated(enumLiteralAS, enumLiteral);
		
			return enumLiteral;
		}
	};

	public AssignastToAssignTransformation(ITransformationContextFactory<IAssignastToAssignResolver, IAssignastToAssignTrace> contextFactory) {
		super(contextFactory);
	}
	
	public AssignModel run(Unit unit) {
		AssignModel assignModel = getResolver().runTransformation(unit, this.transformer);
		performAllCommands();
		return assignModel;
	}	
}