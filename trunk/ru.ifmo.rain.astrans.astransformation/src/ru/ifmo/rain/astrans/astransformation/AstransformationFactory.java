/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstransformationFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AstransformationFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AstransformationFactory INSTANCE = ru.ifmo.rain.astrans.astransformation.AstransformationFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AstransformationFactory init() {
		try {
			AstransformationFactory theAstransformationFactory = (AstransformationFactory)EPackage.Registry.INSTANCE.getEFactory("http://rain.ifmo.ru/~breslav/2007/astransformation"); 
			if (theAstransformationFactory != null) {
				return theAstransformationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AstransformationFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstransformationFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AstransformationPackage.CLASS_NAME: return createClassName();
			case AstransformationPackage.BASIC_TYPE_NAME: return createBasicTypeName();
			case AstransformationPackage.TRANSFORMATION: return createTransformation();
			case AstransformationPackage.PARAMETER: return createParameter();
			case AstransformationPackage.CUSTOM_MAIN_METHOD: return createCustomMainMethod();
			case AstransformationPackage.MAPPING_RULE: return createMappingRule();
			case AstransformationPackage.RESOLVE_OBJECTS: return createResolveObjects();
			case AstransformationPackage.ASSIGN_FEATURE: return createAssignFeature();
			case AstransformationPackage.ASSIGN_ATTRIBUTE: return createAssignAttribute();
			case AstransformationPackage.ASSIGN_REFERENCE: return createAssignReference();
			case AstransformationPackage.WRITE_TRACE: return createWriteTrace();
			case AstransformationPackage.RESOLVE_OBJECT: return createResolveObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AstransformationPackage.BASIC_TYPE:
				return createBasicTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AstransformationPackage.BASIC_TYPE:
				return convertBasicTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassName createClassName() {
		ClassName className = new ClassName();
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicTypeName createBasicTypeName() {
		BasicTypeName basicTypeName = new BasicTypeName();
		return basicTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		Transformation transformation = new Transformation();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		Parameter parameter = new Parameter();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRule createMappingRule() {
		MappingRule mappingRule = new MappingRule();
		return mappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveObjects createResolveObjects() {
		ResolveObjects resolveObjects = new ResolveObjects();
		return resolveObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignFeature createAssignFeature() {
		AssignFeature assignFeature = new AssignFeature();
		return assignFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignAttribute createAssignAttribute() {
		AssignAttribute assignAttribute = new AssignAttribute();
		return assignAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignReference createAssignReference() {
		AssignReference assignReference = new AssignReference();
		return assignReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteTrace createWriteTrace() {
		WriteTrace writeTrace = new WriteTrace();
		return writeTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveObject createResolveObject() {
		ResolveObject resolveObject = new ResolveObject();
		return resolveObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMainMethod createCustomMainMethod() {
		CustomMainMethod customMainMethod = new CustomMainMethod();
		return customMainMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicType createBasicTypeFromString(EDataType eDataType, String initialValue) {
		BasicType result = BasicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstransformationPackage getAstransformationPackage() {
		return (AstransformationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AstransformationPackage getPackage() {
		return AstransformationPackage.eINSTANCE;
	}

} //AstransformationFactory
