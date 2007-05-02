/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign.impl;

import assign.AssignPackage;
import assign.Variable;
import assign.VariableAssignment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link assign.impl.VariableImpl#getVariableAssignment <em>Variable Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ExpressionImpl implements Variable {
	/**
	 * The cached value of the '{@link #getVariableAssignment() <em>Variable Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableAssignment()
	 * @generated
	 * @ordered
	 */
	protected VariableAssignment variableAssignment = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment getVariableAssignment() {
		if (variableAssignment != null && variableAssignment.eIsProxy()) {
			InternalEObject oldVariableAssignment = (InternalEObject)variableAssignment;
			variableAssignment = (VariableAssignment)eResolveProxy(oldVariableAssignment);
			if (variableAssignment != oldVariableAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssignPackage.VARIABLE__VARIABLE_ASSIGNMENT, oldVariableAssignment, variableAssignment));
			}
		}
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment basicGetVariableAssignment() {
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableAssignment(VariableAssignment newVariableAssignment) {
		VariableAssignment oldVariableAssignment = variableAssignment;
		variableAssignment = newVariableAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignPackage.VARIABLE__VARIABLE_ASSIGNMENT, oldVariableAssignment, variableAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignPackage.VARIABLE__VARIABLE_ASSIGNMENT:
				if (resolve) return getVariableAssignment();
				return basicGetVariableAssignment();
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
			case AssignPackage.VARIABLE__VARIABLE_ASSIGNMENT:
				setVariableAssignment((VariableAssignment)newValue);
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
			case AssignPackage.VARIABLE__VARIABLE_ASSIGNMENT:
				setVariableAssignment((VariableAssignment)null);
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
			case AssignPackage.VARIABLE__VARIABLE_ASSIGNMENT:
				return variableAssignment != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EClassifier getType() {
		return getVariableAssignment().getExpression().getType();
	}

} //VariableImpl