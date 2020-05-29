package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import modelo.Jugador;
import modelo.Partido;

public class TestPartido{
	
	static Partido po;
	
	@BeforeEach
	public void init() {
		Jugador j = new Jugador("correo@uma.es", "contra");
		po = new Partido(1, "correo@uma.es", "contra", j.getCorreo());
	}
	
	@Test
	public void agregarPartido() {
		//Jugador j = new Jugador("correo@uma.es", "contra");
		//po = new Partido(1, "2013-03-14", "13:00:00", j.getCorreo());
		int totalPartidos = Partido.getTotalPartidos();
		
		po.agregarPartido();
		
		assertEquals(totalPartidos+1, Partido.getTotalPartidos());
		
	}

}
