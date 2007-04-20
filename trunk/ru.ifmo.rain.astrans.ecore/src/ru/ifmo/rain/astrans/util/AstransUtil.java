package ru.ifmo.rain.astrans.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import ru.ifmo.rain.astrans.SkipClass;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;

public class AstransUtil {
	public static EClassSet getSkippedClasses(Transformation transformation) {
		EClassSet result = new EClassSet();
		for (Iterator iter = transformation.getSkipClassActions().iterator(); iter.hasNext();) {
			SkipClass action = (SkipClass) iter.next();
			result.addEClass(action.getTargetProto(), action.isIncludeDescendants());
		}
		return result;
	}
	
	public static EClassSet getTranslatedClasses(Transformation transformation) {
		EClassSet result = new EClassSet();
		for (Iterator iter = transformation.getTranslateReferencesActions().iterator(); iter.hasNext();) {
			TranslateReferences action = (TranslateReferences) iter.next();
			result.addEClass(action.getModelReferenceTypeProto(), action.isIncludeDescendants());
		}
		return result;
	}
	
	public static Set<EClass> getReferencedClasses(Transformation transformation) {
		HashSet<EClass> result = new HashSet<EClass>();
		EList classifiers = transformation.getInput().getEClassifiers();
		for (Iterator iter = classifiers.iterator(); iter.hasNext();) {
			Object classifier = iter.next();
			if (classifier instanceof EClass) {
				EClass eClass = (EClass) classifier;
				EList allReferences = eClass.getEAllReferences();
				for (Iterator iterator = allReferences.iterator(); iterator
						.hasNext();) {
					EReference reference = (EReference) iterator.next();
					result.add(reference.getEReferenceType());
				}
			}
		}
		return result;
	}
	
	public static Set<EClass> getMappedReferencedAbstractClasses(Transformation transformation) {
		EClassSet skippedClasses = getSkippedClasses(transformation);
		EClassSet translatedClasses = getTranslatedClasses(transformation);		
		HashSet<EClass> result = new HashSet<EClass>();
		EList classifiers = transformation.getInput().getEClassifiers();
		for (Iterator iter = classifiers.iterator(); iter.hasNext();) {
			Object classifier = iter.next();
			if (classifier instanceof EClass) {
				EClass eClass = (EClass) classifier;
				EList allReferences = eClass.getEAllReferences();
				for (Iterator iterator = allReferences.iterator(); iterator
						.hasNext();) {
					EReference reference = (EReference) iterator.next();
					EClass referenceType = reference.getEReferenceType();
					if (referenceType.isAbstract()
							&& !skippedClasses.contains(referenceType)
							&& !translatedClasses.contains(referenceType)) {
						result.add(referenceType);
					}
				}
			}
		}
		return result;
	}
}
