/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.ifmo.rain.astrans.astransformation.AssignAttribute;
import ru.ifmo.rain.astrans.astransformation.AssignFeature;
import ru.ifmo.rain.astrans.astransformation.AssignReference;
import ru.ifmo.rain.astrans.astransformation.AstransformationFactory;
import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.BasicType;
import ru.ifmo.rain.astrans.astransformation.BasicTypeName;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.MappingRule;
import ru.ifmo.rain.astrans.astransformation.Parameter;
import ru.ifmo.rain.astrans.astransformation.ResolveObject;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.astransformation.WriteTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstransformationFactoryImpl extends EFactoryImpl implements AstransformationFactory {
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
		return new AstransformationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstransformationFactoryImpl() {
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
			case AstransformationPackage.TRANSFORMATION: return createTransformation();
			case AstransformationPackage.PARAMETER: return createParameter();
			case AstransformationPackage.MAPPING_RULE: return createMappingRule();
			case AstransformationPackage.ASSIGN_FEATURE: return createAssignFeature();
			case AstransformationPackage.ASSIGN_ATTRIBUTE: return createAssignAttribute();
			case AstransformationPackage.ASSIGN_REFERENCE: return createAssignReference();
			case AstransformationPackage.WRITE_TRACE: return createWriteTrace();
			case AstransformationPackage.RESOLVE_OBJECT: return createResolveObject();
			case AstransformationPackage.BASIC_TYPE_NAME: return createBasicTypeName();
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
		ClassNameImpl className = new ClassNameImpl();
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRule createMappingRule() {
		MappingRuleImpl mappingRule = new MappingRuleImpl();
		return mappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignFeature createAssignFeature() {
		AssignFeatureImpl assignFeature = new AssignFeatureImpl();
		return assignFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignAttribute createAssignAttribute() {
		AssignAttributeImpl assignAttribute = new AssignAttributeImpl();
		return assignAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignReference createAssignReference() {
		AssignReferenceImpl assignReference = new AssignReferenceImpl();
		return assignReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteTrace createWriteTrace() {
		WriteTraceImpl writeTrace = new WriteTraceImpl();
		return writeTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveObject createResolveObject() {
		ResolveObjectImpl resolveObject = new ResolveObjectImpl();
		return resolveObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicTypeName createBasicTypeName() {
		BasicTypeNameImpl basicTypeName = new BasicTypeNameImpl();
		return basicTypeName;
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

} //AstransformationFactoryImpl
