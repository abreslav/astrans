/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.trace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.trace.ClassMapping#getProto <em>Proto</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.ClassMapping#getImage <em>Image</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.ClassMapping#isResolvedAbstractClass <em>Resolved Abstract Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.trace.TracePackage#getClassMapping()
 * @model
 * @generated
 */
public interface ClassMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proto</em>' reference.
	 * @see #setProto(EClass)
	 * @see ru.ifmo.rain.astrans.trace.TracePackage#getClassMapping_Proto()
	 * @model required="true"
	 * @generated
	 */
	EClass getProto();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.trace.ClassMapping#getProto <em>Proto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proto</em>' reference.
	 * @see #getProto()
	 * @generated
	 */
	void setProto(EClass value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(EClass)
	 * @see ru.ifmo.rain.astrans.trace.TracePackage#getClassMapping_Image()
	 * @model required="true"
	 * @generated
	 */
	EClass getImage();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.trace.ClassMapping#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(EClass value);

	/**
	 * Returns the value of the '<em><b>Resolved Abstract Class</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Abstract Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Abstract Class</em>' attribute.
	 * @see #setResolvedAbstractClass(boolean)
	 * @see ru.ifmo.rain.astrans.trace.TracePackage#getClassMapping_ResolvedAbstractClass()
	 * @model default="false"
	 * @generated
	 */
	boolean isResolvedAbstractClass();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.trace.ClassMapping#isResolvedAbstractClass <em>Resolved Abstract Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Abstract Class</em>' attribute.
	 * @see #isResolvedAbstractClass()
	 * @generated
	 */
	void setResolvedAbstractClass(boolean value);

} // ClassMapping