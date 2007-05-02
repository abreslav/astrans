/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see assign.AssignPackage
 * @generated
 */
public interface AssignFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignFactory eINSTANCE = assign.impl.AssignFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	AssignModel createAssignModel();

	/**
	 * Returns a new object of class '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Assignment</em>'.
	 * @generated
	 */
	VariableAssignment createVariableAssignment();

	/**
	 * Returns a new object of class '<em>Many Feature Append</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many Feature Append</em>'.
	 * @generated
	 */
	ManyFeatureAppend createManyFeatureAppend();

	/**
	 * Returns a new object of class '<em>Single Feature Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Feature Assignment</em>'.
	 * @generated
	 */
	SingleFeatureAssignment createSingleFeatureAssignment();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Feature Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Access</em>'.
	 * @generated
	 */
	FeatureAccess createFeatureAccess();

	/**
	 * Returns a new object of class '<em>EObject Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Reference</em>'.
	 * @generated
	 */
	EObjectReference createEObjectReference();

	/**
	 * Returns a new object of class '<em>Create Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Instance</em>'.
	 * @generated
	 */
	CreateInstance createCreateInstance();

	/**
	 * Returns a new object of class '<em>Static EClass Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static EClass Reference</em>'.
	 * @generated
	 */
	StaticEClassReference createStaticEClassReference();

	/**
	 * Returns a new object of class '<em>Dynamic EClass Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic EClass Reference</em>'.
	 * @generated
	 */
	DynamicEClassReference createDynamicEClassReference();

	/**
	 * Returns a new object of class '<em>Copy Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Object</em>'.
	 * @generated
	 */
	CopyObject createCopyObject();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal</em>'.
	 * @generated
	 */
	EnumLiteral createEnumLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssignPackage getAssignPackage();

} //AssignFactory
