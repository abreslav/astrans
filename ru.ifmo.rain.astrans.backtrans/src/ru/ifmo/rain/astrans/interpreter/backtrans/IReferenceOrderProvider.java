package ru.ifmo.rain.astrans.interpreter.backtrans;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public interface IReferenceOrderProvider {
	Iterable<EReference> getReferenceOrder(EClass eClass);
}
