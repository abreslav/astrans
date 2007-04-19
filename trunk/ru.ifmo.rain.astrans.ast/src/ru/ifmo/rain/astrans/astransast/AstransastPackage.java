/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransast;

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
 * @see ru.ifmo.rain.astrans.astransast.AstransastFactory
 * @model kind="package"
 * @generated
 */
public interface AstransastPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "astransast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rain.ifmo.ru/~breslav/2007/astransast";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "astransast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstransastPackage eINSTANCE = ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.ActionASImpl <em>Action AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.ActionASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getActionAS()
	 * @generated
	 */
	int ACTION_AS = 0;

	/**
	 * The number of structural features of the '<em>Action AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.EClassifierReferenceASImpl <em>EClassifier Reference AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.EClassifierReferenceASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getEClassifierReferenceAS()
	 * @generated
	 */
	int ECLASSIFIER_REFERENCE_AS = 1;

	/**
	 * The number of structural features of the '<em>EClassifier Reference AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_REFERENCE_AS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.TranslateReferencesASImpl <em>Translate References AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.TranslateReferencesASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getTranslateReferencesAS()
	 * @generated
	 */
	int TRANSLATE_REFERENCES_AS = 2;

	/**
	 * The feature id for the '<em><b>Include Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_REFERENCES_AS__INCLUDE_DESCENDANTS = ACTION_AS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Reference Type Proto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_REFERENCES_AS__MODEL_REFERENCE_TYPE_PROTO = ACTION_AS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Textual Reference Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_REFERENCES_AS__TEXTUAL_REFERENCE_TYPE = ACTION_AS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Translate References AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_REFERENCES_AS_FEATURE_COUNT = ACTION_AS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.CreateClassASImpl <em>Create Class AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.CreateClassASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getCreateClassAS()
	 * @generated
	 */
	int CREATE_CLASS_AS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_AS__NAME = ACTION_AS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_AS__ABSTRACT = ACTION_AS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_AS__SUPERCLASSES = ACTION_AS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_AS__STRUCTURAL_FEATURES = ACTION_AS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Class AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_AS_FEATURE_COUNT = ACTION_AS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.StructuralFeatureASImpl <em>Structural Feature AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.StructuralFeatureASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getStructuralFeatureAS()
	 * @generated
	 */
	int STRUCTURAL_FEATURE_AS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_AS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_AS__LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_AS__UPPER_BOUND = 2;

	/**
	 * The number of structural features of the '<em>Structural Feature AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_AS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.AttributeASImpl <em>Attribute AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.AttributeASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getAttributeAS()
	 * @generated
	 */
	int ATTRIBUTE_AS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_AS__NAME = STRUCTURAL_FEATURE_AS__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_AS__LOWER_BOUND = STRUCTURAL_FEATURE_AS__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_AS__UPPER_BOUND = STRUCTURAL_FEATURE_AS__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_AS__TYPE = STRUCTURAL_FEATURE_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_AS_FEATURE_COUNT = STRUCTURAL_FEATURE_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.ReferenceASImpl <em>Reference AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.ReferenceASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getReferenceAS()
	 * @generated
	 */
	int REFERENCE_AS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AS__NAME = STRUCTURAL_FEATURE_AS__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AS__LOWER_BOUND = STRUCTURAL_FEATURE_AS__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AS__UPPER_BOUND = STRUCTURAL_FEATURE_AS__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AS__CONTAINMENT = STRUCTURAL_FEATURE_AS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AS__TYPE = STRUCTURAL_FEATURE_AS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AS_FEATURE_COUNT = STRUCTURAL_FEATURE_AS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.ChangeInheritanceASImpl <em>Change Inheritance AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.ChangeInheritanceASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getChangeInheritanceAS()
	 * @generated
	 */
	int CHANGE_INHERITANCE_AS = 7;

	/**
	 * The feature id for the '<em><b>Target Proto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INHERITANCE_AS__TARGET_PROTO = ACTION_AS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INHERITANCE_AS__SUPERCLASSES = ACTION_AS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Inheritance AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INHERITANCE_AS_FEATURE_COUNT = ACTION_AS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.SkipClassASImpl <em>Skip Class AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.SkipClassASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getSkipClassAS()
	 * @generated
	 */
	int SKIP_CLASS_AS = 8;

	/**
	 * The feature id for the '<em><b>Include Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_CLASS_AS__INCLUDE_DESCENDANTS = ACTION_AS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Proto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_CLASS_AS__TARGET_PROTO = ACTION_AS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skip Class AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_CLASS_AS_FEATURE_COUNT = ACTION_AS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.TransformationASImpl <em>Transformation AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.TransformationASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getTransformationAS()
	 * @generated
	 */
	int TRANSFORMATION_AS = 9;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__OUTPUT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Output Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__OUTPUT_NS_URI = 1;

	/**
	 * The feature id for the '<em><b>Create Class Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__CREATE_CLASS_ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Translate References Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__TRANSLATE_REFERENCES_ACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Change Inheritance Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__CHANGE_INHERITANCE_ACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Skip Class Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__SKIP_CLASS_ACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__INPUT = 6;

	/**
	 * The feature id for the '<em><b>Input Model Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__INPUT_MODEL_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Ast Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS__AST_ROOT = 8;

	/**
	 * The number of structural features of the '<em>Transformation AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_AS_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.MappedEClassASImpl <em>Mapped EClass AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.MappedEClassASImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getMappedEClassAS()
	 * @generated
	 */
	int MAPPED_ECLASS_AS = 10;

	/**
	 * The feature id for the '<em><b>Proto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ECLASS_AS__PROTO = ECLASSIFIER_REFERENCE_AS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapped EClass AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ECLASS_AS_FEATURE_COUNT = ECLASSIFIER_REFERENCE_AS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.QualifiedNameImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME__NAME = ECLASSIFIER_REFERENCE_AS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub QN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME__SUB_QN = ECLASSIFIER_REFERENCE_AS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualified Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_FEATURE_COUNT = ECLASSIFIER_REFERENCE_AS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.EPackageReferenceImpl <em>EPackage Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.EPackageReferenceImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getEPackageReference()
	 * @generated
	 */
	int EPACKAGE_REFERENCE = 12;

	/**
	 * The number of structural features of the '<em>EPackage Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.EPackageUriImpl <em>EPackage Uri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.EPackageUriImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getEPackageUri()
	 * @generated
	 */
	int EPACKAGE_URI = 13;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_URI__URI = EPACKAGE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EPackage Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_URI_FEATURE_COUNT = EPACKAGE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.astransast.impl.EPackagePathImpl <em>EPackage Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.astransast.impl.EPackagePathImpl
	 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getEPackagePath()
	 * @generated
	 */
	int EPACKAGE_PATH = 14;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_PATH__PATH = EPACKAGE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EPackage Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_PATH_FEATURE_COUNT = EPACKAGE_REFERENCE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.ActionAS <em>Action AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.ActionAS
	 * @generated
	 */
	EClass getActionAS();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS <em>EClassifier Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClassifier Reference AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.EClassifierReferenceAS
	 * @generated
	 */
	EClass getEClassifierReferenceAS();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS <em>Translate References AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translate References AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TranslateReferencesAS
	 * @generated
	 */
	EClass getTranslateReferencesAS();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#isIncludeDescendants <em>Include Descendants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Descendants</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#isIncludeDescendants()
	 * @see #getTranslateReferencesAS()
	 * @generated
	 */
	EAttribute getTranslateReferencesAS_IncludeDescendants();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#getModelReferenceTypeProto <em>Model Reference Type Proto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Reference Type Proto</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#getModelReferenceTypeProto()
	 * @see #getTranslateReferencesAS()
	 * @generated
	 */
	EReference getTranslateReferencesAS_ModelReferenceTypeProto();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#getTextualReferenceType <em>Textual Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textual Reference Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TranslateReferencesAS#getTextualReferenceType()
	 * @see #getTranslateReferencesAS()
	 * @generated
	 */
	EReference getTranslateReferencesAS_TextualReferenceType();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.CreateClassAS <em>Create Class AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Class AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.CreateClassAS
	 * @generated
	 */
	EClass getCreateClassAS();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.CreateClassAS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.CreateClassAS#getName()
	 * @see #getCreateClassAS()
	 * @generated
	 */
	EAttribute getCreateClassAS_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.CreateClassAS#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.CreateClassAS#isAbstract()
	 * @see #getCreateClassAS()
	 * @generated
	 */
	EAttribute getCreateClassAS_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransast.CreateClassAS#getSuperclasses <em>Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Superclasses</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.CreateClassAS#getSuperclasses()
	 * @see #getCreateClassAS()
	 * @generated
	 */
	EReference getCreateClassAS_Superclasses();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransast.CreateClassAS#getStructuralFeatures <em>Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structural Features</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.CreateClassAS#getStructuralFeatures()
	 * @see #getCreateClassAS()
	 * @generated
	 */
	EReference getCreateClassAS_StructuralFeatures();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.StructuralFeatureAS <em>Structural Feature AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.StructuralFeatureAS
	 * @generated
	 */
	EClass getStructuralFeatureAS();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.StructuralFeatureAS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.StructuralFeatureAS#getName()
	 * @see #getStructuralFeatureAS()
	 * @generated
	 */
	EAttribute getStructuralFeatureAS_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.StructuralFeatureAS#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.StructuralFeatureAS#getLowerBound()
	 * @see #getStructuralFeatureAS()
	 * @generated
	 */
	EAttribute getStructuralFeatureAS_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.StructuralFeatureAS#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.StructuralFeatureAS#getUpperBound()
	 * @see #getStructuralFeatureAS()
	 * @generated
	 */
	EAttribute getStructuralFeatureAS_UpperBound();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.AttributeAS <em>Attribute AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.AttributeAS
	 * @generated
	 */
	EClass getAttributeAS();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.AttributeAS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.AttributeAS#getType()
	 * @see #getAttributeAS()
	 * @generated
	 */
	EReference getAttributeAS_Type();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.ReferenceAS <em>Reference AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.ReferenceAS
	 * @generated
	 */
	EClass getReferenceAS();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.ReferenceAS#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.ReferenceAS#isContainment()
	 * @see #getReferenceAS()
	 * @generated
	 */
	EAttribute getReferenceAS_Containment();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.ReferenceAS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.ReferenceAS#getType()
	 * @see #getReferenceAS()
	 * @generated
	 */
	EReference getReferenceAS_Type();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS <em>Change Inheritance AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Inheritance AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS
	 * @generated
	 */
	EClass getChangeInheritanceAS();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS#getTargetProto <em>Target Proto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Proto</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS#getTargetProto()
	 * @see #getChangeInheritanceAS()
	 * @generated
	 */
	EReference getChangeInheritanceAS_TargetProto();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS#getSuperclasses <em>Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Superclasses</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS#getSuperclasses()
	 * @see #getChangeInheritanceAS()
	 * @generated
	 */
	EReference getChangeInheritanceAS_Superclasses();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.SkipClassAS <em>Skip Class AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skip Class AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.SkipClassAS
	 * @generated
	 */
	EClass getSkipClassAS();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.SkipClassAS#isIncludeDescendants <em>Include Descendants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Descendants</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.SkipClassAS#isIncludeDescendants()
	 * @see #getSkipClassAS()
	 * @generated
	 */
	EAttribute getSkipClassAS_IncludeDescendants();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.SkipClassAS#getTargetProto <em>Target Proto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Proto</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.SkipClassAS#getTargetProto()
	 * @see #getSkipClassAS()
	 * @generated
	 */
	EReference getSkipClassAS_TargetProto();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.TransformationAS <em>Transformation AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS
	 * @generated
	 */
	EClass getTransformationAS();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getOutputName <em>Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getOutputName()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EAttribute getTransformationAS_OutputName();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getOutputNsURI <em>Output Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Ns URI</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getOutputNsURI()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EAttribute getTransformationAS_OutputNsURI();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getCreateClassActions <em>Create Class Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Class Actions</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getCreateClassActions()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EReference getTransformationAS_CreateClassActions();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getTranslateReferencesActions <em>Translate References Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translate References Actions</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getTranslateReferencesActions()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EReference getTransformationAS_TranslateReferencesActions();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getChangeInheritanceActions <em>Change Inheritance Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Inheritance Actions</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getChangeInheritanceActions()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EReference getTransformationAS_ChangeInheritanceActions();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getSkipClassActions <em>Skip Class Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skip Class Actions</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getSkipClassActions()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EReference getTransformationAS_SkipClassActions();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getInput()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EReference getTransformationAS_Input();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getInputModelRoot <em>Input Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Model Root</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getInputModelRoot()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EReference getTransformationAS_InputModelRoot();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.TransformationAS#getAstRoot <em>Ast Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ast Root</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.TransformationAS#getAstRoot()
	 * @see #getTransformationAS()
	 * @generated
	 */
	EReference getTransformationAS_AstRoot();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.MappedEClassAS <em>Mapped EClass AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped EClass AS</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.MappedEClassAS
	 * @generated
	 */
	EClass getMappedEClassAS();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.MappedEClassAS#getProto <em>Proto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proto</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.MappedEClassAS#getProto()
	 * @see #getMappedEClassAS()
	 * @generated
	 */
	EReference getMappedEClassAS_Proto();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.QualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.QualifiedName
	 * @generated
	 */
	EClass getQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.QualifiedName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.QualifiedName#getName()
	 * @see #getQualifiedName()
	 * @generated
	 */
	EAttribute getQualifiedName_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ru.ifmo.rain.astrans.astransast.QualifiedName#getSubQN <em>Sub QN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub QN</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.QualifiedName#getSubQN()
	 * @see #getQualifiedName()
	 * @generated
	 */
	EReference getQualifiedName_SubQN();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.EPackageReference <em>EPackage Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Reference</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.EPackageReference
	 * @generated
	 */
	EClass getEPackageReference();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.EPackageUri <em>EPackage Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Uri</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.EPackageUri
	 * @generated
	 */
	EClass getEPackageUri();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.EPackageUri#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.EPackageUri#getUri()
	 * @see #getEPackageUri()
	 * @generated
	 */
	EAttribute getEPackageUri_Uri();

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.astransast.EPackagePath <em>EPackage Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Path</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.EPackagePath
	 * @generated
	 */
	EClass getEPackagePath();

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.astransast.EPackagePath#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ru.ifmo.rain.astrans.astransast.EPackagePath#getPath()
	 * @see #getEPackagePath()
	 * @generated
	 */
	EAttribute getEPackagePath_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AstransastFactory getAstransastFactory();

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
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.ActionASImpl <em>Action AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.ActionASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getActionAS()
		 * @generated
		 */
		EClass ACTION_AS = eINSTANCE.getActionAS();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.EClassifierReferenceASImpl <em>EClassifier Reference AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.EClassifierReferenceASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getEClassifierReferenceAS()
		 * @generated
		 */
		EClass ECLASSIFIER_REFERENCE_AS = eINSTANCE.getEClassifierReferenceAS();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.TranslateReferencesASImpl <em>Translate References AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.TranslateReferencesASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getTranslateReferencesAS()
		 * @generated
		 */
		EClass TRANSLATE_REFERENCES_AS = eINSTANCE.getTranslateReferencesAS();

		/**
		 * The meta object literal for the '<em><b>Include Descendants</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATE_REFERENCES_AS__INCLUDE_DESCENDANTS = eINSTANCE.getTranslateReferencesAS_IncludeDescendants();

		/**
		 * The meta object literal for the '<em><b>Model Reference Type Proto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATE_REFERENCES_AS__MODEL_REFERENCE_TYPE_PROTO = eINSTANCE.getTranslateReferencesAS_ModelReferenceTypeProto();

		/**
		 * The meta object literal for the '<em><b>Textual Reference Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATE_REFERENCES_AS__TEXTUAL_REFERENCE_TYPE = eINSTANCE.getTranslateReferencesAS_TextualReferenceType();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.CreateClassASImpl <em>Create Class AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.CreateClassASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getCreateClassAS()
		 * @generated
		 */
		EClass CREATE_CLASS_AS = eINSTANCE.getCreateClassAS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_CLASS_AS__NAME = eINSTANCE.getCreateClassAS_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_CLASS_AS__ABSTRACT = eINSTANCE.getCreateClassAS_Abstract();

		/**
		 * The meta object literal for the '<em><b>Superclasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_CLASS_AS__SUPERCLASSES = eINSTANCE.getCreateClassAS_Superclasses();

		/**
		 * The meta object literal for the '<em><b>Structural Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_CLASS_AS__STRUCTURAL_FEATURES = eINSTANCE.getCreateClassAS_StructuralFeatures();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.StructuralFeatureASImpl <em>Structural Feature AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.StructuralFeatureASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getStructuralFeatureAS()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE_AS = eINSTANCE.getStructuralFeatureAS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE_AS__NAME = eINSTANCE.getStructuralFeatureAS_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE_AS__LOWER_BOUND = eINSTANCE.getStructuralFeatureAS_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE_AS__UPPER_BOUND = eINSTANCE.getStructuralFeatureAS_UpperBound();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.AttributeASImpl <em>Attribute AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.AttributeASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getAttributeAS()
		 * @generated
		 */
		EClass ATTRIBUTE_AS = eINSTANCE.getAttributeAS();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_AS__TYPE = eINSTANCE.getAttributeAS_Type();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.ReferenceASImpl <em>Reference AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.ReferenceASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getReferenceAS()
		 * @generated
		 */
		EClass REFERENCE_AS = eINSTANCE.getReferenceAS();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AS__CONTAINMENT = eINSTANCE.getReferenceAS_Containment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_AS__TYPE = eINSTANCE.getReferenceAS_Type();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.ChangeInheritanceASImpl <em>Change Inheritance AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.ChangeInheritanceASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getChangeInheritanceAS()
		 * @generated
		 */
		EClass CHANGE_INHERITANCE_AS = eINSTANCE.getChangeInheritanceAS();

		/**
		 * The meta object literal for the '<em><b>Target Proto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_INHERITANCE_AS__TARGET_PROTO = eINSTANCE.getChangeInheritanceAS_TargetProto();

		/**
		 * The meta object literal for the '<em><b>Superclasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_INHERITANCE_AS__SUPERCLASSES = eINSTANCE.getChangeInheritanceAS_Superclasses();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.SkipClassASImpl <em>Skip Class AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.SkipClassASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getSkipClassAS()
		 * @generated
		 */
		EClass SKIP_CLASS_AS = eINSTANCE.getSkipClassAS();

		/**
		 * The meta object literal for the '<em><b>Include Descendants</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKIP_CLASS_AS__INCLUDE_DESCENDANTS = eINSTANCE.getSkipClassAS_IncludeDescendants();

		/**
		 * The meta object literal for the '<em><b>Target Proto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKIP_CLASS_AS__TARGET_PROTO = eINSTANCE.getSkipClassAS_TargetProto();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.TransformationASImpl <em>Transformation AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.TransformationASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getTransformationAS()
		 * @generated
		 */
		EClass TRANSFORMATION_AS = eINSTANCE.getTransformationAS();

		/**
		 * The meta object literal for the '<em><b>Output Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_AS__OUTPUT_NAME = eINSTANCE.getTransformationAS_OutputName();

		/**
		 * The meta object literal for the '<em><b>Output Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_AS__OUTPUT_NS_URI = eINSTANCE.getTransformationAS_OutputNsURI();

		/**
		 * The meta object literal for the '<em><b>Create Class Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_AS__CREATE_CLASS_ACTIONS = eINSTANCE.getTransformationAS_CreateClassActions();

		/**
		 * The meta object literal for the '<em><b>Translate References Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_AS__TRANSLATE_REFERENCES_ACTIONS = eINSTANCE.getTransformationAS_TranslateReferencesActions();

		/**
		 * The meta object literal for the '<em><b>Change Inheritance Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_AS__CHANGE_INHERITANCE_ACTIONS = eINSTANCE.getTransformationAS_ChangeInheritanceActions();

		/**
		 * The meta object literal for the '<em><b>Skip Class Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_AS__SKIP_CLASS_ACTIONS = eINSTANCE.getTransformationAS_SkipClassActions();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_AS__INPUT = eINSTANCE.getTransformationAS_Input();

		/**
		 * The meta object literal for the '<em><b>Input Model Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_AS__INPUT_MODEL_ROOT = eINSTANCE.getTransformationAS_InputModelRoot();

		/**
		 * The meta object literal for the '<em><b>Ast Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_AS__AST_ROOT = eINSTANCE.getTransformationAS_AstRoot();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.MappedEClassASImpl <em>Mapped EClass AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.MappedEClassASImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getMappedEClassAS()
		 * @generated
		 */
		EClass MAPPED_ECLASS_AS = eINSTANCE.getMappedEClassAS();

		/**
		 * The meta object literal for the '<em><b>Proto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_ECLASS_AS__PROTO = eINSTANCE.getMappedEClassAS_Proto();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.QualifiedNameImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getQualifiedName()
		 * @generated
		 */
		EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAME__NAME = eINSTANCE.getQualifiedName_Name();

		/**
		 * The meta object literal for the '<em><b>Sub QN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_NAME__SUB_QN = eINSTANCE.getQualifiedName_SubQN();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.EPackageReferenceImpl <em>EPackage Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.EPackageReferenceImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getEPackageReference()
		 * @generated
		 */
		EClass EPACKAGE_REFERENCE = eINSTANCE.getEPackageReference();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.EPackageUriImpl <em>EPackage Uri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.EPackageUriImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getEPackageUri()
		 * @generated
		 */
		EClass EPACKAGE_URI = eINSTANCE.getEPackageUri();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE_URI__URI = eINSTANCE.getEPackageUri_Uri();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.astransast.impl.EPackagePathImpl <em>EPackage Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.astransast.impl.EPackagePathImpl
		 * @see ru.ifmo.rain.astrans.astransast.impl.AstransastPackageImpl#getEPackagePath()
		 * @generated
		 */
		EClass EPACKAGE_PATH = eINSTANCE.getEPackagePath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE_PATH__PATH = eINSTANCE.getEPackagePath_Path();

	}

} //AstransastPackage
