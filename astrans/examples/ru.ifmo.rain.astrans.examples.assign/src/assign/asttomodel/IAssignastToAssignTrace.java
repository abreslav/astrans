package assign.asttomodel;

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

public interface IAssignastToAssignTrace {
	void assignModelCreated(AssignModelAS assignModelAS, AssignModel assignModel);

	void variableAssignmentCreated(VariableAssignmentAS variableAssignmentAS, VariableAssignment variableAssignment);

	void manyFeatureAppendCreated(ManyFeatureAppendAS manyFeatureAppendAS, ManyFeatureAppend manyFeatureAppend);

	void singleFeatureAssignmentCreated(SingleFeatureAssignmentAS singleFeatureAssignmentAS, SingleFeatureAssignment singleFeatureAssignment);

	void variableCreated(VariableAS variableAS, Variable variable);

	void featureAccessCreated(FeatureAccessAS featureAccessAS, FeatureAccess featureAccess);

	void eObjectReferenceCreated(EObjectReferenceAS eObjectReferenceAS, EObjectReference eObjectReference);

	void createInstanceCreated(CreateInstanceAS createInstanceAS, CreateInstance createInstance);

	void staticEClassReferenceCreated(StaticEClassReferenceAS staticEClassReferenceAS, StaticEClassReference staticEClassReference);

	void dynamicEClassReferenceCreated(DynamicEClassReferenceAS dynamicEClassReferenceAS, DynamicEClassReference dynamicEClassReference);

	void copyObjectCreated(CopyObjectAS copyObjectAS, CopyObject copyObject);

	void stringLiteralCreated(StringLiteralAS stringLiteralAS, StringLiteral stringLiteral);

	void booleanLiteralCreated(BooleanLiteralAS booleanLiteralAS, BooleanLiteral booleanLiteral);

	void enumLiteralCreated(EnumLiteralAS enumLiteralAS, EnumLiteral enumLiteral);
}