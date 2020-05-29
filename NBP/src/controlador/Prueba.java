package controlador;


import java.text.ParseException;

import org.apache.commons.mail.EmailException;

import modelo.Jugador;
import modelo.Partido;

public class Prueba {

	public static void main(String[] args) throws EmailException, ParseException {
		////ENVIAR CORREO
		//EnviarCorreo env = new EnviarCorreo("marialopez57@uma.es");
		//env.enviar("Tema","Mensaje");	
		////OBTENER ADMINISTRADOR
		//Administrador admin = new Administrador("admin@");
		//System.out.println(admin.estaenBD());
		//System.out.println(admin.getCorreo()+"  "+admin.getContrasena()+" "+admin.getAyuntamiento());
		////OBTENER JUGADOR
		//Jugador jug = new Jugador("admin@");
		//System.out.println(jug.getCorreo()+" "+jug.getContrasena()+" "+jug.getNick()+" "+jug.getPosicionfav()+" "+jug.getNombre()+" "+jug.getApellidos()+" "+jug.getFechaNacimiento());
		////INSERTAR BASICO
		//Jugador jug = new Jugador("primero@","primero");
		////INSERTAR COMPLETO
		//Jugador jug = new Jugador("primero@","primero@","nick1",Demarcacion.PORTERO,"nombre1","apellidos1","2002-02-02");
		////COMPROBAR SI SE PUEDE REGISTRAR
		//Jugador jug = new Jugador("admin@");
		//System.out.println(jug.estaenBD());
////		String a = "";
////		String b = null;
//		System.out.println(a.length());
//		System.out.println(Partido.getTotalPartidos());
//		Partido p = new Partido(5, "2020-05-29", "17:00:00", "juanma@gmail.com");
//		p.agregarPartido();
//		Jugador j = Jugador.obtenerJugador("prueba@prueba.com");
//		System.out.println(j.getCorreo());
	}	
}
