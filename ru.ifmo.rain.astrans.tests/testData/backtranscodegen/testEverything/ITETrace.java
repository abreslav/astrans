package ru.astrans;

import ru.ifmo.rain.astrans.astrans.Transformation;

import ru.ifmo.rain.astrans.astransast.TransformationAS;

public interface ITETrace {
	void transformationCreated(TransformationAS transformationAS, Transformation transformation);
}