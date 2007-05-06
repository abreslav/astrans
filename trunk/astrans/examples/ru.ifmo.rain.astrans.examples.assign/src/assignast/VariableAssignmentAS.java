/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.VariableAssignmentAS#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link assignast.VariableAssignmentAS#isReturned <em>Returned</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getVariableAssignmentAS()
 * @model
 * @generated
 */
public interface VariableAssignmentAS extends AssignmentAS {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see assignast.AssignastPackage#getVariableAssignmentAS_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link assignast.VariableAssignmentAS#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Returned</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned</em>' attribute.
	 * @see #setReturned(boolean)
	 * @see assignast.AssignastPackage#getVariableAssignmentAS_Returned()
	 * @model default="false"
	 * @generated
	 */
	boolean isReturned();

	/**
	 * Sets the value of the '{@link assignast.VariableAssignmentAS#isReturned <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned</em>' attribute.
	 * @see #isReturned()
	 * @generated
	 */
	void setReturned(boolean value);

} // VariableAssignmentAS