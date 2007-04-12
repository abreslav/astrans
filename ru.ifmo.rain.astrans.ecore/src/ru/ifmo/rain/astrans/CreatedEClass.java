/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Created EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.CreatedEClass#getCreate <em>Create</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.AstransPackage#getCreatedEClass()
 * @model
 * @generated
 */
public interface CreatedEClass extends EClassReference {
	/**
	 * Returns the value of the '<em><b>Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' reference.
	 * @see #setCreate(CreateClass)
	 * @see ru.ifmo.rain.astrans.AstransPackage#getCreatedEClass_Create()
	 * @model required="true"
	 * @generated
	 */
	CreateClass getCreate();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.CreatedEClass#getCreate <em>Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' reference.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(CreateClass value);

} // CreatedEClass