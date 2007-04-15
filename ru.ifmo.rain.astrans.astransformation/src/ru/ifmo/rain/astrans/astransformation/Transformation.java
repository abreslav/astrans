/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMain <em>Main</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getResolverClassName <em>Resolver Class Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getTraceClassName <em>Trace Class Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getInput <em>Input</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Named {
	/**
	 * Returns the value of the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.MappingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rules</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation_MappingRules()
	 * @model type="ru.ifmo.rain.astrans.astransformation.MappingRule" containment="true"
	 * @generated
	 */
	EList getMappingRules();

	/**
	 * Returns the value of the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' reference.
	 * @see #setMain(MappingRule)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation_Main()
	 * @model required="true"
	 * @generated
	 */
	MappingRule getMain();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMain <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(MappingRule value);

	/**
	 * Returns the value of the '<em><b>Resolver Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver Class Name</em>' attribute.
	 * @see #setResolverClassName(String)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation_ResolverClassName()
	 * @model required="true"
	 * @generated
	 */
	String getResolverClassName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getResolverClassName <em>Resolver Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver Class Name</em>' attribute.
	 * @see #getResolverClassName()
	 * @generated
	 */
	void setResolverClassName(String value);

	/**
	 * Returns the value of the '<em><b>Trace Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Class Name</em>' attribute.
	 * @see #setTraceClassName(String)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation_TraceClassName()
	 * @model required="true"
	 * @generated
	 */
	String getTraceClassName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getTraceClassName <em>Trace Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Class Name</em>' attribute.
	 * @see #getTraceClassName()
	 * @generated
	 */
	void setTraceClassName(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(EPackage)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation_Input()
	 * @model required="true"
	 * @generated
	 */
	EPackage getInput();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EPackage value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(EPackage)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation_Output()
	 * @model required="true"
	 * @generated
	 */
	EPackage getOutput();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(EPackage value);

} // Transformation