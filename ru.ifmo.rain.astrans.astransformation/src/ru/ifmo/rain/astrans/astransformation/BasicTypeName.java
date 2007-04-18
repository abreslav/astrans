/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Type Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.BasicTypeName#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getBasicTypeName()
 * @model
 * @generated
 */
public interface BasicTypeName extends TypeName {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.ifmo.rain.astrans.astransformation.BasicType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ru.ifmo.rain.astrans.astransformation.BasicType
	 * @see #setType(BasicType)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getBasicTypeName_Type()
	 * @model
	 * @generated
	 */
	BasicType getType();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.BasicTypeName#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ru.ifmo.rain.astrans.astransformation.BasicType
	 * @see #getType()
	 * @generated
	 */
	void setType(BasicType value);

} // BasicTypeName