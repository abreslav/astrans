/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

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
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationFactory
 * @model kind="package"
 * @generated
 */
public interface AstransformationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "astransformation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rain.ifmo.ru/~breslav/2007/astransformation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "astransformation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstransformationPackage eINSTANCE = ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.Named
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.ClassNameImpl <em>Class Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.ClassNameImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getClassName()
	 * @generated
	 */
	int CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Class Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_NAME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MAPPING_RULES = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MAIN = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolver Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RESOLVER_CLASS_NAME = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRACE_CLASS_NAME = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Switch Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SWITCH_CLASS_NAME = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.ParameterImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.MappingRuleImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getMappingRule()
	 * @generated
	 */
	int MAPPING_RULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__PARAMETER = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__RESULT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Factory Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__FACTORY_CLASS_NAME = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Factory Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__FACTORY_METHOD_NAME = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assign Attribute Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assign Reference Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Write Trace Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__WRITE_TRACE_STATEMENT = NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resolve Object Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS = NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.AssignFeatureImpl <em>Assign Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AssignFeatureImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getAssignFeature()
	 * @generated
	 */
	int ASSIGN_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE__SETTER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE__GETTER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE__MANY = 2;

	/**
	 * The number of structural features of the '<em>Assign Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.AssignAttributeImpl <em>Assign Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AssignAttributeImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getAssignAttribute()
	 * @generated
	 */
	int ASSIGN_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_ATTRIBUTE__SETTER_NAME = ASSIGN_FEATURE__SETTER_NAME;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_ATTRIBUTE__GETTER_NAME = ASSIGN_FEATURE__GETTER_NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_ATTRIBUTE__MANY = ASSIGN_FEATURE__MANY;

	/**
	 * The number of structural features of the '<em>Assign Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_ATTRIBUTE_FEATURE_COUNT = ASSIGN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.AssignReferenceImpl <em>Assign Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AssignReferenceImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getAssignReference()
	 * @generated
	 */
	int ASSIGN_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_REFERENCE__SETTER_NAME = ASSIGN_FEATURE__SETTER_NAME;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_REFERENCE__GETTER_NAME = ASSIGN_FEATURE__GETTER_NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_REFERENCE__MANY = ASSIGN_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_REFERENCE__TYPE = ASSIGN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_REFERENCE__MAPPING_NEEDED = ASSIGN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_REFERENCE_FEATURE_COUNT = ASSIGN_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.WriteTraceImpl <em>Write Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.WriteTraceImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getWriteTrace()
	 * @generated
	 */
	int WRITE_TRACE = 8;

	/**
	 * The feature id for the '<em><b>Trace Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_TRACE__TRACE_METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Write Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_TRACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.impl.ResolveObjectImpl <em>Resolve Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.impl.ResolveObjectImpl
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getResolveObject()
	 * @generated
	 */
	int RESOLVE_OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT__SETTER_NAME = ASSIGN_FEATURE__SETTER_NAME;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT__GETTER_NAME = ASSIGN_FEATURE__GETTER_NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT__MANY = ASSIGN_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT__TYPE = ASSIGN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT__PARAMETER_TYPE = ASSIGN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolver Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT__RESOLVER_METHOD_NAME = ASSIGN_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resolve Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT_FEATURE_COUNT = ASSIGN_FEATURE_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransformation.Typed <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransformation.Typed
	 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getTyped()
	 * @generated
	 */
	int TYPED = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.ClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ClassName
	 * @generated
	 */
	EClass getClassName();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.ClassName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ClassName#getName()
	 * @see #getClassName()
	 * @generated
	 */
	EAttribute getClassName_Name();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Rules</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getMappingRules()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_MappingRules();

	/**
	 * Returns the meta object for the reference '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getMain()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Main();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getResolverClassName <em>Resolver Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolver Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getResolverClassName()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_ResolverClassName();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getTraceClassName <em>Trace Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getTraceClassName()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_TraceClassName();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Transformation#getSwitchClassName <em>Switch Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation#getSwitchClassName()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_SwitchClassName();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.MappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule
	 * @generated
	 */
	EClass getMappingRule();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getParameter()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getResult()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_Result();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryClassName <em>Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factory Class Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryClassName()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_FactoryClassName();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryMethodName <em>Factory Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getFactoryMethodName()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_FactoryMethodName();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignAttributeStatements <em>Assign Attribute Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign Attribute Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignAttributeStatements()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_AssignAttributeStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignReferenceStatements <em>Assign Reference Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign Reference Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getAssignReferenceStatements()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_AssignReferenceStatements();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getWriteTraceStatement <em>Write Trace Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Write Trace Statement</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getWriteTraceStatement()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_WriteTraceStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransformation.MappingRule#getResolveObjectStatements <em>Resolve Object Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolve Object Statements</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule#getResolveObjectStatements()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_ResolveObjectStatements();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature <em>Assign Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Feature</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature
	 * @generated
	 */
	EClass getAssignFeature();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#getSetterName <em>Setter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setter Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature#getSetterName()
	 * @see #getAssignFeature()
	 * @generated
	 */
	EAttribute getAssignFeature_SetterName();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#getGetterName <em>Getter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature#getGetterName()
	 * @see #getAssignFeature()
	 * @generated
	 */
	EAttribute getAssignFeature_GetterName();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature#isMany()
	 * @see #getAssignFeature()
	 * @generated
	 */
	EAttribute getAssignFeature_Many();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.AssignAttribute <em>Assign Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Attribute</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignAttribute
	 * @generated
	 */
	EClass getAssignAttribute();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.AssignReference <em>Assign Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Reference</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReference
	 * @generated
	 */
	EClass getAssignReference();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.AssignReference#isMappingNeeded <em>Mapping Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Needed</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReference#isMappingNeeded()
	 * @see #getAssignReference()
	 * @generated
	 */
	EAttribute getAssignReference_MappingNeeded();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace <em>Write Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Trace</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.WriteTrace
	 * @generated
	 */
	EClass getWriteTrace();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace#getTraceMethodName <em>Trace Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.WriteTrace#getTraceMethodName()
	 * @see #getWriteTrace()
	 * @generated
	 */
	EAttribute getWriteTrace_TraceMethodName();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject <em>Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Object</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject
	 * @generated
	 */
	EClass getResolveObject();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject#getParameterType()
	 * @see #getResolveObject()
	 * @generated
	 */
	EReference getResolveObject_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject#getResolverMethodName <em>Resolver Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver Method Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject#getResolverMethodName()
	 * @see #getResolveObject()
	 * @generated
	 */
	EAttribute getResolveObject_ResolverMethodName();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransformation.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Typed
	 * @generated
	 */
	EClass getTyped();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransformation.Typed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransformation.Typed#getType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AstransformationFactory getAstransformationFactory();

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
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.Named
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.ClassNameImpl <em>Class Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.ClassNameImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getClassName()
		 * @generated
		 */
		EClass CLASS_NAME = eINSTANCE.getClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_NAME__NAME = eINSTANCE.getClassName_Name();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.TransformationImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Mapping Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__MAPPING_RULES = eINSTANCE.getTransformation_MappingRules();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__MAIN = eINSTANCE.getTransformation_Main();

		/**
		 * The meta object literal for the '<em><b>Resolver Class Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RESOLVER_CLASS_NAME = eINSTANCE.getTransformation_ResolverClassName();

		/**
		 * The meta object literal for the '<em><b>Trace Class Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TRACE_CLASS_NAME = eINSTANCE.getTransformation_TraceClassName();

		/**
		 * The meta object literal for the '<em><b>Switch Class Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__SWITCH_CLASS_NAME = eINSTANCE.getTransformation_SwitchClassName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.ParameterImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.MappingRuleImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getMappingRule()
		 * @generated
		 */
		EClass MAPPING_RULE = eINSTANCE.getMappingRule();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__PARAMETER = eINSTANCE.getMappingRule_Parameter();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__RESULT = eINSTANCE.getMappingRule_Result();

		/**
		 * The meta object literal for the '<em><b>Factory Class Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__FACTORY_CLASS_NAME = eINSTANCE.getMappingRule_FactoryClassName();

		/**
		 * The meta object literal for the '<em><b>Factory Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__FACTORY_METHOD_NAME = eINSTANCE.getMappingRule_FactoryMethodName();

		/**
		 * The meta object literal for the '<em><b>Assign Attribute Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__ASSIGN_ATTRIBUTE_STATEMENTS = eINSTANCE.getMappingRule_AssignAttributeStatements();

		/**
		 * The meta object literal for the '<em><b>Assign Reference Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__ASSIGN_REFERENCE_STATEMENTS = eINSTANCE.getMappingRule_AssignReferenceStatements();

		/**
		 * The meta object literal for the '<em><b>Write Trace Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__WRITE_TRACE_STATEMENT = eINSTANCE.getMappingRule_WriteTraceStatement();

		/**
		 * The meta object literal for the '<em><b>Resolve Object Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__RESOLVE_OBJECT_STATEMENTS = eINSTANCE.getMappingRule_ResolveObjectStatements();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.AssignFeatureImpl <em>Assign Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AssignFeatureImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getAssignFeature()
		 * @generated
		 */
		EClass ASSIGN_FEATURE = eINSTANCE.getAssignFeature();

		/**
		 * The meta object literal for the '<em><b>Setter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN_FEATURE__SETTER_NAME = eINSTANCE.getAssignFeature_SetterName();

		/**
		 * The meta object literal for the '<em><b>Getter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN_FEATURE__GETTER_NAME = eINSTANCE.getAssignFeature_GetterName();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN_FEATURE__MANY = eINSTANCE.getAssignFeature_Many();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.AssignAttributeImpl <em>Assign Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AssignAttributeImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getAssignAttribute()
		 * @generated
		 */
		EClass ASSIGN_ATTRIBUTE = eINSTANCE.getAssignAttribute();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.AssignReferenceImpl <em>Assign Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AssignReferenceImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getAssignReference()
		 * @generated
		 */
		EClass ASSIGN_REFERENCE = eINSTANCE.getAssignReference();

		/**
		 * The meta object literal for the '<em><b>Mapping Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN_REFERENCE__MAPPING_NEEDED = eINSTANCE.getAssignReference_MappingNeeded();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.WriteTraceImpl <em>Write Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.WriteTraceImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getWriteTrace()
		 * @generated
		 */
		EClass WRITE_TRACE = eINSTANCE.getWriteTrace();

		/**
		 * The meta object literal for the '<em><b>Trace Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITE_TRACE__TRACE_METHOD_NAME = eINSTANCE.getWriteTrace_TraceMethodName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.impl.ResolveObjectImpl <em>Resolve Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.impl.ResolveObjectImpl
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getResolveObject()
		 * @generated
		 */
		EClass RESOLVE_OBJECT = eINSTANCE.getResolveObject();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_OBJECT__PARAMETER_TYPE = eINSTANCE.getResolveObject_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Resolver Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_OBJECT__RESOLVER_METHOD_NAME = eINSTANCE.getResolveObject_ResolverMethodName();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransformation.Typed <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransformation.Typed
		 * @see ru.ifmo.rain.astrans.astransformation.impl.AstransformationPackageImpl#getTyped()
		 * @generated
		 */
		EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__TYPE = eINSTANCE.getTyped_Type();

	}

} //AstransformationPackage
