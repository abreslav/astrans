/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.backtrans.dependencies;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.ifmo.rain.astrans.backtrans.dependencies.util.DependenciesValidator;

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
 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesFactory
 * @generated
 */
public class DependenciesPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "dependencies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://rain.ifmo.ru/~breslav/2007/backtrans/dependencies";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "btd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DependenciesPackage eINSTANCE = ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage.init();

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel <em>Dependency Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage#getDependencyModel()
	 * @generated
	 */
	public static final int DEPENDENCY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_MODEL__CONTEXTS = 0;

	/**
	 * The number of structural features of the '<em>Dependency Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext <em>EClass Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage#getEClassContext()
	 * @generated
	 */
	public static final int ECLASS_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECLASS_CONTEXT__ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Providing Scope Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECLASS_CONTEXT__PROVIDING_SCOPE_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECLASS_CONTEXT__DEPENDENCIES = 2;

	/**
	 * The number of structural features of the '<em>EClass Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECLASS_CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency <em>Feature Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage#getFeatureDependency()
	 * @generated
	 */
	public static final int FEATURE_DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_DEPENDENCY__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_DEPENDENCY__DEPENDS_ON = 1;

	/**
	 * The number of structural features of the '<em>Feature Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureDependencyEClass = null;

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
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DependenciesPackage() {
		super(eNS_URI, ((EFactory)DependenciesFactory.INSTANCE));
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
	public static DependenciesPackage init() {
		if (isInited) return (DependenciesPackage)EPackage.Registry.INSTANCE.getEPackage(DependenciesPackage.eNS_URI);

		// Obtain or create and register package
		DependenciesPackage theDependenciesPackage = (DependenciesPackage)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DependenciesPackage ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DependenciesPackage());

		isInited = true;

		// Create package meta-data objects
		theDependenciesPackage.createPackageContents();

		// Initialize created meta-data
		theDependenciesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDependenciesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DependenciesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDependenciesPackage.freeze();

		return theDependenciesPackage;
	}


	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel <em>Dependency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Model</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel
	 * @generated
	 */
	public EClass getDependencyModel() {
		return dependencyModelEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel#getContexts()
	 * @see #getDependencyModel()
	 * @generated
	 */
	public EReference getDependencyModel_Contexts() {
		return (EReference)dependencyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext <em>EClass Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Context</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext
	 * @generated
	 */
	public EClass getEClassContext() {
		return eClassContextEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#getEClass()
	 * @see #getEClassContext()
	 * @generated
	 */
	public EReference getEClassContext_EClass() {
		return (EReference)eClassContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#isProvidingScopeInformation <em>Providing Scope Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Providing Scope Information</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#isProvidingScopeInformation()
	 * @see #getEClassContext()
	 * @generated
	 */
	public EAttribute getEClassContext_ProvidingScopeInformation() {
		return (EAttribute)eClassContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext#getDependencies()
	 * @see #getEClassContext()
	 * @generated
	 */
	public EReference getEClassContext_Dependencies() {
		return (EReference)eClassContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency <em>Feature Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Dependency</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency
	 * @generated
	 */
	public EClass getFeatureDependency() {
		return featureDependencyEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency#getReference()
	 * @see #getFeatureDependency()
	 * @generated
	 */
	public EReference getFeatureDependency_Reference() {
		return (EReference)featureDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency#getDependsOn()
	 * @see #getFeatureDependency()
	 * @generated
	 */
	public EReference getFeatureDependency_DependsOn() {
		return (EReference)featureDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public DependenciesFactory getDependenciesFactory() {
		return (DependenciesFactory)getEFactoryInstance();
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
		dependencyModelEClass = createEClass(DEPENDENCY_MODEL);
		createEReference(dependencyModelEClass, DEPENDENCY_MODEL__CONTEXTS);

		eClassContextEClass = createEClass(ECLASS_CONTEXT);
		createEReference(eClassContextEClass, ECLASS_CONTEXT__ECLASS);
		createEAttribute(eClassContextEClass, ECLASS_CONTEXT__PROVIDING_SCOPE_INFORMATION);
		createEReference(eClassContextEClass, ECLASS_CONTEXT__DEPENDENCIES);

		featureDependencyEClass = createEClass(FEATURE_DEPENDENCY);
		createEReference(featureDependencyEClass, FEATURE_DEPENDENCY__REFERENCE);
		createEReference(featureDependencyEClass, FEATURE_DEPENDENCY__DEPENDS_ON);
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

		// Initialize classes and features; add operations and parameters
		initEClass(dependencyModelEClass, DependencyModel.class, "DependencyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyModel_Contexts(), this.getEClassContext(), null, "contexts", null, 0, -1, DependencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassContextEClass, EClassContext.class, "EClassContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassContext_EClass(), ecorePackage.getEClass(), null, "eClass", null, 1, 1, EClassContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassContext_ProvidingScopeInformation(), ecorePackage.getEBoolean(), "providingScopeInformation", "false", 0, 1, EClassContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassContext_Dependencies(), this.getFeatureDependency(), null, "dependencies", null, 0, -1, EClassContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureDependencyEClass, FeatureDependency.class, "FeatureDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureDependency_Reference(), ecorePackage.getEReference(), null, "reference", null, 1, 1, FeatureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureDependency_DependsOn(), ecorePackage.getEReference(), null, "dependsOn", null, 0, -1, FeatureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (eClassContextEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllFeaturesBelongToAClass"
		   });
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
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel <em>Dependency Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel
		 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage#getDependencyModel()
		 * @generated
		 */
		public static final EClass DEPENDENCY_MODEL = eINSTANCE.getDependencyModel();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEPENDENCY_MODEL__CONTEXTS = eINSTANCE.getDependencyModel_Contexts();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext <em>EClass Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext
		 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage#getEClassContext()
		 * @generated
		 */
		public static final EClass ECLASS_CONTEXT = eINSTANCE.getEClassContext();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ECLASS_CONTEXT__ECLASS = eINSTANCE.getEClassContext_EClass();

		/**
		 * The meta object literal for the '<em><b>Providing Scope Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ECLASS_CONTEXT__PROVIDING_SCOPE_INFORMATION = eINSTANCE.getEClassContext_ProvidingScopeInformation();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ECLASS_CONTEXT__DEPENDENCIES = eINSTANCE.getEClassContext_Dependencies();

		/**
		 * The meta object literal for the '{@link ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency <em>Feature Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency
		 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage#getFeatureDependency()
		 * @generated
		 */
		public static final EClass FEATURE_DEPENDENCY = eINSTANCE.getFeatureDependency();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FEATURE_DEPENDENCY__REFERENCE = eINSTANCE.getFeatureDependency_Reference();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FEATURE_DEPENDENCY__DEPENDS_ON = eINSTANCE.getFeatureDependency_DependsOn();

	}

} //DependenciesPackage
