package controlador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.apache.commons.mail.EmailException;

import modelo.Administrador;
import modelo.Demarcacion;
import modelo.Jugador;
import modelo.Partido;
import modelo.Pista;
import modelo.BD;
import modelo.BDException;

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
		//System.out.println("here");
		//Pista pista =Pista.obtenerPista("prueba", "prueba");
		//pista.agregarPista();
		//pista.eliminarPista();
		//System.out.println(pista.getNombre());
		//BD bd = new BD();
		//bd.SelectEscalar("");bdexception
		//bd.SelectEscalar(null);bdexception
		//p.eliminarPartido();
		//pista.eliminarPista();
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		//MIN*60000
		Date d = new Date();
		d.setYear(120);
		d.setMonth(6);
		d.setDate(7);
		d.setHours(10);
		d.setMinutes(30);
		d.setSeconds(0);
		System.out.println(d.toString());
		
		String fecha = "2020-05-06";
		String[] sf = fecha.split("-");
		Date actual = new Date();
		Date df = new Date();
		df.setYear(Integer.parseInt(sf[0])-1900);
		df.setMonth(Integer.parseInt(sf[1])-1);
		df.setDate(Integer.parseInt(sf[2]));
		df.setHours(0);
		df.setMinutes(0);
		df.setSeconds(0);
		System.out.println(df.toString());
		System.out.println((actual.before(df)));
		*/
		
	}
}
