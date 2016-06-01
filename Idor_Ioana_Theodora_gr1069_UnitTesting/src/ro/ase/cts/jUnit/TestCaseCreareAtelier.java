package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Singleton.Atelier;


public class TestCaseCreareAtelier extends TestCase {
	Atelier atelier;
	public TestCaseCreareAtelier(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("SetUp testCreareAtelier");	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("TearDown testCreareAtelier");	
	}
	public void testCreareAtelier(){
		String denumireAtelier="Atelier 2";
		String adresaAtelier="str. Florilor, nr. 6";
		atelier=Atelier.getAtelier(denumireAtelier, adresaAtelier);
		assertEquals("Verificare creare denumire atelier ", denumireAtelier, atelier.getDenumireAtelier());
		assertEquals("Verificare creare adresa atelier ", adresaAtelier, atelier.getAdresaAtelier());
	}
	public void testCreareAtelierDenumireNula(){
		String denumireAtelier=null;
		String adresaAtelier="str. Florilor, nr. 6";
		try{
			atelier=Atelier.getAtelier(denumireAtelier, adresaAtelier);
			fail("Lipsa exceptie denumireAtelier=nula");
		}
		catch(Exception e){
			
		}

	}
	public void testCreareAtelierAdresaNula(){
		String denumireAtelier="Atelier 2";
		String adresaAtelier=null;
		try{
			atelier=Atelier.getAtelier(denumireAtelier, adresaAtelier);
			fail("Lipsa exceptie adresaAtelier =nula");
		}
		catch(Exception e){
			
		}

	}
}
