/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.ifmo.rain.astrans.trace.Trace#getClassMappings <em>Class Mappings</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.Trace#getAttributeMappings <em>Attribute Mappings</em>}</li>
 *   <li>{@link ru.ifmo.rain.astrans.trace.Trace#getReferenceMappings <em>Reference Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.ifmo.rain.astrans.trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.trace.ClassMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Mappings</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.trace.TracePackage#getTrace_ClassMappings()
	 * @model type="ru.ifmo.rain.astrans.trace.ClassMapping" containment="true"
	 * @generated
	 */
	EList getClassMappings();

	/**
	 * Returns the value of the '<em><b>Attribute Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.trace.AttributeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Mappings</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.trace.TracePackage#getTrace_AttributeMappings()
	 * @model type="ru.ifmo.rain.astrans.trace.AttributeMapping" containment="true"
	 * @generated
	 */
	EList getAttributeMappings();

	/**
	 * Returns the value of the '<em><b>Reference Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link ru.ifmo.rain.astrans.trace.ReferenceMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mappings</em>' containment reference list.
	 * @see ru.ifmo.rain.astrans.trace.TracePackage#getTrace_ReferenceMappings()
	 * @model type="ru.ifmo.rain.astrans.trace.ReferenceMapping" containment="true"
	 * @generated
	 */
	EList getReferenceMappings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addClassMapping(EClass proto, EClass image);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAttributeMapping(EAttribute proto, EAttribute image);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addReferenceMapping(EReference proto, EStructuralFeature image, ReferenceMappingType type);

} // Trace