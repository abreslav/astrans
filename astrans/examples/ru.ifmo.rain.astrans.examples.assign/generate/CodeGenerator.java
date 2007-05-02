import java.io.File;
import java.io.IOException;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ru.ifmo.rain.astrans.astransformation.Transformation;
import ru.ifmo.rain.astrans.interpreter.backtrans.BacktransCodeGenerator;
import ru.ifmo.rain.astrans.interpreter.backtrans.BacktransCreator;
import ru.ifmo.rain.astrans.interpreter.backtrans.TraceAdapter;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.astrans.trace.TracePackage;
import ru.ifmo.rain.astrans.utils.EMFHelper;


public class CodeGenerator {
	public static void main(String[] args) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		putPackage(resourceSet, EcorePackage.eINSTANCE);
		putPackage(resourceSet, TracePackage.eINSTANCE);
		putPackage(resourceSet, GenModelPackage.eINSTANCE);

		XMIResourceFactoryImpl resourceFactoryImpl = new XMIResourceFactoryImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", resourceFactoryImpl);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", resourceFactoryImpl);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", resourceFactoryImpl);
		
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("assign.ecore"), URI.createURI("model/assign.ecore"));
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("ast.ecore"), URI.createURI("model/ast.ecore"));
		
		GenModel assignGenModel = (GenModel) loadObjectFromResource(resourceSet, "model/assign.genmodel");
		GenModel astGenModel = (GenModel) loadObjectFromResource(resourceSet, "model/ast.genmodel");
		Trace traceModel = (Trace) loadObjectFromResource(resourceSet, "trace.xmi");
		
		TraceAdapter trace = new TraceAdapter(traceModel);
		
		GenPackage protoGP = (GenPackage) assignGenModel.getGenPackages().get(0);
		GenPackage imageGP = (GenPackage) astGenModel.getGenPackages().get(0);
		Transformation transformation = BacktransCreator.createBackTransformation(trace, protoGP, imageGP);
		EMFHelper.saveEObjectToFile(transformation, "backtrans.xmi");
		new File("src/assign/asttomodel").mkdirs();
		BacktransCodeGenerator.generate(transformation, "assign.asttomodel", "src/assign/asttomodel");
	}

	private static EObject loadObjectFromResource(ResourceSet resourceSet, String uri) throws IOException {
		Resource resource = resourceSet.createResource(URI.createURI(uri));
		resource.load(null);
		return (EObject) resource.getContents().get(0);
	}

	private static void putPackage(ResourceSet resourceSet, EPackage ePackage) {
		resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
	}
}
