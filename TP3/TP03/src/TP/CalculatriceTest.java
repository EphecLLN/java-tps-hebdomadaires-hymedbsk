package TP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	
	@Test
	public void testCarre() {
		Calculatrice calc = new Calculatrice(2);
		assertEquals(4,calc.carre(2));
		
	}

}
  