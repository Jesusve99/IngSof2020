package controlador;

import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import modelo.Administrador;
import modelo.BD;

import modelo.Jugador;
//Correo:ingsoftwarenbp@gmail.com
//Contraseña:vKa9rl8nd5

public class Prueba {

	public static void main(String[] args) throws EmailException {
		//bd();
		//enviar("Que pasa fiera :)","marialopez57@uma.es");	
		Administrador ad = new Administrador("admin");
		System.out.println(ad.getContrasena() + " " +ad.getCorreo()+" "+ad.getAyun());
	}
	
	public static void enviar (String str,String destino) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setSSLOnConnect(true);
		email.setAuthenticator(new DefaultAuthenticator("ingsoftwarenbp@gmail.com", "vKa9rl8nd5"));
		email.setSSLOnConnect(true);
		email.setFrom("ingsoftwarenbp@gmail.com");
		email.setSubject("TestMail");
		email.setMsg(str);
		email.addTo(destino);
		email.send();
		System.out.println("Mensaje enviado");
	}
	
	public static void bd() {
		BD mibd = new BD();
		
		List<Object[]> lista = mibd.Select("SELECT * FROM Jugador WHERE correo_jug = 'prueba@';");
		Object[] ob =  lista.get(0);
		String email = (String) ob[0];
		String contrasena = (String) ob[1];
		
		System.out.println(email);
		System.out.println(contrasena);
	}
	String correo = "el que sea";
	BD mibd = new BD();
	Object[] ob = mibd.Select("SELECT * FROM Usuario WHERE email = '" + correo + "';").get(0);
	String correobd = (String) ob[0];
	String contrabd = (String) ob[1];	
	
	
	
}
