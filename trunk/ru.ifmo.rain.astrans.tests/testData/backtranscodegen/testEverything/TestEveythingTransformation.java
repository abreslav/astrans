package ru.astrans;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astrans.AstransFactory;
import ru.ifmo.rain.astrans.astrans.CreateClass;
import ru.ifmo.rain.astrans.astrans.Transformation;

import ru.ifmo.rain.astrans.astransast.Action;
import ru.ifmo.rain.astrans.astransast.ActionAS;
import ru.ifmo.rain.astrans.astransast.AstransastSwitch;
import ru.ifmo.rain.astrans.astransast.EPackageReference;
import ru.ifmo.rain.astrans.astransast.TransformationAS;

import ru.ifmo.rain.astrans.asttomodel.ASTToModelTransformation;
import ru.ifmo.rain.astrans.asttomodel.ITransformationContextFactory;

public class TestEveythingTransformation extends ASTToModelTransformation<ITEResolver, ITETrace> {
	private final AstransastSwitch transformer = new AstransastSwitch() {
		public void doSwitch(EList target, EList source) {
			for (Iterator i = source.iterator(); i.hasNext(); ) {
				target.add(doSwitch((EObject) i.next()));
			}
		}
	
		public Transformation caseTransformationAS(final TransformationAS transformationAS) {
			final Transformation transformation = AstransFactory.eINSTANCE.createTransformation();
			
			transformation.setOutputName().addAll(transformationAS.getOutputName());
			transformation.setOutputNsURI(transformationAS.getOutputNsURI());
			transformation.setCreateClassActions((CreateClass) doSwitch(transformationAS.getCreateClassActions()));
			transformation.getSkipClassActions().addAll(transformationAS.getSkipClassActions());
			doSwitch(transformation.getTranslateReferencesActions(), transformationAS.getTranslateReferencesActions());
			transformation.setChangeInheritanceActions(transformationAS.getChangeInheritanceActions());
			getTrace().transformationCreated(transformationAS, transformation);
			
			addCommand(new Runnable() {
				public void run() {
					for (Iterator i = transformationAS.getInput().iterator(); i.hasNext(); ) {
						transformation.setInput().add(getResolver().resolveTransformationInput((EPackageReference) i.next()));
					}
					transformation.setSomething(getResolver().resolveSomething(transformationAS.getSomething()));
					transformation.setSomething1(getResolver().resolveSomething1(transformationAS.getSomething1()));
				}
			});
			
			return transformation;
		}

		public Action caseMyAbstractClass(final ActionAS actionAS) {
			return getResolver().resolveReferenceToMyAbstractClass(actionAS);
		}
	};

	public TestEveythingTransformation(ITransformationContextFactory<ITEResolver, ITETrace> contextFactory) {
		super(contextFactory);
	}
	
	public Transformation run(TransformationAS transformationAS) {
		Transformation transformation = (Transformation) transformer.doSwitch(transformationAS);
		performAllCommands();
		return transformation;
	}	
}