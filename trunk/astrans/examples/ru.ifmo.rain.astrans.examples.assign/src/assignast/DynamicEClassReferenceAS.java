/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic EClass Reference AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.DynamicEClassReferenceAS#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getDynamicEClassReferenceAS()
 * @model
 * @generated
 */
public interface DynamicEClassReferenceAS extends EClassReferenceAS {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' containment reference.
	 * @see #setEClass(ExpressionAS)
	 * @see assignast.AssignastPackage#getDynamicEClassReferenceAS_EClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAS getEClass();

	/**
	 * Sets the value of the '{@link assignast.DynamicEClassReferenceAS#getEClass <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' containment reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(ExpressionAS value);

} // DynamicEClassReferenceAS