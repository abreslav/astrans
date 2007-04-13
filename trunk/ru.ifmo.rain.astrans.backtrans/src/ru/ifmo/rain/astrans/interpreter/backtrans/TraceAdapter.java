package ru.ifmo.rain.astrans.interpreter.backtrans;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ru.ifmo.rain.astrans.trace.AttributeMapping;
import ru.ifmo.rain.astrans.trace.ClassMapping;
import ru.ifmo.rain.astrans.trace.ReferenceMapping;
import ru.ifmo.rain.astrans.trace.Trace;

public class TraceAdapter {

	private final Collection<ClassMapping> classMappings;
	private final Map<EAttribute, AttributeMapping> attributeMappings;
	private final Map<EReference, ReferenceMapping> referenceMappings;
	private final EPackage input;
	private final EPackage output;
	
	public TraceAdapter(Trace trace) {
		input = trace.getInput();
		output = trace.getOutput();
		
		@SuppressWarnings("unchecked")
		Collection<ClassMapping> unmodifiableCollection = Collections.<ClassMapping>unmodifiableCollection(trace.getClassMappings());
		classMappings = unmodifiableCollection;
		
		Map<EAttribute, AttributeMapping> attrMap = new HashMap<EAttribute, AttributeMapping>();
		for (Iterator iter = trace.getAttributeMappings().iterator(); iter.hasNext();) {
			AttributeMapping mapping = (AttributeMapping) iter.next();
			attrMap.put(mapping.getProto(), mapping);
		}
		attributeMappings = Collections.unmodifiableMap(attrMap);
		
		Map<EReference, ReferenceMapping> refMap = new HashMap<EReference, ReferenceMapping>();
		for (Iterator iter = trace.getReferenceMappings().iterator(); iter.hasNext();) {
			ReferenceMapping mapping = (ReferenceMapping) iter.next();
			refMap.put(mapping.getProto(), mapping);
		}
		referenceMappings = Collections.unmodifiableMap(refMap);
	}
	
	public Collection<ClassMapping> getClassMappings() {
		return classMappings;
	}
	
	public AttributeMapping getAttributeMapping(EAttribute attribute) {
		return attributeMappings.get(attribute);
	}
	
	public ReferenceMapping getReferenceMapping(EReference reference) {
		return referenceMappings.get(reference);
	}
	
	public EPackage getInput() {
		return input;
	}
	
	public EPackage getOutput() {
		return output;
	}
}
