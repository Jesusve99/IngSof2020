package modelo;

public class Usuario {
	private String correo;
	private String contrasena;
	
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
	public String getContraseña() {
		return contrasena;
	}
	public void setContraseña(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
