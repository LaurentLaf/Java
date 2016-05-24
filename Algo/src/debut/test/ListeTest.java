package debut.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import debut.Liste;

public class ListeTest {
	
	@Test
	public void testEstVide() {
		//assertEquals(Liste.estVide(Liste.initListe1()), false);
		
		//encore mieux utiliser assertFalse(liste); assertTrue(liste);
		
		assertFalse(Liste.estVide(Liste.initListe1()));
		assertFalse(Liste.estVide(Liste.initListe2()));
		assertTrue(Liste.estVide(Liste.listeVide()));
	}

	@Test
	public void testPremier() {
		assertEquals(Liste.premier(Liste.initListe1()), "Coucou");
		assertEquals(Liste.premier(Liste.initListe2()), "le");
		assertEquals(Liste.premier(Liste.listeVide()), null);
	}

	@Test
	public void testSuite() {
		 
		assertEquals(Liste.suite(Liste.initListe1()), Liste.initListe2());
		//assertEquals(Liste.suite(Liste.initListe1()), "[7, 8, 9]");
		//assertEquals(Liste.suite(Liste.initListe1()), "[]"); 
	}

}
