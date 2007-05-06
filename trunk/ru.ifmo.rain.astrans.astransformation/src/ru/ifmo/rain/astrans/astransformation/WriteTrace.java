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
 * A representation of the model object '<em><b>Write Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.WriteTrace#getTraceMethodName <em>Trace Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WriteTrace extends EObjectImpl implements EObject {
	/**
	 * The default value of the '{@link #getTraceMethodName() <em>Trace Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceMethodName() <em>Trace Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceMethodName()
	 * @generated
	 * @ordered
	 */
	protected String traceMethodName = TRACE_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteTrace() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.WRITE_TRACE;
	}

	/**
	 * Returns the value of the '<em><b>Trace Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Method Name</em>' attribute.
	 * @see #setTraceMethodName(String)
	 * @generated
	 */
	public String getTraceMethodName() {
		return traceMethodName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace#getTraceMethodName <em>Trace Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Method Name</em>' attribute.
	 * @see #getTraceMethodName()
	 * @generated
	 */
	public void setTraceMethodName(String newTraceMethodName) {
		String oldTraceMethodName = traceMethodName;
		traceMethodName = newTraceMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.WRITE_TRACE__TRACE_METHOD_NAME, oldTraceMethodName, traceMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstransformationPackage.WRITE_TRACE__TRACE_METHOD_NAME:
				return getTraceMethodName();
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
			case AstransformationPackage.WRITE_TRACE__TRACE_METHOD_NAME:
				setTraceMethodName((String)newValue);
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
			case AstransformationPackage.WRITE_TRACE__TRACE_METHOD_NAME:
				setTraceMethodName(TRACE_METHOD_NAME_EDEFAULT);
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
			case AstransformationPackage.WRITE_TRACE__TRACE_METHOD_NAME:
				return TRACE_METHOD_NAME_EDEFAULT == null ? traceMethodName != null : !TRACE_METHOD_NAME_EDEFAULT.equals(traceMethodName);
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
		result.append(" (traceMethodName: ");
		result.append(traceMethodName);
		result.append(')');
		return result.toString();
	}

} // WriteTrace