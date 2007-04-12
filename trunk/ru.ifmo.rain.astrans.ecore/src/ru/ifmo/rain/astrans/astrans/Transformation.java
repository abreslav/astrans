/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astrans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.Transformation#getCreateClassActions <em>Create Class Actions</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.Transformation#getTranslateReferencesActions <em>Translate References Actions</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.Transformation#getChangeInheritanceActions <em>Change Inheritance Actions</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.Transformation#getSkipClassActions <em>Skip Class Actions</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.Transformation#getInput <em>Input</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.Transformation#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astrans.Transformation#getOutputNsURI <em>Output Ns URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Create Class Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astrans.CreateClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Class Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Class Actions</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getTransformation_CreateClassActions()
	 * @model type="ru.ifmo.rain.astrans.astrans.CreateClass" containment="true"
	 * @generated
	 */
	EList getCreateClassActions();

	/**
	 * Returns the value of the '<em><b>Translate References Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astrans.TranslateReferences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translate References Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate References Actions</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getTransformation_TranslateReferencesActions()
	 * @model type="ru.ifmo.rain.astrans.astrans.TranslateReferences" containment="true"
	 * @generated
	 */
	EList getTranslateReferencesActions();

	/**
	 * Returns the value of the '<em><b>Change Inheritance Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astrans.ChangeInheritance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Inheritance Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Inheritance Actions</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getTransformation_ChangeInheritanceActions()
	 * @model type="ru.ifmo.rain.astrans.astrans.ChangeInheritance" containment="true"
	 * @generated
	 */
	EList getChangeInheritanceActions();

	/**
	 * Returns the value of the '<em><b>Skip Class Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astrans.SkipClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Class Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Class Actions</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getTransformation_SkipClassActions()
	 * @model type="ru.ifmo.rain.astrans.astrans.SkipClass" containment="true"
	 * @generated
	 */
	EList getSkipClassActions();

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
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getTransformation_Input()
	 * @model
	 * @generated
	 */
	EPackage getInput();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astrans.Transformation#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EPackage value);

	/**
	 * Returns the value of the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Name</em>' attribute.
	 * @see #setOutputName(String)
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getTransformation_OutputName()
	 * @model
	 * @generated
	 */
	String getOutputName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astrans.Transformation#getOutputName <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Name</em>' attribute.
	 * @see #getOutputName()
	 * @generated
	 */
	void setOutputName(String value);

	/**
	 * Returns the value of the '<em><b>Output Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ns URI</em>' attribute.
	 * @see #setOutputNsURI(String)
	 * @see ru.ifmo.rain.astrans.astrans.AstransPackage#getTransformation_OutputNsURI()
	 * @model
	 * @generated
	 */
	String getOutputNsURI();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astrans.Transformation#getOutputNsURI <em>Output Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Ns URI</em>' attribute.
	 * @see #getOutputNsURI()
	 * @generated
	 */
	void setOutputNsURI(String value);

} // Transformation