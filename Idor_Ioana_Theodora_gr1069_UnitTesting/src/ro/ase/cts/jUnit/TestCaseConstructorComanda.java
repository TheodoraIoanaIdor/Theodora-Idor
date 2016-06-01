package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;
import ro.ase.cts.Strategy.Comanda;

public class TestCaseConstructorComanda extends TestCase {
	Comanda comanda;
	public TestCaseConstructorComanda(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("SetUp testConstructorComanda");	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("TearDown testConstructorComanda");	
	}
	public void testConstructorComandaValoriValide(){
		Rochie rochie=new Rochie("XL", 150f, "vascoza", true, false, false);
		int cantitate=5;
		comanda=new Comanda(cantitate, rochie);
		assertEquals("Verificare constructor rochie", rochie, comanda.getRochie());
	}
	public void testConstructorCantitate(){
		Rochie rochie=new Rochie("XL", 150f, "vascoza", true, false, false);
		int cantitate=-9;
		try{					
			comanda= new Comanda(cantitate, rochie);			
			fail("Lipsa exceptie pe cantitate =  valoare aberanta");
		}
		catch(Exception e){			
		}
	}
	public void testConstructorRochieNull(){
		Rochie rochie=null;
		int cantitate=4;
		try{					
			comanda= new Comanda(cantitate, rochie);			
			fail("Lipsa exceptie pe rochie =  null");
			//Testul trece deoarece se arunca o exceptie din
			//constructorul rochiei
		}
		catch(Exception e){			
		}
	}
}
