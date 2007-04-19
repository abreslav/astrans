package utils;

import java.io.File;
import java.util.HashMap;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.astransast.AstransastPackage;
import ru.ifmo.rain.astrans.astransformation.AstransformationPackage;
import ru.ifmo.rain.astrans.trace.TracePackage;

public class LoadUtils {

	@SuppressWarnings("unchecked")
	public static ResourceSet createResourceSet(final File rootDir) {
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		resourceSetImpl.setURIResourceMap(new HashMap());
		ResourceSet resourceSet = resourceSetImpl;
		resourceSet.setPackageRegistry(EPackage.Registry.INSTANCE);
		
		addEPackage(TracePackage.eINSTANCE);
		addEPackage(AstransformationPackage.eINSTANCE);
		addEPackage(AstransPackage.eINSTANCE);
		addEPackage(AstransastPackage.eINSTANCE);
		addEPackage(EcorePackage.eINSTANCE);
		addEPackage(GenModelPackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());

		resourceSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		
		resourceSet.setURIConverter(new URIConverterImpl() {
			@Override
			public URI normalize(URI uri) {
				String scheme = uri.scheme();
				if (scheme == null) {
					File file = new File(rootDir, uri.toFileString());
//					if (!file.exists()) {
//						System.out.println(file.getAbsolutePath());
//					}
					String absolutePath = file.getAbsolutePath();
					return URI.createFileURI(absolutePath);
				}
				return super.normalize(uri);
			}
		});
		return resourceSet;
	}

	@SuppressWarnings("unchecked")
	private static void addEPackage(EPackage ePackage) {
		EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
	}

}
