/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.EnumLiteralAS#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getEnumLiteralAS()
 * @model
 * @generated
 */
public interface EnumLiteralAS extends ExpressionAS {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(EEnumLiteralDesignator)
	 * @see assignast.AssignastPackage#getEnumLiteralAS_Literal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EEnumLiteralDesignator getLiteral();

	/**
	 * Sets the value of the '{@link assignast.EnumLiteralAS#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(EEnumLiteralDesignator value);

} // EnumLiteralAS