/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astransformation.AssignAttribute;
import ru.ifmo.rain.astrans.astransformation.AssignFeature;
import ru.ifmo.rain.astrans.astransformation.AssignReference;
import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.BasicTypeName;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.MappingRule;
import ru.ifmo.rain.astrans.astransformation.Named;
import ru.ifmo.rain.astrans.astransformation.Parameter;
import ru.ifmo.rain.astrans.astransformation.ResolveObject;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.astransformation.TypeName;
import ru.ifmo.rain.astrans.astransformation.Typed;
import ru.ifmo.rain.astrans.astransformation.WriteTrace;

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
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage
 * @generated
 */
public class AstransformationSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstransformationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstransformationSwitch() {
		if (modelPackage == null) {
			modelPackage = AstransformationPackage.eINSTANCE;
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
			case AstransformationPackage.NAMED: {
				Named named = (Named)theEObject;
				Object result = caseNamed(named);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.TYPED: {
				Typed typed = (Typed)theEObject;
				Object result = caseTyped(typed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.TYPE_NAME: {
				TypeName typeName = (TypeName)theEObject;
				Object result = caseTypeName(typeName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.CLASS_NAME: {
				ClassName className = (ClassName)theEObject;
				Object result = caseClassName(className);
				if (result == null) result = caseTypeName(className);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.BASIC_TYPE_NAME: {
				BasicTypeName basicTypeName = (BasicTypeName)theEObject;
				Object result = caseBasicTypeName(basicTypeName);
				if (result == null) result = caseTypeName(basicTypeName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				Object result = caseTransformation(transformation);
				if (result == null) result = caseNamed(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				Object result = caseParameter(parameter);
				if (result == null) result = caseNamed(parameter);
				if (result == null) result = caseTyped(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.MAPPING_RULE: {
				MappingRule mappingRule = (MappingRule)theEObject;
				Object result = caseMappingRule(mappingRule);
				if (result == null) result = caseNamed(mappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.ASSIGN_FEATURE: {
				AssignFeature assignFeature = (AssignFeature)theEObject;
				Object result = caseAssignFeature(assignFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.ASSIGN_ATTRIBUTE: {
				AssignAttribute assignAttribute = (AssignAttribute)theEObject;
				Object result = caseAssignAttribute(assignAttribute);
				if (result == null) result = caseAssignFeature(assignAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.ASSIGN_REFERENCE: {
				AssignReference assignReference = (AssignReference)theEObject;
				Object result = caseAssignReference(assignReference);
				if (result == null) result = caseAssignFeature(assignReference);
				if (result == null) result = caseTyped(assignReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.WRITE_TRACE: {
				WriteTrace writeTrace = (WriteTrace)theEObject;
				Object result = caseWriteTrace(writeTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstransformationPackage.RESOLVE_OBJECT: {
				ResolveObject resolveObject = (ResolveObject)theEObject;
				Object result = caseResolveObject(resolveObject);
				if (result == null) result = caseAssignFeature(resolveObject);
				if (result == null) result = caseTyped(resolveObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Class Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassName(ClassName object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMappingRule(MappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Assign Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Assign Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignFeature(AssignFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Assign Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Assign Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignAttribute(AssignAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Assign Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Assign Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignReference(AssignReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Write Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Write Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWriteTrace(WriteTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResolveObject(ResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Typed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Typed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTyped(Typed object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeName(TypeName object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Basic Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Basic Type Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicTypeName(BasicTypeName object) {
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

} //AstransformationSwitch
