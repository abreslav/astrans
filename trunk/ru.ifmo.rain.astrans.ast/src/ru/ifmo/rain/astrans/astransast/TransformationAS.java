/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransast;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getOutputNsURI <em>Output Ns URI</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getCreateClassActions <em>Create Class Actions</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getTranslateReferencesActions <em>Translate References Actions</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getChangeInheritanceActions <em>Change Inheritance Actions</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getSkipClassActions <em>Skip Class Actions</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTransformationAS()
 * @model
 * @generated
 */
public interface TransformationAS extends EObject {
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
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTransformationAS_OutputName()
	 * @model
	 * @generated
	 */
	String getOutputName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getOutputName <em>Output Name</em>}' attribute.
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
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTransformationAS_OutputNsURI()
	 * @model
	 * @generated
	 */
	String getOutputNsURI();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getOutputNsURI <em>Output Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Ns URI</em>' attribute.
	 * @see #getOutputNsURI()
	 * @generated
	 */
	void setOutputNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Create Class Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransast.CreateClassAS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Class Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Class Actions</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTransformationAS_CreateClassActions()
	 * @model type="ru.ifmo.rain.astrans.astransast.CreateClassAS" containment="true"
	 * @generated
	 */
	EList getCreateClassActions();

	/**
	 * Returns the value of the '<em><b>Translate References Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translate References Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate References Actions</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTransformationAS_TranslateReferencesActions()
	 * @model type="ru.ifmo.rain.astrans.astransast.TranslateReferencesAS" containment="true"
	 * @generated
	 */
	EList getTranslateReferencesActions();

	/**
	 * Returns the value of the '<em><b>Change Inheritance Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Inheritance Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Inheritance Actions</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTransformationAS_ChangeInheritanceActions()
	 * @model type="ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS" containment="true"
	 * @generated
	 */
	EList getChangeInheritanceActions();

	/**
	 * Returns the value of the '<em><b>Skip Class Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransast.SkipClassAS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Class Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Class Actions</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTransformationAS_SkipClassActions()
	 * @model type="ru.ifmo.rain.astrans.astransast.SkipClassAS" containment="true"
	 * @generated
	 */
	EList getSkipClassActions();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(EPackageReference)
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTransformationAS_Input()
	 * @model containment="true"
	 * @generated
	 */
	EPackageReference getInput();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EPackageReference value);

} // TransformationAS