package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.Pista;

public class TestPista2 {

	private Pista pistaPrueba;
	
	@Before
	public void init() {
		pistaPrueba = new Pista("pista", "pista", "13:00:00", "17:00:00");
	}
	
	
	//************FUNCIONA***************
	@Test
	public void agregarPista() {
		
		int totalPistas = (int)Pista.getTotalPistas();
		
		pistaPrueba.agregarPista();

		assertEquals(totalPistas + 1, (int)Pista.getTotalPistas());
		
		pistaPrueba.eliminarPista(); //Pongo esto para que el eiminar pista no se queje
	}
	
	@Test
	public void eliminarPista() {
		
		pistaPrueba.agregarPista();
		int totalPistas = (int) Pista.getTotalPistas();
		
		pistaPrueba.eliminarPista();

		assertEquals(totalPistas - 1,  (int) Pista.getTotalPistas());
	}
	
	@Test
	public void actualizarEstado() {
		pistaPrueba.deshabilitarPista();
		pistaPrueba.actualizarEstado();
		assertFalse(pistaPrueba.getEstado());
		
		pistaPrueba.habilitarPista();
		pistaPrueba.actualizarEstado();
		assertTrue(pistaPrueba.getEstado());
	}
	
	
	//************FUNCIONA***************
	@Test
	public void existePistaEnBD(){
		//p = pistaNoExistente
		Pista p = new Pista("peta", "zeta", "11:00:00", "20:00:00");
		
		assertTrue(pistaPrueba.existePistaEnBD());
		assertFalse(p.existePistaEnBD());
	}
	
}
