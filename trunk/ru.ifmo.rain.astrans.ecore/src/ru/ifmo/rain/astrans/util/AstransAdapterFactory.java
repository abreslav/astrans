/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.Action;
import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.CreatedEClass;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.ExistingEClass;
import ru.ifmo.rain.astrans.ExistingEDataType;
import ru.ifmo.rain.astrans.MappedEClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.StructuralFeature;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.ifmo.rain.astrans.AstransPackage
 * @generated
 */
public class AstransAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstransPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstransAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AstransPackage.eINSTANCE;
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
	protected AstransSwitch modelSwitch =
		new AstransSwitch() {
			public Object caseAction(Action object) {
				return createActionAdapter();
			}
			public Object caseEClassifierReference(EClassifierReference object) {
				return createEClassifierReferenceAdapter();
			}
			public Object caseEClassReference(EClassReference object) {
				return createEClassReferenceAdapter();
			}
			public Object caseCreatedEClass(CreatedEClass object) {
				return createCreatedEClassAdapter();
			}
			public Object caseMappedEClass(MappedEClass object) {
				return createMappedEClassAdapter();
			}
			public Object caseExistingEClass(ExistingEClass object) {
				return createExistingEClassAdapter();
			}
			public Object caseExistingEDataType(ExistingEDataType object) {
				return createExistingEDataTypeAdapter();
			}
			public Object caseTranslateReferences(TranslateReferences object) {
				return createTranslateReferencesAdapter();
			}
			public Object caseCreateClass(CreateClass object) {
				return createCreateClassAdapter();
			}
			public Object caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			public Object caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			public Object caseReference(Reference object) {
				return createReferenceAdapter();
			}
			public Object caseChangeInheritance(ChangeInheritance object) {
				return createChangeInheritanceAdapter();
			}
			public Object caseSkipClass(SkipClass object) {
				return createSkipClassAdapter();
			}
			public Object caseTransformation(Transformation object) {
				return createTransformationAdapter();
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
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.EClassifierReference <em>EClassifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.EClassifierReference
	 * @generated
	 */
	public Adapter createEClassifierReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.EClassReference <em>EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.EClassReference
	 * @generated
	 */
	public Adapter createEClassReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.CreatedEClass <em>Created EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.CreatedEClass
	 * @generated
	 */
	public Adapter createCreatedEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.MappedEClass <em>Mapped EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.MappedEClass
	 * @generated
	 */
	public Adapter createMappedEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.ExistingEClass <em>Existing EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.ExistingEClass
	 * @generated
	 */
	public Adapter createExistingEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.ExistingEDataType <em>Existing EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.ExistingEDataType
	 * @generated
	 */
	public Adapter createExistingEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.TranslateReferences <em>Translate References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.TranslateReferences
	 * @generated
	 */
	public Adapter createTranslateReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.CreateClass <em>Create Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.CreateClass
	 * @generated
	 */
	public Adapter createCreateClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.ChangeInheritance <em>Change Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.ChangeInheritance
	 * @generated
	 */
	public Adapter createChangeInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.SkipClass <em>Skip Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.SkipClass
	 * @generated
	 */
	public Adapter createSkipClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
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

} //AstransAdapterFactory
