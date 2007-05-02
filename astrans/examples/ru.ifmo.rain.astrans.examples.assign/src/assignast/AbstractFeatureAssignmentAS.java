/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Assignment AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.AbstractFeatureAssignmentAS#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getAbstractFeatureAssignmentAS()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeatureAssignmentAS extends AssignmentAS {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(FeatureAccessAS)
	 * @see assignast.AssignastPackage#getAbstractFeatureAssignmentAS_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureAccessAS getObject();

	/**
	 * Sets the value of the '{@link assignast.AbstractFeatureAssignmentAS#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(FeatureAccessAS value);

} // AbstractFeatureAssignmentAS