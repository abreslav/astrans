/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage
 * @generated
 */
public interface AstransformationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstransformationFactory eINSTANCE = ru.ifmo.rain.astrans.astransformation.impl.AstransformationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Name</em>'.
	 * @generated
	 */
	ClassName createClassName();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Concrete Class Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Class Mapping Rule</em>'.
	 * @generated
	 */
	ConcreteClassMappingRule createConcreteClassMappingRule();

	/**
	 * Returns a new object of class '<em>Abstract Class Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Class Mapping Rule</em>'.
	 * @generated
	 */
	AbstractClassMappingRule createAbstractClassMappingRule();

	/**
	 * Returns a new object of class '<em>Assign Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Feature</em>'.
	 * @generated
	 */
	AssignFeature createAssignFeature();

	/**
	 * Returns a new object of class '<em>Assign Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Attribute</em>'.
	 * @generated
	 */
	AssignAttribute createAssignAttribute();

	/**
	 * Returns a new object of class '<em>Assign Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Reference</em>'.
	 * @generated
	 */
	AssignReference createAssignReference();

	/**
	 * Returns a new object of class '<em>Write Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Trace</em>'.
	 * @generated
	 */
	WriteTrace createWriteTrace();

	/**
	 * Returns a new object of class '<em>Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolve Object</em>'.
	 * @generated
	 */
	ResolveObject createResolveObject();

	/**
	 * Returns a new object of class '<em>Basic Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Type Name</em>'.
	 * @generated
	 */
	BasicTypeName createBasicTypeName();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AstransformationPackage getAstransformationPackage();

} //AstransformationFactory
