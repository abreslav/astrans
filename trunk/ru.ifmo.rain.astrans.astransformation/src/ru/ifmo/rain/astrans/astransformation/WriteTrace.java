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
 * A representation of the model object '<em><b>Write Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.WriteTrace#getTraceMethodName <em>Trace Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getWriteTrace()
 * @model
 * @generated
 */
public interface WriteTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Method Name</em>' attribute.
	 * @see #setTraceMethodName(String)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getWriteTrace_TraceMethodName()
	 * @model required="true"
	 * @generated
	 */
	String getTraceMethodName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace#getTraceMethodName <em>Trace Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Method Name</em>' attribute.
	 * @see #getTraceMethodName()
	 * @generated
	 */
	void setTraceMethodName(String value);

} // WriteTrace