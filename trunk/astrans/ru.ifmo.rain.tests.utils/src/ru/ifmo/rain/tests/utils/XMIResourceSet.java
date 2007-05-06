package ru.ifmo.rain.tests.utils;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class XMIResourceSet extends ResourceSetImpl {

	private static final XMIResourceFactoryImpl XMI_RESOURCE_FACTORY = new XMIResourceFactoryImpl();

	@SuppressWarnings("unchecked")
	public XMIResourceSet(EPackage... packages) {
		setResourceFactoryRegistry(new Resource.Factory.Registry() {

			public Map getExtensionToFactoryMap() {
				return Collections.EMPTY_MAP;
			}

			public Factory getFactory(URI uri) {
				return XMI_RESOURCE_FACTORY;
			}

			public Map getProtocolToFactoryMap() {
				return Collections.EMPTY_MAP;
			}
			
		});
		for (EPackage p : packages) {
			getPackageRegistry().put(p.getNsURI(), p);
		}
	}
	
	public EObject loadEObject(String uri) throws IOException {
		Resource resource = createResource(URI.createURI(uri));
		resource.load(null);
		return (EObject) resource.getContents().get(0);
	}
	
	@SuppressWarnings("unchecked")
	public void saveEObject(EObject object, String uri) throws IOException {
		Resource resource = createResource(URI.createURI(uri));
		resource.getContents().add(object);
		resource.save(null);
	}
}
