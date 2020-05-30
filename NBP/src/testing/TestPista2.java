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

	/*@Test
	public void eliminarPista() {
		long totalPistas = Pista.getTotalPistas();
		
		pistaPrueba.eliminarPista();

		assertEquals(totalPistas - 1, Pista.getTotalPistas());
	}*/
	
	
	//************FUNCIONA***************
	/*@Test
	public void agregarPista() {
		
		long totalPistas = Pista.getTotalPistas();
		
		pistaPrueba.agregarPista();

		assertEquals(totalPistas + 1, Pista.getTotalPistas());
	}*/
	
	/*@Test
	public void actualizarEstado() {
		System.out.println(pistaPrueba.getEstado());
		assertFalse(pistaPrueba.getEstado());
		
	}*/
	
	
	//************FUNCIONA***************
	@Test
	public void existePistaEnBD(){
		Pista p = new Pista("pista", "pista", "13:00:00", "17:00:00");
		
		assertTrue(p.existePistaEnBD());
	}
	
}
