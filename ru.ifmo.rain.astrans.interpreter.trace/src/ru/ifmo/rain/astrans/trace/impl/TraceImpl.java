/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.ifmo.rain.astrans.trace.AttributeMapping;
import ru.ifmo.rain.astrans.trace.ClassMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMappingType;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.astrans.trace.TraceFactory;
import ru.ifmo.rain.astrans.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.trace.impl.TraceImpl#getInput <em>Input</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.impl.TraceImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.impl.TraceImpl#getClassMappings <em>Class Mappings</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.impl.TraceImpl#getAttributeMappings <em>Attribute Mappings</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.impl.TraceImpl#getReferenceMappings <em>Reference Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends EObjectImpl implements Trace {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EPackage input = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EPackage output = null;

	/**
	 * The cached value of the '{@link #getClassMappings() <em>Class Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassMappings()
	 * @generated
	 * @ordered
	 */
	protected EList classMappings = null;

	/**
	 * The cached value of the '{@link #getAttributeMappings() <em>Attribute Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeMappings()
	 * @generated
	 * @ordered
	 */
	protected EList attributeMappings = null;

	/**
	 * The cached value of the '{@link #getReferenceMappings() <em>Reference Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceMappings()
	 * @generated
	 * @ordered
	 */
	protected EList referenceMappings = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (EPackage)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TRACE__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(EPackage newInput) {
		EPackage oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (EPackage)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TRACE__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(EPackage newOutput) {
		EPackage oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassMappings() {
		if (classMappings == null) {
			classMappings = new EObjectContainmentEList(ClassMapping.class, this, TracePackage.TRACE__CLASS_MAPPINGS);
		}
		return classMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributeMappings() {
		if (attributeMappings == null) {
			attributeMappings = new EObjectContainmentEList(AttributeMapping.class, this, TracePackage.TRACE__ATTRIBUTE_MAPPINGS);
		}
		return attributeMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferenceMappings() {
		if (referenceMappings == null) {
			referenceMappings = new EObjectContainmentEList(ReferenceMapping.class, this, TracePackage.TRACE__REFERENCE_MAPPINGS);
		}
		return referenceMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addClassMapping(EClass proto, EClass image) {
		getClassMappings().add(TraceFactory.eINSTANCE.createClassMapping(proto, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addAttributeMapping(EAttribute proto, EAttribute image) {
		getAttributeMappings().add(TraceFactory.eINSTANCE.createAttributeMapping(proto, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addReferenceMapping(EReference proto, EStructuralFeature image, ReferenceMappingType type) {
		getReferenceMappings().add(TraceFactory.eINSTANCE.createReferenceMapping(proto, image, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.TRACE__CLASS_MAPPINGS:
				return ((InternalEList)getClassMappings()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__ATTRIBUTE_MAPPINGS:
				return ((InternalEList)getAttributeMappings()).basicRemove(otherEnd, msgs);
			case TracePackage.TRACE__REFERENCE_MAPPINGS:
				return ((InternalEList)getReferenceMappings()).basicRemove(otherEnd, msgs);
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
			case TracePackage.TRACE__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case TracePackage.TRACE__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case TracePackage.TRACE__CLASS_MAPPINGS:
				return getClassMappings();
			case TracePackage.TRACE__ATTRIBUTE_MAPPINGS:
				return getAttributeMappings();
			case TracePackage.TRACE__REFERENCE_MAPPINGS:
				return getReferenceMappings();
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
			case TracePackage.TRACE__INPUT:
				setInput((EPackage)newValue);
				return;
			case TracePackage.TRACE__OUTPUT:
				setOutput((EPackage)newValue);
				return;
			case TracePackage.TRACE__CLASS_MAPPINGS:
				getClassMappings().clear();
				getClassMappings().addAll((Collection)newValue);
				return;
			case TracePackage.TRACE__ATTRIBUTE_MAPPINGS:
				getAttributeMappings().clear();
				getAttributeMappings().addAll((Collection)newValue);
				return;
			case TracePackage.TRACE__REFERENCE_MAPPINGS:
				getReferenceMappings().clear();
				getReferenceMappings().addAll((Collection)newValue);
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
			case TracePackage.TRACE__INPUT:
				setInput((EPackage)null);
				return;
			case TracePackage.TRACE__OUTPUT:
				setOutput((EPackage)null);
				return;
			case TracePackage.TRACE__CLASS_MAPPINGS:
				getClassMappings().clear();
				return;
			case TracePackage.TRACE__ATTRIBUTE_MAPPINGS:
				getAttributeMappings().clear();
				return;
			case TracePackage.TRACE__REFERENCE_MAPPINGS:
				getReferenceMappings().clear();
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
			case TracePackage.TRACE__INPUT:
				return input != null;
			case TracePackage.TRACE__OUTPUT:
				return output != null;
			case TracePackage.TRACE__CLASS_MAPPINGS:
				return classMappings != null && !classMappings.isEmpty();
			case TracePackage.TRACE__ATTRIBUTE_MAPPINGS:
				return attributeMappings != null && !attributeMappings.isEmpty();
			case TracePackage.TRACE__REFERENCE_MAPPINGS:
				return referenceMappings != null && !referenceMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl