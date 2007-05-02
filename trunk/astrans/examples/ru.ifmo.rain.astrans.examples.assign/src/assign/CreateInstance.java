/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assign.CreateInstance#getEClassReference <em>EClass Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see assign.AssignPackage#getCreateInstance()
 * @model
 * @generated
 */
public interface CreateInstance extends Expression {
	/**
	 * Returns the value of the '<em><b>EClass Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass Reference</em>' containment reference.
	 * @see #setEClassReference(EClassReference)
	 * @see assign.AssignPackage#getCreateInstance_EClassReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EClassReference getEClassReference();

	/**
	 * Sets the value of the '{@link assign.CreateInstance#getEClassReference <em>EClass Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass Reference</em>' containment reference.
	 * @see #getEClassReference()
	 * @generated
	 */
	void setEClassReference(EClassReference value);

} // CreateInstance