/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * @generated
 */
public class ResolveObject extends AssignFeature implements Typed {
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
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected TypeName parameterType = null;

	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolveObject() {
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
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ClassName)
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
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
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
	 * Returns the value of the '<em><b>Resolver Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver Method Name</em>' attribute.
	 * @see #setResolverMethodName(String)
	 * @generated
	 */
	public String getResolverMethodName() {
		return resolverMethodName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getResolverMethodName <em>Resolver Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver Method Name</em>' attribute.
	 * @see #getResolverMethodName()
	 * @generated
	 */
	public void setResolverMethodName(String newResolverMethodName) {
		String oldResolverMethodName = resolverMethodName;
		resolverMethodName = newResolverMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME, oldResolverMethodName, resolverMethodName));
	}

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
	 * @generated
	 */
	public TypeName getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterType(TypeName newParameterType, NotificationChain msgs) {
		TypeName oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE, oldParameterType, newParameterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterType <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' containment reference.
	 * @see #getParameterType()
	 * @generated
	 */
	public void setParameterType(TypeName newParameterType) {
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
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.RESOLVE_OBJECT__PARAMETER_NAME, oldParameterName, parameterName));
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
			case AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME:
				return getResolverMethodName();
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				return getParameterType();
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_NAME:
				return getParameterName();
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
			case AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME:
				setResolverMethodName((String)newValue);
				return;
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				setParameterType((TypeName)newValue);
				return;
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_NAME:
				setParameterName((String)newValue);
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
			case AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME:
				setResolverMethodName(RESOLVER_METHOD_NAME_EDEFAULT);
				return;
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				setParameterType((TypeName)null);
				return;
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
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
			case AstransformationPackage.RESOLVE_OBJECT__RESOLVER_METHOD_NAME:
				return RESOLVER_METHOD_NAME_EDEFAULT == null ? resolverMethodName != null : !RESOLVER_METHOD_NAME_EDEFAULT.equals(resolverMethodName);
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_TYPE:
				return parameterType != null;
			case AstransformationPackage.RESOLVE_OBJECT__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
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
		result.append(", parameterName: ");
		result.append(parameterName);
		result.append(')');
		return result.toString();
	}

} // ResolveObject