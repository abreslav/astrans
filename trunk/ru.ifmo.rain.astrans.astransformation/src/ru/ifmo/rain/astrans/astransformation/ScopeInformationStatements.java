/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Information Statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements#getEnterMethodName <em>Enter Method Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements#getLeaveMethodName <em>Leave Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeInformationStatements extends EObjectImpl implements EObject {
	/**
	 * The default value of the '{@link #getEnterMethodName() <em>Enter Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTER_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterMethodName() <em>Enter Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterMethodName()
	 * @generated
	 * @ordered
	 */
	protected String enterMethodName = ENTER_METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaveMethodName() <em>Leave Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaveMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String LEAVE_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaveMethodName() <em>Leave Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaveMethodName()
	 * @generated
	 * @ordered
	 */
	protected String leaveMethodName = LEAVE_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeInformationStatements() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.SCOPE_INFORMATION_STATEMENTS;
	}

	/**
	 * Returns the value of the '<em><b>Enter Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enter Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enter Method Name</em>' attribute.
	 * @see #setEnterMethodName(String)
	 * @generated
	 */
	public String getEnterMethodName() {
		return enterMethodName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements#getEnterMethodName <em>Enter Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enter Method Name</em>' attribute.
	 * @see #getEnterMethodName()
	 * @generated
	 */
	public void setEnterMethodName(String newEnterMethodName) {
		String oldEnterMethodName = enterMethodName;
		enterMethodName = newEnterMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__ENTER_METHOD_NAME, oldEnterMethodName, enterMethodName));
	}

	/**
	 * Returns the value of the '<em><b>Leave Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leave Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leave Method Name</em>' attribute.
	 * @see #setLeaveMethodName(String)
	 * @generated
	 */
	public String getLeaveMethodName() {
		return leaveMethodName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements#getLeaveMethodName <em>Leave Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leave Method Name</em>' attribute.
	 * @see #getLeaveMethodName()
	 * @generated
	 */
	public void setLeaveMethodName(String newLeaveMethodName) {
		String oldLeaveMethodName = leaveMethodName;
		leaveMethodName = newLeaveMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__LEAVE_METHOD_NAME, oldLeaveMethodName, leaveMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__ENTER_METHOD_NAME:
				return getEnterMethodName();
			case AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__LEAVE_METHOD_NAME:
				return getLeaveMethodName();
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
			case AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__ENTER_METHOD_NAME:
				setEnterMethodName((String)newValue);
				return;
			case AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__LEAVE_METHOD_NAME:
				setLeaveMethodName((String)newValue);
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
			case AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__ENTER_METHOD_NAME:
				setEnterMethodName(ENTER_METHOD_NAME_EDEFAULT);
				return;
			case AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__LEAVE_METHOD_NAME:
				setLeaveMethodName(LEAVE_METHOD_NAME_EDEFAULT);
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
			case AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__ENTER_METHOD_NAME:
				return ENTER_METHOD_NAME_EDEFAULT == null ? enterMethodName != null : !ENTER_METHOD_NAME_EDEFAULT.equals(enterMethodName);
			case AstransformationPackage.SCOPE_INFORMATION_STATEMENTS__LEAVE_METHOD_NAME:
				return LEAVE_METHOD_NAME_EDEFAULT == null ? leaveMethodName != null : !LEAVE_METHOD_NAME_EDEFAULT.equals(leaveMethodName);
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
		result.append(" (enterMethodName: ");
		result.append(enterMethodName);
		result.append(", leaveMethodName: ");
		result.append(leaveMethodName);
		result.append(')');
		return result.toString();
	}

} // ScopeInformationStatements