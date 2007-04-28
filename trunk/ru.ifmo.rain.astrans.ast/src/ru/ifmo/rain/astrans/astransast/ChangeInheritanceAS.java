/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Inheritance AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS#getSubject <em>Subject</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS#getSuperclasses <em>Superclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getChangeInheritanceAS()
 * @model
 * @generated
 */
public interface ChangeInheritanceAS extends ActionAS {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(MappedEClassAS)
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getChangeInheritanceAS_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MappedEClassAS getSubject();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(MappedEClassAS value);

	/**
	 * Returns the value of the '<em><b>Superclasses</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclasses</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getChangeInheritanceAS_Superclasses()
	 * @model type="ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS" containment="true"
	 * @generated
	 */
	EList getSuperclasses();

} // ChangeInheritanceAS