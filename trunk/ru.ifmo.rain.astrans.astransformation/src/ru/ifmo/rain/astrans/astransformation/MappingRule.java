/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getParameter <em>Parameter</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getResult <em>Result</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignAttributeStatements <em>Assign Attribute Statements</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignReferenceStatements <em>Assign Reference Statements</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getWriteTraceStatement <em>Write Trace Statement</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getResolveObjectStatements <em>Resolve Object Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule()
 * @model
 * @generated
 */
public interface MappingRule extends Named {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Parameter)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Parameter)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parameter getResult();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Parameter value);

	/**
	 * Returns the value of the '<em><b>Assign Attribute Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.AssignAttribute}.
	 * It is bidirectional and its opposite is '{@link ru.ifmo.rain.astrans.astransformation.AssignAttribute#getMappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Attribute Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Attribute Statements</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule_AssignAttributeStatements()
	 * @see ru.ifmo.rain.astrans.astransformation.AssignAttribute#getMappingRule
	 * @model type="ru.ifmo.rain.astrans.astransformation.AssignAttribute" opposite="mappingRule" containment="true"
	 * @generated
	 */
	EList getAssignAttributeStatements();

	/**
	 * Returns the value of the '<em><b>Assign Reference Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.AssignReference}.
	 * It is bidirectional and its opposite is '{@link ru.ifmo.rain.astrans.astransformation.AssignReference#getMappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Reference Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Reference Statements</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule_AssignReferenceStatements()
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReference#getMappingRule
	 * @model type="ru.ifmo.rain.astrans.astransformation.AssignReference" opposite="mappingRule" containment="true"
	 * @generated
	 */
	EList getAssignReferenceStatements();

	/**
	 * Returns the value of the '<em><b>Write Trace Statement</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace#getMappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Trace Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Trace Statement</em>' containment reference.
	 * @see #setWriteTraceStatement(WriteTrace)
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule_WriteTraceStatement()
	 * @see ru.ifmo.rain.astrans.astransformation.WriteTrace#getMappingRule
	 * @model opposite="mappingRule" containment="true" required="true"
	 * @generated
	 */
	WriteTrace getWriteTraceStatement();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getWriteTraceStatement <em>Write Trace Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Trace Statement</em>' containment reference.
	 * @see #getWriteTraceStatement()
	 * @generated
	 */
	void setWriteTraceStatement(WriteTrace value);

	/**
	 * Returns the value of the '<em><b>Resolve Object Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.ResolveObject}.
	 * It is bidirectional and its opposite is '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getMappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Object Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Object Statements</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule_ResolveObjectStatements()
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject#getMappingRule
	 * @model type="ru.ifmo.rain.astrans.astransformation.ResolveObject" opposite="mappingRule" containment="true"
	 * @generated
	 */
	EList getResolveObjectStatements();

} // MappingRule