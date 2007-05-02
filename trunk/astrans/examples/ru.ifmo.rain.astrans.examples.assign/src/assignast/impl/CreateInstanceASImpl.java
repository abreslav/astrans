/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.impl;

import assignast.AssignastPackage;
import assignast.CreateInstanceAS;
import assignast.EClassReferenceAS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Instance AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link assignast.impl.CreateInstanceASImpl#getEClassReference <em>EClass Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateInstanceASImpl extends ExpressionASImpl implements CreateInstanceAS {
	/**
	 * The cached value of the '{@link #getEClassReference() <em>EClass Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassReference()
	 * @generated
	 * @ordered
	 */
	protected EClassReferenceAS eClassReference = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateInstanceASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignastPackage.Literals.CREATE_INSTANCE_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassReferenceAS getEClassReference() {
		return eClassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEClassReference(EClassReferenceAS newEClassReference, NotificationChain msgs) {
		EClassReferenceAS oldEClassReference = eClassReference;
		eClassReference = newEClassReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE, oldEClassReference, newEClassReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClassReference(EClassReferenceAS newEClassReference) {
		if (newEClassReference != eClassReference) {
			NotificationChain msgs = null;
			if (eClassReference != null)
				msgs = ((InternalEObject)eClassReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE, null, msgs);
			if (newEClassReference != null)
				msgs = ((InternalEObject)newEClassReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE, null, msgs);
			msgs = basicSetEClassReference(newEClassReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE, newEClassReference, newEClassReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE:
				return basicSetEClassReference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE:
				return getEClassReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE:
				setEClassReference((EClassReferenceAS)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE:
				setEClassReference((EClassReferenceAS)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssignastPackage.CREATE_INSTANCE_AS__ECLASS_REFERENCE:
				return eClassReference != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateInstanceASImpl