package ru.ifmo.rain.astrans.backtrans.dependencies.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel;
import ru.ifmo.rain.astrans.backtrans.dependencies.EClassContext;
import ru.ifmo.rain.astrans.backtrans.dependencies.FeatureDependency;
import ru.ifmo.rain.astrans.interpreter.backtrans.IDependencyProvider;

public class DependencyProvider implements IDependencyProvider {

	private final Map<EClass, List<EReference>> classToReferenceList = new HashMap<EClass, List<EReference>>();
	private final Set<EClass> providingScopeInformation = new HashSet<EClass>();
	
	public DependencyProvider(final DependencyModel dependencyModel) throws IncorrectGraphException {
		List contexts = dependencyModel.getContexts();
		for (Iterator iter = contexts.iterator(); iter.hasNext();) {
			EClassContext context = (EClassContext) iter.next();
			EClass eClass = context.getEClass();

			if (context.isProvidingScopeInformation()) {
				providingScopeInformation.add(eClass);
			}
			
			Map<EReference, List<EReference>> refMap = createReferenceMap(context);

			List<EReference> order = topSort(eClass.getEAllReferences(), refMap);
		
			classToReferenceList.put(eClass, Collections.unmodifiableList(order));
		}
	}

	private Map<EReference, List<EReference>> createReferenceMap(EClassContext context) {
		Map<EReference, List<EReference>> refMap = new HashMap<EReference, List<EReference>>();
		List dependencies = context.getDependencies();
		for (Iterator iter = dependencies.iterator(); iter.hasNext();) {
			FeatureDependency fd = (FeatureDependency) iter.next();
			refMap.put(fd.getReference(), fd.getDependsOn());
		}
		return refMap;
	}
	
	private List<EReference> topSort(List<EReference> allReferences, Map<EReference, List<EReference>> refMap) throws IncorrectGraphException {
		Set<EReference> visited = new HashSet<EReference>();
		Set<EReference> inProcess = new HashSet<EReference>();
		ArrayList<EReference> result = new ArrayList<EReference>();
		for (Iterator iter = allReferences.iterator(); iter.hasNext();) {
			EReference reference = (EReference) iter.next();
			topSortStep(reference, refMap, visited, inProcess, result);
		}
		return result;
	}

	private void topSortStep(EReference reference, Map<EReference, List<EReference>> refMap, Set<EReference> visited, Set<EReference> inProcess, ArrayList<EReference> result) throws IncorrectGraphException {
		if (inProcess.contains(reference)) {
			throw new IncorrectGraphException("Cycle on reference: " + reference.getEContainingClass().getName() + "." + reference.getName());
		}
		if (visited.contains(reference)) {
			return;
		}
		visited.add(reference);
		inProcess.add(reference);
		List<EReference> adjacent = refMap.get(reference);
		if (adjacent != null) {
			for (EReference ref : adjacent) {
				topSortStep(ref, refMap, visited, inProcess, result);
			}
		}
		result.add(reference);
		inProcess.remove(reference);
	}

	public Iterable<EReference> getReferenceOrder(EClass eClass) {
		List<EReference> order = classToReferenceList.get(eClass);
		if (order == null) {
			return Collections.unmodifiableList(eClass.getEAllReferences());
		}
		return order;
	}

	public boolean isProvidingScopeInformation(EClass eClass) {
		return providingScopeInformation.contains(eClass);
	}
}
