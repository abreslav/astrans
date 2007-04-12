/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.CreateClass#getName <em>Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.CreateClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.CreateClass#getSuperclasses <em>Superclasses</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.CreateClass#getStructuralFeatures <em>Structural Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getCreateClass()
 * @model
 * @generated
 */
public interface CreateClass extends Action {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getCreateClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astrans.CreateClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getCreateClass_Abstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astrans.CreateClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Superclasses</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astrans.EClassReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclasses</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getCreateClass_Superclasses()
	 * @model type="ru.ifmo.rain.astrans.astrans.EClassReference" containment="true"
	 * @generated
	 */
	EList getSuperclasses();

	/**
	 * Returns the value of the '<em><b>Structural Features</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astrans.StructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Features</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getCreateClass_StructuralFeatures()
	 * @model type="ru.ifmo.rain.astrans.astrans.StructuralFeature" containment="true"
	 * @generated
	 */
	EList getStructuralFeatures();

} // CreateClass