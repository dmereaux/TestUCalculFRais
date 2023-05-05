package com.calculFrais;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;




public class TestCalculFrais {
	@Test
	// Valeurs aux limites + partition par équivalence */
	public void test() throws MonException {
		paramAppli p = new paramAppli();
		CalculFrais f = new CalculFrais(p);
		assertEquals(20.0, f.montant(300.0),0.001);


	}


}
