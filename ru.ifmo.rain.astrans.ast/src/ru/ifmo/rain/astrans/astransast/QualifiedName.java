/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.QualifiedName#getName <em>Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.QualifiedName#getSubQN <em>Sub QN</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName extends EClassifierReferenceAS {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getQualifiedName_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.QualifiedName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub QN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub QN</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub QN</em>' containment reference.
	 * @see #setSubQN(QualifiedName)
	 * @see ru.ifmo.rain.astrans.astransast.AstransastPackage#getQualifiedName_SubQN()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedName getSubQN();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransast.QualifiedName#getSubQN <em>Sub QN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub QN</em>' containment reference.
	 * @see #getSubQN()
	 * @generated
	 */
	void setSubQN(QualifiedName value);

} // QualifiedName