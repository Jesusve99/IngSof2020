package modelo;

import java.util.Date;
import java.util.List;

public class Jugador extends Usuario {
	private String correo;
	private String contrasena;
	private String nick;
	private Demarcacion posicionfav;
	private String nombre;
	private String apellidos;
	private BD baseDatos = new BD();
	private String fechaNacimiento;
	
	
	public Jugador(String correo) {//Sacar Jugador bd
		try {
			Object[] ob = baseDatos.Select("Select * From Jugador where correo = '"+ correo +"';").get(0);
			this.correo = (String) ob[0];
			this.contrasena = (String) ob[1];
			this.nick = (String) ob[2];
			this.posicionfav = Demarcacion.valueOf((String) ob[3]);
			this.nombre = (String) ob[4];
			this.apellidos = (String) ob[5];
			this.fechaNacimiento = (String) ob[6].toString();
		}catch(Exception e) {
			this.correo = "";
			this.contrasena = "";
		}
	}
	
	//Registro Basico
	public Jugador(String correo, String contrasena) {
		baseDatos.Insert("Insert into Jugador(correo, contra) Values ('"+correo+"','"+contrasena+"');");
	}
	
	//Registro Completo
	public Jugador(String correo,String contra, String nick, Demarcacion posicionfav, String nombre, String apellidos, String fechaNacimiento) {
		baseDatos.Insert("INSERT INTO Jugador(correo, contra, nick, posicionfav, nombre, apellidos, Fecha_nacimiento) VALUES ('"+correo+"','"+contra+"','"+nick+"','"+posicionfav+"','"+nombre+"','"+apellidos+"','"+fechaNacimiento+"');");
	}

	public String getCorreo() {
		return correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public String getNick() {
		return nick;
	}

	public Demarcacion getPosicionfav() {
		return posicionfav;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public boolean estaenBD(){
		return correo != "" ? true : false;
	}

	
	public boolean iniciosesion(String contra) {
		return contrasena.equals(contra);
	}

	
}
