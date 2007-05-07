/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryClassName <em>Factory Class Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryMethodName <em>Factory Method Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignAttributeStatements <em>Assign Attribute Statements</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignReferenceStatements <em>Assign Reference Statements</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getResolveObjectStatements <em>Resolve Object Statements</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getWriteTraceStatement <em>Write Trace Statement</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getScopeInformationStatements <em>Scope Information Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingRule extends Method {
	/**
	 * The cached value of the '{@link #getFactoryClassName() <em>Factory Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected ClassName factoryClassName = null;

	/**
	 * The default value of the '{@link #getFactoryMethodName() <em>Factory Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryMethodName() <em>Factory Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryMethodName()
	 * @generated
	 * @ordered
	 */
	protected String factoryMethodName = FACTORY_METHOD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignAttributeStatements() <em>Assign Attribute Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignAttributeStatements()
	 * @generated
	 * @ordered
	 */
	protected EList assignAttributeStatements = null;

	/**
	 * The cached value of the '{@link #getAssignReferenceStatements() <em>Assign Reference Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignReferenceStatements()
	 * @generated
	 * @ordered
	 */
	protected EList assignReferenceStatements = null;

	/**
	 * The cached value of the '{@link #getWriteTraceStatement() <em>Write Trace Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteTraceStatement()
	 * @generated
	 * @ordered
	 */
	protected WriteTrace writeTraceStatement = null;

	/**
	 * The cached value of the '{@link #getScopeInformationStatements() <em>Scope Information Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeInformationStatements()
	 * @generated
	 * @ordered
	 */
	protected ScopeInformationStatements scopeInformationStatements = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.MAPPING_RULE;
	}

	/**
	 * Returns the value of the '<em><b>Factory Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Class Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Class Name</em>' containment reference.
	 * @see #setFactoryClassName(ClassName)
	 * @generated
	 */
	public ClassName getFactoryClassName() {
		return factoryClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryClassName(ClassName newFactoryClassName, NotificationChain msgs) {
		ClassName oldFactoryClassName = factoryClassName;
		factoryClassName = newFactoryClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME, oldFactoryClassName, newFactoryClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryClassName <em>Factory Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Class Name</em>' containment reference.
	 * @see #getFactoryClassName()
	 * @generated
	 */
	public void setFactoryClassName(ClassName newFactoryClassName) {
		if (newFactoryClassName != factoryClassName) {
			NotificationChain msgs = null;
			if (factoryClassName != null)
				msgs = ((InternalEObject)factoryClassName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME, null, msgs);
			if (newFactoryClassName != null)
				msgs = ((InternalEObject)newFactoryClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME, null, msgs);
			msgs = basicSetFactoryClassName(newFactoryClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME, newFactoryClassName, newFactoryClassName));
	}

	/**
	 * Returns the value of the '<em><b>Factory Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Method Name</em>' attribute.
	 * @see #setFactoryMethodName(String)
	 * @generated
	 */
	public String getFactoryMethodName() {
		return factoryMethodName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryMethodName <em>Factory Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Method Name</em>' attribute.
	 * @see #getFactoryMethodName()
	 * @generated
	 */
	public void setFactoryMethodName(String newFactoryMethodName) {
		String oldFactoryMethodName = factoryMethodName;
		factoryMethodName = newFactoryMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.MAPPING_RULE__FACTORY_METHOD_NAME, oldFactoryMethodName, factoryMethodName));
	}

	/**
	 * Returns the value of the '<em><b>Assign Attribute Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.AssignAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Attribute Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Attribute Statements</em>' containment reference list.
	 * @generated
	 */
	public List getAssignAttributeStatements() {
		if (assignAttributeStatements == null) {
			assignAttributeStatements = new EObjectContainmentEList(AssignAttribute.class, this, AstransformationPackage.MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS);
		}
		return assignAttributeStatements;
	}

	/**
	 * Returns the value of the '<em><b>Assign Reference Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.AssignReferenceStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Reference Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Reference Statements</em>' containment reference list.
	 * @generated
	 */
	public List getAssignReferenceStatements() {
		if (assignReferenceStatements == null) {
			assignReferenceStatements = new EObjectContainmentEList(AssignReferenceStatement.class, this, AstransformationPackage.MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS);
		}
		return assignReferenceStatements;
	}

	/**
	 * Returns the value of the '<em><b>Write Trace Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Trace Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Trace Statement</em>' containment reference.
	 * @see #setWriteTraceStatement(WriteTrace)
	 * @generated
	 */
	public WriteTrace getWriteTraceStatement() {
		return writeTraceStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteTraceStatement(WriteTrace newWriteTraceStatement, NotificationChain msgs) {
		WriteTrace oldWriteTraceStatement = writeTraceStatement;
		writeTraceStatement = newWriteTraceStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT, oldWriteTraceStatement, newWriteTraceStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getWriteTraceStatement <em>Write Trace Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Trace Statement</em>' containment reference.
	 * @see #getWriteTraceStatement()
	 * @generated
	 */
	public void setWriteTraceStatement(WriteTrace newWriteTraceStatement) {
		if (newWriteTraceStatement != writeTraceStatement) {
			NotificationChain msgs = null;
			if (writeTraceStatement != null)
				msgs = ((InternalEObject)writeTraceStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT, null, msgs);
			if (newWriteTraceStatement != null)
				msgs = ((InternalEObject)newWriteTraceStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT, null, msgs);
			msgs = basicSetWriteTraceStatement(newWriteTraceStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT, newWriteTraceStatement, newWriteTraceStatement));
	}

	/**
	 * Returns the value of the '<em><b>Scope Information Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Information Statements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Information Statements</em>' containment reference.
	 * @see #setScopeInformationStatements(ScopeInformationStatements)
	 * @generated
	 */
	public ScopeInformationStatements getScopeInformationStatements() {
		return scopeInformationStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopeInformationStatements(ScopeInformationStatements newScopeInformationStatements, NotificationChain msgs) {
		ScopeInformationStatements oldScopeInformationStatements = scopeInformationStatements;
		scopeInformationStatements = newScopeInformationStatements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS, oldScopeInformationStatements, newScopeInformationStatements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getScopeInformationStatements <em>Scope Information Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Information Statements</em>' containment reference.
	 * @see #getScopeInformationStatements()
	 * @generated
	 */
	public void setScopeInformationStatements(ScopeInformationStatements newScopeInformationStatements) {
		if (newScopeInformationStatements != scopeInformationStatements) {
			NotificationChain msgs = null;
			if (scopeInformationStatements != null)
				msgs = ((InternalEObject)scopeInformationStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS, null, msgs);
			if (newScopeInformationStatements != null)
				msgs = ((InternalEObject)newScopeInformationStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS, null, msgs);
			msgs = basicSetScopeInformationStatements(newScopeInformationStatements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS, newScopeInformationStatements, newScopeInformationStatements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME:
				return basicSetFactoryClassName(null, msgs);
			case AstransformationPackage.MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				return ((InternalEList)getAssignAttributeStatements()).basicRemove(otherEnd, msgs);
			case AstransformationPackage.MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				return ((InternalEList)getAssignReferenceStatements()).basicRemove(otherEnd, msgs);
			case AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT:
				return basicSetWriteTraceStatement(null, msgs);
			case AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS:
				return basicSetScopeInformationStatements(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * Returns the value of the '<em><b>Resolve Object Statements</b></em>' reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.ResolveObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Object Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Object Statements</em>' reference list.
	 * @generated NOT
	 */
	public List getResolveObjectStatements() {
		ArrayList list = new ArrayList();
		List statements = getAssignReferenceStatements();
		for (Iterator iter = statements.iterator(); iter.hasNext();) {
			AssignReferenceStatement ar = (AssignReferenceStatement) iter.next();
			if (ar instanceof ResolveObjects) {
				list.addAll(((ResolveObjects) ar).getResolveObjectStatements());
			}
		}
		return Collections.unmodifiableList(list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME:
				return getFactoryClassName();
			case AstransformationPackage.MAPPING_RULE__FACTORY_METHOD_NAME:
				return getFactoryMethodName();
			case AstransformationPackage.MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				return getAssignAttributeStatements();
			case AstransformationPackage.MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				return getAssignReferenceStatements();
			case AstransformationPackage.MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS:
				return getResolveObjectStatements();
			case AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT:
				return getWriteTraceStatement();
			case AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS:
				return getScopeInformationStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME:
				setFactoryClassName((ClassName)newValue);
				return;
			case AstransformationPackage.MAPPING_RULE__FACTORY_METHOD_NAME:
				setFactoryMethodName((String)newValue);
				return;
			case AstransformationPackage.MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				getAssignAttributeStatements().clear();
				getAssignAttributeStatements().addAll((Collection)newValue);
				return;
			case AstransformationPackage.MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				getAssignReferenceStatements().clear();
				getAssignReferenceStatements().addAll((Collection)newValue);
				return;
			case AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT:
				setWriteTraceStatement((WriteTrace)newValue);
				return;
			case AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS:
				setScopeInformationStatements((ScopeInformationStatements)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME:
				setFactoryClassName((ClassName)null);
				return;
			case AstransformationPackage.MAPPING_RULE__FACTORY_METHOD_NAME:
				setFactoryMethodName(FACTORY_METHOD_NAME_EDEFAULT);
				return;
			case AstransformationPackage.MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				getAssignAttributeStatements().clear();
				return;
			case AstransformationPackage.MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				getAssignReferenceStatements().clear();
				return;
			case AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT:
				setWriteTraceStatement((WriteTrace)null);
				return;
			case AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS:
				setScopeInformationStatements((ScopeInformationStatements)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AstransformationPackage.MAPPING_RULE__FACTORY_CLASS_NAME:
				return factoryClassName != null;
			case AstransformationPackage.MAPPING_RULE__FACTORY_METHOD_NAME:
				return FACTORY_METHOD_NAME_EDEFAULT == null ? factoryMethodName != null : !FACTORY_METHOD_NAME_EDEFAULT.equals(factoryMethodName);
			case AstransformationPackage.MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				return assignAttributeStatements != null && !assignAttributeStatements.isEmpty();
			case AstransformationPackage.MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				return assignReferenceStatements != null && !assignReferenceStatements.isEmpty();
			case AstransformationPackage.MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS:
				return !getResolveObjectStatements().isEmpty();
			case AstransformationPackage.MAPPING_RULE__WRITE_TRACE_STATEMENT:
				return writeTraceStatement != null;
			case AstransformationPackage.MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS:
				return scopeInformationStatements != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (factoryMethodName: ");
		result.append(factoryMethodName);
		result.append(')');
		return result.toString();
	}

} // MappingRule