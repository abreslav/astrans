/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;

import ru.ifmo.rain.astrans.Action;
import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.CreatedEClass;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.ExistingEClass;
import ru.ifmo.rain.astrans.ExistingEDataType;
import ru.ifmo.rain.astrans.MappedEClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.StructuralFeature;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ru.ifmo.rain.astrans.AstransPackage
 * @generated
 */
public class AstransValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AstransValidator INSTANCE = new AstransValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ru.ifmo.rain.astrans";

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
	public AstransValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return AstransPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case AstransPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case AstransPackage.ECLASSIFIER_REFERENCE:
				return validateEClassifierReference((EClassifierReference)value, diagnostics, context);
			case AstransPackage.ECLASS_REFERENCE:
				return validateEClassReference((EClassReference)value, diagnostics, context);
			case AstransPackage.CREATED_ECLASS:
				return validateCreatedEClass((CreatedEClass)value, diagnostics, context);
			case AstransPackage.MAPPED_ECLASS:
				return validateMappedEClass((MappedEClass)value, diagnostics, context);
			case AstransPackage.EXISTING_ECLASS:
				return validateExistingEClass((ExistingEClass)value, diagnostics, context);
			case AstransPackage.EXISTING_EDATA_TYPE:
				return validateExistingEDataType((ExistingEDataType)value, diagnostics, context);
			case AstransPackage.TRANSLATE_REFERENCES:
				return validateTranslateReferences((TranslateReferences)value, diagnostics, context);
			case AstransPackage.CREATE_CLASS:
				return validateCreateClass((CreateClass)value, diagnostics, context);
			case AstransPackage.STRUCTURAL_FEATURE:
				return validateStructuralFeature((StructuralFeature)value, diagnostics, context);
			case AstransPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case AstransPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case AstransPackage.CHANGE_INHERITANCE:
				return validateChangeInheritance((ChangeInheritance)value, diagnostics, context);
			case AstransPackage.SKIP_CLASS:
				return validateSkipClass((SkipClass)value, diagnostics, context);
			case AstransPackage.TRANSFORMATION:
				return validateTransformation((Transformation)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassifierReference(EClassifierReference eClassifierReference, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(eClassifierReference, diagnostics, context);
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
	public boolean validateCreatedEClass(CreatedEClass createdEClass, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(createdEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappedEClass(MappedEClass mappedEClass, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(mappedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mappedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mappedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mappedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateMappedEClass_PrototypeIsNotSkipped(mappedEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PrototypeIsNotSkipped constraint of '<em>Mapped EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMappedEClass_PrototypeIsNotSkipped(MappedEClass mappedEClass, DiagnosticChain diagnostics, Map context) {
		EObject parent = mappedEClass.eContainer();
		while (false == parent instanceof Transformation && parent != null) {
			parent = parent.eContainer();
		}
		EClassSet skippedClasses = AstransUtil.getSkippedClasses((Transformation) parent);
		if (skippedClasses.contains(mappedEClass.getProto())) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "PrototypeIsNotSkipped", getObjectLabel(mappedEClass, context) }),
						 new Object[] { mappedEClass }));
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
	public boolean validateExistingEClass(ExistingEClass existingEClass, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(existingEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistingEDataType(ExistingEDataType existingEDataType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(existingEDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslateReferences(TranslateReferences translateReferences, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(translateReferences, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateClass(CreateClass createClass, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(createClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(StructuralFeature structuralFeature, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(structuralFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeInheritance(ChangeInheritance changeInheritance, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(changeInheritance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkipClass(SkipClass skipClass, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(skipClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(skipClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(skipClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(skipClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSkipClass_FullyDefineAbstractClasses(skipClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FullyDefineAbstractClasses constraint of '<em>Skip Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSkipClass_FullyDefineAbstractClasses(SkipClass skipClass, DiagnosticChain diagnostics, Map context) {
		Set<EClass> mappedReferencedAbstractClasses = (Set<EClass>) context.get(skipClass.eContainer());
		if (mappedReferencedAbstractClasses == null) {
			mappedReferencedAbstractClasses = AstransUtil.getMappedReferencedAbstractClasses((Transformation) skipClass.eContainer());
			context.put(skipClass.eContainer(), mappedReferencedAbstractClasses);
		}
		EList superTypes = skipClass.getTargetProto().getESuperTypes();
		for (Iterator iter = superTypes.iterator(); iter.hasNext();) {
			EClass superClass = (EClass) iter.next();
			if (mappedReferencedAbstractClasses.contains(superClass)) {
				if (diagnostics != null) {
					diagnostics.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "FullyDefineAbstractClasses", getObjectLabel(skipClass, context) }),
							 new Object[] { skipClass }));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformation(Transformation transformation, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(transformation, diagnostics, context);
	}

} //AstransValidator
