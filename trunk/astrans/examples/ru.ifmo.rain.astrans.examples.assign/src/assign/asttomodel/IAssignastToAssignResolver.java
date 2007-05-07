package assign.asttomodel;

import assign.AssignModel;
import assign.EObjectReference;
import assign.EnumLiteral;
import assign.FeatureAccess;
import assign.StaticEClassReference;
import assign.Variable;
import assign.VariableAssignment;

import assignast.EClassDesignator;
import assignast.EEnumLiteralDesignator;
import assignast.EcoreObjectDesignator;
import assignast.Unit;
import assignast.VariableAssignmentAS;

import assignast.util.AssignastSwitch;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IAssignastToAssignResolver {
	AssignModel runTransformation(Unit unit, AssignastSwitch transformer);void enteredVariableAssignmentAS(VariableAssignmentAS variableAssignmentAS, VariableAssignment variableAssignment);
	void leftVariableAssignmentAS(VariableAssignmentAS variableAssignmentAS, VariableAssignment variableAssignment);

	// caseVariableAS
	VariableAssignment resolveVariableVariableAssignment(String variableAssignment, Variable contextObject);

	// caseFeatureAccessAS
	EStructuralFeature resolveFeatureAccessFeature(String feature, FeatureAccess contextObject);

	// caseEObjectReferenceAS
	EObject resolveEObjectReferenceObject(EcoreObjectDesignator object, EObjectReference contextObject);

	// caseStaticEClassReferenceAS
	EClass resolveStaticEClassReferenceEClass(EClassDesignator eClass, StaticEClassReference contextObject);

	// caseEnumLiteralAS
	EEnumLiteral resolveEnumLiteralLiteral(EEnumLiteralDesignator literal, EnumLiteral contextObject);


}