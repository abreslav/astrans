/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.AssignmentAS#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getAssignmentAS()
 * @model abstract="true"
 * @generated
 */
public interface AssignmentAS extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionAS)
	 * @see assignast.AssignastPackage#getAssignmentAS_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAS getExpression();

	/**
	 * Sets the value of the '{@link assignast.AssignmentAS#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionAS value);

} // AssignmentAS