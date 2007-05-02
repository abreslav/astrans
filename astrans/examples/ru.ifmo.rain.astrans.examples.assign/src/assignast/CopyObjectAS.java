/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy Object AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.CopyObjectAS#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getCopyObjectAS()
 * @model
 * @generated
 */
public interface CopyObjectAS extends ExpressionAS {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ExpressionAS)
	 * @see assignast.AssignastPackage#getCopyObjectAS_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAS getObject();

	/**
	 * Sets the value of the '{@link assignast.CopyObjectAS#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ExpressionAS value);

} // CopyObjectAS