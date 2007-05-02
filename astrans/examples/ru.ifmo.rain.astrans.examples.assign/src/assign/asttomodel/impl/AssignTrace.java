package assign.asttomodel.impl;

import java.util.HashMap;
import java.util.Map;

import assign.AssignModel;
import assign.BooleanLiteral;
import assign.CopyObject;
import assign.CreateInstance;
import assign.DynamicEClassReference;
import assign.EObjectReference;
import assign.EnumLiteral;
import assign.FeatureAccess;
import assign.ManyFeatureAppend;
import assign.SingleFeatureAssignment;
import assign.StaticEClassReference;
import assign.StringLiteral;
import assign.Variable;
import assign.VariableAssignment;
import assign.asttomodel.IAssignastToAssignTrace;
import assignast.AssignModelAS;
import assignast.BooleanLiteralAS;
import assignast.CopyObjectAS;
import assignast.CreateInstanceAS;
import assignast.DynamicEClassReferenceAS;
import assignast.EObjectReferenceAS;
import assignast.EnumLiteralAS;
import assignast.FeatureAccessAS;
import assignast.ManyFeatureAppendAS;
import assignast.SingleFeatureAssignmentAS;
import assignast.StaticEClassReferenceAS;
import assignast.StringLiteralAS;
import assignast.VariableAS;
import assignast.VariableAssignmentAS;

public class AssignTrace implements IAssignastToAssignTrace {

	private final Map<String, VariableAssignment> variableMap = new HashMap<String, VariableAssignment>();

	public Map<String, VariableAssignment> getVariableMap() {
		return variableMap;
	}
	
	public void assignModelCreated(AssignModelAS assignModelAS,
			AssignModel assignModel) {
		// TODO Auto-generated method stub

	}

	public void booleanLiteralCreated(BooleanLiteralAS booleanLiteralAS,
			BooleanLiteral booleanLiteral) {
		// TODO Auto-generated method stub

	}

	public void copyObjectCreated(CopyObjectAS copyObjectAS,
			CopyObject copyObject) {
		// TODO Auto-generated method stub

	}

	public void createInstanceCreated(CreateInstanceAS createInstanceAS,
			CreateInstance createInstance) {
		// TODO Auto-generated method stub

	}

	public void dynamicEClassReferenceCreated(
			DynamicEClassReferenceAS dynamicEClassReferenceAS,
			DynamicEClassReference dynamicEClassReference) {
		// TODO Auto-generated method stub

	}

	public void eObjectReferenceCreated(EObjectReferenceAS eObjectReferenceAS,
			EObjectReference eObjectReference) {
		// TODO Auto-generated method stub

	}

	public void enumLiteralCreated(EnumLiteralAS enumLiteralAS,
			EnumLiteral enumLiteral) {
		// TODO Auto-generated method stub

	}

	public void featureAccessCreated(FeatureAccessAS featureAccessAS,
			FeatureAccess featureAccess) {
		// TODO Auto-generated method stub

	}

	public void manyFeatureAppendCreated(
			ManyFeatureAppendAS manyFeatureAppendAS,
			ManyFeatureAppend manyFeatureAppend) {
		// TODO Auto-generated method stub

	}

	public void singleFeatureAssignmentCreated(
			SingleFeatureAssignmentAS singleFeatureAssignmentAS,
			SingleFeatureAssignment singleFeatureAssignment) {
		// TODO Auto-generated method stub

	}

	public void staticEClassReferenceCreated(
			StaticEClassReferenceAS staticEClassReferenceAS,
			StaticEClassReference staticEClassReference) {
		// TODO Auto-generated method stub

	}

	public void stringLiteralCreated(StringLiteralAS stringLiteralAS,
			StringLiteral stringLiteral) {
		// TODO Auto-generated method stub

	}

	public void variableAssignmentCreated(
			VariableAssignmentAS variableAssignmentAS,
			VariableAssignment variableAssignment) {
		variableMap.put(variableAssignmentAS.getVariableName(), variableAssignment);
	}

	public void variableCreated(VariableAS variableAS, Variable variable) {
		// TODO Auto-generated method stub

	}

}
