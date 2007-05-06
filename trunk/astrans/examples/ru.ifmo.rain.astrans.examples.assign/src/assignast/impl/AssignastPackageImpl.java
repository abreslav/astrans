/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.impl;

import assignast.AbstractFeatureAssignmentAS;
import assignast.AssignModelAS;
import assignast.AssignastFactory;
import assignast.AssignastPackage;
import assignast.AssignmentAS;
import assignast.BooleanLiteralAS;
import assignast.CopyObjectAS;
import assignast.CreateInstanceAS;
import assignast.DynamicEClassReferenceAS;
import assignast.EClassDesignator;
import assignast.EClassReferenceAS;
import assignast.EEnumLiteralDesignator;
import assignast.EObjectReferenceAS;
import assignast.EcoreObjectDesignator;
import assignast.EnumLiteralAS;
import assignast.ExpressionAS;
import assignast.FeatureAccessAS;
import assignast.Import;
import assignast.ManyFeatureAppendAS;
import assignast.SingleFeatureAssignmentAS;
import assignast.StaticEClassReferenceAS;
import assignast.StringLiteralAS;
import assignast.Unit;
import assignast.VariableAS;
import assignast.VariableAssignmentAS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignastPackageImpl extends EPackageImpl implements AssignastPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignModelASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureAssignmentASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyFeatureAppendASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFeatureAssignmentASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureAccessASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectReferenceASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createInstanceASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassReferenceASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticEClassReferenceASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicEClassReferenceASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyObjectASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassDesignatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreObjectDesignatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumLiteralDesignatorEClass = null;

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
	 * @see assignast.AssignastPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssignastPackageImpl() {
		super(eNS_URI, AssignastFactory.eINSTANCE);
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
	public static AssignastPackage init() {
		if (isInited) return (AssignastPackage)EPackage.Registry.INSTANCE.getEPackage(AssignastPackage.eNS_URI);

		// Obtain or create and register package
		AssignastPackageImpl theAssignastPackage = (AssignastPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AssignastPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AssignastPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAssignastPackage.createPackageContents();

		// Initialize created meta-data
		theAssignastPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssignastPackage.freeze();

		return theAssignastPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignModelAS() {
		return assignModelASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignModelAS_Assignments() {
		return (EReference)assignModelASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentAS() {
		return assignmentASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentAS_Expression() {
		return (EReference)assignmentASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignmentAS() {
		return variableAssignmentASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAssignmentAS_VariableName() {
		return (EAttribute)variableAssignmentASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAssignmentAS_Returned() {
		return (EAttribute)variableAssignmentASEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureAssignmentAS() {
		return abstractFeatureAssignmentASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureAssignmentAS_Object() {
		return (EReference)abstractFeatureAssignmentASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyFeatureAppendAS() {
		return manyFeatureAppendASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFeatureAssignmentAS() {
		return singleFeatureAssignmentASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionAS() {
		return expressionASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAS() {
		return variableASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAS_VariableAssignment() {
		return (EAttribute)variableASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureAccessAS() {
		return featureAccessASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureAccessAS_Object() {
		return (EReference)featureAccessASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureAccessAS_Feature() {
		return (EAttribute)featureAccessASEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectReferenceAS() {
		return eObjectReferenceASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectReferenceAS_Object() {
		return (EReference)eObjectReferenceASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateInstanceAS() {
		return createInstanceASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateInstanceAS_EClassReference() {
		return (EReference)createInstanceASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassReferenceAS() {
		return eClassReferenceASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticEClassReferenceAS() {
		return staticEClassReferenceASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticEClassReferenceAS_EClass() {
		return (EReference)staticEClassReferenceASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicEClassReferenceAS() {
		return dynamicEClassReferenceASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicEClassReferenceAS_EClass() {
		return (EReference)dynamicEClassReferenceASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyObjectAS() {
		return copyObjectASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyObjectAS_Object() {
		return (EReference)copyObjectASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteralAS() {
		return stringLiteralASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteralAS_Value() {
		return (EAttribute)stringLiteralASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteralAS() {
		return booleanLiteralASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteralAS_Value() {
		return (EAttribute)booleanLiteralASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteralAS() {
		return enumLiteralASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteralAS_Literal() {
		return (EReference)enumLiteralASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Imports() {
		return (EReference)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Model() {
		return (EReference)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_PackageName() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_PackageUri() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassDesignator() {
		return eClassDesignatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassDesignator_Package() {
		return (EAttribute)eClassDesignatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassDesignator_Class() {
		return (EAttribute)eClassDesignatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreObjectDesignator() {
		return ecoreObjectDesignatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreObjectDesignator_Package() {
		return (EAttribute)ecoreObjectDesignatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreObjectDesignator_Class() {
		return (EAttribute)ecoreObjectDesignatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreObjectDesignator_Feature() {
		return (EAttribute)ecoreObjectDesignatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnumLiteralDesignator() {
		return eEnumLiteralDesignatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteralDesignator_Package() {
		return (EAttribute)eEnumLiteralDesignatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteralDesignator_Enum() {
		return (EAttribute)eEnumLiteralDesignatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteralDesignator_Literal() {
		return (EAttribute)eEnumLiteralDesignatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignastFactory getAssignastFactory() {
		return (AssignastFactory)getEFactoryInstance();
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
		assignModelASEClass = createEClass(ASSIGN_MODEL_AS);
		createEReference(assignModelASEClass, ASSIGN_MODEL_AS__ASSIGNMENTS);

		assignmentASEClass = createEClass(ASSIGNMENT_AS);
		createEReference(assignmentASEClass, ASSIGNMENT_AS__EXPRESSION);

		variableAssignmentASEClass = createEClass(VARIABLE_ASSIGNMENT_AS);
		createEAttribute(variableAssignmentASEClass, VARIABLE_ASSIGNMENT_AS__VARIABLE_NAME);
		createEAttribute(variableAssignmentASEClass, VARIABLE_ASSIGNMENT_AS__RETURNED);

		abstractFeatureAssignmentASEClass = createEClass(ABSTRACT_FEATURE_ASSIGNMENT_AS);
		createEReference(abstractFeatureAssignmentASEClass, ABSTRACT_FEATURE_ASSIGNMENT_AS__OBJECT);

		manyFeatureAppendASEClass = createEClass(MANY_FEATURE_APPEND_AS);

		singleFeatureAssignmentASEClass = createEClass(SINGLE_FEATURE_ASSIGNMENT_AS);

		expressionASEClass = createEClass(EXPRESSION_AS);

		variableASEClass = createEClass(VARIABLE_AS);
		createEAttribute(variableASEClass, VARIABLE_AS__VARIABLE_ASSIGNMENT);

		featureAccessASEClass = createEClass(FEATURE_ACCESS_AS);
		createEReference(featureAccessASEClass, FEATURE_ACCESS_AS__OBJECT);
		createEAttribute(featureAccessASEClass, FEATURE_ACCESS_AS__FEATURE);

		eObjectReferenceASEClass = createEClass(EOBJECT_REFERENCE_AS);
		createEReference(eObjectReferenceASEClass, EOBJECT_REFERENCE_AS__OBJECT);

		createInstanceASEClass = createEClass(CREATE_INSTANCE_AS);
		createEReference(createInstanceASEClass, CREATE_INSTANCE_AS__ECLASS_REFERENCE);

		eClassReferenceASEClass = createEClass(ECLASS_REFERENCE_AS);

		staticEClassReferenceASEClass = createEClass(STATIC_ECLASS_REFERENCE_AS);
		createEReference(staticEClassReferenceASEClass, STATIC_ECLASS_REFERENCE_AS__ECLASS);

		dynamicEClassReferenceASEClass = createEClass(DYNAMIC_ECLASS_REFERENCE_AS);
		createEReference(dynamicEClassReferenceASEClass, DYNAMIC_ECLASS_REFERENCE_AS__ECLASS);

		copyObjectASEClass = createEClass(COPY_OBJECT_AS);
		createEReference(copyObjectASEClass, COPY_OBJECT_AS__OBJECT);

		stringLiteralASEClass = createEClass(STRING_LITERAL_AS);
		createEAttribute(stringLiteralASEClass, STRING_LITERAL_AS__VALUE);

		booleanLiteralASEClass = createEClass(BOOLEAN_LITERAL_AS);
		createEAttribute(booleanLiteralASEClass, BOOLEAN_LITERAL_AS__VALUE);

		enumLiteralASEClass = createEClass(ENUM_LITERAL_AS);
		createEReference(enumLiteralASEClass, ENUM_LITERAL_AS__LITERAL);

		unitEClass = createEClass(UNIT);
		createEReference(unitEClass, UNIT__IMPORTS);
		createEReference(unitEClass, UNIT__MODEL);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__PACKAGE_NAME);
		createEAttribute(importEClass, IMPORT__PACKAGE_URI);

		eClassDesignatorEClass = createEClass(ECLASS_DESIGNATOR);
		createEAttribute(eClassDesignatorEClass, ECLASS_DESIGNATOR__PACKAGE);
		createEAttribute(eClassDesignatorEClass, ECLASS_DESIGNATOR__CLASS);

		ecoreObjectDesignatorEClass = createEClass(ECORE_OBJECT_DESIGNATOR);
		createEAttribute(ecoreObjectDesignatorEClass, ECORE_OBJECT_DESIGNATOR__PACKAGE);
		createEAttribute(ecoreObjectDesignatorEClass, ECORE_OBJECT_DESIGNATOR__CLASS);
		createEAttribute(ecoreObjectDesignatorEClass, ECORE_OBJECT_DESIGNATOR__FEATURE);

		eEnumLiteralDesignatorEClass = createEClass(EENUM_LITERAL_DESIGNATOR);
		createEAttribute(eEnumLiteralDesignatorEClass, EENUM_LITERAL_DESIGNATOR__PACKAGE);
		createEAttribute(eEnumLiteralDesignatorEClass, EENUM_LITERAL_DESIGNATOR__ENUM);
		createEAttribute(eEnumLiteralDesignatorEClass, EENUM_LITERAL_DESIGNATOR__LITERAL);
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
		variableAssignmentASEClass.getESuperTypes().add(this.getAssignmentAS());
		abstractFeatureAssignmentASEClass.getESuperTypes().add(this.getAssignmentAS());
		manyFeatureAppendASEClass.getESuperTypes().add(this.getAbstractFeatureAssignmentAS());
		singleFeatureAssignmentASEClass.getESuperTypes().add(this.getAbstractFeatureAssignmentAS());
		variableASEClass.getESuperTypes().add(this.getExpressionAS());
		featureAccessASEClass.getESuperTypes().add(this.getExpressionAS());
		eObjectReferenceASEClass.getESuperTypes().add(this.getExpressionAS());
		createInstanceASEClass.getESuperTypes().add(this.getExpressionAS());
		staticEClassReferenceASEClass.getESuperTypes().add(this.getEClassReferenceAS());
		dynamicEClassReferenceASEClass.getESuperTypes().add(this.getEClassReferenceAS());
		copyObjectASEClass.getESuperTypes().add(this.getExpressionAS());
		stringLiteralASEClass.getESuperTypes().add(this.getExpressionAS());
		booleanLiteralASEClass.getESuperTypes().add(this.getExpressionAS());
		enumLiteralASEClass.getESuperTypes().add(this.getExpressionAS());

		// Initialize classes and features; add operations and parameters
		initEClass(assignModelASEClass, AssignModelAS.class, "AssignModelAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignModelAS_Assignments(), this.getAssignmentAS(), null, "assignments", null, 0, -1, AssignModelAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentASEClass, AssignmentAS.class, "AssignmentAS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentAS_Expression(), this.getExpressionAS(), null, "expression", null, 1, 1, AssignmentAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentASEClass, VariableAssignmentAS.class, "VariableAssignmentAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableAssignmentAS_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, VariableAssignmentAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableAssignmentAS_Returned(), ecorePackage.getEBoolean(), "returned", "false", 0, 1, VariableAssignmentAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFeatureAssignmentASEClass, AbstractFeatureAssignmentAS.class, "AbstractFeatureAssignmentAS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFeatureAssignmentAS_Object(), this.getFeatureAccessAS(), null, "object", null, 1, 1, AbstractFeatureAssignmentAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyFeatureAppendASEClass, ManyFeatureAppendAS.class, "ManyFeatureAppendAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleFeatureAssignmentASEClass, SingleFeatureAssignmentAS.class, "SingleFeatureAssignmentAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionASEClass, ExpressionAS.class, "ExpressionAS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableASEClass, VariableAS.class, "VariableAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableAS_VariableAssignment(), ecorePackage.getEString(), "variableAssignment", null, 1, 1, VariableAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureAccessASEClass, FeatureAccessAS.class, "FeatureAccessAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureAccessAS_Object(), this.getExpressionAS(), null, "object", null, 1, 1, FeatureAccessAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureAccessAS_Feature(), ecorePackage.getEString(), "feature", null, 1, 1, FeatureAccessAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectReferenceASEClass, EObjectReferenceAS.class, "EObjectReferenceAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectReferenceAS_Object(), this.getEcoreObjectDesignator(), null, "object", null, 1, 1, EObjectReferenceAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createInstanceASEClass, CreateInstanceAS.class, "CreateInstanceAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateInstanceAS_EClassReference(), this.getEClassReferenceAS(), null, "eClassReference", null, 1, 1, CreateInstanceAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassReferenceASEClass, EClassReferenceAS.class, "EClassReferenceAS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticEClassReferenceASEClass, StaticEClassReferenceAS.class, "StaticEClassReferenceAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticEClassReferenceAS_EClass(), this.getEClassDesignator(), null, "eClass", null, 1, 1, StaticEClassReferenceAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicEClassReferenceASEClass, DynamicEClassReferenceAS.class, "DynamicEClassReferenceAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicEClassReferenceAS_EClass(), this.getExpressionAS(), null, "eClass", null, 1, 1, DynamicEClassReferenceAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyObjectASEClass, CopyObjectAS.class, "CopyObjectAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCopyObjectAS_Object(), this.getExpressionAS(), null, "object", null, 1, 1, CopyObjectAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralASEClass, StringLiteralAS.class, "StringLiteralAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteralAS_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringLiteralAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralASEClass, BooleanLiteralAS.class, "BooleanLiteralAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteralAS_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanLiteralAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralASEClass, EnumLiteralAS.class, "EnumLiteralAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumLiteralAS_Literal(), this.getEEnumLiteralDesignator(), null, "literal", null, 1, 1, EnumLiteralAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Imports(), this.getImport(), null, "imports", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Model(), this.getAssignModelAS(), null, "model", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_PackageName(), ecorePackage.getEString(), "packageName", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_PackageUri(), ecorePackage.getEString(), "packageUri", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassDesignatorEClass, EClassDesignator.class, "EClassDesignator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClassDesignator_Package(), ecorePackage.getEString(), "package", null, 1, 1, EClassDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassDesignator_Class(), ecorePackage.getEString(), "class", null, 1, 1, EClassDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecoreObjectDesignatorEClass, EcoreObjectDesignator.class, "EcoreObjectDesignator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcoreObjectDesignator_Package(), ecorePackage.getEString(), "package", null, 1, 1, EcoreObjectDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreObjectDesignator_Class(), ecorePackage.getEString(), "class", null, 0, 1, EcoreObjectDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreObjectDesignator_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, EcoreObjectDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumLiteralDesignatorEClass, EEnumLiteralDesignator.class, "EEnumLiteralDesignator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEnumLiteralDesignator_Package(), ecorePackage.getEString(), "package", null, 1, 1, EEnumLiteralDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEnumLiteralDesignator_Enum(), ecorePackage.getEString(), "enum", null, 1, 1, EEnumLiteralDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEnumLiteralDesignator_Literal(), ecorePackage.getEString(), "literal", null, 1, 1, EEnumLiteralDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AssignastPackageImpl
