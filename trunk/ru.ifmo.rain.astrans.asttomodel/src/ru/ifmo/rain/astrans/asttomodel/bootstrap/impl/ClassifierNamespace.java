package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;

import ru.ifmo.rain.astrans.CreatedEClass;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.ExistingEClass;
import ru.ifmo.rain.astrans.ExistingEDataType;
import ru.ifmo.rain.astrans.MappedEClass;
import ru.ifmo.rain.astrans.astransast.QualifiedName;

public abstract class ClassifierNamespace implements IClassifierNamespace {

	public EClassifierReference getEClassifierReference(QualifiedName name) {
		EClassReference classReference = getEClassReference(name);
		if (classReference != null) {
			return classReference;
		}
		return getExistingEDataType(name);
	}
	
	public EClassReference getEClassReference(QualifiedName name) {
		ExistingEClass existingEClass = getExistingEClass(name);
		if (existingEClass != null) {
			return existingEClass;
		}
		
		CreatedEClass createdEClass = getCreatedEClass(name);
		if (createdEClass != null) {
			return createdEClass;
		}
		 
		return getMappedEClass(name);
	}
	
	public ExistingEClass getExistingEClass(QualifiedName name) {
		return null;
	}
	
	public ExistingEDataType getExistingEDataType(QualifiedName name) {
		return null;
	}
	
	public CreatedEClass getCreatedEClass(QualifiedName name) {
		return null;
	}
	
	public MappedEClass getMappedEClass(QualifiedName name) {
		return null;
	}
}