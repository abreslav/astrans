/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransast.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astransast.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage
 * @generated
 */
public class AstransastAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstransastPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstransastAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AstransastPackage.eINSTANCE;
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
	protected AstransastSwitch modelSwitch =
		new AstransastSwitch() {
			public Object caseActionAS(ActionAS object) {
				return createActionASAdapter();
			}
			public Object caseEClassifierReferenceAS(EClassifierReferenceAS object) {
				return createEClassifierReferenceASAdapter();
			}
			public Object caseTranslateReferencesAS(TranslateReferencesAS object) {
				return createTranslateReferencesASAdapter();
			}
			public Object caseCreateClassAS(CreateClassAS object) {
				return createCreateClassASAdapter();
			}
			public Object caseStructuralFeatureAS(StructuralFeatureAS object) {
				return createStructuralFeatureASAdapter();
			}
			public Object caseAttributeAS(AttributeAS object) {
				return createAttributeASAdapter();
			}
			public Object caseReferenceAS(ReferenceAS object) {
				return createReferenceASAdapter();
			}
			public Object caseChangeInheritanceAS(ChangeInheritanceAS object) {
				return createChangeInheritanceASAdapter();
			}
			public Object caseSkipClassAS(SkipClassAS object) {
				return createSkipClassASAdapter();
			}
			public Object caseTransformationAS(TransformationAS object) {
				return createTransformationASAdapter();
			}
			public Object caseMappedEClassAS(MappedEClassAS object) {
				return createMappedEClassASAdapter();
			}
			public Object caseQualifiedName(QualifiedName object) {
				return createQualifiedNameAdapter();
			}
			public Object caseEPackageReference(EPackageReference object) {
				return createEPackageReferenceAdapter();
			}
			public Object caseEPackageUri(EPackageUri object) {
				return createEPackageUriAdapter();
			}
			public Object caseEPackagePath(EPackagePath object) {
				return createEPackagePathAdapter();
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
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.ActionAS <em>Action AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.ActionAS
	 * @generated
	 */
	public Adapter createActionASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS <em>EClassifier Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS
	 * @generated
	 */
	public Adapter createEClassifierReferenceASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS <em>Translate References AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.TranslateReferencesAS
	 * @generated
	 */
	public Adapter createTranslateReferencesASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.CreateClassAS <em>Create Class AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.CreateClassAS
	 * @generated
	 */
	public Adapter createCreateClassASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.StructuralFeatureAS <em>Structural Feature AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.StructuralFeatureAS
	 * @generated
	 */
	public Adapter createStructuralFeatureASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.AttributeAS <em>Attribute AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.AttributeAS
	 * @generated
	 */
	public Adapter createAttributeASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.ReferenceAS <em>Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.ReferenceAS
	 * @generated
	 */
	public Adapter createReferenceASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS <em>Change Inheritance AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS
	 * @generated
	 */
	public Adapter createChangeInheritanceASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.SkipClassAS <em>Skip Class AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.SkipClassAS
	 * @generated
	 */
	public Adapter createSkipClassASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.TransformationAS <em>Transformation AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS
	 * @generated
	 */
	public Adapter createTransformationASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.MappedEClassAS <em>Mapped EClass AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.MappedEClassAS
	 * @generated
	 */
	public Adapter createMappedEClassASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.QualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.QualifiedName
	 * @generated
	 */
	public Adapter createQualifiedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.EPackageReference <em>EPackage Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.EPackageReference
	 * @generated
	 */
	public Adapter createEPackageReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.EPackageUri <em>EPackage Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.EPackageUri
	 * @generated
	 */
	public Adapter createEPackageUriAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransast.EPackagePath <em>EPackage Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransast.EPackagePath
	 * @generated
	 */
	public Adapter createEPackagePathAdapter() {
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

} //AstransastAdapterFactory
