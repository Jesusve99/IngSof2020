package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.Jugador;
import modelo.Partido;
import modelo.Pista;

public class TestPartido {

	private Jugador jugadorPrueba;
	private Pista pistaPrueba;

	@Before
	public void init() {
		jugadorPrueba = Jugador.obtenerJugador("prueba@prueba.com");
		pistaPrueba = Pista.obtenerPista("prueba", "prueba");

	}

	@Test
	public void agregarPartido() {
		Partido p = new Partido(pistaPrueba.getId(), "2020-05-29", "17:00:00", jugadorPrueba.getCorreo());
		long totalPartidos = Partido.getTotalPartidos();
		p.agregarPartido();

		assertEquals(totalPartidos + 1, Partido.getTotalPartidos());
	}

}