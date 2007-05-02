/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.impl;

import assignast.AssignastPackage;
import assignast.VariableAssignmentAS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Assignment AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link assignast.impl.VariableAssignmentASImpl#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableAssignmentASImpl extends AssignmentASImpl implements VariableAssignmentAS {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAssignmentASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignastPackage.Literals.VARIABLE_ASSIGNMENT_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignastPackage.VARIABLE_ASSIGNMENT_AS__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignastPackage.VARIABLE_ASSIGNMENT_AS__VARIABLE_NAME:
				return getVariableName();
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
			case AssignastPackage.VARIABLE_ASSIGNMENT_AS__VARIABLE_NAME:
				setVariableName((String)newValue);
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
			case AssignastPackage.VARIABLE_ASSIGNMENT_AS__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
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
			case AssignastPackage.VARIABLE_ASSIGNMENT_AS__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
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
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(')');
		return result.toString();
	}

} //VariableAssignmentASImpl