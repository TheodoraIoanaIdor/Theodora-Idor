package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;
import ro.ase.cts.Strategy.Comanda;

public class TestCaseNivelComanda extends TestCase {
	Comanda comanda;
	Rochie rochie;
	public TestCaseNivelComanda(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("SetUp testNivelComanda");
		rochie= new Rochie("XL", 150f, "vascoza", true, false, false);
		comanda = new Comanda(5, rochie);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("tearDown testNivelComanda");
		rochie=null;
		comanda=null;
	}
	public void testNivelComandaValoriNormale(){
		int level=10;	
		try{
			comanda.setNivelComanda(level);
			fail("Lipsa exceptie nivel = valoare aberanta");
		}catch(Exception e){
			
		}
	}
}
