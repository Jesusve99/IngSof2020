package modelo;

import java.util.List;

public abstract class Usuario {
	private String correo;
	private String contrasena;
	private BD baseDatos;
	
	public Usuario(String correo, String contrasena) {
		this.correo = correo;
		this.contrasena = contrasena;
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
