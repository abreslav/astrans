package ru.astrans;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astrans.AstransFactory;
import ru.ifmo.rain.astrans.astrans.CreateClass;
import ru.ifmo.rain.astrans.astrans.Transformation;

import ru.ifmo.rain.astrans.astransast.AstransastSwitch;
import ru.ifmo.rain.astrans.astransast.EPackageReference;
import ru.ifmo.rain.astrans.astransast.TransformationAS;

import ru.ifmo.rain.astrans.asttomodel.ASTToModelTransformation;

public class TestEveythingTransformation extends ASTToModelTransformation<ITEResolver, ITETrace> {
	private final AstransastSwitch transformer = new AstransastSwitch() {
		public void doSwitch(EList target, EList source) {
			for (Iterator i = source.iterator(); i.hasNext(); ) {
				traget.add(doSwitch((EObject) i.next()));
			}
		}
	
		public Transformation caseTransformationAS(TransformationAS transformationAS) {
			Transformation transformation = AstransFactory.eINSTANCE.createTransformation();
		
			transformation.setOutputName().addAll(transformationAS.getOutputName);
			transformation.setOutputNsURI(transformationAS.getOutputNsURI);
			transformation.setCreateClassActions((CreateClass) doSwitch(transformationAS.getCreateClassActions()));
			transformation.getSkipClassActions().addAll(transformationAS.getSkipClassActions());
			doSwitch(transformation.getTranslateReferencesActions(), transformationAS.getTranslateReferencesActions());
			transformation.setChangeInheritanceActions(transformationAS.getChangeInheritanceActions());
			getTrace().transformationCreated(transformationAS, transformation);
		
			addCommand(new Runnable() {
				public void run() {
					for (Iterator i = transformation.getInput().iterator(); i.hasNext(); ) {
						transformation.setInput().add(getResolver().resolveTransformationInput((EPackageReference) i.next()));
					}
					transformation.setSomething(getResolver().resolveSomething(transformationAS.getSomething()));
					transformation.setSomething1(getResolver().resolveSomething1(transformationAS.getSomething1()));
				}
			});
		}
	}
}