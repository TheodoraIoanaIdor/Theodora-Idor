package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;
import ro.ase.cts.State.State;
public class TestCaseStareRochie extends TestCase {
	Rochie rochie;
	public TestCaseStareRochie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		rochie=new Rochie("XL", 150f, "vascoza", true, false, false);
		System.out.println("SetUp testStareRochie");	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("tearDown testStareRochie");
		rochie=null;
	}
	public void testStareRochieNull(){
		State stare=null;
		try{
			rochie.setState(stare);
			fail("Lipsa exceptie stare = null");
		}catch(Exception e){
			
		}
	}
}
