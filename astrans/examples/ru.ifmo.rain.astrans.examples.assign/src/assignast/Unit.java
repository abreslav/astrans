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
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.Unit#getImports <em>Imports</em>}</li>
 *   <li>{@link assignast.Unit#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link assignast.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see assignast.AssignastPackage#getUnit_Imports()
	 * @model type="assignast.Import" containment="true"
	 * @generated
	 */
	EList getImports();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(AssignModelAS)
	 * @see assignast.AssignastPackage#getUnit_Model()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssignModelAS getModel();

	/**
	 * Sets the value of the '{@link assignast.Unit#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(AssignModelAS value);

} // Unit