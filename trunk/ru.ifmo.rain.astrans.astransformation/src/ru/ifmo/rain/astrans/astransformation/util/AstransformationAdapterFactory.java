/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.ifmo.rain.astrans.astransformation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astransformation.AssignAttribute;
import ru.ifmo.rain.astrans.astransformation.AssignFeature;
import ru.ifmo.rain.astrans.astransformation.AssignReference;
import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.astransformation.BasicTypeName;
import ru.ifmo.rain.astrans.astransformation.ClassName;
import ru.ifmo.rain.astrans.astransformation.CustomMainMethod;
import ru.ifmo.rain.astrans.astransformation.MappingRule;
import ru.ifmo.rain.astrans.astransformation.Method;
import ru.ifmo.rain.astrans.astransformation.Named;
import ru.ifmo.rain.astrans.astransformation.Parameter;
import ru.ifmo.rain.astrans.astransformation.ResolveObject;
import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.astransformation.TypeName;
import ru.ifmo.rain.astrans.astransformation.Typed;
import ru.ifmo.rain.astrans.astransformation.WriteTrace;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.ifmo.rain.astrans.astransformation.AstransformationPackage
 * @generated
 */
public class AstransformationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstransformationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstransformationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AstransformationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AstransformationSwitch modelSwitch =
		new AstransformationSwitch() {
			public Object caseNamed(Named object) {
				return createNamedAdapter();
			}
			public Object caseTyped(Typed object) {
				return createTypedAdapter();
			}
			public Object caseTypeName(TypeName object) {
				return createTypeNameAdapter();
			}
			public Object caseClassName(ClassName object) {
				return createClassNameAdapter();
			}
			public Object caseBasicTypeName(BasicTypeName object) {
				return createBasicTypeNameAdapter();
			}
			public Object caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			public Object caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			public Object caseMappingRule(MappingRule object) {
				return createMappingRuleAdapter();
			}
			public Object caseAssignFeature(AssignFeature object) {
				return createAssignFeatureAdapter();
			}
			public Object caseAssignAttribute(AssignAttribute object) {
				return createAssignAttributeAdapter();
			}
			public Object caseAssignReference(AssignReference object) {
				return createAssignReferenceAdapter();
			}
			public Object caseWriteTrace(WriteTrace object) {
				return createWriteTraceAdapter();
			}
			public Object caseResolveObject(ResolveObject object) {
				return createResolveObjectAdapter();
			}
			public Object caseMethod(Method object) {
				return createMethodAdapter();
			}
			public Object caseCustomMainMethod(CustomMainMethod object) {
				return createCustomMainMethodAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.ClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.ClassName
	 * @generated
	 */
	public Adapter createClassNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.MappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.MappingRule
	 * @generated
	 */
	public Adapter createMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.AssignFeature <em>Assign Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignFeature
	 * @generated
	 */
	public Adapter createAssignFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.AssignAttribute <em>Assign Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignAttribute
	 * @generated
	 */
	public Adapter createAssignAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.AssignReference <em>Assign Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.AssignReference
	 * @generated
	 */
	public Adapter createAssignReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.WriteTrace <em>Write Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.WriteTrace
	 * @generated
	 */
	public Adapter createWriteTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.ResolveObject <em>Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.ResolveObject
	 * @generated
	 */
	public Adapter createResolveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.CustomMainMethod <em>Custom Main Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.CustomMainMethod
	 * @generated
	 */
	public Adapter createCustomMainMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.Typed
	 * @generated
	 */
	public Adapter createTypedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.TypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.TypeName
	 * @generated
	 */
	public Adapter createTypeNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.ifmo.rain.astrans.astransformation.BasicTypeName <em>Basic Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.ifmo.rain.astrans.astransformation.BasicTypeName
	 * @generated
	 */
	public Adapter createBasicTypeNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AstransformationAdapterFactory
