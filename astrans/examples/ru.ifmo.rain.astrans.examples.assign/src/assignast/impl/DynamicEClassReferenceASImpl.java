/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.impl;

import assignast.AssignastPackage;
import assignast.DynamicEClassReferenceAS;
import assignast.ExpressionAS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic EClass Reference AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link assignast.impl.DynamicEClassReferenceASImpl#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicEClassReferenceASImpl extends EClassReferenceASImpl implements DynamicEClassReferenceAS {
	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAS eClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicEClassReferenceASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignastPackage.Literals.DYNAMIC_ECLASS_REFERENCE_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAS getEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEClass(ExpressionAS newEClass, NotificationChain msgs) {
		ExpressionAS oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS, oldEClass, newEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(ExpressionAS newEClass) {
		if (newEClass != eClass) {
			NotificationChain msgs = null;
			if (eClass != null)
				msgs = ((InternalEObject)eClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS, null, msgs);
			if (newEClass != null)
				msgs = ((InternalEObject)newEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS, null, msgs);
			msgs = basicSetEClass(newEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS, newEClass, newEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS:
				return basicSetEClass(null, msgs);
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
			case AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS:
				return getEClass();
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
			case AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS:
				setEClass((ExpressionAS)newValue);
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
			case AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS:
				setEClass((ExpressionAS)null);
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
			case AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS__ECLASS:
				return eClass != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicEClassReferenceASImpl