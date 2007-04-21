package ru.ifmo.rain.astrans.util;

import static org.junit.Assert.assertFalse;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

import ru.ifmo.rain.astrans.AstransPackage;
import ru.ifmo.rain.astrans.utils.EMFHelper;
import utils.FileUtils;

public class AstransValidatorTest {

	@SuppressWarnings("unchecked")
	@Test
	public final void testValidateSkipClass_FullyDefineAbstractClasses() throws IOException {
		String dir = "testData/modelvalidation/testFullyDefineAbstractClasses/";
		EObject object = EMFHelper.loadEObjectFromXMIResource(AstransPackage.eINSTANCE, dir + "Transformation.xmi");
		BasicDiagnostic diagnostics = new BasicDiagnostic(AstransValidator.DIAGNOSTIC_SOURCE, 0, "", new Object[] {});
		Map context = new HashMap();
		SubstitutionLabelProvider labelProvider = new SubstitutionLabelProvider() {

			public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
				return eStructuralFeature.getEContainingClass().getName() + "::" + eStructuralFeature.getName();
			}

			public String getObjectLabel(EObject eObject) {
				return eObject.eResource().getURIFragment(eObject);
			}

			public String getValueLabel(EDataType eDataType, Object value) {
				return "(" + eDataType.getName() + ") " + value;
			}
			
		};
		context.put(SubstitutionLabelProvider.class, labelProvider);
		boolean b = Diagnostician.INSTANCE.validate(object, diagnostics, context);
		assertFalse(b);
		
		FileWriter messages = new FileWriter(dir + "messages");
		for (Iterator iter = diagnostics.getChildren().iterator(); iter.hasNext();) {
			Diagnostic diagnostic = (Diagnostic) iter.next();
			messages.write(diagnostic.getMessage() + "\n");
		}
		messages.close();
		
		FileUtils.assertEqualFiles("", dir + "expected_messages", dir + "messages");
	}

}
