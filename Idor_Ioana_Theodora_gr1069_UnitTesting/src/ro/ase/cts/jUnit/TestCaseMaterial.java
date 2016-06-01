package ro.ase.cts.jUnit;

import junit.framework.TestCase;
import ro.ase.cts.Factory.Rochie;

public class TestCaseMaterial extends TestCase {
	Rochie rochie;
	public TestCaseMaterial(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("SetUp testMaterial");		
		rochie = new Rochie("XS", 200f, "vascoza", true, false, false);	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("tearDown testMaterial");
		rochie = null;
	}
	public void testMaterialValoriNormale(){
		String material ="BUMBAC";
		rochie.setMaterial(material);
		assertEquals("Verificare setMaterial cu valori normale",
				material, rochie.getMaterial());
	}
	public void testMaterialNull(){
		String material =null;
		try{
			rochie.setMaterial(material);
			fail("Verificare setMaterial cu valoare nula");
		}
		catch(Exception e){
			
		}
	}
	public void testMaterialIntrodus(){
		String material ="214587";
		try{
			rochie.setMaterial(material);
			fail("Verificare setMaterial cu valoare numerica");
		}
		catch(Exception e){
			
		}
	}
}
