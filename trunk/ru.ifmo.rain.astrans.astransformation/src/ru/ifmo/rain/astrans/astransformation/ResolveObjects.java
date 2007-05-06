/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve Objects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.astransformation.ResolveObjects#getResolveObjectStatements <em>Resolve Object Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResolveObjects extends EObjectImpl implements AssignReferenceStatement {
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
	protected ResolveObjects() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AstransformationPackage.Literals.RESOLVE_OBJECTS;
	}

	/**
	 * Returns the value of the '<em><b>Resolve Object Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.astransformation.ResolveObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Object Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Object Statements</em>' containment reference list.
	 * @generated
	 */
	public List getResolveObjectStatements() {
		if (resolveObjectStatements == null) {
			resolveObjectStatements = new EObjectContainmentEList(ResolveObject.class, this, AstransformationPackage.RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS);
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
			case AstransformationPackage.RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS:
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
			case AstransformationPackage.RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS:
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
			case AstransformationPackage.RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS:
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
			case AstransformationPackage.RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS:
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
			case AstransformationPackage.RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS:
				return resolveObjectStatements != null && !resolveObjectStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ResolveObjects