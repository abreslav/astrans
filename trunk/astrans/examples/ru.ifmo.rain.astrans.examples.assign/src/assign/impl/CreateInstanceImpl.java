/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign.impl;

import assign.AssignPackage;
import assign.CreateInstance;
import assign.EClassReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link assign.impl.CreateInstanceImpl#getEClassReference <em>EClass Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateInstanceImpl extends ExpressionImpl implements CreateInstance {
	/**
	 * The cached value of the '{@link #getEClassReference() <em>EClass Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassReference()
	 * @generated
	 * @ordered
	 */
	protected EClassReference eClassReference = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignPackage.Literals.CREATE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassReference getEClassReference() {
		return eClassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEClassReference(EClassReference newEClassReference, NotificationChain msgs) {
		EClassReference oldEClassReference = eClassReference;
		eClassReference = newEClassReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE, oldEClassReference, newEClassReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClassReference(EClassReference newEClassReference) {
		if (newEClassReference != eClassReference) {
			NotificationChain msgs = null;
			if (eClassReference != null)
				msgs = ((InternalEObject)eClassReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE, null, msgs);
			if (newEClassReference != null)
				msgs = ((InternalEObject)newEClassReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE, null, msgs);
			msgs = basicSetEClassReference(newEClassReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE, newEClassReference, newEClassReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE:
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
			case AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE:
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
			case AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE:
				setEClassReference((EClassReference)newValue);
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
			case AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE:
				setEClassReference((EClassReference)null);
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
			case AssignPackage.CREATE_INSTANCE__ECLASS_REFERENCE:
				return eClassReference != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EClassifier getType() {
		return getEClassReference().getType();
	}

} //CreateInstanceImpl