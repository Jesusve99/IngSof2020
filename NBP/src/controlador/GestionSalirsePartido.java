package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;
import vista.Pantallaprincipal;
import vista.SalirsePartido;
import vista.UnirsePartido;

public class GestionSalirsePartido implements ActionListener {
	private SalirsePartido vista = new SalirsePartido();
	public String id="jugador@";
	
	
	public GestionSalirsePartido(SalirsePartido v) {
		this.vista = v;
		this.vista.btnGenerarPartidos.addActionListener(this);
		this.vista.btnSalirPartido.addActionListener(this);
		this.vista.btnVolverMP.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.btnGenerarPartidos) {
			generarPartido();
		}else if(e.getSource() == vista.btnSalirPartido) {
			salirPartido();
		}else if(e.getSource() == vista.btnVolverMP) {
			volverMP();
		}
		
	}
	private void  generarPartido() {
		try {
			String codigo = "Select * from Jugador_Partido";
			PreparedStatement pst = vista.conexion.prepareStatement(codigo);
			ResultSet rs = pst.executeQuery();
			vista.table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
		}catch (Exception exp){
			exp.printStackTrace();
		}
	}
	private void salirPartido() {
		try {
			String codigo = "Select * from Jugador_Partido where partido= ?";
			PreparedStatement pst2;
			pst2 = vista.conexion.prepareStatement(codigo);
			pst2.setString(1, vista.textField.getText());
			ResultSet rs = pst2.executeQuery();
			if(rs.first()) {
				
				String sql = "Delete from Jugador_Partido where partido=\""+vista.textField.getText()+"\" and ID_jug=\""+id+"\"";
				java.sql.Statement st = vista.conexion.createStatement();
				st.executeUpdate(sql);					
				vista.dispose();
				SalirsePartido sp = new SalirsePartido();
				sp.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "No existe el ID","ERROR",JOptionPane.ERROR_MESSAGE);
				vista.dispose();
				SalirsePartido sp = new SalirsePartido();
				sp.setVisible(true);
				
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	private void volverMP() {
		Pantallaprincipal pp = new Pantallaprincipal();
		pp.setVisible(true);
		vista.dispose();
		//SalirsePartido.this.dispose();
	}

	
}
