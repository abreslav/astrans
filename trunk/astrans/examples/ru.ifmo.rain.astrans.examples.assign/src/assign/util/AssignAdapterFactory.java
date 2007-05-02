/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign.util;

import assign.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see assign.AssignPackage
 * @generated
 */
public class AssignAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssignPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssignPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignSwitch modelSwitch =
		new AssignSwitch() {
			public Object caseAssignModel(AssignModel object) {
				return createAssignModelAdapter();
			}
			public Object caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			public Object caseVariableAssignment(VariableAssignment object) {
				return createVariableAssignmentAdapter();
			}
			public Object caseAbstractFeatureAssignment(AbstractFeatureAssignment object) {
				return createAbstractFeatureAssignmentAdapter();
			}
			public Object caseManyFeatureAppend(ManyFeatureAppend object) {
				return createManyFeatureAppendAdapter();
			}
			public Object caseSingleFeatureAssignment(SingleFeatureAssignment object) {
				return createSingleFeatureAssignmentAdapter();
			}
			public Object caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			public Object caseVariable(Variable object) {
				return createVariableAdapter();
			}
			public Object caseFeatureAccess(FeatureAccess object) {
				return createFeatureAccessAdapter();
			}
			public Object caseEObjectReference(EObjectReference object) {
				return createEObjectReferenceAdapter();
			}
			public Object caseCreateInstance(CreateInstance object) {
				return createCreateInstanceAdapter();
			}
			public Object caseEClassReference(EClassReference object) {
				return createEClassReferenceAdapter();
			}
			public Object caseStaticEClassReference(StaticEClassReference object) {
				return createStaticEClassReferenceAdapter();
			}
			public Object caseDynamicEClassReference(DynamicEClassReference object) {
				return createDynamicEClassReferenceAdapter();
			}
			public Object caseCopyObject(CopyObject object) {
				return createCopyObjectAdapter();
			}
			public Object caseStringLiteral(StringLiteral object) {
				return createStringLiteralAdapter();
			}
			public Object caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			public Object caseEnumLiteral(EnumLiteral object) {
				return createEnumLiteralAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link assign.AssignModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.AssignModel
	 * @generated
	 */
	public Adapter createAssignModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.VariableAssignment
	 * @generated
	 */
	public Adapter createVariableAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.AbstractFeatureAssignment <em>Abstract Feature Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.AbstractFeatureAssignment
	 * @generated
	 */
	public Adapter createAbstractFeatureAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.ManyFeatureAppend <em>Many Feature Append</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.ManyFeatureAppend
	 * @generated
	 */
	public Adapter createManyFeatureAppendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.SingleFeatureAssignment <em>Single Feature Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.SingleFeatureAssignment
	 * @generated
	 */
	public Adapter createSingleFeatureAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.FeatureAccess <em>Feature Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.FeatureAccess
	 * @generated
	 */
	public Adapter createFeatureAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.EObjectReference <em>EObject Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.EObjectReference
	 * @generated
	 */
	public Adapter createEObjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.CreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.CreateInstance
	 * @generated
	 */
	public Adapter createCreateInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.EClassReference <em>EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.EClassReference
	 * @generated
	 */
	public Adapter createEClassReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.StaticEClassReference <em>Static EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.StaticEClassReference
	 * @generated
	 */
	public Adapter createStaticEClassReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.DynamicEClassReference <em>Dynamic EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.DynamicEClassReference
	 * @generated
	 */
	public Adapter createDynamicEClassReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.CopyObject <em>Copy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.CopyObject
	 * @generated
	 */
	public Adapter createCopyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assign.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assign.EnumLiteral
	 * @generated
	 */
	public Adapter createEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AssignAdapterFactory
