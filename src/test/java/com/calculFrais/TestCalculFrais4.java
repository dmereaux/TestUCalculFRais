package com.calculFrais;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import com.calculFrais.*;

@RunWith(Parameterized.class)
public class TestCalculFrais4 {
	
	@Parameters public static Collection<Object[]> val(){
		return Arrays.asList(new Object [][] {});
	}
	private double total;
	private double montant;
	
	public TestCalculFrais4 ()
	{
	}
	
	@Test
	// Valeurs aux limites + partition par équivalence */
	public void test() throws MonException {
		paramAppli p = new paramAppli();
		CalculFrais f = new CalculFrais(p);
		assertEquals(20.0, f.montant(300.0),0.001);


	}

}
