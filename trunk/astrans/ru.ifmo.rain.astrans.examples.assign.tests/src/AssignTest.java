import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;

import ru.ifmo.rain.tests.utils.DirectoryBasedTest;
import ru.ifmo.rain.tests.utils.XMIResourceSet;
import ru.ifmo.rain.tests.utils.emf.Difference;
import ru.ifmo.rain.tests.utils.emf.EMFComparator;
import assign.AssignModel;
import assign.AssignPackage;
import assign.asttomodel.AssignastToAssignTransformation;
import assign.asttomodel.impl.AssignTransformationContextFactory;
import assignast.AssignastPackage;
import assignast.Unit;

public class AssignTest extends DirectoryBasedTest {

	public AssignTest(final File testDir) {
		super(testDir);
	}
	
	@Test
	public void testAssign() throws IOException {
		XMIResourceSet resourceSet = new XMIResourceSet(EcorePackage.eINSTANCE, AssignastPackage.eINSTANCE, AssignPackage.eINSTANCE);

		AssignModel expected = (AssignModel) resourceSet.loadEObject(getPath("expected.xmi"));
		Unit ast = (Unit) resourceSet.loadEObject(getPath("ast.xmi"));
		
		AssignastToAssignTransformation transformation = new AssignastToAssignTransformation(new AssignTransformationContextFactory());
		AssignModel model = transformation.run(ast);
		
		resourceSet.saveEObject(model, getPath("result.xmi"));
		
		Difference difference = EMFComparator.compare(expected, model);
		assertTrue(difference.toString(), difference.areEqual());
	}
}
