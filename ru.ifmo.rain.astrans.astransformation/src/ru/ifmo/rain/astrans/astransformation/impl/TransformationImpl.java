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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.MappingRule;
import ru.ifmo.rain.astrans.astransformation.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl#getMain <em>Main</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl#getResolverClassName <em>Resolver Class Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl#getTraceClassName <em>Trace Class Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl#getSwitchClassName <em>Switch Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends EObjectImpl implements Transformation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappingRules() <em>Mapping Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingRules()
	 * @generated
	 * @ordered
	 */
	protected EList mappingRules = null;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected MappingRule main = null;

	/**
	 * The cached value of the '{@link #getResolverClassName() <em>Resolver Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverClassName()
	 * @generated
	 * @ordered
	 */
	protected ClassName resolverClassName = null;

	/**
	 * The cached value of the '{@link #getTraceClassName() <em>Trace Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceClassName()
	 * @generated
	 * @ordered
	 */
	protected ClassName traceClassName = null;

	/**
	 * The cached value of the '{@link #getSwitchClassName() <em>Switch Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchClassName()
	 * @generated
	 * @ordered
	 */
	protected ClassName switchClassName = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMappingRules() {
		if (mappingRules == null) {
			mappingRules = new EObjectContainmentEList(MappingRule.class, this, AstransformationPackage.TRANSFORMATION__MAPPING_RULES);
		}
		return mappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRule getMain() {
		if (main != null && main.eIsProxy()) {
			InternalEObject oldMain = (InternalEObject)main;
			main = (MappingRule)eResolveProxy(oldMain);
			if (main != oldMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AstransformationPackage.TRANSFORMATION__MAIN, oldMain, main));
			}
		}
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRule basicGetMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(MappingRule newMain) {
		MappingRule oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassName getResolverClassName() {
		return resolverClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolverClassName(ClassName newResolverClassName, NotificationChain msgs) {
		ClassName oldResolverClassName = resolverClassName;
		resolverClassName = newResolverClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME, oldResolverClassName, newResolverClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolverClassName(ClassName newResolverClassName) {
		if (newResolverClassName != resolverClassName) {
			NotificationChain msgs = null;
			if (resolverClassName != null)
				msgs = ((InternalEObject)resolverClassName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME, null, msgs);
			if (newResolverClassName != null)
				msgs = ((InternalEObject)newResolverClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME, null, msgs);
			msgs = basicSetResolverClassName(newResolverClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME, newResolverClassName, newResolverClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassName getTraceClassName() {
		return traceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceClassName(ClassName newTraceClassName, NotificationChain msgs) {
		ClassName oldTraceClassName = traceClassName;
		traceClassName = newTraceClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME, oldTraceClassName, newTraceClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceClassName(ClassName newTraceClassName) {
		if (newTraceClassName != traceClassName) {
			NotificationChain msgs = null;
			if (traceClassName != null)
				msgs = ((InternalEObject)traceClassName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME, null, msgs);
			if (newTraceClassName != null)
				msgs = ((InternalEObject)newTraceClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME, null, msgs);
			msgs = basicSetTraceClassName(newTraceClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME, newTraceClassName, newTraceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassName getSwitchClassName() {
		return switchClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchClassName(ClassName newSwitchClassName, NotificationChain msgs) {
		ClassName oldSwitchClassName = switchClassName;
		switchClassName = newSwitchClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME, oldSwitchClassName, newSwitchClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchClassName(ClassName newSwitchClassName) {
		if (newSwitchClassName != switchClassName) {
			NotificationChain msgs = null;
			if (switchClassName != null)
				msgs = ((InternalEObject)switchClassName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME, null, msgs);
			if (newSwitchClassName != null)
				msgs = ((InternalEObject)newSwitchClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME, null, msgs);
			msgs = basicSetSwitchClassName(newSwitchClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME, newSwitchClassName, newSwitchClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstransformationPackage.TRANSFORMATION__MAPPING_RULES:
				return ((InternalEList)getMappingRules()).basicRemove(otherEnd, msgs);
			case AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME:
				return basicSetResolverClassName(null, msgs);
			case AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME:
				return basicSetTraceClassName(null, msgs);
			case AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME:
				return basicSetSwitchClassName(null, msgs);
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
			case AstransformationPackage.TRANSFORMATION__NAME:
				return getName();
			case AstransformationPackage.TRANSFORMATION__MAPPING_RULES:
				return getMappingRules();
			case AstransformationPackage.TRANSFORMATION__MAIN:
				if (resolve) return getMain();
				return basicGetMain();
			case AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME:
				return getResolverClassName();
			case AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME:
				return getTraceClassName();
			case AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME:
				return getSwitchClassName();
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
			case AstransformationPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case AstransformationPackage.TRANSFORMATION__MAPPING_RULES:
				getMappingRules().clear();
				getMappingRules().addAll((Collection)newValue);
				return;
			case AstransformationPackage.TRANSFORMATION__MAIN:
				setMain((MappingRule)newValue);
				return;
			case AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME:
				setResolverClassName((ClassName)newValue);
				return;
			case AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME:
				setTraceClassName((ClassName)newValue);
				return;
			case AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME:
				setSwitchClassName((ClassName)newValue);
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
			case AstransformationPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AstransformationPackage.TRANSFORMATION__MAPPING_RULES:
				getMappingRules().clear();
				return;
			case AstransformationPackage.TRANSFORMATION__MAIN:
				setMain((MappingRule)null);
				return;
			case AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME:
				setResolverClassName((ClassName)null);
				return;
			case AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME:
				setTraceClassName((ClassName)null);
				return;
			case AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME:
				setSwitchClassName((ClassName)null);
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
			case AstransformationPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AstransformationPackage.TRANSFORMATION__MAPPING_RULES:
				return mappingRules != null && !mappingRules.isEmpty();
			case AstransformationPackage.TRANSFORMATION__MAIN:
				return main != null;
			case AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME:
				return resolverClassName != null;
			case AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME:
				return traceClassName != null;
			case AstransformationPackage.TRANSFORMATION__SWITCH_CLASS_NAME:
				return switchClassName != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl