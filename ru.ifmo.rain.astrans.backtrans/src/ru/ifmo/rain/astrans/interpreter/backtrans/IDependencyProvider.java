package ru.ifmo.rain.astrans.interpreter.backtrans;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public interface IDependencyProvider {
	Iterable<EReference> getReferenceOrder(EClass eClass);
	boolean isProvidingScopeInformation(EClass eClass);
}
