package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;

import ru.ifmo.rain.astrans.astransast.AttributeAS;
import ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS;
import ru.ifmo.rain.astrans.astransast.CreateClassAS;
import ru.ifmo.rain.astrans.astransast.ReferenceAS;
import ru.ifmo.rain.astrans.astransast.SkipClassAS;
import ru.ifmo.rain.astrans.astransast.TransformationAS;
import ru.ifmo.rain.astrans.astransast.TranslateReferencesAS;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.ITrace;
import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;

public class TraceImpl implements ITrace {

	private final CreatedClasses createdClasses = new CreatedClasses();
	
	public void attributeCreated(AttributeAS attributeAS, Attribute attribute) {
		// TODO Auto-generated method stub

	}

	public void changeInheritanceCreated(
			ChangeInheritanceAS changeInheritanceAS,
			ChangeInheritance changeInheritance) {
		// TODO Auto-generated method stub

	}

	public void createClassCreated(CreateClassAS createClassAS,
			CreateClass createClass) {
		createdClasses.add(createClass);
	}

	public void referenceCreated(ReferenceAS referenceAS, Reference reference) {
		// TODO Auto-generated method stub

	}

	public void skipClassCreated(SkipClassAS skipClassAS, SkipClass skipClass) {
		// TODO Auto-generated method stub

	}

	public void transformationCreated(TransformationAS transformationAS,
			Transformation transformation) {
		// TODO Auto-generated method stub

	}

	public void translateReferencesCreated(
			TranslateReferencesAS translateReferencesAS,
			TranslateReferences translateReferences) {
		// TODO Auto-generated method stub

	}

	public CreatedClasses getCreatedClasses() {
		return createdClasses;
	}
	
}
