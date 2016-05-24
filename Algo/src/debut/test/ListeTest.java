package debut.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import debut.Liste;

public class ListeTest {
	
	@Test
	public void testEstVide() {
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
		assertEquals(Liste.suite(Liste.initListe2()), Liste.initListe3());
		assertNull(Liste.suite(Liste.listeVide())); 
	}
	
	@Test
	public void testestSurLeDernierElement() {
		assertFalse(Liste.estSurLeDernierElement(Liste.initListe1()));
		assertFalse(Liste.estSurLeDernierElement(Liste.initListe2()));
		assertTrue(Liste.estSurLeDernierElement(Liste.initListe3()));
		assertFalse(Liste.estSurLeDernierElement(Liste.listeVide()));	
	}
	
	@Test
	public void testdernier() {
		assertEquals(Liste.dernier(Liste.initListe1()), "monde");
		assertEquals(Liste.dernier(Liste.initListe2()), "monde");
		assertEquals(Liste.dernier(Liste.initListe3()), "monde");
		assertNull(Liste.dernier(Liste.listeVide()));
	}
	
	
	
}
