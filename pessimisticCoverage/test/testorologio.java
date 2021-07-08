package test;

import static org.junit.Assert.*;

import org.junit.Test;
import logic.orologio;
public class testorologio {

	@Test
	public void test() {
	 orologio orologio1 = new orologio();
	 assertEquals(16.34,orologio1.cambioorario(13.34, 3.0),0.0);
	
	}
	@Test
	public void test2() {
		 orologio orologio2 = new orologio();

	
   assertEquals(12.41,orologio2.cambioorario(9.00, 3.41),0.0);
	  
}
}
