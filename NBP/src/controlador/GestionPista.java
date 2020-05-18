package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.*;

public class GestionPista {
	public void obtenerPista(Pista p) {
		
		BD bd = new BD();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet n = null;
		
		try {
			con = BD.connectToDatabase();
			
			String sql = "INSERT INTO Pista (nombre, ubicacion, Hora_inicio, Hora_fin, cod_pista) VALUES (?,?,?,?,?);";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, p.getNombre());
			pst.setString(2, p.getUbicacion());
			pst.setDate(3, (Date) p.getHorainicio());
			pst.setDate(4, (Date) p.getHorafin());
			pst.setInt(5, p.getId());
			//pst.setInt(6, p.getDiasDisponibles());
			
			n = pst.executeQuery();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
