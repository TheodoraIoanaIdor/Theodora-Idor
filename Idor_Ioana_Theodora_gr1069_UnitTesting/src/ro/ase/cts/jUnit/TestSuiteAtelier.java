package ro.ase.cts.jUnit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteAtelier {

	public static Test suite() {
		TestSuite suite = new TestSuite(TestSuiteAtelier.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCaseCreareAtelier.class);
		suite.addTest(TestSuiteComanda.suite());
		suite.addTest(TestSuiteRochie.suite());
		//$JUnit-END$
		return suite;
	}

}
