package ru.ifmo.rain.astrans.interpreter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.Diagnostician;

import ru.ifmo.rain.astrans.ChangeInheritance;
import ru.ifmo.rain.astrans.CreateClass;
import ru.ifmo.rain.astrans.EClassReference;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.TranslateReferences;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.astrans.util.AstransUtil;
import ru.ifmo.rain.astrans.util.EClassMap;
import ru.ifmo.rain.astrans.util.EClassSet;


/*
 * Features to be supported:
 *   1. Manage containment on reference translation
 *   2. Change inheritance
 *   3. Test everything
 */
public class AstransInterpreter {

	private static Collection<EClass> createEClassObjects(Transformation transformation, AstransInterpreterTrace trace, EClassSet skipper) {
		ArrayList<EClass> classes = new ArrayList<EClass>();
		mapClasses(transformation, trace, classes, skipper);
		createClasses(transformation, trace, classes);
		return classes;
	}

	private static void mapClasses(Transformation transformation, AstransInterpreterTrace trace, Collection<EClass> classes, EClassSet skipper) {
		EList classifiers = transformation.getInput().getEClassifiers();
		for (Iterator iter = classifiers.iterator(); iter.hasNext();) {
			EClassifier eClassifier = (EClassifier) iter.next();
			if (eClassifier instanceof EClass) {
				EClass proto = (EClass) eClassifier;

				if (!skipper.contains(proto)) {
					EClass image = EcoreFactory.eINSTANCE.createEClass();
					trace.registerMappedClass(proto, image);
					
					classes.add(image);
				}
			}
		}
	}

	private static void createClasses(Transformation transformation, AstransInterpreterTrace trace, Collection<EClass> classes) {
		for (Iterator iter = transformation.getCreateClassActions().iterator(); iter.hasNext();) {
			CreateClass action = (CreateClass) iter.next();
			EClass result = EcoreFactory.eINSTANCE.createEClass();
			trace.registerCreatedClass(action, result);
			classes.add(result);
		}
	}

	@SuppressWarnings("unchecked")
	private static EPackage createResult(Transformation transformation, Collection<? extends EClassifier> classes) {
		EPackage result = EcoreFactory.eINSTANCE.createEPackage();
		result.setName(transformation.getOutputName());
		result.setNsPrefix(transformation.getOutputName());
		result.setNsURI(transformation.getOutputNsURI());
		result.getEClassifiers().addAll(classes);
		return result;
	}

	@SuppressWarnings("unchecked")
	private static void changeInheritace(Transformation transformation, AstransInterpreterTrace trace, ReferenceResolver referenceResolver) {
		EList changeInheritanceActions = transformation.getChangeInheritanceActions();
		for (Iterator iter = changeInheritanceActions.iterator(); iter
				.hasNext();) {
			ChangeInheritance action = (ChangeInheritance) iter.next();
			EClass mappedClass = (EClass) referenceResolver.resolveEClassifierReference(action.getSubject());
			mappedClass.getESuperTypes().clear();
			EList superclasses = action.getSuperclasses();
			for (Iterator iterator = superclasses.iterator(); iterator
					.hasNext();) {
				EClassReference superclassReference = (EClassReference) iterator.next();
				mappedClass.getESuperTypes().add(referenceResolver.resolveEClassifierReference(superclassReference));
			}
		}
	}

	private static EClassMap<TranslateReferenceRecord> createTranslatedTypesMap(Transformation transformation, ReferenceResolver referenceResolver) {
		EClassMap<TranslateReferenceRecord> translatedTypes = new EClassMap<TranslateReferenceRecord>();
		for (Iterator iter = transformation.getTranslateReferencesActions().iterator(); iter.hasNext();) {
			TranslateReferences action = (TranslateReferences) iter.next();
			translatedTypes.put(
					action.getModelReferenceTypeProto(),
					new TranslateReferenceRecord(
							(EClassifier) referenceResolver.doSwitch(action.getTextualReferenceType()),
							action.isCrossReferencesOnly()
					),
					action.isIncludeDescendants()
			);
		}
		return translatedTypes;
	}

	public static EPackage run(Transformation transformation, Trace traceModel) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(transformation);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			StringBuilder message = new StringBuilder(diagnostic.getMessage());
			List children = diagnostic.getChildren();
			for (Iterator iter = children.iterator(); iter.hasNext();) {
				Diagnostic child = (Diagnostic) iter.next();
				message.append("\n    ").append(child.getMessage());
			}
			throw new IllegalArgumentException(message.toString());
		}		
		
		AstransInterpreterTrace trace = new AstransInterpreterTrace(traceModel);
		EClassSet skippedClasses = AstransUtil.getSkippedClasses(transformation);

		Collection<EClass> classes = createEClassObjects(transformation, trace, skippedClasses);

		ReferenceResolver referenceResolver = new ReferenceResolver(trace);
		EClassMap<TranslateReferenceRecord> translatedTypes = createTranslatedTypesMap(transformation, referenceResolver);
		
		Composer composer = new Composer(translatedTypes, trace, skippedClasses, referenceResolver);
		composer.run(transformation);

		changeInheritace(transformation, trace, referenceResolver);
		
		EPackage result = createResult(transformation, classes);
		trace.registerOutput(transformation.getInput(), result, transformation.getInputModelRoot(), (EClass) referenceResolver.resolveEClassifierReference(transformation.getAstRoot()));
		return result;
	}

}
