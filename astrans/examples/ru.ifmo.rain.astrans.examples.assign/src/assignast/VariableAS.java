/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.VariableAS#getVariableAssignment <em>Variable Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getVariableAS()
 * @model
 * @generated
 */
public interface VariableAS extends ExpressionAS {
	/**
	 * Returns the value of the '<em><b>Variable Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Assignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Assignment</em>' attribute.
	 * @see #setVariableAssignment(String)
	 * @see assignast.AssignastPackage#getVariableAS_VariableAssignment()
	 * @model required="true"
	 * @generated
	 */
	String getVariableAssignment();

	/**
	 * Sets the value of the '{@link assignast.VariableAS#getVariableAssignment <em>Variable Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Assignment</em>' attribute.
	 * @see #getVariableAssignment()
	 * @generated
	 */
	void setVariableAssignment(String value);

} // VariableAS