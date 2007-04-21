/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.MappedEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.impl.ChangeInheritanceImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.impl.ChangeInheritanceImpl#getSuperclasses <em>Superclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeInheritanceImpl extends ActionImpl implements ChangeInheritance {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected MappedEClass subject = null;

	/**
	 * The cached value of the '{@link #getSuperclasses() <em>Superclasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclasses()
	 * @generated
	 * @ordered
	 */
	protected EList superclasses = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeInheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransPackage.Literals.CHANGE_INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedEClass getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(MappedEClass newSubject, NotificationChain msgs) {
		MappedEClass oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransPackage.CHANGE_INHERITANCE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(MappedEClass newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransPackage.CHANGE_INHERITANCE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransPackage.CHANGE_INHERITANCE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransPackage.CHANGE_INHERITANCE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuperclasses() {
		if (superclasses == null) {
			superclasses = new EObjectContainmentEList(EClassReference.class, this, AstransPackage.CHANGE_INHERITANCE__SUPERCLASSES);
		}
		return superclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstransPackage.CHANGE_INHERITANCE__SUBJECT:
				return basicSetSubject(null, msgs);
			case AstransPackage.CHANGE_INHERITANCE__SUPERCLASSES:
				return ((InternalEList)getSuperclasses()).basicRemove(otherEnd, msgs);
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
			case AstransPackage.CHANGE_INHERITANCE__SUBJECT:
				return getSubject();
			case AstransPackage.CHANGE_INHERITANCE__SUPERCLASSES:
				return getSuperclasses();
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
			case AstransPackage.CHANGE_INHERITANCE__SUBJECT:
				setSubject((MappedEClass)newValue);
				return;
			case AstransPackage.CHANGE_INHERITANCE__SUPERCLASSES:
				getSuperclasses().clear();
				getSuperclasses().addAll((Collection)newValue);
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
			case AstransPackage.CHANGE_INHERITANCE__SUBJECT:
				setSubject((MappedEClass)null);
				return;
			case AstransPackage.CHANGE_INHERITANCE__SUPERCLASSES:
				getSuperclasses().clear();
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
			case AstransPackage.CHANGE_INHERITANCE__SUBJECT:
				return subject != null;
			case AstransPackage.CHANGE_INHERITANCE__SUPERCLASSES:
				return superclasses != null && !superclasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangeInheritanceImpl