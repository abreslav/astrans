/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existing EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.ExistingEClass#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.AstransPackage#getExistingEClass()
 * @model
 * @generated
 */
public interface ExistingEClass extends EClassReference {
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
	 * @see ru.ifmo.rain.astrans.AstransPackage#getExistingEClass_EClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.ExistingEClass#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

} // ExistingEClass