/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static EClass Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assign.StaticEClassReference#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see assign.AssignPackage#getStaticEClassReference()
 * @model
 * @generated
 */
public interface StaticEClassReference extends EClassReference {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see assign.AssignPackage#getStaticEClassReference_EClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link assign.StaticEClassReference#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

} // StaticEClassReference