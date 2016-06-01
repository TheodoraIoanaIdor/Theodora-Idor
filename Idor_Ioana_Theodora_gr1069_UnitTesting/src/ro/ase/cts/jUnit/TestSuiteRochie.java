package ro.ase.cts.jUnit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteRochie {

	public static Test suite() {
		TestSuite suite = new TestSuite(TestSuiteRochie.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCaseConstructorRochie.class);
		suite.addTestSuite(TestCaseIdRochie.class);
		suite.addTestSuite(TestCaseMarime.class);
		suite.addTestSuite(TestCaseMaterial.class);
		suite.addTestSuite(TestCasePret.class);
		suite.addTestSuite(TestCaseStareRochie.class);
		//$JUnit-END$
		return suite;
	}

}
