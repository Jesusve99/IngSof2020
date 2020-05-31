package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import modelo.Administrador;
import org.junit.Test;

public class TestAdministrador {
	private Administrador adminPrueba;
	private Administrador adminNoRegistrado;
	
	@Before
	public void init() {
		adminPrueba = new Administrador("prueba@gmail.com", "Prueba2000", "Málaga");
		adminNoRegistrado = new Administrador("estoNoEsUnCorreoRegistrado@gmail.com", "Contraseña1234");
	}
	
	@Test
	public void testAgregarAdministrador() {
		//Prueba de que agrega bien el Administrador 
		int numAdministradoresPrincipio = (int) Administrador.getTotalAdministrador();
		adminPrueba.agregarAdministrador();
		int numAdministradorPostAgregacion = (int) Administrador.getTotalAdministrador();
		assertEquals(numAdministradoresPrincipio+1, numAdministradorPostAgregacion);
		//Prueba de que no agrega Administrradores con correo a NULL
		Administrador adminIncorrecto = new Administrador(null, "");
		System.out.println(adminIncorrecto.getCorreo());
		assertFalse(adminIncorrecto.agregarAdministrador());
	}
	
	@Test
	public void testCorreoRegistrado() {
		//Comprobamos que el correo que esta registrado con un correo ya agregado
		//adminPrueba.agregarAdministrador();
		assertTrue(adminPrueba.correoRegistrado());
		//Comprobamos que el correo no esta registrado con un correo inventado
		assertFalse(adminNoRegistrado.correoRegistrado());
	}
	
	
	@Test
	public void testInicioCorrecto() {
		//Comprobamos que los datos esta registrado con un Administrador ya agregado
		assertTrue(adminPrueba.datosInicioCorrecto());
		//Comprobamos que los datos esta registrado con un Administrador inventado
		assertFalse(adminNoRegistrado.datosInicioCorrecto());
	}
	
	@Test
	public void testEliminarAdministrador() {
		int numAdministradores = (int) Administrador.getTotalAdministrador();
		adminPrueba.eliminarAdministrador();
		assertEquals(numAdministradores-1, Administrador.getTotalAdministrador());
	}
}
