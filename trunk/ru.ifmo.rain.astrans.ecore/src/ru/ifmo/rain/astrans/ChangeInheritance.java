/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.ChangeInheritance#getSubject <em>Subject</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.ChangeInheritance#getSuperclasses <em>Superclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.AstransPackage#getChangeInheritance()
 * @model
 * @generated
 */
public interface ChangeInheritance extends Action {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(MappedEClass)
	 * @see ru.ifmo.rain.astrans.AstransPackage#getChangeInheritance_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MappedEClass getSubject();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.ChangeInheritance#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(MappedEClass value);

	/**
	 * Returns the value of the '<em><b>Superclasses</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.EClassReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclasses</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.AstransPackage#getChangeInheritance_Superclasses()
	 * @model type="ru.ifmo.rain.astrans.EClassReference" containment="true"
	 * @generated
	 */
	EList getSuperclasses();

} // ChangeInheritance