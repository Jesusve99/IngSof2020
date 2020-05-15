package modelo;

import java.util.List;

public abstract class Usuario {
	private String correo;
	private String contrasena;
	private BD baseDatos = new BD();
	
	public Usuario(String correo, String contrasena) {
		this.correo = correo;
		this.contrasena = contrasena;
	}
	
	protected Usuario(String correo) {//Sacar Usuario BD
		try {
		Object[] ob = baseDatos.Select("SELECT * FROM Usuario WHERE Email = '" + correo + "';").get(0);
		this.correo = (String) ob[0];
		this.contrasena = (String) ob[1];
	
		}catch(IndexOutOfBoundsException e) {
		}
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	abstract boolean registrarse(String correo, String contrasena);

	
}
