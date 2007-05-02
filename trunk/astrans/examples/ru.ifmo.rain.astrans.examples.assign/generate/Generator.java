import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.Transformation;
import ru.ifmo.rain.astrans.interpreter.AstransInterpreter;
import ru.ifmo.rain.astrans.trace.Trace;
import ru.ifmo.rain.astrans.trace.TraceFactory;
import ru.ifmo.rain.astrans.utils.EMFHelper;

public class Generator {
	public static void main(String[] args) throws IOException {
		EMFHelper.loadEObjectFromXMIResource(EcorePackage.eINSTANCE, "model/assign.ecore");
		Transformation transformation = (Transformation) EMFHelper.loadEObjectFromXMIResource(AstransPackage.eINSTANCE, "transformation.xmi");
		
		Trace traceModel = TraceFactory.eINSTANCE.createTrace();
		EPackage ast = AstransInterpreter.run(transformation, traceModel);
		
		EMFHelper.saveEObjectToFile(ast, "model/ast.ecore");
		EMFHelper.saveEObjectToFile(traceModel, "trace.xmi");
	}
}
