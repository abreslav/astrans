/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign.impl;

import assign.AbstractFeatureAssignment;
import assign.AssignFactory;
import assign.AssignModel;
import assign.AssignPackage;
import assign.Assignment;
import assign.BooleanLiteral;
import assign.CopyObject;
import assign.CreateInstance;
import assign.DynamicEClassReference;
import assign.EClassReference;
import assign.EObjectReference;
import assign.EnumLiteral;
import assign.Expression;
import assign.FeatureAccess;
import assign.ManyFeatureAppend;
import assign.SingleFeatureAssignment;
import assign.StaticEClassReference;
import assign.StringLiteral;
import assign.Variable;
import assign.VariableAssignment;

import assign.util.AssignValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignPackageImpl extends EPackageImpl implements AssignPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyFeatureAppendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFeatureAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticEClassReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicEClassReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

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
	 * @see assign.AssignPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssignPackageImpl() {
		super(eNS_URI, AssignFactory.eINSTANCE);
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
	public static AssignPackage init() {
		if (isInited) return (AssignPackage)EPackage.Registry.INSTANCE.getEPackage(AssignPackage.eNS_URI);

		// Obtain or create and register package
		AssignPackageImpl theAssignPackage = (AssignPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AssignPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AssignPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAssignPackage.createPackageContents();

		// Initialize created meta-data
		theAssignPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAssignPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AssignValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAssignPackage.freeze();

		return theAssignPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignModel() {
		return assignModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignModel_Assignments() {
		return (EReference)assignModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Expression() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignment() {
		return variableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAssignment_VariableName() {
		return (EAttribute)variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureAssignment() {
		return abstractFeatureAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureAssignment_Object() {
		return (EReference)abstractFeatureAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyFeatureAppend() {
		return manyFeatureAppendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFeatureAssignment() {
		return singleFeatureAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Type() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_VariableAssignment() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureAccess() {
		return featureAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureAccess_Object() {
		return (EReference)featureAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureAccess_Feature() {
		return (EReference)featureAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectReference() {
		return eObjectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectReference_Object() {
		return (EReference)eObjectReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateInstance() {
		return createInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateInstance_EClassReference() {
		return (EReference)createInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassReference() {
		return eClassReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassReference_Type() {
		return (EReference)eClassReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticEClassReference() {
		return staticEClassReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticEClassReference_EClass() {
		return (EReference)staticEClassReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicEClassReference() {
		return dynamicEClassReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicEClassReference_EClass() {
		return (EReference)dynamicEClassReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyObject() {
		return copyObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyObject_Object() {
		return (EReference)copyObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_Value() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteral_Literal() {
		return (EReference)enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignFactory getAssignFactory() {
		return (AssignFactory)getEFactoryInstance();
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
		assignModelEClass = createEClass(ASSIGN_MODEL);
		createEReference(assignModelEClass, ASSIGN_MODEL__ASSIGNMENTS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__EXPRESSION);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEAttribute(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VARIABLE_NAME);

		abstractFeatureAssignmentEClass = createEClass(ABSTRACT_FEATURE_ASSIGNMENT);
		createEReference(abstractFeatureAssignmentEClass, ABSTRACT_FEATURE_ASSIGNMENT__OBJECT);

		manyFeatureAppendEClass = createEClass(MANY_FEATURE_APPEND);

		singleFeatureAssignmentEClass = createEClass(SINGLE_FEATURE_ASSIGNMENT);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__TYPE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__VARIABLE_ASSIGNMENT);

		featureAccessEClass = createEClass(FEATURE_ACCESS);
		createEReference(featureAccessEClass, FEATURE_ACCESS__OBJECT);
		createEReference(featureAccessEClass, FEATURE_ACCESS__FEATURE);

		eObjectReferenceEClass = createEClass(EOBJECT_REFERENCE);
		createEReference(eObjectReferenceEClass, EOBJECT_REFERENCE__OBJECT);

		createInstanceEClass = createEClass(CREATE_INSTANCE);
		createEReference(createInstanceEClass, CREATE_INSTANCE__ECLASS_REFERENCE);

		eClassReferenceEClass = createEClass(ECLASS_REFERENCE);
		createEReference(eClassReferenceEClass, ECLASS_REFERENCE__TYPE);

		staticEClassReferenceEClass = createEClass(STATIC_ECLASS_REFERENCE);
		createEReference(staticEClassReferenceEClass, STATIC_ECLASS_REFERENCE__ECLASS);

		dynamicEClassReferenceEClass = createEClass(DYNAMIC_ECLASS_REFERENCE);
		createEReference(dynamicEClassReferenceEClass, DYNAMIC_ECLASS_REFERENCE__ECLASS);

		copyObjectEClass = createEClass(COPY_OBJECT);
		createEReference(copyObjectEClass, COPY_OBJECT__OBJECT);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEReference(enumLiteralEClass, ENUM_LITERAL__LITERAL);
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
		variableAssignmentEClass.getESuperTypes().add(this.getAssignment());
		abstractFeatureAssignmentEClass.getESuperTypes().add(this.getAssignment());
		manyFeatureAppendEClass.getESuperTypes().add(this.getAbstractFeatureAssignment());
		singleFeatureAssignmentEClass.getESuperTypes().add(this.getAbstractFeatureAssignment());
		variableEClass.getESuperTypes().add(this.getExpression());
		featureAccessEClass.getESuperTypes().add(this.getExpression());
		eObjectReferenceEClass.getESuperTypes().add(this.getExpression());
		createInstanceEClass.getESuperTypes().add(this.getExpression());
		staticEClassReferenceEClass.getESuperTypes().add(this.getEClassReference());
		dynamicEClassReferenceEClass.getESuperTypes().add(this.getEClassReference());
		copyObjectEClass.getESuperTypes().add(this.getExpression());
		stringLiteralEClass.getESuperTypes().add(this.getExpression());
		booleanLiteralEClass.getESuperTypes().add(this.getExpression());
		enumLiteralEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(assignModelEClass, AssignModel.class, "AssignModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignModel_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, AssignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Expression(), this.getExpression(), null, "expression", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableAssignment_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFeatureAssignmentEClass, AbstractFeatureAssignment.class, "AbstractFeatureAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFeatureAssignment_Object(), this.getFeatureAccess(), null, "object", null, 1, 1, AbstractFeatureAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyFeatureAppendEClass, ManyFeatureAppend.class, "ManyFeatureAppend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleFeatureAssignmentEClass, SingleFeatureAssignment.class, "SingleFeatureAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Type(), ecorePackage.getEClassifier(), null, "type", null, 1, 1, Expression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_VariableAssignment(), this.getVariableAssignment(), null, "variableAssignment", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureAccessEClass, FeatureAccess.class, "FeatureAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureAccess_Object(), this.getExpression(), null, "object", null, 1, 1, FeatureAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureAccess_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, FeatureAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectReferenceEClass, EObjectReference.class, "EObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectReference_Object(), ecorePackage.getEObject(), null, "object", null, 1, 1, EObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createInstanceEClass, CreateInstance.class, "CreateInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateInstance_EClassReference(), this.getEClassReference(), null, "eClassReference", null, 1, 1, CreateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassReferenceEClass, EClassReference.class, "EClassReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassReference_Type(), ecorePackage.getEClassifier(), null, "type", null, 1, 1, EClassReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(staticEClassReferenceEClass, StaticEClassReference.class, "StaticEClassReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticEClassReference_EClass(), ecorePackage.getEClass(), null, "eClass", null, 1, 1, StaticEClassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicEClassReferenceEClass, DynamicEClassReference.class, "DynamicEClassReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicEClassReference_EClass(), this.getExpression(), null, "eClass", null, 1, 1, DynamicEClassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyObjectEClass, CopyObject.class, "CopyObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCopyObject_Object(), this.getExpression(), null, "object", null, 1, 1, CopyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumLiteral_Literal(), ecorePackage.getEEnumLiteral(), null, "literal", null, 1, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (variableAssignmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "VariableNameIsNotDefinedBefore"
		   });		
		addAnnotation
		  (abstractFeatureAssignmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "FeatureIsChangeable"
		   });		
		addAnnotation
		  (abstractFeatureAssignmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "TypesAreCompatible"
		   });		
		addAnnotation
		  (manyFeatureAppendEClass, 
		   source, 
		   new String[] {
			 "constraints", "FeatureIsMany"
		   });		
		addAnnotation
		  (singleFeatureAssignmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "FeatureIsNotMany"
		   });		
		addAnnotation
		  (featureAccessEClass, 
		   source, 
		   new String[] {
			 "constraints", "FeatureBelongsToObjectType"
		   });		
		addAnnotation
		  (dynamicEClassReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ExpressionEvaluatesToAClass"
		   });
	}

} //AssignPackageImpl
