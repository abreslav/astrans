/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign;

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
 * @see assign.AssignFactory
 * @model kind="package"
 * @generated
 */
public interface AssignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assign";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rain.ifmo.ru/~breslav/astrans/examples/2007/assign";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assign";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignPackage eINSTANCE = assign.impl.AssignPackageImpl.init();

	/**
	 * The meta object id for the '{@link assign.impl.AssignModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.AssignModelImpl
	 * @see assign.impl.AssignPackageImpl#getAssignModel()
	 * @generated
	 */
	int ASSIGN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_MODEL__ASSIGNMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link assign.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.AssignmentImpl
	 * @see assign.impl.AssignPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link assign.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.VariableAssignmentImpl
	 * @see assign.impl.AssignPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__EXPRESSION = ASSIGNMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VARIABLE_NAME = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__RETURNED = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link assign.impl.AbstractFeatureAssignmentImpl <em>Abstract Feature Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.AbstractFeatureAssignmentImpl
	 * @see assign.impl.AssignPackageImpl#getAbstractFeatureAssignment()
	 * @generated
	 */
	int ABSTRACT_FEATURE_ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_ASSIGNMENT__EXPRESSION = ASSIGNMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_ASSIGNMENT__OBJECT = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Feature Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.ManyFeatureAppendImpl <em>Many Feature Append</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.ManyFeatureAppendImpl
	 * @see assign.impl.AssignPackageImpl#getManyFeatureAppend()
	 * @generated
	 */
	int MANY_FEATURE_APPEND = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_FEATURE_APPEND__EXPRESSION = ABSTRACT_FEATURE_ASSIGNMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_FEATURE_APPEND__OBJECT = ABSTRACT_FEATURE_ASSIGNMENT__OBJECT;

	/**
	 * The number of structural features of the '<em>Many Feature Append</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_FEATURE_APPEND_FEATURE_COUNT = ABSTRACT_FEATURE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link assign.impl.SingleFeatureAssignmentImpl <em>Single Feature Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.SingleFeatureAssignmentImpl
	 * @see assign.impl.AssignPackageImpl#getSingleFeatureAssignment()
	 * @generated
	 */
	int SINGLE_FEATURE_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_ASSIGNMENT__EXPRESSION = ABSTRACT_FEATURE_ASSIGNMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_ASSIGNMENT__OBJECT = ABSTRACT_FEATURE_ASSIGNMENT__OBJECT;

	/**
	 * The number of structural features of the '<em>Single Feature Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_ASSIGNMENT_FEATURE_COUNT = ABSTRACT_FEATURE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link assign.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.ExpressionImpl
	 * @see assign.impl.AssignPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link assign.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.VariableImpl
	 * @see assign.impl.AssignPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_ASSIGNMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.FeatureAccessImpl <em>Feature Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.FeatureAccessImpl
	 * @see assign.impl.AssignPackageImpl#getFeatureAccess()
	 * @generated
	 */
	int FEATURE_ACCESS = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link assign.impl.EObjectReferenceImpl <em>EObject Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.EObjectReferenceImpl
	 * @see assign.impl.AssignPackageImpl#getEObjectReference()
	 * @generated
	 */
	int EOBJECT_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.CreateInstanceImpl <em>Create Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.CreateInstanceImpl
	 * @see assign.impl.AssignPackageImpl#getCreateInstance()
	 * @generated
	 */
	int CREATE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>EClass Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE__ECLASS_REFERENCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.EClassReferenceImpl <em>EClass Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.EClassReferenceImpl
	 * @see assign.impl.AssignPackageImpl#getEClassReference()
	 * @generated
	 */
	int ECLASS_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_REFERENCE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>EClass Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link assign.impl.StaticEClassReferenceImpl <em>Static EClass Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.StaticEClassReferenceImpl
	 * @see assign.impl.AssignPackageImpl#getStaticEClassReference()
	 * @generated
	 */
	int STATIC_ECLASS_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ECLASS_REFERENCE__TYPE = ECLASS_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ECLASS_REFERENCE__ECLASS = ECLASS_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static EClass Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ECLASS_REFERENCE_FEATURE_COUNT = ECLASS_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.DynamicEClassReferenceImpl <em>Dynamic EClass Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.DynamicEClassReferenceImpl
	 * @see assign.impl.AssignPackageImpl#getDynamicEClassReference()
	 * @generated
	 */
	int DYNAMIC_ECLASS_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ECLASS_REFERENCE__TYPE = ECLASS_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ECLASS_REFERENCE__ECLASS = ECLASS_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic EClass Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ECLASS_REFERENCE_FEATURE_COUNT = ECLASS_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.CopyObjectImpl <em>Copy Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.CopyObjectImpl
	 * @see assign.impl.AssignPackageImpl#getCopyObject()
	 * @generated
	 */
	int COPY_OBJECT = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OBJECT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OBJECT__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Copy Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OBJECT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.StringLiteralImpl
	 * @see assign.impl.AssignPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.BooleanLiteralImpl
	 * @see assign.impl.AssignPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link assign.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assign.impl.EnumLiteralImpl
	 * @see assign.impl.AssignPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__LITERAL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link assign.AssignModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see assign.AssignModel
	 * @generated
	 */
	EClass getAssignModel();

	/**
	 * Returns the meta object for the containment reference list '{@link assign.AssignModel#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see assign.AssignModel#getAssignments()
	 * @see #getAssignModel()
	 * @generated
	 */
	EReference getAssignModel_Assignments();

	/**
	 * Returns the meta object for class '{@link assign.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see assign.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link assign.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see assign.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expression();

	/**
	 * Returns the meta object for class '{@link assign.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see assign.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the attribute '{@link assign.VariableAssignment#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see assign.VariableAssignment#getVariableName()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EAttribute getVariableAssignment_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link assign.VariableAssignment#isReturned <em>Returned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returned</em>'.
	 * @see assign.VariableAssignment#isReturned()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EAttribute getVariableAssignment_Returned();

	/**
	 * Returns the meta object for class '{@link assign.AbstractFeatureAssignment <em>Abstract Feature Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Assignment</em>'.
	 * @see assign.AbstractFeatureAssignment
	 * @generated
	 */
	EClass getAbstractFeatureAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link assign.AbstractFeatureAssignment#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see assign.AbstractFeatureAssignment#getObject()
	 * @see #getAbstractFeatureAssignment()
	 * @generated
	 */
	EReference getAbstractFeatureAssignment_Object();

	/**
	 * Returns the meta object for class '{@link assign.ManyFeatureAppend <em>Many Feature Append</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Feature Append</em>'.
	 * @see assign.ManyFeatureAppend
	 * @generated
	 */
	EClass getManyFeatureAppend();

	/**
	 * Returns the meta object for class '{@link assign.SingleFeatureAssignment <em>Single Feature Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Feature Assignment</em>'.
	 * @see assign.SingleFeatureAssignment
	 * @generated
	 */
	EClass getSingleFeatureAssignment();

	/**
	 * Returns the meta object for class '{@link assign.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see assign.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link assign.Expression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see assign.Expression#getType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Type();

	/**
	 * Returns the meta object for class '{@link assign.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see assign.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link assign.Variable#getVariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Assignment</em>'.
	 * @see assign.Variable#getVariableAssignment()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_VariableAssignment();

	/**
	 * Returns the meta object for class '{@link assign.FeatureAccess <em>Feature Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Access</em>'.
	 * @see assign.FeatureAccess
	 * @generated
	 */
	EClass getFeatureAccess();

	/**
	 * Returns the meta object for the containment reference '{@link assign.FeatureAccess#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see assign.FeatureAccess#getObject()
	 * @see #getFeatureAccess()
	 * @generated
	 */
	EReference getFeatureAccess_Object();

	/**
	 * Returns the meta object for the reference '{@link assign.FeatureAccess#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see assign.FeatureAccess#getFeature()
	 * @see #getFeatureAccess()
	 * @generated
	 */
	EReference getFeatureAccess_Feature();

	/**
	 * Returns the meta object for class '{@link assign.EObjectReference <em>EObject Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Reference</em>'.
	 * @see assign.EObjectReference
	 * @generated
	 */
	EClass getEObjectReference();

	/**
	 * Returns the meta object for the reference '{@link assign.EObjectReference#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see assign.EObjectReference#getObject()
	 * @see #getEObjectReference()
	 * @generated
	 */
	EReference getEObjectReference_Object();

	/**
	 * Returns the meta object for class '{@link assign.CreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Instance</em>'.
	 * @see assign.CreateInstance
	 * @generated
	 */
	EClass getCreateInstance();

	/**
	 * Returns the meta object for the containment reference '{@link assign.CreateInstance#getEClassReference <em>EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass Reference</em>'.
	 * @see assign.CreateInstance#getEClassReference()
	 * @see #getCreateInstance()
	 * @generated
	 */
	EReference getCreateInstance_EClassReference();

	/**
	 * Returns the meta object for class '{@link assign.EClassReference <em>EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Reference</em>'.
	 * @see assign.EClassReference
	 * @generated
	 */
	EClass getEClassReference();

	/**
	 * Returns the meta object for the reference '{@link assign.EClassReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see assign.EClassReference#getType()
	 * @see #getEClassReference()
	 * @generated
	 */
	EReference getEClassReference_Type();

	/**
	 * Returns the meta object for class '{@link assign.StaticEClassReference <em>Static EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static EClass Reference</em>'.
	 * @see assign.StaticEClassReference
	 * @generated
	 */
	EClass getStaticEClassReference();

	/**
	 * Returns the meta object for the reference '{@link assign.StaticEClassReference#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see assign.StaticEClassReference#getEClass()
	 * @see #getStaticEClassReference()
	 * @generated
	 */
	EReference getStaticEClassReference_EClass();

	/**
	 * Returns the meta object for class '{@link assign.DynamicEClassReference <em>Dynamic EClass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic EClass Reference</em>'.
	 * @see assign.DynamicEClassReference
	 * @generated
	 */
	EClass getDynamicEClassReference();

	/**
	 * Returns the meta object for the containment reference '{@link assign.DynamicEClassReference#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass</em>'.
	 * @see assign.DynamicEClassReference#getEClass()
	 * @see #getDynamicEClassReference()
	 * @generated
	 */
	EReference getDynamicEClassReference_EClass();

	/**
	 * Returns the meta object for class '{@link assign.CopyObject <em>Copy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Object</em>'.
	 * @see assign.CopyObject
	 * @generated
	 */
	EClass getCopyObject();

	/**
	 * Returns the meta object for the containment reference '{@link assign.CopyObject#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see assign.CopyObject#getObject()
	 * @see #getCopyObject()
	 * @generated
	 */
	EReference getCopyObject_Object();

	/**
	 * Returns the meta object for class '{@link assign.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see assign.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link assign.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see assign.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link assign.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see assign.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link assign.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see assign.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link assign.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see assign.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the reference '{@link assign.EnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see assign.EnumLiteral#getLiteral()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EReference getEnumLiteral_Literal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssignFactory getAssignFactory();

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
		 * The meta object literal for the '{@link assign.impl.AssignModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.AssignModelImpl
		 * @see assign.impl.AssignPackageImpl#getAssignModel()
		 * @generated
		 */
		EClass ASSIGN_MODEL = eINSTANCE.getAssignModel();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_MODEL__ASSIGNMENTS = eINSTANCE.getAssignModel_Assignments();

		/**
		 * The meta object literal for the '{@link assign.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.AssignmentImpl
		 * @see assign.impl.AssignPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

		/**
		 * The meta object literal for the '{@link assign.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.VariableAssignmentImpl
		 * @see assign.impl.AssignPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ASSIGNMENT__VARIABLE_NAME = eINSTANCE.getVariableAssignment_VariableName();

		/**
		 * The meta object literal for the '<em><b>Returned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ASSIGNMENT__RETURNED = eINSTANCE.getVariableAssignment_Returned();

		/**
		 * The meta object literal for the '{@link assign.impl.AbstractFeatureAssignmentImpl <em>Abstract Feature Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.AbstractFeatureAssignmentImpl
		 * @see assign.impl.AssignPackageImpl#getAbstractFeatureAssignment()
		 * @generated
		 */
		EClass ABSTRACT_FEATURE_ASSIGNMENT = eINSTANCE.getAbstractFeatureAssignment();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FEATURE_ASSIGNMENT__OBJECT = eINSTANCE.getAbstractFeatureAssignment_Object();

		/**
		 * The meta object literal for the '{@link assign.impl.ManyFeatureAppendImpl <em>Many Feature Append</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.ManyFeatureAppendImpl
		 * @see assign.impl.AssignPackageImpl#getManyFeatureAppend()
		 * @generated
		 */
		EClass MANY_FEATURE_APPEND = eINSTANCE.getManyFeatureAppend();

		/**
		 * The meta object literal for the '{@link assign.impl.SingleFeatureAssignmentImpl <em>Single Feature Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.SingleFeatureAssignmentImpl
		 * @see assign.impl.AssignPackageImpl#getSingleFeatureAssignment()
		 * @generated
		 */
		EClass SINGLE_FEATURE_ASSIGNMENT = eINSTANCE.getSingleFeatureAssignment();

		/**
		 * The meta object literal for the '{@link assign.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.ExpressionImpl
		 * @see assign.impl.AssignPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

		/**
		 * The meta object literal for the '{@link assign.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.VariableImpl
		 * @see assign.impl.AssignPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VARIABLE_ASSIGNMENT = eINSTANCE.getVariable_VariableAssignment();

		/**
		 * The meta object literal for the '{@link assign.impl.FeatureAccessImpl <em>Feature Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.FeatureAccessImpl
		 * @see assign.impl.AssignPackageImpl#getFeatureAccess()
		 * @generated
		 */
		EClass FEATURE_ACCESS = eINSTANCE.getFeatureAccess();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ACCESS__OBJECT = eINSTANCE.getFeatureAccess_Object();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ACCESS__FEATURE = eINSTANCE.getFeatureAccess_Feature();

		/**
		 * The meta object literal for the '{@link assign.impl.EObjectReferenceImpl <em>EObject Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.EObjectReferenceImpl
		 * @see assign.impl.AssignPackageImpl#getEObjectReference()
		 * @generated
		 */
		EClass EOBJECT_REFERENCE = eINSTANCE.getEObjectReference();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_REFERENCE__OBJECT = eINSTANCE.getEObjectReference_Object();

		/**
		 * The meta object literal for the '{@link assign.impl.CreateInstanceImpl <em>Create Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.CreateInstanceImpl
		 * @see assign.impl.AssignPackageImpl#getCreateInstance()
		 * @generated
		 */
		EClass CREATE_INSTANCE = eINSTANCE.getCreateInstance();

		/**
		 * The meta object literal for the '<em><b>EClass Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INSTANCE__ECLASS_REFERENCE = eINSTANCE.getCreateInstance_EClassReference();

		/**
		 * The meta object literal for the '{@link assign.impl.EClassReferenceImpl <em>EClass Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.EClassReferenceImpl
		 * @see assign.impl.AssignPackageImpl#getEClassReference()
		 * @generated
		 */
		EClass ECLASS_REFERENCE = eINSTANCE.getEClassReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_REFERENCE__TYPE = eINSTANCE.getEClassReference_Type();

		/**
		 * The meta object literal for the '{@link assign.impl.StaticEClassReferenceImpl <em>Static EClass Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.StaticEClassReferenceImpl
		 * @see assign.impl.AssignPackageImpl#getStaticEClassReference()
		 * @generated
		 */
		EClass STATIC_ECLASS_REFERENCE = eINSTANCE.getStaticEClassReference();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ECLASS_REFERENCE__ECLASS = eINSTANCE.getStaticEClassReference_EClass();

		/**
		 * The meta object literal for the '{@link assign.impl.DynamicEClassReferenceImpl <em>Dynamic EClass Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.DynamicEClassReferenceImpl
		 * @see assign.impl.AssignPackageImpl#getDynamicEClassReference()
		 * @generated
		 */
		EClass DYNAMIC_ECLASS_REFERENCE = eINSTANCE.getDynamicEClassReference();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_ECLASS_REFERENCE__ECLASS = eINSTANCE.getDynamicEClassReference_EClass();

		/**
		 * The meta object literal for the '{@link assign.impl.CopyObjectImpl <em>Copy Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.CopyObjectImpl
		 * @see assign.impl.AssignPackageImpl#getCopyObject()
		 * @generated
		 */
		EClass COPY_OBJECT = eINSTANCE.getCopyObject();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY_OBJECT__OBJECT = eINSTANCE.getCopyObject_Object();

		/**
		 * The meta object literal for the '{@link assign.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.StringLiteralImpl
		 * @see assign.impl.AssignPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link assign.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.BooleanLiteralImpl
		 * @see assign.impl.AssignPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link assign.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assign.impl.EnumLiteralImpl
		 * @see assign.impl.AssignPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL__LITERAL = eINSTANCE.getEnumLiteral_Literal();

	}

} //AssignPackage
