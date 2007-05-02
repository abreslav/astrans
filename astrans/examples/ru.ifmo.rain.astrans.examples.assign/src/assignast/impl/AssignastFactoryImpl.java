/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.impl;

import assignast.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignastFactoryImpl extends EFactoryImpl implements AssignastFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignastFactory init() {
		try {
			AssignastFactory theAssignastFactory = (AssignastFactory)EPackage.Registry.INSTANCE.getEFactory("http://rain.ifmo.ru/~breslav/astrans/examples/2002/assign/ast"); 
			if (theAssignastFactory != null) {
				return theAssignastFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssignastFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignastFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssignastPackage.ASSIGN_MODEL_AS: return createAssignModelAS();
			case AssignastPackage.VARIABLE_ASSIGNMENT_AS: return createVariableAssignmentAS();
			case AssignastPackage.MANY_FEATURE_APPEND_AS: return createManyFeatureAppendAS();
			case AssignastPackage.SINGLE_FEATURE_ASSIGNMENT_AS: return createSingleFeatureAssignmentAS();
			case AssignastPackage.VARIABLE_AS: return createVariableAS();
			case AssignastPackage.FEATURE_ACCESS_AS: return createFeatureAccessAS();
			case AssignastPackage.EOBJECT_REFERENCE_AS: return createEObjectReferenceAS();
			case AssignastPackage.CREATE_INSTANCE_AS: return createCreateInstanceAS();
			case AssignastPackage.STATIC_ECLASS_REFERENCE_AS: return createStaticEClassReferenceAS();
			case AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS: return createDynamicEClassReferenceAS();
			case AssignastPackage.COPY_OBJECT_AS: return createCopyObjectAS();
			case AssignastPackage.STRING_LITERAL_AS: return createStringLiteralAS();
			case AssignastPackage.BOOLEAN_LITERAL_AS: return createBooleanLiteralAS();
			case AssignastPackage.ENUM_LITERAL_AS: return createEnumLiteralAS();
			case AssignastPackage.UNIT: return createUnit();
			case AssignastPackage.IMPORT: return createImport();
			case AssignastPackage.ECLASS_DESIGNATOR: return createEClassDesignator();
			case AssignastPackage.ECORE_OBJECT_DESIGNATOR: return createEcoreObjectDesignator();
			case AssignastPackage.EENUM_LITERAL_DESIGNATOR: return createEEnumLiteralDesignator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignModelAS createAssignModelAS() {
		AssignModelASImpl assignModelAS = new AssignModelASImpl();
		return assignModelAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentAS createVariableAssignmentAS() {
		VariableAssignmentASImpl variableAssignmentAS = new VariableAssignmentASImpl();
		return variableAssignmentAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyFeatureAppendAS createManyFeatureAppendAS() {
		ManyFeatureAppendASImpl manyFeatureAppendAS = new ManyFeatureAppendASImpl();
		return manyFeatureAppendAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFeatureAssignmentAS createSingleFeatureAssignmentAS() {
		SingleFeatureAssignmentASImpl singleFeatureAssignmentAS = new SingleFeatureAssignmentASImpl();
		return singleFeatureAssignmentAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAS createVariableAS() {
		VariableASImpl variableAS = new VariableASImpl();
		return variableAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAccessAS createFeatureAccessAS() {
		FeatureAccessASImpl featureAccessAS = new FeatureAccessASImpl();
		return featureAccessAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectReferenceAS createEObjectReferenceAS() {
		EObjectReferenceASImpl eObjectReferenceAS = new EObjectReferenceASImpl();
		return eObjectReferenceAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateInstanceAS createCreateInstanceAS() {
		CreateInstanceASImpl createInstanceAS = new CreateInstanceASImpl();
		return createInstanceAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticEClassReferenceAS createStaticEClassReferenceAS() {
		StaticEClassReferenceASImpl staticEClassReferenceAS = new StaticEClassReferenceASImpl();
		return staticEClassReferenceAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicEClassReferenceAS createDynamicEClassReferenceAS() {
		DynamicEClassReferenceASImpl dynamicEClassReferenceAS = new DynamicEClassReferenceASImpl();
		return dynamicEClassReferenceAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyObjectAS createCopyObjectAS() {
		CopyObjectASImpl copyObjectAS = new CopyObjectASImpl();
		return copyObjectAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralAS createStringLiteralAS() {
		StringLiteralASImpl stringLiteralAS = new StringLiteralASImpl();
		return stringLiteralAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralAS createBooleanLiteralAS() {
		BooleanLiteralASImpl booleanLiteralAS = new BooleanLiteralASImpl();
		return booleanLiteralAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralAS createEnumLiteralAS() {
		EnumLiteralASImpl enumLiteralAS = new EnumLiteralASImpl();
		return enumLiteralAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassDesignator createEClassDesignator() {
		EClassDesignatorImpl eClassDesignator = new EClassDesignatorImpl();
		return eClassDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreObjectDesignator createEcoreObjectDesignator() {
		EcoreObjectDesignatorImpl ecoreObjectDesignator = new EcoreObjectDesignatorImpl();
		return ecoreObjectDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteralDesignator createEEnumLiteralDesignator() {
		EEnumLiteralDesignatorImpl eEnumLiteralDesignator = new EEnumLiteralDesignatorImpl();
		return eEnumLiteralDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignastPackage getAssignastPackage() {
		return (AssignastPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AssignastPackage getPackage() {
		return AssignastPackage.eINSTANCE;
	}

} //AssignastFactoryImpl
