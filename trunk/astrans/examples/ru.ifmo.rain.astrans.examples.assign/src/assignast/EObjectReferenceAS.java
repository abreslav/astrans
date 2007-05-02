/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Reference AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.EObjectReferenceAS#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getEObjectReferenceAS()
 * @model
 * @generated
 */
public interface EObjectReferenceAS extends ExpressionAS {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(EcoreObjectDesignator)
	 * @see assignast.AssignastPackage#getEObjectReferenceAS_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EcoreObjectDesignator getObject();

	/**
	 * Sets the value of the '{@link assignast.EObjectReferenceAS#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(EcoreObjectDesignator value);

} // EObjectReferenceAS