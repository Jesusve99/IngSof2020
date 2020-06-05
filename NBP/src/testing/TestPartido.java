package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import modelo.Jugador;
import modelo.Partido;
import modelo.Pista;

public class TestPartido {

	private Jugador jugadorPrueba;
	private Jugador jugadorUnPartido;
	private Pista pistaPrueba;
	private Partido partidoPrueba;
	private Partido anfitrionRepetido;
	private Partido anfitrionUnPartido;

	@Before
	public void init() {
		jugadorPrueba = Jugador.obtenerJugador("prueba@prueba.com");
		jugadorUnPartido = Jugador.obtenerJugador("notengopartido@correo.es");
		
		pistaPrueba = Pista.obtenerPista("prueba");
		
		partidoPrueba = new Partido(pistaPrueba.getId(), "2020-05-29", "17:00:00", jugadorPrueba.getCorreo());
		anfitrionRepetido = new Partido(pistaPrueba.getId(), "2020-05-29", "16:00:00", jugadorPrueba.getCorreo());
		anfitrionUnPartido = new Partido(pistaPrueba.getId(), "2020-05-29", "16:00:00", jugadorUnPartido.getCorreo());

	}

	@Test
	public void agregarPartido() {
		
		long totalPartidos = Partido.getTotalPartidos();
		partidoPrueba.agregarPartido();

		assertEquals(totalPartidos + 1, Partido.getTotalPartidos());
		
		partidoPrueba.obtenerCodPartido(pistaPrueba.getId(), "2020-05-29", "17:00:00", jugadorPrueba.getCorreo());
		partidoPrueba.eliminarPartido();
	}
	
	// Devuelve TRUE si el anfitrion no ha creado ningï¿½n otro partido en ese dï¿½a, en
	// caso contrario devuelve FALSE
	@Test
	public void anfitrionOtroPartido() {
		partidoPrueba.agregarPartido();
		anfitrionRepetido.agregarPartido();
		anfitrionUnPartido.agregarPartido();
		
		assertFalse(partidoPrueba.anfitrionOtroPartido());
		assertTrue(anfitrionUnPartido.anfitrionOtroPartido());
		
		partidoPrueba.obtenerCodPartido(pistaPrueba.getId(), "2020-05-29", "17:00:00", jugadorPrueba.getCorreo());
		anfitrionRepetido.obtenerCodPartido(pistaPrueba.getId(), "2020-05-29", "16:00:00", jugadorPrueba.getCorreo());
		anfitrionUnPartido.obtenerCodPartido(pistaPrueba.getId(), "2020-05-29", "16:00:00", jugadorUnPartido.getCorreo());
		
		partidoPrueba.eliminarPartido();
		anfitrionRepetido.eliminarPartido();
		anfitrionUnPartido.eliminarPartido();
	}
	
	// Devuelve TRUE si la pista estï¿½ sin utilizar en ese dia y hora, en caso
	//contrario devuelve FALSE
	@Test
	public void pistaDisponibleTiempo() {
		assertFalse(partidoPrueba.pistaDisponibleTiempo());
	}
	
	@Test
	public void eliminarPartido() {
		partidoPrueba.agregarPartido();
		partidoPrueba.obtenerCodPartido(pistaPrueba.getId(), "2020-05-29", "17:00:00", jugadorPrueba.getCorreo());
		
		long totalPartidos = Partido.getTotalPartidos();
		partidoPrueba.eliminarPartido();

		assertEquals(totalPartidos - 1, Partido.getTotalPartidos());
	}
	
	//Añade al partido al anfitrion del partido
	@Test
	public void agregarAnfitrion() {
		partidoPrueba.agregarPartido();
		partidoPrueba.agregarAnfitrion();
		
		int totalJugadores = partidoPrueba.getTotalJugadores();
		System.out.println(totalJugadores);
		assertEquals(totalJugadores, 1);
		
		partidoPrueba.obtenerCodPartido(pistaPrueba.getId(), "2020-05-29", "17:00:00", jugadorPrueba.getCorreo());
		partidoPrueba.eliminarPartido();
	}
	
}