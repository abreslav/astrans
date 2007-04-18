/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getResolverMethodName <em>Resolver Method Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getResolveObject()
 * @model
 * @generated
 */
public interface ResolveObject extends AssignFeature, Typed {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' containment reference.
	 * @see #setParameterType(TypeName)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getResolveObject_ParameterType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeName getParameterType();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterType <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' containment reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(TypeName value);

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getResolveObject_ParameterName()
	 * @model required="true"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Resolver Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver Method Name</em>' attribute.
	 * @see #setResolverMethodName(String)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getResolveObject_ResolverMethodName()
	 * @model required="true"
	 * @generated
	 */
	String getResolverMethodName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getResolverMethodName <em>Resolver Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver Method Name</em>' attribute.
	 * @see #getResolverMethodName()
	 * @generated
	 */
	void setResolverMethodName(String value);

} // ResolveObject