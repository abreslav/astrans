/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.CustomMainMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Main Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.CustomMainMethodImpl#getResolverMethodName <em>Resolver Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomMainMethodImpl extends MethodImpl implements CustomMainMethod {
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
	protected CustomMainMethodImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolverMethodName() {
		return resolverMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //CustomMainMethodImpl