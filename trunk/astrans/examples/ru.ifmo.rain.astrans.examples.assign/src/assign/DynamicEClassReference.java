/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic EClass Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assign.DynamicEClassReference#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see assign.AssignPackage#getDynamicEClassReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExpressionEvaluatesToAClass'"
 * @generated
 */
public interface DynamicEClassReference extends EClassReference {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' containment reference.
	 * @see #setEClass(Expression)
	 * @see assign.AssignPackage#getDynamicEClassReference_EClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getEClass();

	/**
	 * Sets the value of the '{@link assign.DynamicEClassReference#getEClass <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' containment reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(Expression value);

} // DynamicEClassReference