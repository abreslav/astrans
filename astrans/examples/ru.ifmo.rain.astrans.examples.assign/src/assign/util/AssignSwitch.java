/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assign.util;

import assign.*;

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
 * @see assign.AssignPackage
 * @generated
 */
public class AssignSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssignPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignSwitch() {
		if (modelPackage == null) {
			modelPackage = AssignPackage.eINSTANCE;
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
			case AssignPackage.ASSIGN_MODEL: {
				AssignModel assignModel = (AssignModel)theEObject;
				Object result = caseAssignModel(assignModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				Object result = caseAssignment(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.VARIABLE_ASSIGNMENT: {
				VariableAssignment variableAssignment = (VariableAssignment)theEObject;
				Object result = caseVariableAssignment(variableAssignment);
				if (result == null) result = caseAssignment(variableAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.ABSTRACT_FEATURE_ASSIGNMENT: {
				AbstractFeatureAssignment abstractFeatureAssignment = (AbstractFeatureAssignment)theEObject;
				Object result = caseAbstractFeatureAssignment(abstractFeatureAssignment);
				if (result == null) result = caseAssignment(abstractFeatureAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.MANY_FEATURE_APPEND: {
				ManyFeatureAppend manyFeatureAppend = (ManyFeatureAppend)theEObject;
				Object result = caseManyFeatureAppend(manyFeatureAppend);
				if (result == null) result = caseAbstractFeatureAssignment(manyFeatureAppend);
				if (result == null) result = caseAssignment(manyFeatureAppend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.SINGLE_FEATURE_ASSIGNMENT: {
				SingleFeatureAssignment singleFeatureAssignment = (SingleFeatureAssignment)theEObject;
				Object result = caseSingleFeatureAssignment(singleFeatureAssignment);
				if (result == null) result = caseAbstractFeatureAssignment(singleFeatureAssignment);
				if (result == null) result = caseAssignment(singleFeatureAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				Object result = caseVariable(variable);
				if (result == null) result = caseExpression(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.FEATURE_ACCESS: {
				FeatureAccess featureAccess = (FeatureAccess)theEObject;
				Object result = caseFeatureAccess(featureAccess);
				if (result == null) result = caseExpression(featureAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.EOBJECT_REFERENCE: {
				EObjectReference eObjectReference = (EObjectReference)theEObject;
				Object result = caseEObjectReference(eObjectReference);
				if (result == null) result = caseExpression(eObjectReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.CREATE_INSTANCE: {
				CreateInstance createInstance = (CreateInstance)theEObject;
				Object result = caseCreateInstance(createInstance);
				if (result == null) result = caseExpression(createInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.ECLASS_REFERENCE: {
				EClassReference eClassReference = (EClassReference)theEObject;
				Object result = caseEClassReference(eClassReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.STATIC_ECLASS_REFERENCE: {
				StaticEClassReference staticEClassReference = (StaticEClassReference)theEObject;
				Object result = caseStaticEClassReference(staticEClassReference);
				if (result == null) result = caseEClassReference(staticEClassReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.DYNAMIC_ECLASS_REFERENCE: {
				DynamicEClassReference dynamicEClassReference = (DynamicEClassReference)theEObject;
				Object result = caseDynamicEClassReference(dynamicEClassReference);
				if (result == null) result = caseEClassReference(dynamicEClassReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.COPY_OBJECT: {
				CopyObject copyObject = (CopyObject)theEObject;
				Object result = caseCopyObject(copyObject);
				if (result == null) result = caseExpression(copyObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				Object result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				Object result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				Object result = caseEnumLiteral(enumLiteral);
				if (result == null) result = caseExpression(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignModel(AssignModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Variable Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableAssignment(VariableAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Feature Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Feature Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractFeatureAssignment(AbstractFeatureAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Many Feature Append</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Many Feature Append</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseManyFeatureAppend(ManyFeatureAppend object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Single Feature Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Single Feature Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleFeatureAssignment(SingleFeatureAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Feature Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Feature Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeatureAccess(FeatureAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEObjectReference(EObjectReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Create Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Create Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateInstance(CreateInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EClass Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EClass Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEClassReference(EClassReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Static EClass Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Static EClass Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStaticEClassReference(StaticEClassReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dynamic EClass Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dynamic EClass Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDynamicEClassReference(DynamicEClassReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Copy Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Copy Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCopyObject(CopyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumLiteral(EnumLiteral object) {
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

} //AssignSwitch
