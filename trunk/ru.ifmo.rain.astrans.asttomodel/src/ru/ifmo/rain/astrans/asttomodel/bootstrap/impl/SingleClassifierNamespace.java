package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ru.ifmo.rain.astrans.EClassifierReference;
import ru.ifmo.rain.astrans.astransast.QualifiedName;

public abstract class SingleClassifierNamespace<T extends EClassifierReference, V> {

	private final Map<String, T> classMap = new HashMap<String, T>();

	@SuppressWarnings("unchecked")
	public T getReference(QualifiedName name) {
		T ref = classMap.get(name.getName());
		if (ref == null) {
			return null;
		}
		return (T) EcoreUtil.copy(ref);
	}

	public void add(V value) {
		assert !classMap.containsKey(getName(value));
		T result = createReference(value);
		classMap.put(getName(value), result);
	}

	protected abstract T createReference(V value);

	protected abstract String getName(V value);
}
