/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Class Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.AbstractClassMappingRule#getResolverMethodName <em>Resolver Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAbstractClassMappingRule()
 * @model
 * @generated
 */
public interface AbstractClassMappingRule extends MappingRule {
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
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAbstractClassMappingRule_ResolverMethodName()
	 * @model required="true"
	 * @generated
	 */
	String getResolverMethodName();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.AbstractClassMappingRule#getResolverMethodName <em>Resolver Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver Method Name</em>' attribute.
	 * @see #getResolverMethodName()
	 * @generated
	 */
	void setResolverMethodName(String value);

} // AbstractClassMappingRule