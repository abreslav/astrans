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
 * A representation of the model object '<em><b>Skip Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.SkipClass#getTargetProto <em>Target Proto</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.SkipClass#isIncludeDescendants <em>Include Descendants</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.AstransPackage#getSkipClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FullyDefineAbstractClasses'"
 * @generated
 */
public interface SkipClass extends Action {
	/**
	 * Returns the value of the '<em><b>Target Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Proto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Proto</em>' reference.
	 * @see #setTargetProto(EClass)
	 * @see ru.ifmo.rain.astrans.AstransPackage#getSkipClass_TargetProto()
	 * @model required="true"
	 * @generated
	 */
	EClass getTargetProto();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.SkipClass#getTargetProto <em>Target Proto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Proto</em>' reference.
	 * @see #getTargetProto()
	 * @generated
	 */
	void setTargetProto(EClass value);

	/**
	 * Returns the value of the '<em><b>Include Descendants</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Descendants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Descendants</em>' attribute.
	 * @see #setIncludeDescendants(boolean)
	 * @see ru.ifmo.rain.astrans.AstransPackage#getSkipClass_IncludeDescendants()
	 * @model default="false"
	 * @generated
	 */
	boolean isIncludeDescendants();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.SkipClass#isIncludeDescendants <em>Include Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Descendants</em>' attribute.
	 * @see #isIncludeDescendants()
	 * @generated
	 */
	void setIncludeDescendants(boolean value);

} // SkipClass