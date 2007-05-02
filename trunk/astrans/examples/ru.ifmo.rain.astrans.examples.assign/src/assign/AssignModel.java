/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assign.AssignModel#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see assign.AssignPackage#getAssignModel()
 * @model
 * @generated
 */
public interface AssignModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link assign.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see assign.AssignPackage#getAssignModel_Assignments()
	 * @model type="assign.Assignment" containment="true"
	 * @generated
	 */
	EList getAssignments();

} // AssignModel