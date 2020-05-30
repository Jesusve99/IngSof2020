package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.Jugador;
import modelo.Partido;
import modelo.Pista;

class TestPista {


	@Before
	public void init() {
		
	}

	@Test
	public void agregarPista() {
		Pista p = new Pista("pista", "pista", "13:00:00", "17:00:00");
		long totalPistas = Pista.getTotalPistas();
		
		p.agregarPista();

		assertEquals(totalPistas + 1, Pista.getTotalPistas());
	}
}
