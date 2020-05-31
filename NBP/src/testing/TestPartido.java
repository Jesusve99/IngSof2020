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
		
		pistaPrueba = Pista.obtenerPista("prueba", "prueba");
		
		partidoPrueba = new Partido(pistaPrueba.getId(), "2020-05-29", "17:00:00", jugadorPrueba.getCorreo());
		anfitrionRepetido = new Partido(pistaPrueba.getId(), "2020-05-29", "16:00:00", jugadorPrueba.getCorreo());
		anfitrionUnPartido = new Partido(pistaPrueba.getId(), "2020-05-29", "16:00:00", jugadorUnPartido.getCorreo());

	}

	@Test
	public void agregarPartido() {
		
		long totalPartidos = Partido.getTotalPartidos();
		partidoPrueba.agregarPartido();

		assertEquals(totalPartidos + 1, Partido.getTotalPartidos());
	}
	
	// Devuelve TRUE si el anfitrion no ha creado ningún otro partido en ese día, en
	// caso contrario devuelve FALSE
	@Test
	public void anfitrionOtroPartido() {
		
		assertFalse(partidoPrueba.anfitrionOtroPartido());
		//assertTrue(anfitrionUnPartido.anfitrionOtroPartido());
		
	}
	
	// Devuelve TRUE si la pista está sin utilizar en ese dia y hora, en caso
	//contrario devuelve FALSE
	@Test
	public void pistaDisponibleTiempo() {
		assertFalse(partidoPrueba.pistaDisponibleTiempo());
	}
	
	/*@Test
	public void eliminarPartido() {
		
		long totalPartidos = Partido.getTotalPartidos();
		partidoPrueba.eliminarPartido();

		assertEquals(totalPartidos - 1, Partido.getTotalPartidos());
	}*/
	
}