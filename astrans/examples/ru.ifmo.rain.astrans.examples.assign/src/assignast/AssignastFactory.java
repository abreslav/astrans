/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see assignast.AssignastPackage
 * @generated
 */
public interface AssignastFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignastFactory eINSTANCE = assignast.impl.AssignastFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assign Model AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Model AS</em>'.
	 * @generated
	 */
	AssignModelAS createAssignModelAS();

	/**
	 * Returns a new object of class '<em>Variable Assignment AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Assignment AS</em>'.
	 * @generated
	 */
	VariableAssignmentAS createVariableAssignmentAS();

	/**
	 * Returns a new object of class '<em>Many Feature Append AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many Feature Append AS</em>'.
	 * @generated
	 */
	ManyFeatureAppendAS createManyFeatureAppendAS();

	/**
	 * Returns a new object of class '<em>Single Feature Assignment AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Feature Assignment AS</em>'.
	 * @generated
	 */
	SingleFeatureAssignmentAS createSingleFeatureAssignmentAS();

	/**
	 * Returns a new object of class '<em>Variable AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable AS</em>'.
	 * @generated
	 */
	VariableAS createVariableAS();

	/**
	 * Returns a new object of class '<em>Feature Access AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Access AS</em>'.
	 * @generated
	 */
	FeatureAccessAS createFeatureAccessAS();

	/**
	 * Returns a new object of class '<em>EObject Reference AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Reference AS</em>'.
	 * @generated
	 */
	EObjectReferenceAS createEObjectReferenceAS();

	/**
	 * Returns a new object of class '<em>Create Instance AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Instance AS</em>'.
	 * @generated
	 */
	CreateInstanceAS createCreateInstanceAS();

	/**
	 * Returns a new object of class '<em>Static EClass Reference AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static EClass Reference AS</em>'.
	 * @generated
	 */
	StaticEClassReferenceAS createStaticEClassReferenceAS();

	/**
	 * Returns a new object of class '<em>Dynamic EClass Reference AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic EClass Reference AS</em>'.
	 * @generated
	 */
	DynamicEClassReferenceAS createDynamicEClassReferenceAS();

	/**
	 * Returns a new object of class '<em>Copy Object AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Object AS</em>'.
	 * @generated
	 */
	CopyObjectAS createCopyObjectAS();

	/**
	 * Returns a new object of class '<em>String Literal AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal AS</em>'.
	 * @generated
	 */
	StringLiteralAS createStringLiteralAS();

	/**
	 * Returns a new object of class '<em>Boolean Literal AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal AS</em>'.
	 * @generated
	 */
	BooleanLiteralAS createBooleanLiteralAS();

	/**
	 * Returns a new object of class '<em>Enum Literal AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal AS</em>'.
	 * @generated
	 */
	EnumLiteralAS createEnumLiteralAS();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>EClass Designator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass Designator</em>'.
	 * @generated
	 */
	EClassDesignator createEClassDesignator();

	/**
	 * Returns a new object of class '<em>Ecore Object Designator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Object Designator</em>'.
	 * @generated
	 */
	EcoreObjectDesignator createEcoreObjectDesignator();

	/**
	 * Returns a new object of class '<em>EEnum Literal Designator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum Literal Designator</em>'.
	 * @generated
	 */
	EEnumLiteralDesignator createEEnumLiteralDesignator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssignastPackage getAssignastPackage();

} //AssignastFactory
