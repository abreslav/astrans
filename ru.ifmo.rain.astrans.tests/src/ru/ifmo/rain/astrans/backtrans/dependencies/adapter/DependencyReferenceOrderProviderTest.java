package ru.ifmo.rain.astrans.backtrans.dependencies.adapter;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ru.ifmo.rain.astrans.backtrans.dependencies.DependenciesPackage;
import ru.ifmo.rain.astrans.backtrans.dependencies.DependencyModel;
import ru.ifmo.rain.tests.utils.FileUtils;
import ru.ifmo.rain.tests.utils.IFileProcessor;
import ru.ifmo.rain.tests.utils.XMIResourceSet;

@RunWith(Parameterized.class)
public class DependencyReferenceOrderProviderTest {

	@Parameters
	public static Collection<Object[]> parameters() {
		return FileUtils.processDirectory("testData/dependencies", new IFileProcessor() {
			public Object[] process(File file) {
				return new Object[] {
					file
				};
			}
		});
	}
	
	private final File testDir;

	public DependencyReferenceOrderProviderTest(File testDir) {
		this.testDir = testDir;
	}

	private String getURI(String name) {
		return new File(testDir, name).getPath();
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void testGetReferenceOrder() throws IOException {
		XMIResourceSet resourceSet = new XMIResourceSet(DependenciesPackage.eINSTANCE, EcorePackage.eINSTANCE);
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("input.ecore"), URI.createURI(getURI("input.ecore")));
		EPackage input = (EPackage) resourceSet.loadEObject(getURI("input.ecore"));
		DependencyModel dependencyModel = (DependencyModel) resourceSet.loadEObject(getURI("DependencyModel.xmi"));
		
		PrintStream output = new PrintStream(new File(testDir, "output.txt"));
		DependencyReferenceOrderProvider provider;
		try {
			provider = new DependencyReferenceOrderProvider(dependencyModel);
		
			EList classifiers = input.getEClassifiers();
			for (Iterator iter = classifiers.iterator(); iter.hasNext();) {
				EClass eClass = (EClass) iter.next();
				Iterable<EReference> order = provider.getReferenceOrder(eClass);
				for (EReference reference : order) {
					output.println(eClass.getName() + ":" + reference.getName());
				}
			}
		} catch (IncorrectGraphException e) {
			output.println("cycle");
		}
		output.close();
		
		FileUtils.assertEqualFiles("", getURI("expected.txt"), getURI("output.txt"));
	}
}
