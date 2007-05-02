package ru.ifmo.rain.astrans.interpreter;

import org.eclipse.emf.ecore.EClassifier;

/*package*/ final class TranslateReferenceRecord {
	public final EClassifier type;
	public final boolean crossReferencesOnly;
	
	public TranslateReferenceRecord(final EClassifier type, final boolean crossReferencesOnly) {
		this.type = type;
		this.crossReferencesOnly = crossReferencesOnly;
	}	
}
