package ru.ifmo.rain.astrans;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;
import ru.ifmo.rain.astrans.asttomodel.AstransASTToModelTransformationTest;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.impl.CreatedClassesTest;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.impl.EPackageResolverTest;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.impl.IterableClassQNTest;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.impl.IterableQNTest;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.impl.MyEPackageTest;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.impl.ResolverTest;
import ru.ifmo.rain.astrans.interpreter.AstransInterpreterTest;
import ru.ifmo.rain.astrans.interpreter.backtrans.BacktransCodeGeneratorTest;
import ru.ifmo.rain.astrans.interpreter.backtrans.BacktransCreatorTest;
import ru.ifmo.rain.astrans.interpreter.backtrans.TraceAdapterTest;
import ru.ifmo.rain.astrans.util.AstransValidatorTest;
import ru.ifmo.rain.astrans.util.EClassMapTest;
import ru.ifmo.rain.astrans.util.EClassSetTest;
import utils.ORTest;
import utils.QNUtilsTest;

public abstract class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for ru.ifmo.rain.astrans");
		//$JUnit-BEGIN$
		
		suite.addTest(new JUnit4TestAdapter(AstransASTToModelTransformationTest.class));
		suite.addTest(new JUnit4TestAdapter(CreatedClassesTest.class));
		suite.addTest(new JUnit4TestAdapter(EPackageResolverTest.class));
		suite.addTest(new JUnit4TestAdapter(IterableClassQNTest.class));
		suite.addTest(new JUnit4TestAdapter(IterableQNTest.class));
		suite.addTest(new JUnit4TestAdapter(MyEPackageTest.class));
		suite.addTest(new JUnit4TestAdapter(ResolverTest.class));
		suite.addTest(new JUnit4TestAdapter(AstransInterpreterTest.class));
		suite.addTest(new JUnit4TestAdapter(BacktransCodeGeneratorTest.class));
		suite.addTest(new JUnit4TestAdapter(BacktransCreatorTest.class));
		suite.addTest(new JUnit4TestAdapter(TraceAdapterTest.class));
		suite.addTest(new JUnit4TestAdapter(AstransValidatorTest.class));
		suite.addTest(new JUnit4TestAdapter(EClassMapTest.class));
		suite.addTest(new JUnit4TestAdapter(EClassSetTest.class));
		suite.addTest(new JUnit4TestAdapter(ORTest.class));
		suite.addTest(new JUnit4TestAdapter(QNUtilsTest.class));

		//$JUnit-END$
		return suite;
	}

}
