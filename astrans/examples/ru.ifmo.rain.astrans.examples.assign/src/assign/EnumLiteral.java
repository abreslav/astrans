/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;

import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assign.EnumLiteral#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see assign.AssignPackage#getEnumLiteral()
 * @model
 * @generated
 */
public interface EnumLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' reference.
	 * @see #setLiteral(EEnumLiteral)
	 * @see assign.AssignPackage#getEnumLiteral_Literal()
	 * @model required="true"
	 * @generated
	 */
	EEnumLiteral getLiteral();

	/**
	 * Sets the value of the '{@link assign.EnumLiteral#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(EEnumLiteral value);

} // EnumLiteral