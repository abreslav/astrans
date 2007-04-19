/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.trace.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ru.ifmo.rain.astrans.trace.ClassMapping;
import ru.ifmo.rain.astrans.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.trace.impl.ClassMappingImpl#getProto <em>Proto</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.impl.ClassMappingImpl#getImage <em>Image</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.impl.ClassMappingImpl#isResolvedAbstractClass <em>Resolved Abstract Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassMappingImpl extends EObjectImpl implements ClassMapping {
	/**
	 * The cached value of the '{@link #getProto() <em>Proto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProto()
	 * @generated
	 * @ordered
	 */
	protected EClass proto = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EClass image = null;

	/**
	 * The default value of the '{@link #isResolvedAbstractClass() <em>Resolved Abstract Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolvedAbstractClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_ABSTRACT_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolvedAbstractClass() <em>Resolved Abstract Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolvedAbstractClass()
	 * @generated
	 * @ordered
	 */
	protected boolean resolvedAbstractClass = RESOLVED_ABSTRACT_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TracePackage.Literals.CLASS_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProto() {
		if (proto != null && proto.eIsProxy()) {
			InternalEObject oldProto = (InternalEObject)proto;
			proto = (EClass)eResolveProxy(oldProto);
			if (proto != oldProto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.CLASS_MAPPING__PROTO, oldProto, proto));
			}
		}
		return proto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetProto() {
		return proto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProto(EClass newProto) {
		EClass oldProto = proto;
		proto = newProto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.CLASS_MAPPING__PROTO, oldProto, proto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		if (image != null && image.eIsProxy()) {
			InternalEObject oldImage = (InternalEObject)image;
			image = (EClass)eResolveProxy(oldImage);
			if (image != oldImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.CLASS_MAPPING__IMAGE, oldImage, image));
			}
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(EClass newImage) {
		EClass oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.CLASS_MAPPING__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolvedAbstractClass() {
		return resolvedAbstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedAbstractClass(boolean newResolvedAbstractClass) {
		boolean oldResolvedAbstractClass = resolvedAbstractClass;
		resolvedAbstractClass = newResolvedAbstractClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.CLASS_MAPPING__RESOLVED_ABSTRACT_CLASS, oldResolvedAbstractClass, resolvedAbstractClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.CLASS_MAPPING__PROTO:
				if (resolve) return getProto();
				return basicGetProto();
			case TracePackage.CLASS_MAPPING__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
			case TracePackage.CLASS_MAPPING__RESOLVED_ABSTRACT_CLASS:
				return isResolvedAbstractClass() ? Boolean.TRUE : Boolean.FALSE;
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
			case TracePackage.CLASS_MAPPING__PROTO:
				setProto((EClass)newValue);
				return;
			case TracePackage.CLASS_MAPPING__IMAGE:
				setImage((EClass)newValue);
				return;
			case TracePackage.CLASS_MAPPING__RESOLVED_ABSTRACT_CLASS:
				setResolvedAbstractClass(((Boolean)newValue).booleanValue());
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
			case TracePackage.CLASS_MAPPING__PROTO:
				setProto((EClass)null);
				return;
			case TracePackage.CLASS_MAPPING__IMAGE:
				setImage((EClass)null);
				return;
			case TracePackage.CLASS_MAPPING__RESOLVED_ABSTRACT_CLASS:
				setResolvedAbstractClass(RESOLVED_ABSTRACT_CLASS_EDEFAULT);
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
			case TracePackage.CLASS_MAPPING__PROTO:
				return proto != null;
			case TracePackage.CLASS_MAPPING__IMAGE:
				return image != null;
			case TracePackage.CLASS_MAPPING__RESOLVED_ABSTRACT_CLASS:
				return resolvedAbstractClass != RESOLVED_ABSTRACT_CLASS_EDEFAULT;
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
		result.append(" (resolvedAbstractClass: ");
		result.append(resolvedAbstractClass);
		result.append(')');
		return result.toString();
	}

} //ClassMappingImpl