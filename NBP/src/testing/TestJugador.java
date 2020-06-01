package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import modelo.Demarcacion;
import modelo.Jugador;

public class TestJugador {

	private Jugador j;
	private Jugador jugador;
	
	@Before
	public void init() {
		j = new Jugador("holi@uma.es","Holiwi2","Del",Demarcacion.DEFENSA,"mari","lopez","2000-10-10");
	}
	
	@Test
	public void TestAgregarJugador() {
		int numJugadoresInicial = (int) Jugador.getTotalJugadores();
		j.agregarJugador();
		assertEquals(numJugadoresInicial + 1, (int)Jugador.getTotalJugadores());
	}
	
	@Test
	public void testCorreoRegistrado() {
		assertTrue(j.correoRegistrado());
	}
	
	@Test
	public void testObtenerJugador() {
		assertEquals(Jugador.obtenerJugador("holi@uma.es"),j);
		
	}
	
	@Test
	public void testInicioCorrecto() {
		assertTrue(j.datosInicioCorrecto());
	}
	
	@Test
	public void testEliminarAdministrador() {
		int numJugadores = (int) Jugador.getTotalJugadores();
		j.eliminarJugador();
		assertEquals(numJugadores-1, Jugador.getTotalJugadores());
	}
}
