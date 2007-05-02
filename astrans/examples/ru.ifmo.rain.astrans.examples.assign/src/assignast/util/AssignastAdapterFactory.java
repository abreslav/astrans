/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.util;

import assignast.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see assignast.AssignastPackage
 * @generated
 */
public class AssignastAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssignastPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignastAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssignastPackage.eINSTANCE;
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
	protected AssignastSwitch modelSwitch =
		new AssignastSwitch() {
			public Object caseAssignModelAS(AssignModelAS object) {
				return createAssignModelASAdapter();
			}
			public Object caseAssignmentAS(AssignmentAS object) {
				return createAssignmentASAdapter();
			}
			public Object caseVariableAssignmentAS(VariableAssignmentAS object) {
				return createVariableAssignmentASAdapter();
			}
			public Object caseAbstractFeatureAssignmentAS(AbstractFeatureAssignmentAS object) {
				return createAbstractFeatureAssignmentASAdapter();
			}
			public Object caseManyFeatureAppendAS(ManyFeatureAppendAS object) {
				return createManyFeatureAppendASAdapter();
			}
			public Object caseSingleFeatureAssignmentAS(SingleFeatureAssignmentAS object) {
				return createSingleFeatureAssignmentASAdapter();
			}
			public Object caseExpressionAS(ExpressionAS object) {
				return createExpressionASAdapter();
			}
			public Object caseVariableAS(VariableAS object) {
				return createVariableASAdapter();
			}
			public Object caseFeatureAccessAS(FeatureAccessAS object) {
				return createFeatureAccessASAdapter();
			}
			public Object caseEObjectReferenceAS(EObjectReferenceAS object) {
				return createEObjectReferenceASAdapter();
			}
			public Object caseCreateInstanceAS(CreateInstanceAS object) {
				return createCreateInstanceASAdapter();
			}
			public Object caseEClassReferenceAS(EClassReferenceAS object) {
				return createEClassReferenceASAdapter();
			}
			public Object caseStaticEClassReferenceAS(StaticEClassReferenceAS object) {
				return createStaticEClassReferenceASAdapter();
			}
			public Object caseDynamicEClassReferenceAS(DynamicEClassReferenceAS object) {
				return createDynamicEClassReferenceASAdapter();
			}
			public Object caseCopyObjectAS(CopyObjectAS object) {
				return createCopyObjectASAdapter();
			}
			public Object caseStringLiteralAS(StringLiteralAS object) {
				return createStringLiteralASAdapter();
			}
			public Object caseBooleanLiteralAS(BooleanLiteralAS object) {
				return createBooleanLiteralASAdapter();
			}
			public Object caseEnumLiteralAS(EnumLiteralAS object) {
				return createEnumLiteralASAdapter();
			}
			public Object caseUnit(Unit object) {
				return createUnitAdapter();
			}
			public Object caseImport(Import object) {
				return createImportAdapter();
			}
			public Object caseEClassDesignator(EClassDesignator object) {
				return createEClassDesignatorAdapter();
			}
			public Object caseEcoreObjectDesignator(EcoreObjectDesignator object) {
				return createEcoreObjectDesignatorAdapter();
			}
			public Object caseEEnumLiteralDesignator(EEnumLiteralDesignator object) {
				return createEEnumLiteralDesignatorAdapter();
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
	 * Creates a new adapter for an object of class '{@link assignast.AssignModelAS <em>Assign Model AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.AssignModelAS
	 * @generated
	 */
	public Adapter createAssignModelASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.AssignmentAS <em>Assignment AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.AssignmentAS
	 * @generated
	 */
	public Adapter createAssignmentASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.VariableAssignmentAS <em>Variable Assignment AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.VariableAssignmentAS
	 * @generated
	 */
	public Adapter createVariableAssignmentASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.AbstractFeatureAssignmentAS <em>Abstract Feature Assignment AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.AbstractFeatureAssignmentAS
	 * @generated
	 */
	public Adapter createAbstractFeatureAssignmentASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.ManyFeatureAppendAS <em>Many Feature Append AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.ManyFeatureAppendAS
	 * @generated
	 */
	public Adapter createManyFeatureAppendASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.SingleFeatureAssignmentAS <em>Single Feature Assignment AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.SingleFeatureAssignmentAS
	 * @generated
	 */
	public Adapter createSingleFeatureAssignmentASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.ExpressionAS <em>Expression AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.ExpressionAS
	 * @generated
	 */
	public Adapter createExpressionASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.VariableAS <em>Variable AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.VariableAS
	 * @generated
	 */
	public Adapter createVariableASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.FeatureAccessAS <em>Feature Access AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.FeatureAccessAS
	 * @generated
	 */
	public Adapter createFeatureAccessASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.EObjectReferenceAS <em>EObject Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.EObjectReferenceAS
	 * @generated
	 */
	public Adapter createEObjectReferenceASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.CreateInstanceAS <em>Create Instance AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.CreateInstanceAS
	 * @generated
	 */
	public Adapter createCreateInstanceASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.EClassReferenceAS <em>EClass Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.EClassReferenceAS
	 * @generated
	 */
	public Adapter createEClassReferenceASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.StaticEClassReferenceAS <em>Static EClass Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.StaticEClassReferenceAS
	 * @generated
	 */
	public Adapter createStaticEClassReferenceASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.DynamicEClassReferenceAS <em>Dynamic EClass Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.DynamicEClassReferenceAS
	 * @generated
	 */
	public Adapter createDynamicEClassReferenceASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.CopyObjectAS <em>Copy Object AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.CopyObjectAS
	 * @generated
	 */
	public Adapter createCopyObjectASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.StringLiteralAS <em>String Literal AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.StringLiteralAS
	 * @generated
	 */
	public Adapter createStringLiteralASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.BooleanLiteralAS <em>Boolean Literal AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.BooleanLiteralAS
	 * @generated
	 */
	public Adapter createBooleanLiteralASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.EnumLiteralAS <em>Enum Literal AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.EnumLiteralAS
	 * @generated
	 */
	public Adapter createEnumLiteralASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.EClassDesignator <em>EClass Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.EClassDesignator
	 * @generated
	 */
	public Adapter createEClassDesignatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.EcoreObjectDesignator <em>Ecore Object Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.EcoreObjectDesignator
	 * @generated
	 */
	public Adapter createEcoreObjectDesignatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignast.EEnumLiteralDesignator <em>EEnum Literal Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignast.EEnumLiteralDesignator
	 * @generated
	 */
	public Adapter createEEnumLiteralDesignatorAdapter() {
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

} //AssignastAdapterFactory
