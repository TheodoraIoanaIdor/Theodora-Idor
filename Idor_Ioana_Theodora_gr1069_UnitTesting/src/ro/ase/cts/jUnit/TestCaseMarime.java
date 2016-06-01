package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;

public class TestCaseMarime extends TestCase {
	Rochie rochie;
	public TestCaseMarime(String name) {
		super(name);		
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("SetUp testMarime");		
		rochie = new Rochie("XS", 200f, "vascoza", true, false, false);	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("tearDown testMarime");
		rochie = null;
	}
	public void testMarimeValoriNormale(){
		String marime ="S";
		rochie.setMarime(marime);
		assertEquals("Verificare setMarime cu valori normale",
				marime, rochie.getMarime());
	}
	public void testMarimeValoriAberante(){
		String marime ="hyhuikhg";
		try{
			rochie.setMarime(marime);
			fail("Verificare setMarime cu valori aberante");
		}
		catch(Exception e){
			
		}
	}
}
