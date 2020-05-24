package modelo;

import java.util.List;

public class Administrador extends Usuario {
	private BD baseDatos = new BD();
	private String ayuntamiento;
	
	public Administrador(String correo, String contrasena) {
		super(correo, contrasena);
	}
	
	public Administrador(String correo) {//Sacar Admin BD
		super(correo);
		try {
		Object[] ob = baseDatos.Select("Select * From Administrador where email = '"+ correo +"';").get(0);
		this.ayuntamiento = (String) ob[0];
		}catch (Exception e) {
		}
		
	}
	
	public String getAyuntamiento() {
		return this.ayuntamiento;
	}

	@Override
	boolean registrarse(String correo, String contrasena) {
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
			ok= true;
		}
		return ok;
	}

}
