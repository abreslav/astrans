/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;


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
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignReference()
 * @model
 * @generated
 */
public interface AssignReference extends AssignFeature, Typed {
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
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignReference_MappingNeeded()
	 * @model default="true"
	 * @generated
	 */
	boolean isMappingNeeded();

	/**
	 * Sets the value of the '{@link ru.ifmo.rain.astrans.astransformation.AssignReference#isMappingNeeded <em>Mapping Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Needed</em>' attribute.
	 * @see #isMappingNeeded()
	 * @generated
	 */
	void setMappingNeeded(boolean value);

} // AssignReference