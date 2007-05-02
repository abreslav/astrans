/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.impl;

import assignast.AbstractFeatureAssignmentAS;
import assignast.AssignastPackage;
import assignast.FeatureAccessAS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature Assignment AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link assignast.impl.AbstractFeatureAssignmentASImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractFeatureAssignmentASImpl extends AssignmentASImpl implements AbstractFeatureAssignmentAS {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected FeatureAccessAS object = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureAssignmentASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignastPackage.Literals.ABSTRACT_FEATURE_ASSIGNMENT_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAccessAS getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(FeatureAccessAS newObject, NotificationChain msgs) {
		FeatureAccessAS oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(FeatureAccessAS newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT:
				return basicSetObject(null, msgs);
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
			case AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT:
				return getObject();
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
			case AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT:
				setObject((FeatureAccessAS)newValue);
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
			case AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT:
				setObject((FeatureAccessAS)null);
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
			case AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT:
				return object != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractFeatureAssignmentASImpl