package modelo;

import java.util.List;

public class Administrador extends Usuario {
	private BD baseDatos = new BD();
	private String correo;
	private String contrasena;
	private String ayuntamiento;
	
	public Administrador(String correo, String contrasena,String ayuntamiento) {//Registro Completo
		baseDatos.Insert("Insert into Administrador (Email, Contrasena, Ayuntamiento) Values ('"+correo+"','"+contrasena+"','"+ayuntamiento+"');");                            
	}
	
	public Administrador(String correo) {//Sacar Admin BD
		try {
		Object[] ob = baseDatos.Select("Select * From Administrador where email = '"+ correo +"';").get(0);
		this.correo = (String) ob[0];
		this.contrasena = (String) ob[1];
		this.ayuntamiento = (String) ob[2];
		}catch (Exception e) {
			this.correo = "";
			this.contrasena = "";
		}
		
	}
	
	public String getAyuntamiento() {
		return this.ayuntamiento;
	}

	public boolean estaenBD(){
		return correo != "" ? true : false;
	}
	public boolean iniciosesion(String contra) {
		return contrasena.equals(contra);
	}

}
