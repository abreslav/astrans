/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast.util;

import assignast.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see assignast.AssignastPackage
 * @generated
 */
public class AssignastSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssignastPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignastSwitch() {
		if (modelPackage == null) {
			modelPackage = AssignastPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AssignastPackage.ASSIGN_MODEL_AS: {
				AssignModelAS assignModelAS = (AssignModelAS)theEObject;
				Object result = caseAssignModelAS(assignModelAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.ASSIGNMENT_AS: {
				AssignmentAS assignmentAS = (AssignmentAS)theEObject;
				Object result = caseAssignmentAS(assignmentAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.VARIABLE_ASSIGNMENT_AS: {
				VariableAssignmentAS variableAssignmentAS = (VariableAssignmentAS)theEObject;
				Object result = caseVariableAssignmentAS(variableAssignmentAS);
				if (result == null) result = caseAssignmentAS(variableAssignmentAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.ABSTRACT_FEATURE_ASSIGNMENT_AS: {
				AbstractFeatureAssignmentAS abstractFeatureAssignmentAS = (AbstractFeatureAssignmentAS)theEObject;
				Object result = caseAbstractFeatureAssignmentAS(abstractFeatureAssignmentAS);
				if (result == null) result = caseAssignmentAS(abstractFeatureAssignmentAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.MANY_FEATURE_APPEND_AS: {
				ManyFeatureAppendAS manyFeatureAppendAS = (ManyFeatureAppendAS)theEObject;
				Object result = caseManyFeatureAppendAS(manyFeatureAppendAS);
				if (result == null) result = caseAbstractFeatureAssignmentAS(manyFeatureAppendAS);
				if (result == null) result = caseAssignmentAS(manyFeatureAppendAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.SINGLE_FEATURE_ASSIGNMENT_AS: {
				SingleFeatureAssignmentAS singleFeatureAssignmentAS = (SingleFeatureAssignmentAS)theEObject;
				Object result = caseSingleFeatureAssignmentAS(singleFeatureAssignmentAS);
				if (result == null) result = caseAbstractFeatureAssignmentAS(singleFeatureAssignmentAS);
				if (result == null) result = caseAssignmentAS(singleFeatureAssignmentAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.EXPRESSION_AS: {
				ExpressionAS expressionAS = (ExpressionAS)theEObject;
				Object result = caseExpressionAS(expressionAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.VARIABLE_AS: {
				VariableAS variableAS = (VariableAS)theEObject;
				Object result = caseVariableAS(variableAS);
				if (result == null) result = caseExpressionAS(variableAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.FEATURE_ACCESS_AS: {
				FeatureAccessAS featureAccessAS = (FeatureAccessAS)theEObject;
				Object result = caseFeatureAccessAS(featureAccessAS);
				if (result == null) result = caseExpressionAS(featureAccessAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.EOBJECT_REFERENCE_AS: {
				EObjectReferenceAS eObjectReferenceAS = (EObjectReferenceAS)theEObject;
				Object result = caseEObjectReferenceAS(eObjectReferenceAS);
				if (result == null) result = caseExpressionAS(eObjectReferenceAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.CREATE_INSTANCE_AS: {
				CreateInstanceAS createInstanceAS = (CreateInstanceAS)theEObject;
				Object result = caseCreateInstanceAS(createInstanceAS);
				if (result == null) result = caseExpressionAS(createInstanceAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.ECLASS_REFERENCE_AS: {
				EClassReferenceAS eClassReferenceAS = (EClassReferenceAS)theEObject;
				Object result = caseEClassReferenceAS(eClassReferenceAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.STATIC_ECLASS_REFERENCE_AS: {
				StaticEClassReferenceAS staticEClassReferenceAS = (StaticEClassReferenceAS)theEObject;
				Object result = caseStaticEClassReferenceAS(staticEClassReferenceAS);
				if (result == null) result = caseEClassReferenceAS(staticEClassReferenceAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.DYNAMIC_ECLASS_REFERENCE_AS: {
				DynamicEClassReferenceAS dynamicEClassReferenceAS = (DynamicEClassReferenceAS)theEObject;
				Object result = caseDynamicEClassReferenceAS(dynamicEClassReferenceAS);
				if (result == null) result = caseEClassReferenceAS(dynamicEClassReferenceAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.COPY_OBJECT_AS: {
				CopyObjectAS copyObjectAS = (CopyObjectAS)theEObject;
				Object result = caseCopyObjectAS(copyObjectAS);
				if (result == null) result = caseExpressionAS(copyObjectAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.STRING_LITERAL_AS: {
				StringLiteralAS stringLiteralAS = (StringLiteralAS)theEObject;
				Object result = caseStringLiteralAS(stringLiteralAS);
				if (result == null) result = caseExpressionAS(stringLiteralAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.BOOLEAN_LITERAL_AS: {
				BooleanLiteralAS booleanLiteralAS = (BooleanLiteralAS)theEObject;
				Object result = caseBooleanLiteralAS(booleanLiteralAS);
				if (result == null) result = caseExpressionAS(booleanLiteralAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.ENUM_LITERAL_AS: {
				EnumLiteralAS enumLiteralAS = (EnumLiteralAS)theEObject;
				Object result = caseEnumLiteralAS(enumLiteralAS);
				if (result == null) result = caseExpressionAS(enumLiteralAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				Object result = caseUnit(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				Object result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.ECLASS_DESIGNATOR: {
				EClassDesignator eClassDesignator = (EClassDesignator)theEObject;
				Object result = caseEClassDesignator(eClassDesignator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.ECORE_OBJECT_DESIGNATOR: {
				EcoreObjectDesignator ecoreObjectDesignator = (EcoreObjectDesignator)theEObject;
				Object result = caseEcoreObjectDesignator(ecoreObjectDesignator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignastPackage.EENUM_LITERAL_DESIGNATOR: {
				EEnumLiteralDesignator eEnumLiteralDesignator = (EEnumLiteralDesignator)theEObject;
				Object result = caseEEnumLiteralDesignator(eEnumLiteralDesignator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Assign Model AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Assign Model AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignModelAS(AssignModelAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Assignment AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Assignment AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignmentAS(AssignmentAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Variable Assignment AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Variable Assignment AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableAssignmentAS(VariableAssignmentAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Feature Assignment AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Feature Assignment AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractFeatureAssignmentAS(AbstractFeatureAssignmentAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Many Feature Append AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Many Feature Append AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseManyFeatureAppendAS(ManyFeatureAppendAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Single Feature Assignment AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Single Feature Assignment AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleFeatureAssignmentAS(SingleFeatureAssignmentAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expression AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expression AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpressionAS(ExpressionAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Variable AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Variable AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableAS(VariableAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Feature Access AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Feature Access AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeatureAccessAS(FeatureAccessAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject Reference AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject Reference AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEObjectReferenceAS(EObjectReferenceAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Create Instance AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Create Instance AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateInstanceAS(CreateInstanceAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EClass Reference AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EClass Reference AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEClassReferenceAS(EClassReferenceAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Static EClass Reference AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Static EClass Reference AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStaticEClassReferenceAS(StaticEClassReferenceAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dynamic EClass Reference AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dynamic EClass Reference AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDynamicEClassReferenceAS(DynamicEClassReferenceAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Copy Object AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Copy Object AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCopyObjectAS(CopyObjectAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>String Literal AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>String Literal AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringLiteralAS(StringLiteralAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Boolean Literal AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Boolean Literal AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanLiteralAS(BooleanLiteralAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Enum Literal AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Enum Literal AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumLiteralAS(EnumLiteralAS object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EClass Designator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EClass Designator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEClassDesignator(EClassDesignator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ecore Object Designator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ecore Object Designator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEcoreObjectDesignator(EcoreObjectDesignator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EEnum Literal Designator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EEnum Literal Designator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEEnumLiteralDesignator(EEnumLiteralDesignator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //AssignastSwitch
