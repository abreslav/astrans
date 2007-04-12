/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translate References AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#isIncludeDescendants <em>Include Descendants</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#getModelReferenceTypeProto <em>Model Reference Type Proto</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#getTextualReferenceType <em>Textual Reference Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTranslateReferencesAS()
 * @model
 * @generated
 */
public interface TranslateReferencesAS extends ActionAS {
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
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTranslateReferencesAS_IncludeDescendants()
	 * @model default="false"
	 * @generated
	 */
	boolean isIncludeDescendants();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#isIncludeDescendants <em>Include Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Descendants</em>' attribute.
	 * @see #isIncludeDescendants()
	 * @generated
	 */
	void setIncludeDescendants(boolean value);

	/**
	 * Returns the value of the '<em><b>Model Reference Type Proto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Reference Type Proto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Reference Type Proto</em>' containment reference.
	 * @see #setModelReferenceTypeProto(QualifiedName)
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTranslateReferencesAS_ModelReferenceTypeProto()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QualifiedName getModelReferenceTypeProto();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#getModelReferenceTypeProto <em>Model Reference Type Proto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Reference Type Proto</em>' containment reference.
	 * @see #getModelReferenceTypeProto()
	 * @generated
	 */
	void setModelReferenceTypeProto(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>Textual Reference Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textual Reference Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textual Reference Type</em>' containment reference.
	 * @see #setTextualReferenceType(EClassifierReferenceAS)
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getTranslateReferencesAS_TextualReferenceType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EClassifierReferenceAS getTextualReferenceType();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#getTextualReferenceType <em>Textual Reference Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textual Reference Type</em>' containment reference.
	 * @see #getTextualReferenceType()
	 * @generated
	 */
	void setTextualReferenceType(EClassifierReferenceAS value);

} // TranslateReferencesAS