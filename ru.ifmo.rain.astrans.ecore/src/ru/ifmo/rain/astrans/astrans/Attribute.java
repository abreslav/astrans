/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astrans;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends StructuralFeature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDataType)
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	EDataType getType();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astrans.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDataType value);

} // Attribute