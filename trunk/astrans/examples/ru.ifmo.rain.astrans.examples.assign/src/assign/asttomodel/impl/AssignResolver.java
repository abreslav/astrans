package assign.asttomodel.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import assign.AssignModel;
import assign.EObjectReference;
import assign.EnumLiteral;
import assign.FeatureAccess;
import assign.StaticEClassReference;
import assign.Variable;
import assign.VariableAssignment;
import assign.asttomodel.IAssignastToAssignResolver;
import assignast.EClassDesignator;
import assignast.EEnumLiteralDesignator;
import assignast.EcoreObjectDesignator;
import assignast.Import;
import assignast.Unit;
import assignast.util.AssignastSwitch;

public class AssignResolver implements IAssignastToAssignResolver {

	private final Map<String, EPackage> packages = new HashMap<String, EPackage>();
	private final AssignTrace trace;
	
	public AssignResolver(final AssignTrace trace) {
		super();
		this.trace = trace;
	}

	public EObject resolveEObjectReferenceObject(EcoreObjectDesignator object, EObjectReference contextObject) {
		EPackage ePackage = packages.get(object.getPackage());
		if (object.getClass_() == null) {
			return ePackage;
		}
		EClass eClass = (EClass) ePackage.getEClassifier(object.getClass_());
		if (object.getFeature() == null) {
			return eClass;
		}
		return eClass.getEStructuralFeature(object.getFeature());
	}

	public EEnumLiteral resolveEnumLiteralLiteral(EEnumLiteralDesignator literal, EnumLiteral contextObject) {
		EPackage ePackage = packages.get(literal.getPackage());
		EEnum eEnum = (EEnum) ePackage.getEClassifier(literal.getEnum());
		return eEnum.getEEnumLiteral(literal.getLiteral());
	}

	public EStructuralFeature resolveFeatureAccessFeature(String feature, FeatureAccess contextObject) {
		EClass eClass = (EClass) contextObject.getObject().getType();
		return eClass.getEStructuralFeature(feature);
	}

	public EClass resolveStaticEClassReferenceEClass(EClassDesignator eClass, StaticEClassReference contextObject) {
		EPackage ePackage = packages.get(eClass.getPackage());
		return (EClass) ePackage.getEClassifier(eClass.getClass_());
	}

	public VariableAssignment resolveVariableVariableAssignment(String variableAssignment, Variable contextObject) {
		return trace.getVariableMap().get(variableAssignment);
	}

	public AssignModel runTransformation(Unit unit, AssignastSwitch transformer) {
		EList imports = unit.getImports();
		for (Iterator iter = imports.iterator(); iter.hasNext();) {
			Import imp = (Import) iter.next();
			packages.put(imp.getPackageName(), EPackage.Registry.INSTANCE.getEPackage(imp.getPackageUri()));
		}
		return (AssignModel) transformer.doSwitch(unit.getModel());
	}

}
