/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.trace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.trace.AttributeMapping#getProto <em>Proto</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.AttributeMapping#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.trace.TracePackage#getAttributeMapping()
 * @model
 * @generated
 */
public interface AttributeMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proto</em>' reference.
	 * @see #setProto(EAttribute)
	 * @see ru.ifmo.rain.astrans.trace.TracePackage#getAttributeMapping_Proto()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getProto();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.trace.AttributeMapping#getProto <em>Proto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proto</em>' reference.
	 * @see #getProto()
	 * @generated
	 */
	void setProto(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(EAttribute)
	 * @see ru.ifmo.rain.astrans.trace.TracePackage#getAttributeMapping_Image()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getImage();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.trace.AttributeMapping#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(EAttribute value);

} // AttributeMapping