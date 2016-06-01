package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;

public class TestCaseIdRochie extends TestCase {
	Rochie rochie;
	public TestCaseIdRochie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		rochie=new Rochie("XL", 150f, "vascoza", true, false, false);
		System.out.println("SetUp testIdRochie");	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		rochie=null;
		System.out.println("TearDown testIdRochie");	
	}
	public void testIdRochie(){
		String id="O";
		rochie.setId(id);
		assertEquals("Verificare ID rochie", id, rochie.getId());
	}
	public void testIdRochieNull(){
		String id=null;
		try{
		rochie.setId(id);
		fail("Lipsa exceptie id=null");
		}catch(Exception e){
			
		}
	}
	public void testIdRochieValoareAberanta(){
		String id ="hyhuikhg";
		try{
			rochie.setId(id);
			fail("Verificare setID cu valori aberante");
		}
		catch(Exception e){
			
		}
	}
}
