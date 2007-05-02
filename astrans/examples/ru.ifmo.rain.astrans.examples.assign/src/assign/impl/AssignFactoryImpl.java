/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign.impl;

import assign.*;

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
public class AssignFactoryImpl extends EFactoryImpl implements AssignFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignFactory init() {
		try {
			AssignFactory theAssignFactory = (AssignFactory)EPackage.Registry.INSTANCE.getEFactory("http://rain.ifmo.ru/~breslav/astrans/examples/2007/assign"); 
			if (theAssignFactory != null) {
				return theAssignFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssignFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssignPackage.ASSIGN_MODEL: return createAssignModel();
			case AssignPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
			case AssignPackage.MANY_FEATURE_APPEND: return createManyFeatureAppend();
			case AssignPackage.SINGLE_FEATURE_ASSIGNMENT: return createSingleFeatureAssignment();
			case AssignPackage.VARIABLE: return createVariable();
			case AssignPackage.FEATURE_ACCESS: return createFeatureAccess();
			case AssignPackage.EOBJECT_REFERENCE: return createEObjectReference();
			case AssignPackage.CREATE_INSTANCE: return createCreateInstance();
			case AssignPackage.STATIC_ECLASS_REFERENCE: return createStaticEClassReference();
			case AssignPackage.DYNAMIC_ECLASS_REFERENCE: return createDynamicEClassReference();
			case AssignPackage.COPY_OBJECT: return createCopyObject();
			case AssignPackage.STRING_LITERAL: return createStringLiteral();
			case AssignPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case AssignPackage.ENUM_LITERAL: return createEnumLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignModel createAssignModel() {
		AssignModelImpl assignModel = new AssignModelImpl();
		return assignModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment createVariableAssignment() {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyFeatureAppend createManyFeatureAppend() {
		ManyFeatureAppendImpl manyFeatureAppend = new ManyFeatureAppendImpl();
		return manyFeatureAppend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFeatureAssignment createSingleFeatureAssignment() {
		SingleFeatureAssignmentImpl singleFeatureAssignment = new SingleFeatureAssignmentImpl();
		return singleFeatureAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAccess createFeatureAccess() {
		FeatureAccessImpl featureAccess = new FeatureAccessImpl();
		return featureAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectReference createEObjectReference() {
		EObjectReferenceImpl eObjectReference = new EObjectReferenceImpl();
		return eObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateInstance createCreateInstance() {
		CreateInstanceImpl createInstance = new CreateInstanceImpl();
		return createInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticEClassReference createStaticEClassReference() {
		StaticEClassReferenceImpl staticEClassReference = new StaticEClassReferenceImpl();
		return staticEClassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicEClassReference createDynamicEClassReference() {
		DynamicEClassReferenceImpl dynamicEClassReference = new DynamicEClassReferenceImpl();
		return dynamicEClassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyObject createCopyObject() {
		CopyObjectImpl copyObject = new CopyObjectImpl();
		return copyObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignPackage getAssignPackage() {
		return (AssignPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AssignPackage getPackage() {
		return AssignPackage.eINSTANCE;
	}

} //AssignFactoryImpl
