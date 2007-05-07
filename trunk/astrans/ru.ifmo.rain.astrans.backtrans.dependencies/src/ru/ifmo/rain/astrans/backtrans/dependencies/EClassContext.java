/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.backtrans.dependencies;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#getEClass <em>EClass</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#isProvidingScopeInformation <em>Providing Scope Information</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassContext extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass = null;

	/**
	 * The default value of the '{@link #isProvidingScopeInformation() <em>Providing Scope Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidingScopeInformation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDING_SCOPE_INFORMATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidingScopeInformation() <em>Providing Scope Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidingScopeInformation()
	 * @generated
	 * @ordered
	 */
	protected boolean providingScopeInformation = PROVIDING_SCOPE_INFORMATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList dependencies = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassContext() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.ECLASS_CONTEXT;
	}

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependenciesPackage.ECLASS_CONTEXT__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.ECLASS_CONTEXT__ECLASS, oldEClass, eClass));
	}

	/**
	 * Returns the value of the '<em><b>Providing Scope Information</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providing Scope Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Scope Information</em>' attribute.
	 * @see #setProvidingScopeInformation(boolean)
	 * @generated
	 */
	public boolean isProvidingScopeInformation() {
		return providingScopeInformation;
	}

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#isProvidingScopeInformation <em>Providing Scope Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Scope Information</em>' attribute.
	 * @see #isProvidingScopeInformation()
	 * @generated
	 */
	public void setProvidingScopeInformation(boolean newProvidingScopeInformation) {
		boolean oldProvidingScopeInformation = providingScopeInformation;
		providingScopeInformation = newProvidingScopeInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.ECLASS_CONTEXT__PROVIDING_SCOPE_INFORMATION, oldProvidingScopeInformation, providingScopeInformation));
	}

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @generated
	 */
	public List getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList(FeatureDependency.class, this, DependenciesPackage.ECLASS_CONTEXT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.ECLASS_CONTEXT__DEPENDENCIES:
				return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
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
			case DependenciesPackage.ECLASS_CONTEXT__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case DependenciesPackage.ECLASS_CONTEXT__PROVIDING_SCOPE_INFORMATION:
				return isProvidingScopeInformation() ? Boolean.TRUE : Boolean.FALSE;
			case DependenciesPackage.ECLASS_CONTEXT__DEPENDENCIES:
				return getDependencies();
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
			case DependenciesPackage.ECLASS_CONTEXT__ECLASS:
				setEClass((EClass)newValue);
				return;
			case DependenciesPackage.ECLASS_CONTEXT__PROVIDING_SCOPE_INFORMATION:
				setProvidingScopeInformation(((Boolean)newValue).booleanValue());
				return;
			case DependenciesPackage.ECLASS_CONTEXT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
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
			case DependenciesPackage.ECLASS_CONTEXT__ECLASS:
				setEClass((EClass)null);
				return;
			case DependenciesPackage.ECLASS_CONTEXT__PROVIDING_SCOPE_INFORMATION:
				setProvidingScopeInformation(PROVIDING_SCOPE_INFORMATION_EDEFAULT);
				return;
			case DependenciesPackage.ECLASS_CONTEXT__DEPENDENCIES:
				getDependencies().clear();
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
			case DependenciesPackage.ECLASS_CONTEXT__ECLASS:
				return eClass != null;
			case DependenciesPackage.ECLASS_CONTEXT__PROVIDING_SCOPE_INFORMATION:
				return providingScopeInformation != PROVIDING_SCOPE_INFORMATION_EDEFAULT;
			case DependenciesPackage.ECLASS_CONTEXT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
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
		result.append(" (providingScopeInformation: ");
		result.append(providingScopeInformation);
		result.append(')');
		return result.toString();
	}

} // EClassContext