package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.BD;
import modelo.Pista;

public class GestionPista {
	public void obtenerPista(Pista p) {
		
		BD bd = new BD();
		Connection con = null;
		Statement pst = null;
		int n ;
		
		try {
			con = BD.connectToDatabase();
			
			String sql = "INSERT INTO Pista (nombre, ubicacion, Hora_inicio, Hora_fin) VALUES (\""+p.getNombre()+"\",\""+p.getUbicacion()+"\",\""+
			p.getHoraInicio()+"\",\""+p.getHoraFin()+"\");";
			pst = con.createStatement();
			//pst = con.prepareStatement(sql);
			/*pst.setString(1, p.getNombre());
			pst.setString(2, p.getUbicacion());
			pst.setString(3, p.getHorainicio());
			pst.setString(4, p.getHorafin());
			//pst.setInt(6, p.getDiasDisponibles());
			*/
					
			n = pst.executeUpdate(sql);
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
