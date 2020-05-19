package controlador;


import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import modelo.Administrador;
import modelo.BD;
import modelo.Demarcacion;
import modelo.Jugador;
import modelo.Usuario;
import modelo.EnviarCorreo;
//Correo:ingsoftwarenbp@gmail.com
//Contraseña:vKa9rl8nd5

public class Prueba {

	public static void main(String[] args) throws EmailException, ParseException {
		////ENVIAR CORREO
		//EnviarCorreo env = new EnviarCorreo("marialopez57@uma.es");
		//env.enviar("Tema","Mensaje");	
		////OBTENER ADMINISTRADOR
		//Administrador admin = new Administrador("admin@");
		//System.out.println(admin.getCorreo()+"  "+admin.getContrasena()+" "+admin.getAyuntamiento());
		////OBTENER JUGADOR
		//Jugador jug = new Jugador("admin@");
		//System.out.println(jug.getCorreo()+" "+jug.getContrasena()+" "+jug.getNick()+" "+jug.getPosicionfav()+" "+jug.getNombre()+" "+jug.getApellidos()+" "+jug.getFechaNacimiento());
		////INSERTAR BASICO
		//Jugador jug = new Jugador("primero@","primero");
		////INSERTAR COMPLETO
		//Jugador jug = new Jugador("primero@","primero@","nick1",Demarcacion.PORTERO,"nombre1","apellidos1","2002-02-02");
		////COMPROBAR SI SE PUEDE REGISTRAR
		Jugador jug = new Jugador("admin@");
		System.out.println(jug.estaenBD());

	}	
}
