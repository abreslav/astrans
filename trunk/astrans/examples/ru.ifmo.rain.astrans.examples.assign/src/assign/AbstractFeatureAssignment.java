/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assign.AbstractFeatureAssignment#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see assign.AssignPackage#getAbstractFeatureAssignment()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FeatureIsChangeable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypesAreCompatible'"
 * @generated
 */
public interface AbstractFeatureAssignment extends Assignment {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(FeatureAccess)
	 * @see assign.AssignPackage#getAbstractFeatureAssignment_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureAccess getObject();

	/**
	 * Sets the value of the '{@link assign.AbstractFeatureAssignment#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(FeatureAccess value);

} // AbstractFeatureAssignment