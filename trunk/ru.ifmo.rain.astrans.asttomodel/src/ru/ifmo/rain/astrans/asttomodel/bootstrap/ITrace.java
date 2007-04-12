package ru.ifmo.rain.astrans.asttomodel.bootstrap;

import ru.ifmo.rain.astrans.astransast.AttributeAS;
import ru.ifmo.rain.astrans.astransast.ChangeInheritanceAS;
import ru.ifmo.rain.astrans.astransast.CreateClassAS;
import ru.ifmo.rain.astrans.astransast.ReferenceAS;
import ru.ifmo.rain.astrans.astransast.SkipClassAS;
import ru.ifmo.rain.astrans.astransast.TransformationAS;
import ru.ifmo.rain.astrans.astransast.TranslateReferencesAS;
import ru.ifmo.rain.astrans.Attribute;
import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.Reference;
import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;

public interface ITrace {

	void transformationCreated(TransformationAS transformationAS, Transformation transformation);

	void attributeCreated(AttributeAS attributeAS, Attribute attribute);

	void referenceCreated(ReferenceAS referenceAS, Reference reference);

	void createClassCreated(CreateClassAS createClassAS, CreateClass createClass);

	void skipClassCreated(SkipClassAS skipClassAS, SkipClass skipClass);

	void translateReferencesCreated(TranslateReferencesAS translateReferencesAS, TranslateReferences translateReferences);

	void changeInheritanceCreated(ChangeInheritanceAS changeInheritanceAS, ChangeInheritance changeInheritance);

}
