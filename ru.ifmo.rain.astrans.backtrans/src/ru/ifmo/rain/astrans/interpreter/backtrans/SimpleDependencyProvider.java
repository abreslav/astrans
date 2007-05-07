package ru.ifmo.rain.astrans.interpreter.backtrans;

import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public class SimpleDependencyProvider implements IDependencyProvider {

	@SuppressWarnings("unchecked")
	public Iterable<EReference> getReferenceOrder(EClass eClass) {
		return Collections.<EReference>unmodifiableCollection(eClass.getEAllReferences());
	}

	public boolean isProvidingScopeInformation(EClass eClass) {
		return false;
	}

}
