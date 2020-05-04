package modelo;

import java.util.List;

public class Jugador extends Usuario {
	
	BD mibd = new BD();
	
	private String nick;
	private String posicionfav;
	private String nombre;
	private String apellidos;
	
	public Jugador(String correo, String contrasena, String nick, String posicionfav, String nombre, String apellidos) {
		super(correo, contrasena);
		this.nick = nick;
		this.posicionfav = posicionfav;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNick() {
		
		List<Object[]> lista = mibd.Select("SELECT * FROM Jugador WHERE correo = 'prueba@';");
		Object[] ob =  lista.get(0);
		String nick = (String) ob[2];
		
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPosicionfav() {
		return posicionfav;
	}

	public void setPosicionfav(String posicionfav) {
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
	
	
}
