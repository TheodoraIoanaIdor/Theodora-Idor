package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;

public class TestCasePret extends TestCase {
	Rochie rochie;
	public TestCasePret(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("SetUp testPret");		
		rochie = new Rochie("XL", 150f, "vascoza", true, false, false);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("tearDown testPret");
		rochie = null;
	}
	public void testPretValoriNormale(){
		float pret = 220f;
		rochie.setPret(pret);
		assertEquals("Verificare setPret cu valori normale",
				pret, rochie.getPret());
	}
	public void testPretValoriNegative(){
		float pretNou = -150f;
		try{
		rochie.setPret(pretNou);
		fail("Pretul este negativ");
		}
		catch(Exception e){			
		}
	}
	public void testPretValoareMaximaAberanta(){
		float pretNou = 20000000f;
		try{
		rochie.setPret(pretNou);
		fail("Pretul are valoare maxima aberanta");
		}
		catch(Exception e){			
		}
	}
	public void testPretValoareMinimaAberanta(){
		float pretNou = 5f;
		try{
		rochie.setPret(pretNou);
		fail("Pretul are valoare minima aberanta");
		}
		catch(Exception e){			
		}
	}
}
