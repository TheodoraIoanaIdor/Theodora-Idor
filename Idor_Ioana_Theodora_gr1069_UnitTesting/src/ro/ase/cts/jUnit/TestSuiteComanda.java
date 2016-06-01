package ro.ase.cts.jUnit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteComanda {

	public static Test suite() {
		TestSuite suite = new TestSuite(TestSuiteComanda.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCaseCantitate.class);
		suite.addTestSuite(TestCaseConstructorComanda.class);
		suite.addTestSuite(TestCaseNivelComanda.class);
		//$JUnit-END$
		return suite;
	}

}
