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
 * A representation of the model object '<em><b>Mapped EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.MappedEClass#getProto <em>Proto</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.AstransPackage#getMappedEClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PrototypeIsNotSkipped'"
 * @generated
 */
public interface MappedEClass extends EClassReference {
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
	 * @see ru.ifmo.rain.astrans.AstransPackage#getMappedEClass_Proto()
	 * @model required="true"
	 * @generated
	 */
	EClass getProto();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.MappedEClass#getProto <em>Proto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proto</em>' reference.
	 * @see #getProto()
	 * @generated
	 */
	void setProto(EClass value);

} // MappedEClass