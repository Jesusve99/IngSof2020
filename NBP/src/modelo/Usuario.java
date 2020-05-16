package modelo;

import java.util.List;

public abstract class Usuario {
	private String correo;
	private String contrasena;
	private BD baseDatos = new BD();
	
	public Usuario(String correo, String contrasena) {//Introducir Usuario a bd
		baseDatos.Insert("Insert into 'Usuario' ('Email', 'Contrasena') Values ('"+correo+"','"+contrasena+"');");
	}
	
	public Usuario(String correo) {//Sacar Usuario bd
		try {
			Object[] ob = baseDatos.Select("Select * From Usuario where Email = '"+ correo +"';").get(0);
			this.correo = (String) ob[0];
			this.contrasena = (String) ob[1];
		}catch (Exception e) {
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
