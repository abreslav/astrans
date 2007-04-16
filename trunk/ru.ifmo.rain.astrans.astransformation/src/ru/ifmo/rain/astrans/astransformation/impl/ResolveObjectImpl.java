/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.ResolveObject;

import ru.ifmo.rain.astrans.astransformation.Typed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolve Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ResolveObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ResolveObjectImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.ResolveObjectImpl#getResolverMethodName <em>Resolver Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResolveObjectImpl extends AssignFeatureImpl implements ResolveObject {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClassName type = null;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected ClassName parameterType = null;

	/**
	 * The default value of the '{@link #getResolverMethodName() <em>Resolver Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolverMethodName() <em>Resolver Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverMethodName()
	 * @generated
	 * @ordered
	 */
	protected String resolverMethodName = RESOLVER_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolveObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.RESOLVE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassName getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ClassName newType, NotificationChain msgs) {
		ClassName oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.RESOLVE_OBJECT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClassName newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.RESOLVE_OBJECT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.RESOLVE_OBJECT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.RESOLVE_OBJECT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassName getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterType(ClassName newParameterType, NotificationChain msgs) {
		ClassName oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE, oldParameterType, newParameterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(ClassName newParameterType) {
		if (newParameterType != parameterType) {
			NotificationChain msgs = null;
			if (parameterType != null)
				msgs = ((InternalEObject)parameterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE, null, msgs);
			if (newParameterType != null)
				msgs = ((InternalEObject)newParameterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE, null, msgs);
			msgs = basicSetParameterType(newParameterType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE, newParameterType, newParameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolverMethodName() {
		return resolverMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolverMethodName(String newResolverMethodName) {
		String oldResolverMethodName = resolverMethodName;
		resolverMethodName = newResolverMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME, oldResolverMethodName, resolverMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstransformationPackage.RESOLVE_OBJECT__TYPE:
				return basicSetType(null, msgs);
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				return basicSetParameterType(null, msgs);
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
			case AstransformationPackage.RESOLVE_OBJECT__TYPE:
				return getType();
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				return getParameterType();
			case AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME:
				return getResolverMethodName();
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
			case AstransformationPackage.RESOLVE_OBJECT__TYPE:
				setType((ClassName)newValue);
				return;
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				setParameterType((ClassName)newValue);
				return;
			case AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME:
				setResolverMethodName((String)newValue);
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
			case AstransformationPackage.RESOLVE_OBJECT__TYPE:
				setType((ClassName)null);
				return;
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				setParameterType((ClassName)null);
				return;
			case AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME:
				setResolverMethodName(RESOLVER_METHOD_NAME_EDEFAULT);
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
			case AstransformationPackage.RESOLVE_OBJECT__TYPE:
				return type != null;
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				return parameterType != null;
			case AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME:
				return RESOLVER_METHOD_NAME_EDEFAULT == null ? resolverMethodName != null : !RESOLVER_METHOD_NAME_EDEFAULT.equals(resolverMethodName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Typed.class) {
			switch (derivedFeatureID) {
				case AstransformationPackage.RESOLVE_OBJECT__TYPE: return AstransformationPackage.TYPED__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Typed.class) {
			switch (baseFeatureID) {
				case AstransformationPackage.TYPED__TYPE: return AstransformationPackage.RESOLVE_OBJECT__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resolverMethodName: ");
		result.append(resolverMethodName);
		result.append(')');
		return result.toString();
	}

} //ResolveObjectImpl