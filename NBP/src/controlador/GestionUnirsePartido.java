package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;
import vista.InformacionPartido;
import vista.MenuJugador;
import vista.UnirsePartido;

public class GestionUnirsePartido implements ActionListener {
	private UnirsePartido vista = new UnirsePartido();
	//private String idJugador = "jugador@";
	
	public GestionUnirsePartido(UnirsePartido v) {
		this.vista = v;
		this.vista.btnGenerarPartidos.addActionListener(this);
		this.vista.btnVerPartido.addActionListener(this);
		this.vista.btnVolver.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.btnGenerarPartidos) {
			generarPartido();
		}else if(e.getSource() == vista.btnVolver) {
			volverMenu();
		}else if(e.getSource() == vista.btnVerPartido) {
			verPartido();
		}
		
	}
	
	public void generarPartido() {
		try {
		
			String codigo = "Select * from Partido";
			PreparedStatement pst = vista.conexion.prepareStatement(codigo);
			ResultSet rs = pst.executeQuery();
			vista.table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
		}catch (Exception exp){
			exp.printStackTrace();
		}
		
	}
	public void volverMenu() {
		vista.dispose();
		MenuJugador p = new MenuJugador();
		p.setVisible(true);
	}
	
	public void verPartido() {
		try {
			String codigo = "Select * from Partido where cod_partido= ?";
			PreparedStatement pst2 = vista.conexion.prepareStatement(codigo);
			pst2.setString(1, vista.textField.getText());
			ResultSet rs = pst2.executeQuery();
			
			if(rs.first()) {
				vista.dispose();
				InformacionPartido ip = new InformacionPartido();
				ip.setVisible(true);						
				//JOptionPane.showMessageDialog(null, "Bienvenido al partido","Ingresastes",JOptionPane.INFORMATION_MESSAGE);
				vista.conexion.close();
			}else {
				JOptionPane.showMessageDialog(null, "No existe el ID","ERROR",JOptionPane.ERROR_MESSAGE);
				vista.conexion.close();
			}
			
			
		} catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
	
	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}
		
}
