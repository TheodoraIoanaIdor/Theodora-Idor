package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;

public class TestCaseConstructorRochie extends TestCase {
	Rochie rochie;
	public TestCaseConstructorRochie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("SetUp testConstructorRochie");	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("TearDown testConstructorRochie");	
	}
	public void testConstructorValoriValide(){
		String marime="M";
		float pret= 220f;
		String material="vascoza";
		rochie=new Rochie(marime, pret, material, false, false, false);
		assertEquals("Verificare constructor marime", marime, rochie.getMarime());
		assertEquals("Verificare constructor pret", pret, rochie.getPret());
		assertEquals("Verificare constructor material", material, rochie.getMaterial());
	}
	public void testConstructorMarimeNull(){
		String marime = null;
		float pret= 220f;
		String material="vascoza";
		try{
		rochie = new Rochie(marime, pret, material, false, false, false);
		fail("Lipsa exceptie pe marime =  null");
		}
		catch(Exception e){
			
		}
	}
	public void testConstructorMaterialNull(){
		String marime = "XL";
		float pret= 220f;
		String material=null;
		try{
		rochie = new Rochie(marime, pret, material, false, false, false);
		fail("Lipsa exceptie pe material =  null");
		}
		catch(Exception e){			
		}
	}
}
