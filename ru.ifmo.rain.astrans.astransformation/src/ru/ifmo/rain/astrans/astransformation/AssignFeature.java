/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#getSetterName <em>Setter Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#getGetterName <em>Getter Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#isMany <em>Many</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignFeature()
 * @model
 * @generated
 */
public interface AssignFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Name</em>' attribute.
	 * @see #setSetterName(String)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignFeature_SetterName()
	 * @model required="true"
	 * @generated
	 */
	String getSetterName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#getSetterName <em>Setter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Name</em>' attribute.
	 * @see #getSetterName()
	 * @generated
	 */
	void setSetterName(String value);

	/**
	 * Returns the value of the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Name</em>' attribute.
	 * @see #setGetterName(String)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignFeature_GetterName()
	 * @model required="true"
	 * @generated
	 */
	String getGetterName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#getGetterName <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Name</em>' attribute.
	 * @see #getGetterName()
	 * @generated
	 */
	void setGetterName(String value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignFeature_Many()
	 * @model default="false"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

} // AssignFeature