/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ru.ifmo.rain.astrans.astransformation.AssignFeature;
import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.AssignFeatureImpl#getSetterName <em>Setter Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.AssignFeatureImpl#getGetterName <em>Getter Name</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.impl.AssignFeatureImpl#isMany <em>Many</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignFeatureImpl extends EObjectImpl implements AssignFeature {
	/**
	 * The default value of the '{@link #getSetterName() <em>Setter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterName()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetterName() <em>Setter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterName()
	 * @generated
	 * @ordered
	 */
	protected String setterName = SETTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGetterName() <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterName()
	 * @generated
	 * @ordered
	 */
	protected static final String GETTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetterName() <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterName()
	 * @generated
	 * @ordered
	 */
	protected String getterName = GETTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected boolean many = MANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.ASSIGN_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetterName() {
		return setterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetterName(String newSetterName) {
		String oldSetterName = setterName;
		setterName = newSetterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.ASSIGN_FEATURE__SETTER_NAME, oldSetterName, setterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGetterName() {
		return getterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterName(String newGetterName) {
		String oldGetterName = getterName;
		getterName = newGetterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.ASSIGN_FEATURE__GETTER_NAME, oldGetterName, getterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany() {
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(boolean newMany) {
		boolean oldMany = many;
		many = newMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.ASSIGN_FEATURE__MANY, oldMany, many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstransformationPackage.ASSIGN_FEATURE__SETTER_NAME:
				return getSetterName();
			case AstransformationPackage.ASSIGN_FEATURE__GETTER_NAME:
				return getGetterName();
			case AstransformationPackage.ASSIGN_FEATURE__MANY:
				return isMany() ? Boolean.TRUE : Boolean.FALSE;
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
			case AstransformationPackage.ASSIGN_FEATURE__SETTER_NAME:
				setSetterName((String)newValue);
				return;
			case AstransformationPackage.ASSIGN_FEATURE__GETTER_NAME:
				setGetterName((String)newValue);
				return;
			case AstransformationPackage.ASSIGN_FEATURE__MANY:
				setMany(((Boolean)newValue).booleanValue());
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
			case AstransformationPackage.ASSIGN_FEATURE__SETTER_NAME:
				setSetterName(SETTER_NAME_EDEFAULT);
				return;
			case AstransformationPackage.ASSIGN_FEATURE__GETTER_NAME:
				setGetterName(GETTER_NAME_EDEFAULT);
				return;
			case AstransformationPackage.ASSIGN_FEATURE__MANY:
				setMany(MANY_EDEFAULT);
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
			case AstransformationPackage.ASSIGN_FEATURE__SETTER_NAME:
				return SETTER_NAME_EDEFAULT == null ? setterName != null : !SETTER_NAME_EDEFAULT.equals(setterName);
			case AstransformationPackage.ASSIGN_FEATURE__GETTER_NAME:
				return GETTER_NAME_EDEFAULT == null ? getterName != null : !GETTER_NAME_EDEFAULT.equals(getterName);
			case AstransformationPackage.ASSIGN_FEATURE__MANY:
				return many != MANY_EDEFAULT;
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
		result.append(" (setterName: ");
		result.append(setterName);
		result.append(", getterName: ");
		result.append(getterName);
		result.append(", many: ");
		result.append(many);
		result.append(')');
		return result.toString();
	}

} //AssignFeatureImpl