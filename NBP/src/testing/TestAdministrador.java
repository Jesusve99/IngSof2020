package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import modelo.Administrador;
import org.junit.jupiter.api.Test;

class TestAdministrador {
	private Administrador adminPrueba;
	
	@Before
	public void init() {
		adminPrueba = new Administrador("prueba@gmail.com", "Prueba2000", "Málaga");
	}
	
	@Test
	void testAgregarAdministrador() {
		//Prueba de que agrega bien el Administrador 
		int numAdministradoresPrincipio = (int) Administrador.getTotalAdministrador();
		adminPrueba.agregarAdministrador();
		int numAdministradorPostAgregacion = (int) Administrador.getTotalAdministrador();
		assertEquals(numAdministradoresPrincipio+1, numAdministradorPostAgregacion);
		//Prueba de que no agrega Adminiistrradores con correo a NULL
		Administrador adminIncorrecto = new Administrador(null, null);
		adminIncorrecto.agregarAdministrador();
		assertEquals(numAdministradorPostAgregacion, Administrador.getTotalAdministrador());
	
		
	}

}
