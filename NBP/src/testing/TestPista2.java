package testing;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import modelo.Pista;

public class TestPista2 {

	private static Pista pistaPrueba;
	
	@Before
	public void init() {
		pistaPrueba = new Pista("pista15", "pista15", "13:00:00", "17:00:00");
		
	}
	
	/*@AfterClass
	public static void fin() {
		pistaPrueba = Pista.obtenerPista("pista15", "pista15");
		pistaPrueba.eliminarPista();
	}*/
	
	@Test
	public void agregarPista() {
		pistaPrueba.agregarPista();
		pistaPrueba = Pista.obtenerPista("pista15", "pista15");
		pistaPrueba.eliminarPista();
		
		int totalPistas = (int)Pista.getTotalPistas();
		
		pistaPrueba.agregarPista();

		assertEquals(totalPistas + 1, (int)Pista.getTotalPistas());
		
		pistaPrueba = Pista.obtenerPista("pista15", "pista15");
		pistaPrueba.eliminarPista(); //Pongo esto para que el eliminar pista no se queje
	}
	
	@Test
	public void eliminarPista() {
		pistaPrueba.agregarPista();
		pistaPrueba = Pista.obtenerPista("pista15", "pista15");
		int totalPistas = (int) Pista.getTotalPistas();
		
		pistaPrueba.eliminarPista();
		
		assertEquals(totalPistas - 1,  (int) Pista.getTotalPistas());
	}
	
	@Test
	public void actualizarEstado() {
		pistaPrueba.agregarPista();
		pistaPrueba = Pista.obtenerPista("pista15", "pista15");
		pistaPrueba.deshabilitarPista();
		pistaPrueba.actualizarEstado();
		assertFalse(pistaPrueba.getEstado());
		
		pistaPrueba.habilitarPista();
		pistaPrueba.actualizarEstado();
		assertTrue(pistaPrueba.getEstado());
		
		pistaPrueba = Pista.obtenerPista("pista15", "pista15");
		pistaPrueba.eliminarPista();
		
	}
	

	@Test
	public void existePistaEnBD(){
		
		//p = pistaNoExistente
		Pista p = new Pista("peta", "zeta", "11:00:00", "20:00:00");
		
		pistaPrueba.agregarPista();
		pistaPrueba = Pista.obtenerPista("pista15", "pista15");
		
		assertTrue(pistaPrueba.existePistaEnBD());
		assertFalse(p.existePistaEnBD());
		
		pistaPrueba.eliminarPista();
	}
	
}
