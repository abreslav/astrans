/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationFactory
 * @generated
 */
public class AstransformationPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "astransformation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://rain.ifmo.ru/~breslav/2007/astransformation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "astransformation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AstransformationPackage eINSTANCE = ru.ifmo.rain.astrans.astransformation.AstransformationPackage.init();

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.Named
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getNamed()
	 * @generated
	 */
	public static final int NAMED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAMED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.Typed <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.Typed
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTyped()
	 * @generated
	 */
	public static final int TYPED = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPED__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.TypeName <em>Type Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.TypeName
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTypeName()
	 * @generated
	 */
	public static final int TYPE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Type Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_NAME_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.ClassName <em>Class Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.ClassName
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getClassName()
	 * @generated
	 */
	public static final int CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_NAME__NAME = TYPE_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_NAME_FEATURE_COUNT = TYPE_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.BasicTypeName <em>Basic Type Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.BasicTypeName
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getBasicTypeName()
	 * @generated
	 */
	public static final int BASIC_TYPE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_TYPE_NAME__TYPE = TYPE_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Type Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_TYPE_NAME_FEATURE_COUNT = TYPE_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.Transformation <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation()
	 * @generated
	 */
	public static final int TRANSFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION__MAPPING_RULES = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION__MAIN = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION__CUSTOM_MAIN = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolver Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION__RESOLVER_CLASS_NAME = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trace Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION__TRACE_CLASS_NAME = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION__SWITCH_CLASS_NAME = NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.Parameter <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.Parameter
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getParameter()
	 * @generated
	 */
	public static final int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.Method <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.Method
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMethod()
	 * @generated
	 */
	public static final int METHOD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__PARAMETER = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__RESULT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule <em>Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule()
	 * @generated
	 */
	public static final int MAPPING_RULE = 9;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature <em>Assign Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignFeature()
	 * @generated
	 */
	public static final int ASSIGN_FEATURE = 12;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.AssignAttribute <em>Assign Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.AssignAttribute
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignAttribute()
	 * @generated
	 */
	public static final int ASSIGN_ATTRIBUTE = 13;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.AssignReference <em>Assign Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReference
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignReference()
	 * @generated
	 */
	public static final int ASSIGN_REFERENCE = 14;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObjects <em>Resolve Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObjects
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getResolveObjects()
	 * @generated
	 */
	public static final int RESOLVE_OBJECTS = 11;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace <em>Write Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.WriteTrace
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getWriteTrace()
	 * @generated
	 */
	public static final int WRITE_TRACE = 15;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject <em>Resolve Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getResolveObject()
	 * @generated
	 */
	public static final int RESOLVE_OBJECT = 16;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.CustomMainMethod <em>Custom Main Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.CustomMainMethod
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getCustomMainMethod()
	 * @generated
	 */
	public static final int CUSTOM_MAIN_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_MAIN_METHOD__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_MAIN_METHOD__PARAMETER = METHOD__PARAMETER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_MAIN_METHOD__RESULT = METHOD__RESULT;

	/**
	 * The feature id for the '<em><b>Resolver Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_MAIN_METHOD__RESOLVER_METHOD_NAME = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Main Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_MAIN_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__PARAMETER = METHOD__PARAMETER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__RESULT = METHOD__RESULT;

	/**
	 * The feature id for the '<em><b>Factory Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__FACTORY_CLASS_NAME = METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factory Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__FACTORY_METHOD_NAME = METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assign Attribute Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS = METHOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assign Reference Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS = METHOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolve Object Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS = METHOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Write Trace Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__WRITE_TRACE_STATEMENT = METHOD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scope Information Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS = METHOD_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_RULE_FEATURE_COUNT = METHOD_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.AssignReferenceStatement <em>Assign Reference Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReferenceStatement
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignReferenceStatement()
	 * @generated
	 */
	public static final int ASSIGN_REFERENCE_STATEMENT = 10;

	/**
	 * The number of structural features of the '<em>Assign Reference Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_REFERENCE_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Resolve Object Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS = ASSIGN_REFERENCE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolve Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECTS_FEATURE_COUNT = ASSIGN_REFERENCE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_FEATURE__SETTER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_FEATURE__GETTER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_FEATURE__MANY = 2;

	/**
	 * The number of structural features of the '<em>Assign Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_FEATURE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_ATTRIBUTE__SETTER_NAME = ASSIGN_FEATURE__SETTER_NAME;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_ATTRIBUTE__GETTER_NAME = ASSIGN_FEATURE__GETTER_NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_ATTRIBUTE__MANY = ASSIGN_FEATURE__MANY;

	/**
	 * The number of structural features of the '<em>Assign Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_ATTRIBUTE_FEATURE_COUNT = ASSIGN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_REFERENCE__SETTER_NAME = ASSIGN_FEATURE__SETTER_NAME;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_REFERENCE__GETTER_NAME = ASSIGN_FEATURE__GETTER_NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_REFERENCE__MANY = ASSIGN_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_REFERENCE__TYPE = ASSIGN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_REFERENCE__MAPPING_NEEDED = ASSIGN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_REFERENCE_FEATURE_COUNT = ASSIGN_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_TRACE__TRACE_METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Write Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_TRACE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECT__SETTER_NAME = ASSIGN_FEATURE__SETTER_NAME;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECT__GETTER_NAME = ASSIGN_FEATURE__GETTER_NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECT__MANY = ASSIGN_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECT__TYPE = ASSIGN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolver Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECT__RESOLVER_METHOD_NAME = ASSIGN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECT__PARAMETER_TYPE = ASSIGN_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECT__PARAMETER_NAME = ASSIGN_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resolve Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_OBJECT_FEATURE_COUNT = ASSIGN_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements <em>Scope Information Statements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getScopeInformationStatements()
	 * @generated
	 */
	public static final int SCOPE_INFORMATION_STATEMENTS = 17;

	/**
	 * The feature id for the '<em><b>Enter Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCOPE_INFORMATION_STATEMENTS__ENTER_METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Leave Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCOPE_INFORMATION_STATEMENTS__LEAVE_METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Scope Information Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCOPE_INFORMATION_STATEMENTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.BasicType <em>Basic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.BasicType
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getBasicType()
	 * @generated
	 */
	public static final int BASIC_TYPE = 18;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTypeNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignReferenceStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveObjectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeInformationStatementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customMainMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basicTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AstransformationPackage() {
		super(eNS_URI, ((EFactory)AstransformationFactory.INSTANCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AstransformationPackage init() {
		if (isInited) return (AstransformationPackage)EPackage.Registry.INSTANCE.getEPackage(AstransformationPackage.eNS_URI);

		// Obtain or create and register package
		AstransformationPackage theAstransformationPackage = (AstransformationPackage)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AstransformationPackage ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AstransformationPackage());

		isInited = true;

		// Create package meta-data objects
		theAstransformationPackage.createPackageContents();

		// Initialize created meta-data
		theAstransformationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAstransformationPackage.freeze();

		return theAstransformationPackage;
	}


	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Named
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Typed
	 * @generated
	 */
	public EClass getTyped() {
		return typedEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Typed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Typed#getType()
	 * @see #getTyped()
	 * @generated
	 */
	public EReference getTyped_Type() {
		return (EReference)typedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.TypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.TypeName
	 * @generated
	 */
	public EClass getTypeName() {
		return typeNameEClass;
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.ClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ClassName
	 * @generated
	 */
	public EClass getClassName() {
		return classNameEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.ClassName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ClassName#getName()
	 * @see #getClassName()
	 * @generated
	 */
	public EAttribute getClassName_Name() {
		return (EAttribute)classNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.BasicTypeName <em>Basic Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.BasicTypeName
	 * @generated
	 */
	public EClass getBasicTypeName() {
		return basicTypeNameEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.BasicTypeName#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.BasicTypeName#getType()
	 * @see #getBasicTypeName()
	 * @generated
	 */
	public EAttribute getBasicTypeName_Type() {
		return (EAttribute)basicTypeNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Rules</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getMappingRules()
	 * @see #getTransformation()
	 * @generated
	 */
	public EReference getTransformation_MappingRules() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getMain()
	 * @see #getTransformation()
	 * @generated
	 */
	public EReference getTransformation_Main() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getCustomMain <em>Custom Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Main</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getCustomMain()
	 * @see #getTransformation()
	 * @generated
	 */
	public EReference getTransformation_CustomMain() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getResolverClassName <em>Resolver Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getResolverClassName()
	 * @see #getTransformation()
	 * @generated
	 */
	public EAttribute getTransformation_ResolverClassName() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getTraceClassName <em>Trace Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getTraceClassName()
	 * @see #getTransformation()
	 * @generated
	 */
	public EAttribute getTransformation_TraceClassName() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getSwitchClassName <em>Switch Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getSwitchClassName()
	 * @see #getTransformation()
	 * @generated
	 */
	public EReference getTransformation_SwitchClassName() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Parameter
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.MappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule
	 * @generated
	 */
	public EClass getMappingRule() {
		return mappingRuleEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryClassName <em>Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factory Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryClassName()
	 * @see #getMappingRule()
	 * @generated
	 */
	public EReference getMappingRule_FactoryClassName() {
		return (EReference)mappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryMethodName <em>Factory Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryMethodName()
	 * @see #getMappingRule()
	 * @generated
	 */
	public EAttribute getMappingRule_FactoryMethodName() {
		return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignAttributeStatements <em>Assign Attribute Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign Attribute Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignAttributeStatements()
	 * @see #getMappingRule()
	 * @generated
	 */
	public EReference getMappingRule_AssignAttributeStatements() {
		return (EReference)mappingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignReferenceStatements <em>Assign Reference Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign Reference Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignReferenceStatements()
	 * @see #getMappingRule()
	 * @generated
	 */
	public EReference getMappingRule_AssignReferenceStatements() {
		return (EReference)mappingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getWriteTraceStatement <em>Write Trace Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Write Trace Statement</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getWriteTraceStatement()
	 * @see #getMappingRule()
	 * @generated
	 */
	public EReference getMappingRule_WriteTraceStatement() {
		return (EReference)mappingRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getScopeInformationStatements <em>Scope Information Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope Information Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getScopeInformationStatements()
	 * @see #getMappingRule()
	 * @generated
	 */
	public EReference getMappingRule_ScopeInformationStatements() {
		return (EReference)mappingRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.AssignReferenceStatement <em>Assign Reference Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Reference Statement</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReferenceStatement
	 * @generated
	 */
	public EClass getAssignReferenceStatement() {
		return assignReferenceStatementEClass;
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.ResolveObjects <em>Resolve Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Objects</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObjects
	 * @generated
	 */
	public EClass getResolveObjects() {
		return resolveObjectsEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransformation.ResolveObjects#getResolveObjectStatements <em>Resolve Object Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolve Object Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObjects#getResolveObjectStatements()
	 * @see #getResolveObjects()
	 * @generated
	 */
	public EReference getResolveObjects_ResolveObjectStatements() {
		return (EReference)resolveObjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getResolveObjectStatements <em>Resolve Object Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolve Object Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getResolveObjectStatements()
	 * @see #getMappingRule()
	 * @generated
	 */
	public EReference getMappingRule_ResolveObjectStatements() {
		return (EReference)mappingRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature <em>Assign Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Feature</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature
	 * @generated
	 */
	public EClass getAssignFeature() {
		return assignFeatureEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#getSetterName <em>Setter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setter Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature#getSetterName()
	 * @see #getAssignFeature()
	 * @generated
	 */
	public EAttribute getAssignFeature_SetterName() {
		return (EAttribute)assignFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#getGetterName <em>Getter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature#getGetterName()
	 * @see #getAssignFeature()
	 * @generated
	 */
	public EAttribute getAssignFeature_GetterName() {
		return (EAttribute)assignFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature#isMany()
	 * @see #getAssignFeature()
	 * @generated
	 */
	public EAttribute getAssignFeature_Many() {
		return (EAttribute)assignFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.AssignAttribute <em>Assign Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Attribute</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignAttribute
	 * @generated
	 */
	public EClass getAssignAttribute() {
		return assignAttributeEClass;
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.AssignReference <em>Assign Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Reference</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReference
	 * @generated
	 */
	public EClass getAssignReference() {
		return assignReferenceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.AssignReference#isMappingNeeded <em>Mapping Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Needed</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReference#isMappingNeeded()
	 * @see #getAssignReference()
	 * @generated
	 */
	public EAttribute getAssignReference_MappingNeeded() {
		return (EAttribute)assignReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace <em>Write Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Trace</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.WriteTrace
	 * @generated
	 */
	public EClass getWriteTrace() {
		return writeTraceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace#getTraceMethodName <em>Trace Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.WriteTrace#getTraceMethodName()
	 * @see #getWriteTrace()
	 * @generated
	 */
	public EAttribute getWriteTrace_TraceMethodName() {
		return (EAttribute)writeTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject <em>Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Object</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject
	 * @generated
	 */
	public EClass getResolveObject() {
		return resolveObjectEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getResolverMethodName <em>Resolver Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject#getResolverMethodName()
	 * @see #getResolveObject()
	 * @generated
	 */
	public EAttribute getResolveObject_ResolverMethodName() {
		return (EAttribute)resolveObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterType()
	 * @see #getResolveObject()
	 * @generated
	 */
	public EReference getResolveObject_ParameterType() {
		return (EReference)resolveObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterName()
	 * @see #getResolveObject()
	 * @generated
	 */
	public EAttribute getResolveObject_ParameterName() {
		return (EAttribute)resolveObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements <em>Scope Information Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Information Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements
	 * @generated
	 */
	public EClass getScopeInformationStatements() {
		return scopeInformationStatementsEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements#getEnterMethodName <em>Enter Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enter Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements#getEnterMethodName()
	 * @see #getScopeInformationStatements()
	 * @generated
	 */
	public EAttribute getScopeInformationStatements_EnterMethodName() {
		return (EAttribute)scopeInformationStatementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements#getLeaveMethodName <em>Leave Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leave Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements#getLeaveMethodName()
	 * @see #getScopeInformationStatements()
	 * @generated
	 */
	public EAttribute getScopeInformationStatements_LeaveMethodName() {
		return (EAttribute)scopeInformationStatementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Method
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Method#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Method#getParameter()
	 * @see #getMethod()
	 * @generated
	 */
	public EReference getMethod_Parameter() {
		return (EReference)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Method#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Method#getResult()
	 * @see #getMethod()
	 * @generated
	 */
	public EReference getMethod_Result() {
		return (EReference)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.CustomMainMethod <em>Custom Main Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Main Method</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.CustomMainMethod
	 * @generated
	 */
	public EClass getCustomMainMethod() {
		return customMainMethodEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.CustomMainMethod#getResolverMethodName <em>Resolver Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.CustomMainMethod#getResolverMethodName()
	 * @see #getCustomMainMethod()
	 * @generated
	 */
	public EAttribute getCustomMainMethod_ResolverMethodName() {
		return (EAttribute)customMainMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ru.ifmo.rain.astrans.astransformation.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.BasicType
	 * @generated
	 */
	public EEnum getBasicType() {
		return basicTypeEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public AstransformationFactory getAstransformationFactory() {
		return (AstransformationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		typedEClass = createEClass(TYPED);
		createEReference(typedEClass, TYPED__TYPE);

		typeNameEClass = createEClass(TYPE_NAME);

		classNameEClass = createEClass(CLASS_NAME);
		createEAttribute(classNameEClass, CLASS_NAME__NAME);

		basicTypeNameEClass = createEClass(BASIC_TYPE_NAME);
		createEAttribute(basicTypeNameEClass, BASIC_TYPE_NAME__TYPE);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__MAPPING_RULES);
		createEReference(transformationEClass, TRANSFORMATION__MAIN);
		createEReference(transformationEClass, TRANSFORMATION__CUSTOM_MAIN);
		createEAttribute(transformationEClass, TRANSFORMATION__RESOLVER_CLASS_NAME);
		createEAttribute(transformationEClass, TRANSFORMATION__TRACE_CLASS_NAME);
		createEReference(transformationEClass, TRANSFORMATION__SWITCH_CLASS_NAME);

		parameterEClass = createEClass(PARAMETER);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__PARAMETER);
		createEReference(methodEClass, METHOD__RESULT);

		customMainMethodEClass = createEClass(CUSTOM_MAIN_METHOD);
		createEAttribute(customMainMethodEClass, CUSTOM_MAIN_METHOD__RESOLVER_METHOD_NAME);

		mappingRuleEClass = createEClass(MAPPING_RULE);
		createEReference(mappingRuleEClass, MAPPING_RULE__FACTORY_CLASS_NAME);
		createEAttribute(mappingRuleEClass, MAPPING_RULE__FACTORY_METHOD_NAME);
		createEReference(mappingRuleEClass, MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS);
		createEReference(mappingRuleEClass, MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS);
		createEReference(mappingRuleEClass, MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS);
		createEReference(mappingRuleEClass, MAPPING_RULE__WRITE_TRACE_STATEMENT);
		createEReference(mappingRuleEClass, MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS);

		assignReferenceStatementEClass = createEClass(ASSIGN_REFERENCE_STATEMENT);

		resolveObjectsEClass = createEClass(RESOLVE_OBJECTS);
		createEReference(resolveObjectsEClass, RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS);

		assignFeatureEClass = createEClass(ASSIGN_FEATURE);
		createEAttribute(assignFeatureEClass, ASSIGN_FEATURE__SETTER_NAME);
		createEAttribute(assignFeatureEClass, ASSIGN_FEATURE__GETTER_NAME);
		createEAttribute(assignFeatureEClass, ASSIGN_FEATURE__MANY);

		assignAttributeEClass = createEClass(ASSIGN_ATTRIBUTE);

		assignReferenceEClass = createEClass(ASSIGN_REFERENCE);
		createEAttribute(assignReferenceEClass, ASSIGN_REFERENCE__MAPPING_NEEDED);

		writeTraceEClass = createEClass(WRITE_TRACE);
		createEAttribute(writeTraceEClass, WRITE_TRACE__TRACE_METHOD_NAME);

		resolveObjectEClass = createEClass(RESOLVE_OBJECT);
		createEAttribute(resolveObjectEClass, RESOLVE_OBJECT__RESOLVER_METHOD_NAME);
		createEReference(resolveObjectEClass, RESOLVE_OBJECT__PARAMETER_TYPE);
		createEAttribute(resolveObjectEClass, RESOLVE_OBJECT__PARAMETER_NAME);

		scopeInformationStatementsEClass = createEClass(SCOPE_INFORMATION_STATEMENTS);
		createEAttribute(scopeInformationStatementsEClass, SCOPE_INFORMATION_STATEMENTS__ENTER_METHOD_NAME);
		createEAttribute(scopeInformationStatementsEClass, SCOPE_INFORMATION_STATEMENTS__LEAVE_METHOD_NAME);

		// Create enums
		basicTypeEEnum = createEEnum(BASIC_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		classNameEClass.getESuperTypes().add(this.getTypeName());
		basicTypeNameEClass.getESuperTypes().add(this.getTypeName());
		transformationEClass.getESuperTypes().add(this.getNamed());
		parameterEClass.getESuperTypes().add(this.getNamed());
		parameterEClass.getESuperTypes().add(this.getTyped());
		methodEClass.getESuperTypes().add(this.getNamed());
		customMainMethodEClass.getESuperTypes().add(this.getMethod());
		mappingRuleEClass.getESuperTypes().add(this.getMethod());
		resolveObjectsEClass.getESuperTypes().add(this.getAssignReferenceStatement());
		assignAttributeEClass.getESuperTypes().add(this.getAssignFeature());
		assignReferenceEClass.getESuperTypes().add(this.getAssignFeature());
		assignReferenceEClass.getESuperTypes().add(this.getTyped());
		assignReferenceEClass.getESuperTypes().add(this.getAssignReferenceStatement());
		resolveObjectEClass.getESuperTypes().add(this.getAssignFeature());
		resolveObjectEClass.getESuperTypes().add(this.getTyped());

		// Initialize classes and features; add operations and parameters
		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 1, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedEClass, Typed.class, "Typed", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTyped_Type(), this.getClassName(), null, "type", null, 1, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeNameEClass, TypeName.class, "TypeName", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classNameEClass, ClassName.class, "ClassName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassName_Name(), ecorePackage.getEString(), "name", null, 1, 1, ClassName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicTypeNameEClass, BasicTypeName.class, "BasicTypeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicTypeName_Type(), this.getBasicType(), "type", null, 0, 1, BasicTypeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_MappingRules(), this.getMappingRule(), null, "mappingRules", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Main(), this.getMappingRule(), null, "main", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_CustomMain(), this.getCustomMainMethod(), null, "customMain", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_ResolverClassName(), ecorePackage.getEString(), "resolverClassName", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_TraceClassName(), ecorePackage.getEString(), "traceClassName", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_SwitchClassName(), this.getClassName(), null, "switchClassName", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethod_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Result(), this.getParameter(), null, "result", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customMainMethodEClass, CustomMainMethod.class, "CustomMainMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomMainMethod_ResolverMethodName(), ecorePackage.getEString(), "resolverMethodName", null, 1, 1, CustomMainMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingRuleEClass, MappingRule.class, "MappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingRule_FactoryClassName(), this.getClassName(), null, "factoryClassName", null, 1, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingRule_FactoryMethodName(), ecorePackage.getEString(), "factoryMethodName", null, 1, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingRule_AssignAttributeStatements(), this.getAssignAttribute(), null, "assignAttributeStatements", null, 0, -1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingRule_AssignReferenceStatements(), this.getAssignReferenceStatement(), null, "assignReferenceStatements", null, 0, -1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingRule_ResolveObjectStatements(), this.getResolveObject(), null, "resolveObjectStatements", null, 0, -1, MappingRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMappingRule_WriteTraceStatement(), this.getWriteTrace(), null, "writeTraceStatement", null, 1, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingRule_ScopeInformationStatements(), this.getScopeInformationStatements(), null, "scopeInformationStatements", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignReferenceStatementEClass, AssignReferenceStatement.class, "AssignReferenceStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resolveObjectsEClass, ResolveObjects.class, "ResolveObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolveObjects_ResolveObjectStatements(), this.getResolveObject(), null, "resolveObjectStatements", null, 1, -1, ResolveObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignFeatureEClass, AssignFeature.class, "AssignFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignFeature_SetterName(), ecorePackage.getEString(), "setterName", null, 1, 1, AssignFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignFeature_GetterName(), ecorePackage.getEString(), "getterName", null, 1, 1, AssignFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignFeature_Many(), ecorePackage.getEBoolean(), "many", "false", 0, 1, AssignFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignAttributeEClass, AssignAttribute.class, "AssignAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignReferenceEClass, AssignReference.class, "AssignReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignReference_MappingNeeded(), ecorePackage.getEBoolean(), "mappingNeeded", "true", 0, 1, AssignReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeTraceEClass, WriteTrace.class, "WriteTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWriteTrace_TraceMethodName(), ecorePackage.getEString(), "traceMethodName", null, 1, 1, WriteTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolveObjectEClass, ResolveObject.class, "ResolveObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResolveObject_ResolverMethodName(), ecorePackage.getEString(), "resolverMethodName", null, 1, 1, ResolveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolveObject_ParameterType(), this.getTypeName(), null, "parameterType", null, 1, 1, ResolveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveObject_ParameterName(), ecorePackage.getEString(), "parameterName", null, 1, 1, ResolveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeInformationStatementsEClass, ScopeInformationStatements.class, "ScopeInformationStatements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScopeInformationStatements_EnterMethodName(), ecorePackage.getEString(), "enterMethodName", null, 1, 1, ScopeInformationStatements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeInformationStatements_LeaveMethodName(), ecorePackage.getEString(), "leaveMethodName", null, 1, 1, ScopeInformationStatements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(basicTypeEEnum, BasicType.class, "BasicType");
		addEEnumLiteral(basicTypeEEnum, BasicType.INT_LITERAL);
		addEEnumLiteral(basicTypeEEnum, BasicType.BYTE_LITERAL);
		addEEnumLiteral(basicTypeEEnum, BasicType.CHAR_LITERAL);
		addEEnumLiteral(basicTypeEEnum, BasicType.SHORT_LITERAL);
		addEEnumLiteral(basicTypeEEnum, BasicType.LONG_LITERAL);
		addEEnumLiteral(basicTypeEEnum, BasicType.FLOAT_LITERAL);
		addEEnumLiteral(basicTypeEEnum, BasicType.DOUBLE_LITERAL);
		addEEnumLiteral(basicTypeEEnum, BasicType.BOOLEAN_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.Named
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getNamed()
		 * @generated
		 */
		public static final EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.Typed <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.Typed
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTyped()
		 * @generated
		 */
		public static final EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TYPED__TYPE = eINSTANCE.getTyped_Type();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.TypeName <em>Type Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.TypeName
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTypeName()
		 * @generated
		 */
		public static final EClass TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.ClassName <em>Class Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.ClassName
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getClassName()
		 * @generated
		 */
		public static final EClass CLASS_NAME = eINSTANCE.getClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CLASS_NAME__NAME = eINSTANCE.getClassName_Name();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.BasicTypeName <em>Basic Type Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.BasicTypeName
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getBasicTypeName()
		 * @generated
		 */
		public static final EClass BASIC_TYPE_NAME = eINSTANCE.getBasicTypeName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASIC_TYPE_NAME__TYPE = eINSTANCE.getBasicTypeName_Type();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.Transformation <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.Transformation
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getTransformation()
		 * @generated
		 */
		public static final EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Mapping Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMATION__MAPPING_RULES = eINSTANCE.getTransformation_MappingRules();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMATION__MAIN = eINSTANCE.getTransformation_Main();

		/**
		 * The meta object literal for the '<em><b>Custom Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMATION__CUSTOM_MAIN = eINSTANCE.getTransformation_CustomMain();

		/**
		 * The meta object literal for the '<em><b>Resolver Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMATION__RESOLVER_CLASS_NAME = eINSTANCE.getTransformation_ResolverClassName();

		/**
		 * The meta object literal for the '<em><b>Trace Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMATION__TRACE_CLASS_NAME = eINSTANCE.getTransformation_TraceClassName();

		/**
		 * The meta object literal for the '<em><b>Switch Class Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMATION__SWITCH_CLASS_NAME = eINSTANCE.getTransformation_SwitchClassName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.Parameter <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.Parameter
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getParameter()
		 * @generated
		 */
		public static final EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.MappingRule <em>Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.MappingRule
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMappingRule()
		 * @generated
		 */
		public static final EClass MAPPING_RULE = eINSTANCE.getMappingRule();

		/**
		 * The meta object literal for the '<em><b>Factory Class Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPING_RULE__FACTORY_CLASS_NAME = eINSTANCE.getMappingRule_FactoryClassName();

		/**
		 * The meta object literal for the '<em><b>Factory Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAPPING_RULE__FACTORY_METHOD_NAME = eINSTANCE.getMappingRule_FactoryMethodName();

		/**
		 * The meta object literal for the '<em><b>Assign Attribute Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS = eINSTANCE.getMappingRule_AssignAttributeStatements();

		/**
		 * The meta object literal for the '<em><b>Assign Reference Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS = eINSTANCE.getMappingRule_AssignReferenceStatements();

		/**
		 * The meta object literal for the '<em><b>Write Trace Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPING_RULE__WRITE_TRACE_STATEMENT = eINSTANCE.getMappingRule_WriteTraceStatement();

		/**
		 * The meta object literal for the '<em><b>Scope Information Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPING_RULE__SCOPE_INFORMATION_STATEMENTS = eINSTANCE.getMappingRule_ScopeInformationStatements();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.AssignReferenceStatement <em>Assign Reference Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.AssignReferenceStatement
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignReferenceStatement()
		 * @generated
		 */
		public static final EClass ASSIGN_REFERENCE_STATEMENT = eINSTANCE.getAssignReferenceStatement();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObjects <em>Resolve Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.ResolveObjects
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getResolveObjects()
		 * @generated
		 */
		public static final EClass RESOLVE_OBJECTS = eINSTANCE.getResolveObjects();

		/**
		 * The meta object literal for the '<em><b>Resolve Object Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESOLVE_OBJECTS__RESOLVE_OBJECT_STATEMENTS = eINSTANCE.getResolveObjects_ResolveObjectStatements();

		/**
		 * The meta object literal for the '<em><b>Resolve Object Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS = eINSTANCE.getMappingRule_ResolveObjectStatements();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature <em>Assign Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignFeature()
		 * @generated
		 */
		public static final EClass ASSIGN_FEATURE = eINSTANCE.getAssignFeature();

		/**
		 * The meta object literal for the '<em><b>Setter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSIGN_FEATURE__SETTER_NAME = eINSTANCE.getAssignFeature_SetterName();

		/**
		 * The meta object literal for the '<em><b>Getter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSIGN_FEATURE__GETTER_NAME = eINSTANCE.getAssignFeature_GetterName();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSIGN_FEATURE__MANY = eINSTANCE.getAssignFeature_Many();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.AssignAttribute <em>Assign Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.AssignAttribute
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignAttribute()
		 * @generated
		 */
		public static final EClass ASSIGN_ATTRIBUTE = eINSTANCE.getAssignAttribute();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.AssignReference <em>Assign Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.AssignReference
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getAssignReference()
		 * @generated
		 */
		public static final EClass ASSIGN_REFERENCE = eINSTANCE.getAssignReference();

		/**
		 * The meta object literal for the '<em><b>Mapping Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSIGN_REFERENCE__MAPPING_NEEDED = eINSTANCE.getAssignReference_MappingNeeded();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace <em>Write Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.WriteTrace
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getWriteTrace()
		 * @generated
		 */
		public static final EClass WRITE_TRACE = eINSTANCE.getWriteTrace();

		/**
		 * The meta object literal for the '<em><b>Trace Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WRITE_TRACE__TRACE_METHOD_NAME = eINSTANCE.getWriteTrace_TraceMethodName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject <em>Resolve Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getResolveObject()
		 * @generated
		 */
		public static final EClass RESOLVE_OBJECT = eINSTANCE.getResolveObject();

		/**
		 * The meta object literal for the '<em><b>Resolver Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESOLVE_OBJECT__RESOLVER_METHOD_NAME = eINSTANCE.getResolveObject_ResolverMethodName();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESOLVE_OBJECT__PARAMETER_TYPE = eINSTANCE.getResolveObject_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESOLVE_OBJECT__PARAMETER_NAME = eINSTANCE.getResolveObject_ParameterName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements <em>Scope Information Statements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.ScopeInformationStatements
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getScopeInformationStatements()
		 * @generated
		 */
		public static final EClass SCOPE_INFORMATION_STATEMENTS = eINSTANCE.getScopeInformationStatements();

		/**
		 * The meta object literal for the '<em><b>Enter Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SCOPE_INFORMATION_STATEMENTS__ENTER_METHOD_NAME = eINSTANCE.getScopeInformationStatements_EnterMethodName();

		/**
		 * The meta object literal for the '<em><b>Leave Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SCOPE_INFORMATION_STATEMENTS__LEAVE_METHOD_NAME = eINSTANCE.getScopeInformationStatements_LeaveMethodName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.Method <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.Method
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getMethod()
		 * @generated
		 */
		public static final EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METHOD__PARAMETER = eINSTANCE.getMethod_Parameter();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METHOD__RESULT = eINSTANCE.getMethod_Result();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.CustomMainMethod <em>Custom Main Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.CustomMainMethod
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getCustomMainMethod()
		 * @generated
		 */
		public static final EClass CUSTOM_MAIN_METHOD = eINSTANCE.getCustomMainMethod();

		/**
		 * The meta object literal for the '<em><b>Resolver Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CUSTOM_MAIN_METHOD__RESOLVER_METHOD_NAME = eINSTANCE.getCustomMainMethod_ResolverMethodName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.BasicType <em>Basic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.BasicType
		 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage#getBasicType()
		 * @generated
		 */
		public static final EEnum BASIC_TYPE = eINSTANCE.getBasicType();

	}

} //AstransformationPackage
