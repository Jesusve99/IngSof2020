package modelo;

import java.util.Date;
import java.util.List;

public class Jugador extends Usuario {

	private String nick;
	private Demarcacion posicionfav;
	private String nombre;
	private String apellidos;
	private BD baseDatos = new BD();
	private Date fechaNacimiento;
	
	public Jugador(String correo, String contrasena, String nick, Demarcacion posicionfav, String nombre, String apellidos,Date fechaNacimiento) {
		super(correo, contrasena);
		this.nick = nick;
		this.posicionfav = posicionfav;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNick() {
		
		List<Object[]> lista = baseDatos.Select("SELECT * FROM Jugador WHERE correo = 'prueba@';");
		Object[] ob =  lista.get(0);
		String nick = (String) ob[2];
		
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Demarcacion getPosicionfav() {
		return posicionfav;
	}

	public void setPosicionfav(Demarcacion posicionfav) {
		this.posicionfav = posicionfav;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public boolean registrarse(String correo, String contrasena) {
		StringBuilder codigoBD = new StringBuilder();StringBuilder codigoBDJugador = new StringBuilder();
		boolean ok= false;
		List<Object[]> lista = baseDatos.Select("SELECT * FROM Jugador WHERE correo = '"+correo+"';");
		if(lista.isEmpty()){ //La lista está vacia por lo tanto el usuario no existe en nuestra BD
			codigoBD.append("Insert into Usuario (correo,contrasena) ");
			codigoBD.append("Values (");
			codigoBD.append(correo);
			codigoBD.append(",");
			codigoBD.append(contrasena);
			codigoBD.append(");");
			baseDatos.Insert(codigoBD.toString());
			codigoBDJugador.append("Insert into Jugador (correo,id,posicionFavorita,nombre,apellidos,fechaNacimiento) "); //!!!!!Revisar que está asi en la BD definitiva!!!!!
			codigoBDJugador.append("Values (");
			codigoBDJugador.append(getNick());
			codigoBDJugador.append(",");
			codigoBDJugador.append(getNombre());
			codigoBDJugador.append(",");
			codigoBDJugador.append(getApellidos());
			codigoBDJugador.append(",");
			codigoBDJugador.append(getPosicionfav());
			codigoBDJugador.append(",");
			codigoBDJugador.append(correo);
			codigoBDJugador.append(");");
			baseDatos.Insert(codigoBDJugador.toString());
			ok= true;
		}
		return ok;
	}
}
