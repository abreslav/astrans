/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign.util;

import assign.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see assign.AssignPackage
 * @generated
 */
public class AssignValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssignValidator INSTANCE = new AssignValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assign";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return AssignPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case AssignPackage.ASSIGN_MODEL:
				return validateAssignModel((AssignModel)value, diagnostics, context);
			case AssignPackage.ASSIGNMENT:
				return validateAssignment((Assignment)value, diagnostics, context);
			case AssignPackage.VARIABLE_ASSIGNMENT:
				return validateVariableAssignment((VariableAssignment)value, diagnostics, context);
			case AssignPackage.ABSTRACT_FEATURE_ASSIGNMENT:
				return validateAbstractFeatureAssignment((AbstractFeatureAssignment)value, diagnostics, context);
			case AssignPackage.MANY_FEATURE_APPEND:
				return validateManyFeatureAppend((ManyFeatureAppend)value, diagnostics, context);
			case AssignPackage.SINGLE_FEATURE_ASSIGNMENT:
				return validateSingleFeatureAssignment((SingleFeatureAssignment)value, diagnostics, context);
			case AssignPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case AssignPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case AssignPackage.FEATURE_ACCESS:
				return validateFeatureAccess((FeatureAccess)value, diagnostics, context);
			case AssignPackage.EOBJECT_REFERENCE:
				return validateEObjectReference((EObjectReference)value, diagnostics, context);
			case AssignPackage.CREATE_INSTANCE:
				return validateCreateInstance((CreateInstance)value, diagnostics, context);
			case AssignPackage.ECLASS_REFERENCE:
				return validateEClassReference((EClassReference)value, diagnostics, context);
			case AssignPackage.STATIC_ECLASS_REFERENCE:
				return validateStaticEClassReference((StaticEClassReference)value, diagnostics, context);
			case AssignPackage.DYNAMIC_ECLASS_REFERENCE:
				return validateDynamicEClassReference((DynamicEClassReference)value, diagnostics, context);
			case AssignPackage.COPY_OBJECT:
				return validateCopyObject((CopyObject)value, diagnostics, context);
			case AssignPackage.STRING_LITERAL:
				return validateStringLiteral((StringLiteral)value, diagnostics, context);
			case AssignPackage.BOOLEAN_LITERAL:
				return validateBooleanLiteral((BooleanLiteral)value, diagnostics, context);
			case AssignPackage.ENUM_LITERAL:
				return validateEnumLiteral((EnumLiteral)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignModel(AssignModel assignModel, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(assignModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignment(Assignment assignment, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(assignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment(VariableAssignment variableAssignment, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAssignment_VariableNameIsNotDefinedBefore(variableAssignment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VariableNameIsNotDefinedBefore constraint of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment_VariableNameIsNotDefinedBefore(VariableAssignment variableAssignment, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "VariableNameIsNotDefinedBefore", getObjectLabel(variableAssignment, context) }),
						 new Object[] { variableAssignment }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFeatureAssignment(AbstractFeatureAssignment abstractFeatureAssignment, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(abstractFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractFeatureAssignment_FeatureIsChangeable(abstractFeatureAssignment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FeatureIsChangeable constraint of '<em>Abstract Feature Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFeatureAssignment_FeatureIsChangeable(AbstractFeatureAssignment abstractFeatureAssignment, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "FeatureIsChangeable", getObjectLabel(abstractFeatureAssignment, context) }),
						 new Object[] { abstractFeatureAssignment }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyFeatureAppend(ManyFeatureAppend manyFeatureAppend, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(manyFeatureAppend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manyFeatureAppend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manyFeatureAppend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manyFeatureAppend, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractFeatureAssignment_FeatureIsChangeable(manyFeatureAppend, diagnostics, context);
		if (result || diagnostics != null) result &= validateManyFeatureAppend_FeatureIsMany(manyFeatureAppend, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FeatureIsMany constraint of '<em>Many Feature Append</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyFeatureAppend_FeatureIsMany(ManyFeatureAppend manyFeatureAppend, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "FeatureIsMany", getObjectLabel(manyFeatureAppend, context) }),
						 new Object[] { manyFeatureAppend }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleFeatureAssignment(SingleFeatureAssignment singleFeatureAssignment, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(singleFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractFeatureAssignment_FeatureIsChangeable(singleFeatureAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleFeatureAssignment_FeatureIsNotMany(singleFeatureAssignment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FeatureIsNotMany constraint of '<em>Single Feature Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleFeatureAssignment_FeatureIsNotMany(SingleFeatureAssignment singleFeatureAssignment, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "FeatureIsNotMany", getObjectLabel(singleFeatureAssignment, context) }),
						 new Object[] { singleFeatureAssignment }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureAccess(FeatureAccess featureAccess, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(featureAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatureAccess_FeatureBelongsToObjectType(featureAccess, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FeatureBelongsToObjectType constraint of '<em>Feature Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureAccess_FeatureBelongsToObjectType(FeatureAccess featureAccess, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "FeatureBelongsToObjectType", getObjectLabel(featureAccess, context) }),
						 new Object[] { featureAccess }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEObjectReference(EObjectReference eObjectReference, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(eObjectReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateInstance(CreateInstance createInstance, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(createInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassReference(EClassReference eClassReference, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(eClassReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticEClassReference(StaticEClassReference staticEClassReference, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(staticEClassReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicEClassReference(DynamicEClassReference dynamicEClassReference, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(dynamicEClassReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicEClassReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicEClassReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicEClassReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicEClassReference_ExpressionEvaluatesToAClass(dynamicEClassReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExpressionEvaluatesToAClass constraint of '<em>Dynamic EClass Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicEClassReference_ExpressionEvaluatesToAClass(DynamicEClassReference dynamicEClassReference, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ExpressionEvaluatesToAClass", getObjectLabel(dynamicEClassReference, context) }),
						 new Object[] { dynamicEClassReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyObject(CopyObject copyObject, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(copyObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLiteral(StringLiteral stringLiteral, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(stringLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanLiteral(BooleanLiteral booleanLiteral, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(booleanLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumLiteral(EnumLiteral enumLiteral, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(enumLiteral, diagnostics, context);
	}

} //AssignValidator
