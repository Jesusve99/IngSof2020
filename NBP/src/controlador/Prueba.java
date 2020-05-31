package controlador;

import java.text.ParseException;

import org.apache.commons.mail.EmailException;

import modelo.Administrador;
import modelo.Demarcacion;
import modelo.Jugador;
import modelo.Partido;
import modelo.Pista;

public class Prueba {

	public static void main(String[] args) throws EmailException, ParseException {
		// Prueba jugador
		/*
		 * Jugador j = Jugador.obtenerJugador("juanma@gmail.com");
		 * System.out.println(j.getNick());
		 * System.out.println("Existe correo: "+j.correoRegistrado());
		 * System.out.println("Datos correctos: "+j.datosInicioCorrecto());
		 */
		// Prueba administrador
		/*
		 * Administrador admin =
		 * Administrador.obtenerAdministrador("prueba@prueba.com");
		 * System.out.println(admin.getAyuntamiento());
		 * System.out.println("Existe correo: "+admin.correoRegistrado());
		 * System.out.println("Datos correctos: "+admin.datosInicioCorrecto());
		 */
		// Prueba Pista
/*
		Pista pista = new Pista("prueba", "prueba", "10:00:00", "22:00:00");
		pista.agregarPista();
		pista = Pista.obtenerPista("prueba", "prueba");
		System.out.println(pista.getId());
		System.out.println("Estado: " + pista.getEstado());
		pista.deshabilitarPista();
		pista.actualizarEstado();
		pista = Pista.obtenerPista("prueba", "prueba");
		System.out.println("Estado: " + pista.getEstado());
		System.out.println("Existe en BD: "+pista.existePistaEnBD());
		pista.eliminarPista();
		System.out.println("Existe en BD: "+pista.existePistaEnBD());
*/
		//Prueba Partido
/*
		Jugador j = new Jugador("prueba@prueba.es", "contra", "Prueba", Demarcacion.valueOf("DELANTERO"), "prueba", "prueba", "2000-09-02");
		j.agregarJugador();
		Pista pista = new Pista("prueba", "prueba", "10:00:00", "22:00:00");
		pista.agregarPista();
		pista = Pista.obtenerPista(pista.getNombre(), pista.getUbicacion());
		Partido p = new Partido(pista.getId(), "2020-05-06", "17:00:00", j.getCorreo());
		System.out.println("Anfitrion otro? "+p.anfitrionOtroPartido());
		System.out.println("Disponible? "+p.pistaDisponibleTiempo());
		p.agregarPartido();
		System.out.println("Anfitrion otro? "+p.anfitrionOtroPartido());
		System.out.println("Disponible? "+p.pistaDisponibleTiempo());
		p.eliminarPartido();
		pista.eliminarPista();
*/
	}
}
