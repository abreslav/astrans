/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign.impl;

import assign.AssignPackage;
import assign.EObjectReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link assign.impl.EObjectReferenceImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EObjectReferenceImpl extends ExpressionImpl implements EObjectReference {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EObject object = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignPackage.Literals.EOBJECT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssignPackage.EOBJECT_REFERENCE__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(EObject newObject) {
		EObject oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignPackage.EOBJECT_REFERENCE__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignPackage.EOBJECT_REFERENCE__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
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
			case AssignPackage.EOBJECT_REFERENCE__OBJECT:
				setObject((EObject)newValue);
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
			case AssignPackage.EOBJECT_REFERENCE__OBJECT:
				setObject((EObject)null);
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
			case AssignPackage.EOBJECT_REFERENCE__OBJECT:
				return object != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EClassifier getType() {
		return getObject().eClass();
	}

} //EObjectReferenceImpl