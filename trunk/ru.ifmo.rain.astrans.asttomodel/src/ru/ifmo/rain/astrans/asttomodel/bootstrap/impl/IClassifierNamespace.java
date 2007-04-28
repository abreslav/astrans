package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;

import ru.ifmo.rain.astrans.CreatedEClass;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.ExistingEClass;
import ru.ifmo.rain.astrans.ExistingEDataType;
import ru.ifmo.rain.astrans.MappedEClass;
import ru.ifmo.rain.astrans.astransast.QualifiedName;

public interface IClassifierNamespace {

	/**
	 * Returns a reference to a classifier with given QN 
	 * @param name classifiers qualified name
	 * @return a reference of an appropriate type or <code>null</code> if nothing found
	 */
	EClassifierReference getEClassifierReference(QualifiedName name);
	EClassReference getEClassReference(QualifiedName name);
	ExistingEClass getExistingEClass(QualifiedName name);
	ExistingEDataType getExistingEDataType(QualifiedName name);
	CreatedEClass getCreatedEClass(QualifiedName name);
	MappedEClass getMappedEClass(QualifiedName name);
}