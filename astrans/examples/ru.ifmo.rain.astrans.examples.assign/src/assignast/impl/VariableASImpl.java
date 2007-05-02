/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.impl;

import assignast.AssignastPackage;
import assignast.VariableAS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link assignast.impl.VariableASImpl#getVariableAssignment <em>Variable Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableASImpl extends ExpressionASImpl implements VariableAS {
	/**
	 * The default value of the '{@link #getVariableAssignment() <em>Variable Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_ASSIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableAssignment() <em>Variable Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableAssignment()
	 * @generated
	 * @ordered
	 */
	protected String variableAssignment = VARIABLE_ASSIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignastPackage.Literals.VARIABLE_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableAssignment() {
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableAssignment(String newVariableAssignment) {
		String oldVariableAssignment = variableAssignment;
		variableAssignment = newVariableAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignastPackage.VARIABLE_AS__VARIABLE_ASSIGNMENT, oldVariableAssignment, variableAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignastPackage.VARIABLE_AS__VARIABLE_ASSIGNMENT:
				return getVariableAssignment();
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
			case AssignastPackage.VARIABLE_AS__VARIABLE_ASSIGNMENT:
				setVariableAssignment((String)newValue);
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
			case AssignastPackage.VARIABLE_AS__VARIABLE_ASSIGNMENT:
				setVariableAssignment(VARIABLE_ASSIGNMENT_EDEFAULT);
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
			case AssignastPackage.VARIABLE_AS__VARIABLE_ASSIGNMENT:
				return VARIABLE_ASSIGNMENT_EDEFAULT == null ? variableAssignment != null : !VARIABLE_ASSIGNMENT_EDEFAULT.equals(variableAssignment);
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
		result.append(" (variableAssignment: ");
		result.append(variableAssignment);
		result.append(')');
		return result.toString();
	}

} //VariableASImpl