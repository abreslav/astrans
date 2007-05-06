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
 * A representation of the model object '<em><b>Assign Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.AssignReference#isMappingNeeded <em>Mapping Needed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignReference extends AssignFeature implements Typed, AssignReferenceStatement {
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
	 * The default value of the '{@link #isMappingNeeded() <em>Mapping Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMappingNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAPPING_NEEDED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMappingNeeded() <em>Mapping Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMappingNeeded()
	 * @generated
	 * @ordered
	 */
	protected boolean mappingNeeded = MAPPING_NEEDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignReference() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.ASSIGN_REFERENCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransformationPackage.ASSIGN_REFERENCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.AssignReference#getType <em>Type</em>}' containment reference.
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.ASSIGN_REFERENCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransformationPackage.ASSIGN_REFERENCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.ASSIGN_REFERENCE__TYPE, newType, newType));
	}

	/**
	 * Returns the value of the '<em><b>Mapping Needed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Needed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Needed</em>' attribute.
	 * @see #setMappingNeeded(boolean)
	 * @generated
	 */
	public boolean isMappingNeeded() {
		return mappingNeeded;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.AssignReference#isMappingNeeded <em>Mapping Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Needed</em>' attribute.
	 * @see #isMappingNeeded()
	 * @generated
	 */
	public void setMappingNeeded(boolean newMappingNeeded) {
		boolean oldMappingNeeded = mappingNeeded;
		mappingNeeded = newMappingNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransformationPackage.ASSIGN_REFERENCE__MAPPING_NEEDED, oldMappingNeeded, mappingNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstransformationPackage.ASSIGN_REFERENCE__TYPE:
				return basicSetType(null, msgs);
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
			case AstransformationPackage.ASSIGN_REFERENCE__TYPE:
				return getType();
			case AstransformationPackage.ASSIGN_REFERENCE__MAPPING_NEEDED:
				return isMappingNeeded() ? Boolean.TRUE : Boolean.FALSE;
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
			case AstransformationPackage.ASSIGN_REFERENCE__TYPE:
				setType((ClassName)newValue);
				return;
			case AstransformationPackage.ASSIGN_REFERENCE__MAPPING_NEEDED:
				setMappingNeeded(((Boolean)newValue).booleanValue());
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
			case AstransformationPackage.ASSIGN_REFERENCE__TYPE:
				setType((ClassName)null);
				return;
			case AstransformationPackage.ASSIGN_REFERENCE__MAPPING_NEEDED:
				setMappingNeeded(MAPPING_NEEDED_EDEFAULT);
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
			case AstransformationPackage.ASSIGN_REFERENCE__TYPE:
				return type != null;
			case AstransformationPackage.ASSIGN_REFERENCE__MAPPING_NEEDED:
				return mappingNeeded != MAPPING_NEEDED_EDEFAULT;
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
				case AstransformationPackage.ASSIGN_REFERENCE__TYPE: return AstransformationPackage.TYPED__TYPE;
				default: return -1;
			}
		}
		if (baseClass == AssignReferenceStatement.class) {
			switch (derivedFeatureID) {
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
				case AstransformationPackage.TYPED__TYPE: return AstransformationPackage.ASSIGN_REFERENCE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == AssignReferenceStatement.class) {
			switch (baseFeatureID) {
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
		result.append(" (mappingNeeded: ");
		result.append(mappingNeeded);
		result.append(')');
		return result.toString();
	}

} // AssignReference