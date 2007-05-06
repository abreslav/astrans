/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMain <em>Main</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getCustomMain <em>Custom Main</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getResolverClassName <em>Resolver Class Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getTraceClassName <em>Trace Class Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.Transformation#getSwitchClassName <em>Switch Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Transformation extends EObjectImpl implements Named {
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
	 * The cached value of the '{@link #getCustomMain() <em>Custom Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMain()
	 * @generated
	 * @ordered
	 */
	protected CustomMainMethod customMain = null;

	/**
	 * The default value of the '{@link #getResolverClassName() <em>Resolver Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolverClassName() <em>Resolver Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverClassName()
	 * @generated
	 * @ordered
	 */
	protected String resolverClassName = RESOLVER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceClassName() <em>Trace Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceClassName() <em>Trace Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceClassName()
	 * @generated
	 * @ordered
	 */
	protected String traceClassName = TRACE_CLASS_NAME_EDEFAULT;

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
	protected Transformation() {
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.MappingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rules</em>' containment reference list.
	 * @generated
	 */
	public List getMappingRules() {
		if (mappingRules == null) {
			mappingRules = new EObjectContainmentEList(MappingRule.class, this, AstransformationPackage.TRANSFORMATION__MAPPING_RULES);
		}
		return mappingRules;
	}

	/**
	 * Returns the value of the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' reference.
	 * @see #setMain(MappingRule)
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
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMain <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' reference.
	 * @see #getMain()
	 * @generated
	 */
	public void setMain(MappingRule newMain) {
		MappingRule oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__MAIN, oldMain, main));
	}

	/**
	 * Returns the value of the '<em><b>Custom Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Main</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Main</em>' containment reference.
	 * @see #setCustomMain(CustomMainMethod)
	 * @generated
	 */
	public CustomMainMethod getCustomMain() {
		return customMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomMain(CustomMainMethod newCustomMain, NotificationChain msgs) {
		CustomMainMethod oldCustomMain = customMain;
		customMain = newCustomMain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN, oldCustomMain, newCustomMain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getCustomMain <em>Custom Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Main</em>' containment reference.
	 * @see #getCustomMain()
	 * @generated
	 */
	public void setCustomMain(CustomMainMethod newCustomMain) {
		if (newCustomMain != customMain) {
			NotificationChain msgs = null;
			if (customMain != null)
				msgs = ((InternalEObject)customMain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN, null, msgs);
			if (newCustomMain != null)
				msgs = ((InternalEObject)newCustomMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN, null, msgs);
			msgs = basicSetCustomMain(newCustomMain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN, newCustomMain, newCustomMain));
	}

	/**
	 * Returns the value of the '<em><b>Resolver Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver Class Name</em>' attribute.
	 * @see #setResolverClassName(String)
	 * @generated
	 */
	public String getResolverClassName() {
		return resolverClassName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getResolverClassName <em>Resolver Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver Class Name</em>' attribute.
	 * @see #getResolverClassName()
	 * @generated
	 */
	public void setResolverClassName(String newResolverClassName) {
		String oldResolverClassName = resolverClassName;
		resolverClassName = newResolverClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME, oldResolverClassName, resolverClassName));
	}

	/**
	 * Returns the value of the '<em><b>Trace Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Class Name</em>' attribute.
	 * @see #setTraceClassName(String)
	 * @generated
	 */
	public String getTraceClassName() {
		return traceClassName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getTraceClassName <em>Trace Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Class Name</em>' attribute.
	 * @see #getTraceClassName()
	 * @generated
	 */
	public void setTraceClassName(String newTraceClassName) {
		String oldTraceClassName = traceClassName;
		traceClassName = newTraceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME, oldTraceClassName, traceClassName));
	}

	/**
	 * Returns the value of the '<em><b>Switch Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Class Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Class Name</em>' containment reference.
	 * @see #setSwitchClassName(ClassName)
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
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getSwitchClassName <em>Switch Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Class Name</em>' containment reference.
	 * @see #getSwitchClassName()
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
			case AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN:
				return basicSetCustomMain(null, msgs);
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
			case AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN:
				return getCustomMain();
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
			case AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN:
				setCustomMain((CustomMainMethod)newValue);
				return;
			case AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME:
				setResolverClassName((String)newValue);
				return;
			case AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME:
				setTraceClassName((String)newValue);
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
			case AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN:
				setCustomMain((CustomMainMethod)null);
				return;
			case AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME:
				setResolverClassName(RESOLVER_CLASS_NAME_EDEFAULT);
				return;
			case AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME:
				setTraceClassName(TRACE_CLASS_NAME_EDEFAULT);
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
			case AstransformationPackage.TRANSFORMATION__CUSTOM_MAIN:
				return customMain != null;
			case AstransformationPackage.TRANSFORMATION__RESOLVER_CLASS_NAME:
				return RESOLVER_CLASS_NAME_EDEFAULT == null ? resolverClassName != null : !RESOLVER_CLASS_NAME_EDEFAULT.equals(resolverClassName);
			case AstransformationPackage.TRANSFORMATION__TRACE_CLASS_NAME:
				return TRACE_CLASS_NAME_EDEFAULT == null ? traceClassName != null : !TRACE_CLASS_NAME_EDEFAULT.equals(traceClassName);
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
		result.append(", resolverClassName: ");
		result.append(resolverClassName);
		result.append(", traceClassName: ");
		result.append(traceClassName);
		result.append(')');
		return result.toString();
	}

} // Transformation