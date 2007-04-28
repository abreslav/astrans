/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransast.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.ifmo.rain.astrans.astransast.AstransastPackage;
import ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS;
import ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS;
import ru.ifmo.rain.astrans.astransast.MappedEClassAS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Inheritance AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.impl.ChangeInheritanceASImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.astransast.impl.ChangeInheritanceASImpl#getSuperclasses <em>Superclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeInheritanceASImpl extends ActionASImpl implements ChangeInheritanceAS {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected MappedEClassAS subject = null;

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
	protected ChangeInheritanceASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransastPackage.Literals.CHANGE_INHERITANCE_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedEClassAS getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(MappedEClassAS newSubject, NotificationChain msgs) {
		MappedEClassAS oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(MappedEClassAS newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuperclasses() {
		if (superclasses == null) {
			superclasses = new EObjectContainmentEList(EClassifierReferenceAS.class, this, AstransastPackage.CHANGE_INHERITANCE_AS__SUPERCLASSES);
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
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT:
				return basicSetSubject(null, msgs);
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUPERCLASSES:
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
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT:
				return getSubject();
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUPERCLASSES:
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
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT:
				setSubject((MappedEClassAS)newValue);
				return;
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUPERCLASSES:
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
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT:
				setSubject((MappedEClassAS)null);
				return;
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUPERCLASSES:
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
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUBJECT:
				return subject != null;
			case AstransastPackage.CHANGE_INHERITANCE_AS__SUPERCLASSES:
				return superclasses != null && !superclasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangeInheritanceASImpl