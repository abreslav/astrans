package ru.ifmo.rain.astrans.bootstrap;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.interpreter.AstransInterpreter;
import ru.ifmo.rain.astrans.interpreter.backtrans.BacktransCodeGenerator;
import ru.ifmo.rain.astrans.interpreter.backtrans.BacktransCreator;
import ru.ifmo.rain.astrans.interpreter.backtrans.SimpleReferenceOrderProvider;
import ru.ifmo.rain.astrans.interpreter.backtrans.TraceAdapter;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.astrans.trace.TraceFactory;
import utils.LoadUtils;

public class BootstrapTest {

	@Test
	@SuppressWarnings("unchecked")
	public void testBootstrap() throws IOException {
		ResourceSet resourceSet = LoadUtils.createResourceSet(new File("bootstrap"));
		Resource resource = resourceSet.createResource(URI.createURI("Transformation.xmi"));
		resource.load(null);
		
		Transformation transformation = (Transformation) resource.getContents().get(0);
		
		Trace trace = TraceFactory.eINSTANCE.createTrace();
		EPackage astPackage = AstransInterpreter.run(transformation, trace);
		
		save(resourceSet, "astransast.ecore", astPackage);
		save(resourceSet, "trace.xmi", trace);
		
        GenPackage protoGM = createGenPackage(AstransPackage.eINSTANCE, "ru.ifmo.rain");
        save(resourceSet, "astrans.genmodel", protoGM.getGenModel());
		GenPackage imageGM = createGenPackage(astPackage, "ru.ifmo.rain.astrans");
		save(resourceSet, "astransast.genmodel", imageGM.getGenModel());
		
		
		BacktransCreator backtransCreator = new BacktransCreator(new TraceAdapter(trace), protoGM, imageGM, new SimpleReferenceOrderProvider());
		ru.ifmo.rain.astrans.astransformation.Transformation backTransformation = backtransCreator.createBackTransformation();
		save(resourceSet, "backtrans.xmi", backTransformation);
		
		BacktransCodeGenerator.generate(backTransformation, "ru.ifmo.rain.astrans.asttomodel.bootstrap", "bootstrap/result/ru/ifmo/rain/astrans/asttomodel/bootstrap");
	}

	@SuppressWarnings("unchecked")
	private void save(ResourceSet resourceSet, String fileName, EObject ePackage) throws IOException {
		Resource astResource = resourceSet.createResource(URI.createURI(fileName));
		astResource.getContents().add(ePackage);
		astResource.save(null);
	}

	private GenPackage createGenPackage(EPackage ePackage, String base) {
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.initialize(Collections.singleton(ePackage));
		genModel.setModelName(CodeGenUtil.capName(ePackage.getName()));
        GenPackage protoGM = (GenPackage)genModel.getGenPackages().get(0);
        protoGM.setBasePackage(base);
        protoGM.setPrefix(CodeGenUtil.capName(ePackage.getName()));
		return protoGM;
	}
}
