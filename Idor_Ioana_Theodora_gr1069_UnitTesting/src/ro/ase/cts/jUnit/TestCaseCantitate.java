package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;
import ro.ase.cts.Strategy.Comanda;

public class TestCaseCantitate extends TestCase {
	Comanda comanda;
	Rochie rochie;
	public TestCaseCantitate(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("SetUp testCantitate");	
		rochie= new Rochie("XL", 150f, "vascoza", true, false, false);
		comanda = new Comanda(5, rochie);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("TearDown testCantitate");	
		comanda=null;
		rochie=null;
	}
	public void testCantitateValoriNormale(){
		int cantitate = 3;
		comanda.setCantitate(cantitate);
		assertEquals("Verificare setCantitate cu valori normale",
				cantitate, comanda.getCantitate());
	}
	
	public void testCantitateValoriNegative(){
		int cantitate=-2;
		try{
			comanda.setCantitate(cantitate);
			fail("Cantitatea comandata este negativa");
		}
		catch(Exception e){			
		}
	}
	
}
