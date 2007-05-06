/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.backtrans.dependencies.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import ru.ifmo.rain.astrans.backtrans.dependencies.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage
 * @generated
 */
public class DependenciesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DependenciesValidator INSTANCE = new DependenciesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ru.ifmo.rain.astrans.backtrans.dependencies";

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
	public DependenciesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return DependenciesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case DependenciesPackage.DEPENDENCY_MODEL:
				return validateDependencyModel((DependencyModel)value, diagnostics, context);
			case DependenciesPackage.ECLASS_CONTEXT:
				return validateEClassContext((EClassContext)value, diagnostics, context);
			case DependenciesPackage.FEATURE_DEPENDENCY:
				return validateFeatureDependency((FeatureDependency)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependencyModel(DependencyModel dependencyModel, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(dependencyModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassContext(EClassContext eClassContext, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(eClassContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eClassContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eClassContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eClassContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassContext_AllFeaturesBelongToAClass(eClassContext, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllFeaturesBelongToAClass constraint of '<em>EClass Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassContext_AllFeaturesBelongToAClass(EClassContext eClassContext, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AllFeaturesBelongToAClass", getObjectLabel(eClassContext, context) }),
						 new Object[] { eClassContext }));
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
	public boolean validateFeatureDependency(FeatureDependency featureDependency, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(featureDependency, diagnostics, context);
	}

} //DependenciesValidator
