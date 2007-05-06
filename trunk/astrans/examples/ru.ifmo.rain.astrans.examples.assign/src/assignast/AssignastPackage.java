/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assignast.AssignastFactory
 * @model kind="package"
 * @generated
 */
public interface AssignastPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rain.ifmo.ru/~breslav/astrans/examples/2002/assign/ast";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assignast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignastPackage eINSTANCE = assignast.impl.AssignastPackageImpl.init();

	/**
	 * The meta object id for the '{@link assignast.impl.AssignModelASImpl <em>Assign Model AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.AssignModelASImpl
	 * @see assignast.impl.AssignastPackageImpl#getAssignModelAS()
	 * @generated
	 */
	int ASSIGN_MODEL_AS = 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_MODEL_AS__ASSIGNMENTS = 0;

	/**
	 * The number of structural features of the '<em>Assign Model AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_MODEL_AS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link assignast.impl.AssignmentASImpl <em>Assignment AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.AssignmentASImpl
	 * @see assignast.impl.AssignastPackageImpl#getAssignmentAS()
	 * @generated
	 */
	int ASSIGNMENT_AS = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AS__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Assignment AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link assignast.impl.VariableAssignmentASImpl <em>Variable Assignment AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.VariableAssignmentASImpl
	 * @see assignast.impl.AssignastPackageImpl#getVariableAssignmentAS()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT_AS = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_AS__EXPRESSION = ASSIGNMENT_AS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_AS__VARIABLE_NAME = ASSIGNMENT_AS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_AS__RETURNED = ASSIGNMENT_AS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_AS_FEATURE_COUNT = ASSIGNMENT_AS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link assignast.impl.AbstractFeatureAssignmentASImpl <em>Abstract Feature Assignment AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.AbstractFeatureAssignmentASImpl
	 * @see assignast.impl.AssignastPackageImpl#getAbstractFeatureAssignmentAS()
	 * @generated
	 */
	int ABSTRACT_FEATURE_ASSIGNMENT_AS = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_ASSIGNMENT_AS__EXPRESSION = ASSIGNMENT_AS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT = ASSIGNMENT_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Feature Assignment AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_ASSIGNMENT_AS_FEATURE_COUNT = ASSIGNMENT_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.ManyFeatureAppendASImpl <em>Many Feature Append AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.ManyFeatureAppendASImpl
	 * @see assignast.impl.AssignastPackageImpl#getManyFeatureAppendAS()
	 * @generated
	 */
	int MANY_FEATURE_APPEND_AS = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_FEATURE_APPEND_AS__EXPRESSION = ABSTRACT_FEATURE_ASSIGNMENT_AS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_FEATURE_APPEND_AS__OBJECT = ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT;

	/**
	 * The number of structural features of the '<em>Many Feature Append AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_FEATURE_APPEND_AS_FEATURE_COUNT = ABSTRACT_FEATURE_ASSIGNMENT_AS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignast.impl.SingleFeatureAssignmentASImpl <em>Single Feature Assignment AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.SingleFeatureAssignmentASImpl
	 * @see assignast.impl.AssignastPackageImpl#getSingleFeatureAssignmentAS()
	 * @generated
	 */
	int SINGLE_FEATURE_ASSIGNMENT_AS = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_ASSIGNMENT_AS__EXPRESSION = ABSTRACT_FEATURE_ASSIGNMENT_AS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_ASSIGNMENT_AS__OBJECT = ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT;

	/**
	 * The number of structural features of the '<em>Single Feature Assignment AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_ASSIGNMENT_AS_FEATURE_COUNT = ABSTRACT_FEATURE_ASSIGNMENT_AS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignast.impl.ExpressionASImpl <em>Expression AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.ExpressionASImpl
	 * @see assignast.impl.AssignastPackageImpl#getExpressionAS()
	 * @generated
	 */
	int EXPRESSION_AS = 6;

	/**
	 * The number of structural features of the '<em>Expression AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignast.impl.VariableASImpl <em>Variable AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.VariableASImpl
	 * @see assignast.impl.AssignastPackageImpl#getVariableAS()
	 * @generated
	 */
	int VARIABLE_AS = 7;

	/**
	 * The feature id for the '<em><b>Variable Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_AS__VARIABLE_ASSIGNMENT = EXPRESSION_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_AS_FEATURE_COUNT = EXPRESSION_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.FeatureAccessASImpl <em>Feature Access AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.FeatureAccessASImpl
	 * @see assignast.impl.AssignastPackageImpl#getFeatureAccessAS()
	 * @generated
	 */
	int FEATURE_ACCESS_AS = 8;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_AS__OBJECT = EXPRESSION_AS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_AS__FEATURE = EXPRESSION_AS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Access AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_AS_FEATURE_COUNT = EXPRESSION_AS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link assignast.impl.EObjectReferenceASImpl <em>EObject Reference AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.EObjectReferenceASImpl
	 * @see assignast.impl.AssignastPackageImpl#getEObjectReferenceAS()
	 * @generated
	 */
	int EOBJECT_REFERENCE_AS = 9;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE_AS__OBJECT = EXPRESSION_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Reference AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE_AS_FEATURE_COUNT = EXPRESSION_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.CreateInstanceASImpl <em>Create Instance AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.CreateInstanceASImpl
	 * @see assignast.impl.AssignastPackageImpl#getCreateInstanceAS()
	 * @generated
	 */
	int CREATE_INSTANCE_AS = 10;

	/**
	 * The feature id for the '<em><b>EClass Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_AS__ECLASS_REFERENCE = EXPRESSION_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Instance AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_AS_FEATURE_COUNT = EXPRESSION_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.EClassReferenceASImpl <em>EClass Reference AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.EClassReferenceASImpl
	 * @see assignast.impl.AssignastPackageImpl#getEClassReferenceAS()
	 * @generated
	 */
	int ECLASS_REFERENCE_AS = 11;

	/**
	 * The number of structural features of the '<em>EClass Reference AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_REFERENCE_AS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignast.impl.StaticEClassReferenceASImpl <em>Static EClass Reference AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.StaticEClassReferenceASImpl
	 * @see assignast.impl.AssignastPackageImpl#getStaticEClassReferenceAS()
	 * @generated
	 */
	int STATIC_ECLASS_REFERENCE_AS = 12;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ECLASS_REFERENCE_AS__ECLASS = ECLASS_REFERENCE_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static EClass Reference AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ECLASS_REFERENCE_AS_FEATURE_COUNT = ECLASS_REFERENCE_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.DynamicEClassReferenceASImpl <em>Dynamic EClass Reference AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.DynamicEClassReferenceASImpl
	 * @see assignast.impl.AssignastPackageImpl#getDynamicEClassReferenceAS()
	 * @generated
	 */
	int DYNAMIC_ECLASS_REFERENCE_AS = 13;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ECLASS_REFERENCE_AS__ECLASS = ECLASS_REFERENCE_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic EClass Reference AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ECLASS_REFERENCE_AS_FEATURE_COUNT = ECLASS_REFERENCE_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.CopyObjectASImpl <em>Copy Object AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.CopyObjectASImpl
	 * @see assignast.impl.AssignastPackageImpl#getCopyObjectAS()
	 * @generated
	 */
	int COPY_OBJECT_AS = 14;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OBJECT_AS__OBJECT = EXPRESSION_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Copy Object AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OBJECT_AS_FEATURE_COUNT = EXPRESSION_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.StringLiteralASImpl <em>String Literal AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.StringLiteralASImpl
	 * @see assignast.impl.AssignastPackageImpl#getStringLiteralAS()
	 * @generated
	 */
	int STRING_LITERAL_AS = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_AS__VALUE = EXPRESSION_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_AS_FEATURE_COUNT = EXPRESSION_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.BooleanLiteralASImpl <em>Boolean Literal AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.BooleanLiteralASImpl
	 * @see assignast.impl.AssignastPackageImpl#getBooleanLiteralAS()
	 * @generated
	 */
	int BOOLEAN_LITERAL_AS = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_AS__VALUE = EXPRESSION_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_AS_FEATURE_COUNT = EXPRESSION_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.EnumLiteralASImpl <em>Enum Literal AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.EnumLiteralASImpl
	 * @see assignast.impl.AssignastPackageImpl#getEnumLiteralAS()
	 * @generated
	 */
	int ENUM_LITERAL_AS = 17;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_AS__LITERAL = EXPRESSION_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_AS_FEATURE_COUNT = EXPRESSION_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignast.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.UnitImpl
	 * @see assignast.impl.AssignastPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 18;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MODEL = 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link assignast.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.ImportImpl
	 * @see assignast.impl.AssignastPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 19;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__PACKAGE_URI = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link assignast.impl.EClassDesignatorImpl <em>EClass Designator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.EClassDesignatorImpl
	 * @see assignast.impl.AssignastPackageImpl#getEClassDesignator()
	 * @generated
	 */
	int ECLASS_DESIGNATOR = 20;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_DESIGNATOR__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_DESIGNATOR__CLASS = 1;

	/**
	 * The number of structural features of the '<em>EClass Designator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_DESIGNATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link assignast.impl.EcoreObjectDesignatorImpl <em>Ecore Object Designator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.EcoreObjectDesignatorImpl
	 * @see assignast.impl.AssignastPackageImpl#getEcoreObjectDesignator()
	 * @generated
	 */
	int ECORE_OBJECT_DESIGNATOR = 21;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OBJECT_DESIGNATOR__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OBJECT_DESIGNATOR__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OBJECT_DESIGNATOR__FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Ecore Object Designator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OBJECT_DESIGNATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link assignast.impl.EEnumLiteralDesignatorImpl <em>EEnum Literal Designator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignast.impl.EEnumLiteralDesignatorImpl
	 * @see assignast.impl.AssignastPackageImpl#getEEnumLiteralDesignator()
	 * @generated
	 */
	int EENUM_LITERAL_DESIGNATOR = 22;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_DESIGNATOR__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_DESIGNATOR__ENUM = 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_DESIGNATOR__LITERAL = 2;

	/**
	 * The number of structural features of the '<em>EEnum Literal Designator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_DESIGNATOR_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link assignast.AssignModelAS <em>Assign Model AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Model AS</em>'.
	 * @see assignast.AssignModelAS
	 * @generated
	 */
	EClass getAssignModelAS();

	/**
	 * Returns the meta object for the containment reference list '{@link assignast.AssignModelAS#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see assignast.AssignModelAS#getAssignments()
	 * @see #getAssignModelAS()
	 * @generated
	 */
	EReference getAssignModelAS_Assignments();

	/**
	 * Returns the meta object for class '{@link assignast.AssignmentAS <em>Assignment AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment AS</em>'.
	 * @see assignast.AssignmentAS
	 * @generated
	 */
	EClass getAssignmentAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.AssignmentAS#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see assignast.AssignmentAS#getExpression()
	 * @see #getAssignmentAS()
	 * @generated
	 */
	EReference getAssignmentAS_Expression();

	/**
	 * Returns the meta object for class '{@link assignast.VariableAssignmentAS <em>Variable Assignment AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment AS</em>'.
	 * @see assignast.VariableAssignmentAS
	 * @generated
	 */
	EClass getVariableAssignmentAS();

	/**
	 * Returns the meta object for the attribute '{@link assignast.VariableAssignmentAS#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see assignast.VariableAssignmentAS#getVariableName()
	 * @see #getVariableAssignmentAS()
	 * @generated
	 */
	EAttribute getVariableAssignmentAS_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link assignast.VariableAssignmentAS#isReturned <em>Returned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returned</em>'.
	 * @see assignast.VariableAssignmentAS#isReturned()
	 * @see #getVariableAssignmentAS()
	 * @generated
	 */
	EAttribute getVariableAssignmentAS_Returned();

	/**
	 * Returns the meta object for class '{@link assignast.AbstractFeatureAssignmentAS <em>Abstract Feature Assignment AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Assignment AS</em>'.
	 * @see assignast.AbstractFeatureAssignmentAS
	 * @generated
	 */
	EClass getAbstractFeatureAssignmentAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.AbstractFeatureAssignmentAS#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see assignast.AbstractFeatureAssignmentAS#getObject()
	 * @see #getAbstractFeatureAssignmentAS()
	 * @generated
	 */
	EReference getAbstractFeatureAssignmentAS_Object();

	/**
	 * Returns the meta object for class '{@link assignast.ManyFeatureAppendAS <em>Many Feature Append AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Feature Append AS</em>'.
	 * @see assignast.ManyFeatureAppendAS
	 * @generated
	 */
	EClass getManyFeatureAppendAS();

	/**
	 * Returns the meta object for class '{@link assignast.SingleFeatureAssignmentAS <em>Single Feature Assignment AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Feature Assignment AS</em>'.
	 * @see assignast.SingleFeatureAssignmentAS
	 * @generated
	 */
	EClass getSingleFeatureAssignmentAS();

	/**
	 * Returns the meta object for class '{@link assignast.ExpressionAS <em>Expression AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression AS</em>'.
	 * @see assignast.ExpressionAS
	 * @generated
	 */
	EClass getExpressionAS();

	/**
	 * Returns the meta object for class '{@link assignast.VariableAS <em>Variable AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable AS</em>'.
	 * @see assignast.VariableAS
	 * @generated
	 */
	EClass getVariableAS();

	/**
	 * Returns the meta object for the attribute '{@link assignast.VariableAS#getVariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Assignment</em>'.
	 * @see assignast.VariableAS#getVariableAssignment()
	 * @see #getVariableAS()
	 * @generated
	 */
	EAttribute getVariableAS_VariableAssignment();

	/**
	 * Returns the meta object for class '{@link assignast.FeatureAccessAS <em>Feature Access AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Access AS</em>'.
	 * @see assignast.FeatureAccessAS
	 * @generated
	 */
	EClass getFeatureAccessAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.FeatureAccessAS#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see assignast.FeatureAccessAS#getObject()
	 * @see #getFeatureAccessAS()
	 * @generated
	 */
	EReference getFeatureAccessAS_Object();

	/**
	 * Returns the meta object for the attribute '{@link assignast.FeatureAccessAS#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see assignast.FeatureAccessAS#getFeature()
	 * @see #getFeatureAccessAS()
	 * @generated
	 */
	EAttribute getFeatureAccessAS_Feature();

	/**
	 * Returns the meta object for class '{@link assignast.EObjectReferenceAS <em>EObject Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Reference AS</em>'.
	 * @see assignast.EObjectReferenceAS
	 * @generated
	 */
	EClass getEObjectReferenceAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.EObjectReferenceAS#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see assignast.EObjectReferenceAS#getObject()
	 * @see #getEObjectReferenceAS()
	 * @generated
	 */
	EReference getEObjectReferenceAS_Object();

	/**
	 * Returns the meta object for class '{@link assignast.CreateInstanceAS <em>Create Instance AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Instance AS</em>'.
	 * @see assignast.CreateInstanceAS
	 * @generated
	 */
	EClass getCreateInstanceAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.CreateInstanceAS#getEClassReference <em>EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass Reference</em>'.
	 * @see assignast.CreateInstanceAS#getEClassReference()
	 * @see #getCreateInstanceAS()
	 * @generated
	 */
	EReference getCreateInstanceAS_EClassReference();

	/**
	 * Returns the meta object for class '{@link assignast.EClassReferenceAS <em>EClass Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Reference AS</em>'.
	 * @see assignast.EClassReferenceAS
	 * @generated
	 */
	EClass getEClassReferenceAS();

	/**
	 * Returns the meta object for class '{@link assignast.StaticEClassReferenceAS <em>Static EClass Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static EClass Reference AS</em>'.
	 * @see assignast.StaticEClassReferenceAS
	 * @generated
	 */
	EClass getStaticEClassReferenceAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.StaticEClassReferenceAS#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass</em>'.
	 * @see assignast.StaticEClassReferenceAS#getEClass()
	 * @see #getStaticEClassReferenceAS()
	 * @generated
	 */
	EReference getStaticEClassReferenceAS_EClass();

	/**
	 * Returns the meta object for class '{@link assignast.DynamicEClassReferenceAS <em>Dynamic EClass Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic EClass Reference AS</em>'.
	 * @see assignast.DynamicEClassReferenceAS
	 * @generated
	 */
	EClass getDynamicEClassReferenceAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.DynamicEClassReferenceAS#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass</em>'.
	 * @see assignast.DynamicEClassReferenceAS#getEClass()
	 * @see #getDynamicEClassReferenceAS()
	 * @generated
	 */
	EReference getDynamicEClassReferenceAS_EClass();

	/**
	 * Returns the meta object for class '{@link assignast.CopyObjectAS <em>Copy Object AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Object AS</em>'.
	 * @see assignast.CopyObjectAS
	 * @generated
	 */
	EClass getCopyObjectAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.CopyObjectAS#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see assignast.CopyObjectAS#getObject()
	 * @see #getCopyObjectAS()
	 * @generated
	 */
	EReference getCopyObjectAS_Object();

	/**
	 * Returns the meta object for class '{@link assignast.StringLiteralAS <em>String Literal AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal AS</em>'.
	 * @see assignast.StringLiteralAS
	 * @generated
	 */
	EClass getStringLiteralAS();

	/**
	 * Returns the meta object for the attribute '{@link assignast.StringLiteralAS#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see assignast.StringLiteralAS#getValue()
	 * @see #getStringLiteralAS()
	 * @generated
	 */
	EAttribute getStringLiteralAS_Value();

	/**
	 * Returns the meta object for class '{@link assignast.BooleanLiteralAS <em>Boolean Literal AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal AS</em>'.
	 * @see assignast.BooleanLiteralAS
	 * @generated
	 */
	EClass getBooleanLiteralAS();

	/**
	 * Returns the meta object for the attribute '{@link assignast.BooleanLiteralAS#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see assignast.BooleanLiteralAS#isValue()
	 * @see #getBooleanLiteralAS()
	 * @generated
	 */
	EAttribute getBooleanLiteralAS_Value();

	/**
	 * Returns the meta object for class '{@link assignast.EnumLiteralAS <em>Enum Literal AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal AS</em>'.
	 * @see assignast.EnumLiteralAS
	 * @generated
	 */
	EClass getEnumLiteralAS();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.EnumLiteralAS#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see assignast.EnumLiteralAS#getLiteral()
	 * @see #getEnumLiteralAS()
	 * @generated
	 */
	EReference getEnumLiteralAS_Literal();

	/**
	 * Returns the meta object for class '{@link assignast.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see assignast.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link assignast.Unit#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see assignast.Unit#getImports()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link assignast.Unit#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see assignast.Unit#getModel()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Model();

	/**
	 * Returns the meta object for class '{@link assignast.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see assignast.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link assignast.Import#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see assignast.Import#getPackageName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link assignast.Import#getPackageUri <em>Package Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Uri</em>'.
	 * @see assignast.Import#getPackageUri()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_PackageUri();

	/**
	 * Returns the meta object for class '{@link assignast.EClassDesignator <em>EClass Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Designator</em>'.
	 * @see assignast.EClassDesignator
	 * @generated
	 */
	EClass getEClassDesignator();

	/**
	 * Returns the meta object for the attribute '{@link assignast.EClassDesignator#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see assignast.EClassDesignator#getPackage()
	 * @see #getEClassDesignator()
	 * @generated
	 */
	EAttribute getEClassDesignator_Package();

	/**
	 * Returns the meta object for the attribute '{@link assignast.EClassDesignator#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see assignast.EClassDesignator#getClass_()
	 * @see #getEClassDesignator()
	 * @generated
	 */
	EAttribute getEClassDesignator_Class();

	/**
	 * Returns the meta object for class '{@link assignast.EcoreObjectDesignator <em>Ecore Object Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Object Designator</em>'.
	 * @see assignast.EcoreObjectDesignator
	 * @generated
	 */
	EClass getEcoreObjectDesignator();

	/**
	 * Returns the meta object for the attribute '{@link assignast.EcoreObjectDesignator#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see assignast.EcoreObjectDesignator#getPackage()
	 * @see #getEcoreObjectDesignator()
	 * @generated
	 */
	EAttribute getEcoreObjectDesignator_Package();

	/**
	 * Returns the meta object for the attribute '{@link assignast.EcoreObjectDesignator#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see assignast.EcoreObjectDesignator#getClass_()
	 * @see #getEcoreObjectDesignator()
	 * @generated
	 */
	EAttribute getEcoreObjectDesignator_Class();

	/**
	 * Returns the meta object for the attribute '{@link assignast.EcoreObjectDesignator#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see assignast.EcoreObjectDesignator#getFeature()
	 * @see #getEcoreObjectDesignator()
	 * @generated
	 */
	EAttribute getEcoreObjectDesignator_Feature();

	/**
	 * Returns the meta object for class '{@link assignast.EEnumLiteralDesignator <em>EEnum Literal Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Literal Designator</em>'.
	 * @see assignast.EEnumLiteralDesignator
	 * @generated
	 */
	EClass getEEnumLiteralDesignator();

	/**
	 * Returns the meta object for the attribute '{@link assignast.EEnumLiteralDesignator#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see assignast.EEnumLiteralDesignator#getPackage()
	 * @see #getEEnumLiteralDesignator()
	 * @generated
	 */
	EAttribute getEEnumLiteralDesignator_Package();

	/**
	 * Returns the meta object for the attribute '{@link assignast.EEnumLiteralDesignator#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see assignast.EEnumLiteralDesignator#getEnum()
	 * @see #getEEnumLiteralDesignator()
	 * @generated
	 */
	EAttribute getEEnumLiteralDesignator_Enum();

	/**
	 * Returns the meta object for the attribute '{@link assignast.EEnumLiteralDesignator#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see assignast.EEnumLiteralDesignator#getLiteral()
	 * @see #getEEnumLiteralDesignator()
	 * @generated
	 */
	EAttribute getEEnumLiteralDesignator_Literal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssignastFactory getAssignastFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link assignast.impl.AssignModelASImpl <em>Assign Model AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.AssignModelASImpl
		 * @see assignast.impl.AssignastPackageImpl#getAssignModelAS()
		 * @generated
		 */
		EClass ASSIGN_MODEL_AS = eINSTANCE.getAssignModelAS();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_MODEL_AS__ASSIGNMENTS = eINSTANCE.getAssignModelAS_Assignments();

		/**
		 * The meta object literal for the '{@link assignast.impl.AssignmentASImpl <em>Assignment AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.AssignmentASImpl
		 * @see assignast.impl.AssignastPackageImpl#getAssignmentAS()
		 * @generated
		 */
		EClass ASSIGNMENT_AS = eINSTANCE.getAssignmentAS();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_AS__EXPRESSION = eINSTANCE.getAssignmentAS_Expression();

		/**
		 * The meta object literal for the '{@link assignast.impl.VariableAssignmentASImpl <em>Variable Assignment AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.VariableAssignmentASImpl
		 * @see assignast.impl.AssignastPackageImpl#getVariableAssignmentAS()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT_AS = eINSTANCE.getVariableAssignmentAS();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ASSIGNMENT_AS__VARIABLE_NAME = eINSTANCE.getVariableAssignmentAS_VariableName();

		/**
		 * The meta object literal for the '<em><b>Returned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ASSIGNMENT_AS__RETURNED = eINSTANCE.getVariableAssignmentAS_Returned();

		/**
		 * The meta object literal for the '{@link assignast.impl.AbstractFeatureAssignmentASImpl <em>Abstract Feature Assignment AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.AbstractFeatureAssignmentASImpl
		 * @see assignast.impl.AssignastPackageImpl#getAbstractFeatureAssignmentAS()
		 * @generated
		 */
		EClass ABSTRACT_FEATURE_ASSIGNMENT_AS = eINSTANCE.getAbstractFeatureAssignmentAS();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT = eINSTANCE.getAbstractFeatureAssignmentAS_Object();

		/**
		 * The meta object literal for the '{@link assignast.impl.ManyFeatureAppendASImpl <em>Many Feature Append AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.ManyFeatureAppendASImpl
		 * @see assignast.impl.AssignastPackageImpl#getManyFeatureAppendAS()
		 * @generated
		 */
		EClass MANY_FEATURE_APPEND_AS = eINSTANCE.getManyFeatureAppendAS();

		/**
		 * The meta object literal for the '{@link assignast.impl.SingleFeatureAssignmentASImpl <em>Single Feature Assignment AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.SingleFeatureAssignmentASImpl
		 * @see assignast.impl.AssignastPackageImpl#getSingleFeatureAssignmentAS()
		 * @generated
		 */
		EClass SINGLE_FEATURE_ASSIGNMENT_AS = eINSTANCE.getSingleFeatureAssignmentAS();

		/**
		 * The meta object literal for the '{@link assignast.impl.ExpressionASImpl <em>Expression AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.ExpressionASImpl
		 * @see assignast.impl.AssignastPackageImpl#getExpressionAS()
		 * @generated
		 */
		EClass EXPRESSION_AS = eINSTANCE.getExpressionAS();

		/**
		 * The meta object literal for the '{@link assignast.impl.VariableASImpl <em>Variable AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.VariableASImpl
		 * @see assignast.impl.AssignastPackageImpl#getVariableAS()
		 * @generated
		 */
		EClass VARIABLE_AS = eINSTANCE.getVariableAS();

		/**
		 * The meta object literal for the '<em><b>Variable Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_AS__VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAS_VariableAssignment();

		/**
		 * The meta object literal for the '{@link assignast.impl.FeatureAccessASImpl <em>Feature Access AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.FeatureAccessASImpl
		 * @see assignast.impl.AssignastPackageImpl#getFeatureAccessAS()
		 * @generated
		 */
		EClass FEATURE_ACCESS_AS = eINSTANCE.getFeatureAccessAS();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ACCESS_AS__OBJECT = eINSTANCE.getFeatureAccessAS_Object();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_ACCESS_AS__FEATURE = eINSTANCE.getFeatureAccessAS_Feature();

		/**
		 * The meta object literal for the '{@link assignast.impl.EObjectReferenceASImpl <em>EObject Reference AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.EObjectReferenceASImpl
		 * @see assignast.impl.AssignastPackageImpl#getEObjectReferenceAS()
		 * @generated
		 */
		EClass EOBJECT_REFERENCE_AS = eINSTANCE.getEObjectReferenceAS();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_REFERENCE_AS__OBJECT = eINSTANCE.getEObjectReferenceAS_Object();

		/**
		 * The meta object literal for the '{@link assignast.impl.CreateInstanceASImpl <em>Create Instance AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.CreateInstanceASImpl
		 * @see assignast.impl.AssignastPackageImpl#getCreateInstanceAS()
		 * @generated
		 */
		EClass CREATE_INSTANCE_AS = eINSTANCE.getCreateInstanceAS();

		/**
		 * The meta object literal for the '<em><b>EClass Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INSTANCE_AS__ECLASS_REFERENCE = eINSTANCE.getCreateInstanceAS_EClassReference();

		/**
		 * The meta object literal for the '{@link assignast.impl.EClassReferenceASImpl <em>EClass Reference AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.EClassReferenceASImpl
		 * @see assignast.impl.AssignastPackageImpl#getEClassReferenceAS()
		 * @generated
		 */
		EClass ECLASS_REFERENCE_AS = eINSTANCE.getEClassReferenceAS();

		/**
		 * The meta object literal for the '{@link assignast.impl.StaticEClassReferenceASImpl <em>Static EClass Reference AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.StaticEClassReferenceASImpl
		 * @see assignast.impl.AssignastPackageImpl#getStaticEClassReferenceAS()
		 * @generated
		 */
		EClass STATIC_ECLASS_REFERENCE_AS = eINSTANCE.getStaticEClassReferenceAS();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ECLASS_REFERENCE_AS__ECLASS = eINSTANCE.getStaticEClassReferenceAS_EClass();

		/**
		 * The meta object literal for the '{@link assignast.impl.DynamicEClassReferenceASImpl <em>Dynamic EClass Reference AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.DynamicEClassReferenceASImpl
		 * @see assignast.impl.AssignastPackageImpl#getDynamicEClassReferenceAS()
		 * @generated
		 */
		EClass DYNAMIC_ECLASS_REFERENCE_AS = eINSTANCE.getDynamicEClassReferenceAS();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_ECLASS_REFERENCE_AS__ECLASS = eINSTANCE.getDynamicEClassReferenceAS_EClass();

		/**
		 * The meta object literal for the '{@link assignast.impl.CopyObjectASImpl <em>Copy Object AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.CopyObjectASImpl
		 * @see assignast.impl.AssignastPackageImpl#getCopyObjectAS()
		 * @generated
		 */
		EClass COPY_OBJECT_AS = eINSTANCE.getCopyObjectAS();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY_OBJECT_AS__OBJECT = eINSTANCE.getCopyObjectAS_Object();

		/**
		 * The meta object literal for the '{@link assignast.impl.StringLiteralASImpl <em>String Literal AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.StringLiteralASImpl
		 * @see assignast.impl.AssignastPackageImpl#getStringLiteralAS()
		 * @generated
		 */
		EClass STRING_LITERAL_AS = eINSTANCE.getStringLiteralAS();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL_AS__VALUE = eINSTANCE.getStringLiteralAS_Value();

		/**
		 * The meta object literal for the '{@link assignast.impl.BooleanLiteralASImpl <em>Boolean Literal AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.BooleanLiteralASImpl
		 * @see assignast.impl.AssignastPackageImpl#getBooleanLiteralAS()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_AS = eINSTANCE.getBooleanLiteralAS();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL_AS__VALUE = eINSTANCE.getBooleanLiteralAS_Value();

		/**
		 * The meta object literal for the '{@link assignast.impl.EnumLiteralASImpl <em>Enum Literal AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.EnumLiteralASImpl
		 * @see assignast.impl.AssignastPackageImpl#getEnumLiteralAS()
		 * @generated
		 */
		EClass ENUM_LITERAL_AS = eINSTANCE.getEnumLiteralAS();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_AS__LITERAL = eINSTANCE.getEnumLiteralAS_Literal();

		/**
		 * The meta object literal for the '{@link assignast.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.UnitImpl
		 * @see assignast.impl.AssignastPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__IMPORTS = eINSTANCE.getUnit_Imports();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__MODEL = eINSTANCE.getUnit_Model();

		/**
		 * The meta object literal for the '{@link assignast.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.ImportImpl
		 * @see assignast.impl.AssignastPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__PACKAGE_NAME = eINSTANCE.getImport_PackageName();

		/**
		 * The meta object literal for the '<em><b>Package Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__PACKAGE_URI = eINSTANCE.getImport_PackageUri();

		/**
		 * The meta object literal for the '{@link assignast.impl.EClassDesignatorImpl <em>EClass Designator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.EClassDesignatorImpl
		 * @see assignast.impl.AssignastPackageImpl#getEClassDesignator()
		 * @generated
		 */
		EClass ECLASS_DESIGNATOR = eINSTANCE.getEClassDesignator();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_DESIGNATOR__PACKAGE = eINSTANCE.getEClassDesignator_Package();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_DESIGNATOR__CLASS = eINSTANCE.getEClassDesignator_Class();

		/**
		 * The meta object literal for the '{@link assignast.impl.EcoreObjectDesignatorImpl <em>Ecore Object Designator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.EcoreObjectDesignatorImpl
		 * @see assignast.impl.AssignastPackageImpl#getEcoreObjectDesignator()
		 * @generated
		 */
		EClass ECORE_OBJECT_DESIGNATOR = eINSTANCE.getEcoreObjectDesignator();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_OBJECT_DESIGNATOR__PACKAGE = eINSTANCE.getEcoreObjectDesignator_Package();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_OBJECT_DESIGNATOR__CLASS = eINSTANCE.getEcoreObjectDesignator_Class();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_OBJECT_DESIGNATOR__FEATURE = eINSTANCE.getEcoreObjectDesignator_Feature();

		/**
		 * The meta object literal for the '{@link assignast.impl.EEnumLiteralDesignatorImpl <em>EEnum Literal Designator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignast.impl.EEnumLiteralDesignatorImpl
		 * @see assignast.impl.AssignastPackageImpl#getEEnumLiteralDesignator()
		 * @generated
		 */
		EClass EENUM_LITERAL_DESIGNATOR = eINSTANCE.getEEnumLiteralDesignator();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL_DESIGNATOR__PACKAGE = eINSTANCE.getEEnumLiteralDesignator_Package();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL_DESIGNATOR__ENUM = eINSTANCE.getEEnumLiteralDesignator_Enum();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL_DESIGNATOR__LITERAL = eINSTANCE.getEEnumLiteralDesignator_Literal();

	}

} //AssignastPackage
