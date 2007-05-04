package ru.astrans;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ru.ifmo.rain.astrans.astransast.AstransastSwitch;

import ru.ifmo.rain.astrans.asttomodel.ASTToModelTransformation;
import ru.ifmo.rain.astrans.asttomodel.ITransformationContextFactory;

import ru.model.Result;

import ru.some.ast.Node;

public class TestEveythingTransformation extends ASTToModelTransformation<ITEResolver, ITETrace> {
	private final AstransastSwitch transformer = new AstransastSwitch() {
		public void doSwitch(EList target, EList source) {
			for (Iterator i = source.iterator(); i.hasNext(); ) {
				target.add(doSwitch((EObject) i.next()));
			}
		}
	
	};

	public TestEveythingTransformation(ITransformationContextFactory<ITEResolver, ITETrace> contextFactory) {
		super(contextFactory);
	}
	
	public Result run(Node astNode) {
		Result result = getResolver().runTransformation(astNode, this.transformer);
		performAllCommands();
		return result;
	}	
}