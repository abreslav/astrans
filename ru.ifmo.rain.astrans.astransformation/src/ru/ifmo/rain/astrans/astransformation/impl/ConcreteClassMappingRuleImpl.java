/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.ifmo.rain.astrans.astransformation.AssignAttribute;
import ru.ifmo.rain.astrans.astransformation.AssignReference;
import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.ConcreteClassMappingRule;
import ru.ifmo.rain.astrans.astransformation.ResolveObject;
import ru.ifmo.rain.astrans.astransformation.WriteTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Class Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ConcreteClassMappingRuleImpl#getFactoryClassName <em>Factory Class Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ConcreteClassMappingRuleImpl#getFactoryMethodName <em>Factory Method Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ConcreteClassMappingRuleImpl#getAssignAttributeStatements <em>Assign Attribute Statements</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ConcreteClassMappingRuleImpl#getAssignReferenceStatements <em>Assign Reference Statements</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ConcreteClassMappingRuleImpl#getWriteTraceStatement <em>Write Trace Statement</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ConcreteClassMappingRuleImpl#getResolveObjectStatements <em>Resolve Object Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteClassMappingRuleImpl extends MappingRuleImpl implements ConcreteClassMappingRule {
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
	 * The cached value of the '{@link #getResolveObjectStatements() <em>Resolve Object Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveObjectStatements()
	 * @generated
	 * @ordered
	 */
	protected EList resolveObjectStatements = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteClassMappingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.CONCRETE_CLASS_MAPPING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME, oldFactoryClassName, newFactoryClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryClassName(ClassName newFactoryClassName) {
		if (newFactoryClassName != factoryClassName) {
			NotificationChain msgs = null;
			if (factoryClassName != null)
				msgs = ((InternalEObject)factoryClassName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME, null, msgs);
			if (newFactoryClassName != null)
				msgs = ((InternalEObject)newFactoryClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME, null, msgs);
			msgs = basicSetFactoryClassName(newFactoryClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME, newFactoryClassName, newFactoryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryMethodName() {
		return factoryMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryMethodName(String newFactoryMethodName) {
		String oldFactoryMethodName = factoryMethodName;
		factoryMethodName = newFactoryMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_METHOD_NAME, oldFactoryMethodName, factoryMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssignAttributeStatements() {
		if (assignAttributeStatements == null) {
			assignAttributeStatements = new EObjectContainmentEList(AssignAttribute.class, this, AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS);
		}
		return assignAttributeStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssignReferenceStatements() {
		if (assignReferenceStatements == null) {
			assignReferenceStatements = new EObjectContainmentEList(AssignReference.class, this, AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS);
		}
		return assignReferenceStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT, oldWriteTraceStatement, newWriteTraceStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteTraceStatement(WriteTrace newWriteTraceStatement) {
		if (newWriteTraceStatement != writeTraceStatement) {
			NotificationChain msgs = null;
			if (writeTraceStatement != null)
				msgs = ((InternalEObject)writeTraceStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT, null, msgs);
			if (newWriteTraceStatement != null)
				msgs = ((InternalEObject)newWriteTraceStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT, null, msgs);
			msgs = basicSetWriteTraceStatement(newWriteTraceStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT, newWriteTraceStatement, newWriteTraceStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResolveObjectStatements() {
		if (resolveObjectStatements == null) {
			resolveObjectStatements = new EObjectContainmentEList(ResolveObject.class, this, AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS);
		}
		return resolveObjectStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME:
				return basicSetFactoryClassName(null, msgs);
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				return ((InternalEList)getAssignAttributeStatements()).basicRemove(otherEnd, msgs);
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				return ((InternalEList)getAssignReferenceStatements()).basicRemove(otherEnd, msgs);
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT:
				return basicSetWriteTraceStatement(null, msgs);
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS:
				return ((InternalEList)getResolveObjectStatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME:
				return getFactoryClassName();
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_METHOD_NAME:
				return getFactoryMethodName();
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				return getAssignAttributeStatements();
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				return getAssignReferenceStatements();
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT:
				return getWriteTraceStatement();
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS:
				return getResolveObjectStatements();
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
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME:
				setFactoryClassName((ClassName)newValue);
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_METHOD_NAME:
				setFactoryMethodName((String)newValue);
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				getAssignAttributeStatements().clear();
				getAssignAttributeStatements().addAll((Collection)newValue);
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				getAssignReferenceStatements().clear();
				getAssignReferenceStatements().addAll((Collection)newValue);
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT:
				setWriteTraceStatement((WriteTrace)newValue);
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS:
				getResolveObjectStatements().clear();
				getResolveObjectStatements().addAll((Collection)newValue);
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
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME:
				setFactoryClassName((ClassName)null);
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_METHOD_NAME:
				setFactoryMethodName(FACTORY_METHOD_NAME_EDEFAULT);
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				getAssignAttributeStatements().clear();
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				getAssignReferenceStatements().clear();
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT:
				setWriteTraceStatement((WriteTrace)null);
				return;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS:
				getResolveObjectStatements().clear();
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
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_CLASS_NAME:
				return factoryClassName != null;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__FACTORY_METHOD_NAME:
				return FACTORY_METHOD_NAME_EDEFAULT == null ? factoryMethodName != null : !FACTORY_METHOD_NAME_EDEFAULT.equals(factoryMethodName);
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS:
				return assignAttributeStatements != null && !assignAttributeStatements.isEmpty();
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS:
				return assignReferenceStatements != null && !assignReferenceStatements.isEmpty();
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__WRITE_TRACE_STATEMENT:
				return writeTraceStatement != null;
			case AstransformationPackage.CONCRETE_CLASS_MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS:
				return resolveObjectStatements != null && !resolveObjectStatements.isEmpty();
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

} //ConcreteClassMappingRuleImpl