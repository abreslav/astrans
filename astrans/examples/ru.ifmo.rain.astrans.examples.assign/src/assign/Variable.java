/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assign.Variable#getVariableAssignment <em>Variable Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see assign.AssignPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Assignment</em>' reference.
	 * @see #setVariableAssignment(VariableAssignment)
	 * @see assign.AssignPackage#getVariable_VariableAssignment()
	 * @model required="true"
	 * @generated
	 */
	VariableAssignment getVariableAssignment();

	/**
	 * Sets the value of the '{@link assign.Variable#getVariableAssignment <em>Variable Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Assignment</em>' reference.
	 * @see #getVariableAssignment()
	 * @generated
	 */
	void setVariableAssignment(VariableAssignment value);

} // Variable