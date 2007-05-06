/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Main Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.CustomMainMethod#getResolverMethodName <em>Resolver Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomMainMethod extends Method {
	/**
	 * The default value of the '{@link #getResolverMethodName() <em>Resolver Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolverMethodName() <em>Resolver Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverMethodName()
	 * @generated
	 * @ordered
	 */
	protected String resolverMethodName = RESOLVER_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomMainMethod() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.CUSTOM_MAIN_METHOD;
	}

	/**
	 * Returns the value of the '<em><b>Resolver Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver Method Name</em>' attribute.
	 * @see #setResolverMethodName(String)
	 * @generated
	 */
	public String getResolverMethodName() {
		return resolverMethodName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.CustomMainMethod#getResolverMethodName <em>Resolver Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver Method Name</em>' attribute.
	 * @see #getResolverMethodName()
	 * @generated
	 */
	public void setResolverMethodName(String newResolverMethodName) {
		String oldResolverMethodName = resolverMethodName;
		resolverMethodName = newResolverMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.CUSTOM_MAIN_METHOD__RESOLVER_METHOD_NAME, oldResolverMethodName, resolverMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstransformationPackage.CUSTOM_MAIN_METHOD__RESOLVER_METHOD_NAME:
				return getResolverMethodName();
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
			case AstransformationPackage.CUSTOM_MAIN_METHOD__RESOLVER_METHOD_NAME:
				setResolverMethodName((String)newValue);
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
			case AstransformationPackage.CUSTOM_MAIN_METHOD__RESOLVER_METHOD_NAME:
				setResolverMethodName(RESOLVER_METHOD_NAME_EDEFAULT);
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
			case AstransformationPackage.CUSTOM_MAIN_METHOD__RESOLVER_METHOD_NAME:
				return RESOLVER_METHOD_NAME_EDEFAULT == null ? resolverMethodName != null : !RESOLVER_METHOD_NAME_EDEFAULT.equals(resolverMethodName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resolverMethodName: ");
		result.append(resolverMethodName);
		result.append(')');
		return result.toString();
	}

} // CustomMainMethod