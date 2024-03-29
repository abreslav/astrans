/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assign.VariableAssignment#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link assign.VariableAssignment#isReturned <em>Returned</em>}</li>
 * </ul>
 * </p>
 *
 * @see assign.AssignPackage#getVariableAssignment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VariableNameIsNotDefinedBefore'"
 * @generated
 */
public interface VariableAssignment extends Assignment {
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
	 * @see assign.AssignPackage#getVariableAssignment_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link assign.VariableAssignment#getVariableName <em>Variable Name</em>}' attribute.
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
	 * @see assign.AssignPackage#getVariableAssignment_Returned()
	 * @model default="false"
	 * @generated
	 */
	boolean isReturned();

	/**
	 * Sets the value of the '{@link assign.VariableAssignment#isReturned <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned</em>' attribute.
	 * @see #isReturned()
	 * @generated
	 */
	void setReturned(boolean value);

} // VariableAssignment