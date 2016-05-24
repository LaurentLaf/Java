package debut.test;

import static org.junit.Assert.*;

import org.junit.Test;

import debut.Geo;

public class GeoTest {

	@Test
	public void testRetourneCaracteres() {
		assertEquals(Geo.retourneCaracteres(5, "*"), "*****");
		//fail("Not yet implemented");
	}

}
