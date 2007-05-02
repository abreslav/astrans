/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Instance AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.CreateInstanceAS#getEClassReference <em>EClass Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getCreateInstanceAS()
 * @model
 * @generated
 */
public interface CreateInstanceAS extends ExpressionAS {
	/**
	 * Returns the value of the '<em><b>EClass Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass Reference</em>' containment reference.
	 * @see #setEClassReference(EClassReferenceAS)
	 * @see assignast.AssignastPackage#getCreateInstanceAS_EClassReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EClassReferenceAS getEClassReference();

	/**
	 * Sets the value of the '{@link assignast.CreateInstanceAS#getEClassReference <em>EClass Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass Reference</em>' containment reference.
	 * @see #getEClassReference()
	 * @generated
	 */
	void setEClassReference(EClassReferenceAS value);

} // CreateInstanceAS