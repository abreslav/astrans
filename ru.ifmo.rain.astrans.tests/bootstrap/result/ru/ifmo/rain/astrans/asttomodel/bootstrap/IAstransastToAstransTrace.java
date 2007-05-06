package ru.ifmo.rain.astrans.asttomodel.bootstrap;

import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.MappedEClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;
import ru.ifmo.rain.astrans.astransast.AttributeAS;
import ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS;
import ru.ifmo.rain.astrans.astransast.CreateClassAS;
import ru.ifmo.rain.astrans.astransast.MappedEClassAS;
import ru.ifmo.rain.astrans.astransast.ReferenceAS;
import ru.ifmo.rain.astrans.astransast.SkipClassAS;
import ru.ifmo.rain.astrans.astransast.TransformationAS;
import ru.ifmo.rain.astrans.astransast.TranslateReferencesAS;

public interface IAstransastToAstransTrace {
	void mappedEClassCreated(MappedEClassAS mappedEClassAS, MappedEClass mappedEClass);

	void translateReferencesCreated(TranslateReferencesAS translateReferencesAS, TranslateReferences translateReferences);

	void createClassCreated(CreateClassAS createClassAS, CreateClass createClass);

	void attributeCreated(AttributeAS attributeAS, Attribute attribute);

	void referenceCreated(ReferenceAS referenceAS, Reference reference);

	void changeInheritanceCreated(ChangeInheritanceAS changeInheritanceAS, ChangeInheritance changeInheritance);

	void skipClassCreated(SkipClassAS skipClassAS, SkipClass skipClass);

	void transformationCreated(TransformationAS transformationAS, Transformation transformation);
}