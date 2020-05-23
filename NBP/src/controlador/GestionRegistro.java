package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.BD;
import modelo.Jugador;


public class GestionRegistro {
	
	public void obtenerRegistro(Jugador r) {
		
		BD bd = new BD();
		Connection con = null;
		Statement pst = null;
		int n ;
		
		try {
			con = BD.connectToDatabase();
			
			String sql = "INSERT INTO jugador (correo, nick, posicion, nombre, apellidos, fechanac) VALUES (\""+r.getCorreo()+"\",\""+r.getNick()+"\",\""+
			r.getPosicionfav()+"\",\""+r.getNombre()+"\",\""+r.getApellidos()+"\",\""+r.getFechaNacimiento()+"\");";
			
			pst = con.createStatement();
			
			n = pst.executeUpdate(sql);
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
