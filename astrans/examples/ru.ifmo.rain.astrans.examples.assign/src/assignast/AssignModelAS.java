/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Model AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.AssignModelAS#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getAssignModelAS()
 * @model
 * @generated
 */
public interface AssignModelAS extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link assignast.AssignmentAS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see assignast.AssignastPackage#getAssignModelAS_Assignments()
	 * @model type="assignast.AssignmentAS" containment="true"
	 * @generated
	 */
	EList getAssignments();

} // AssignModelAS