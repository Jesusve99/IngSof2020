package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Administrador;
import vista.GestionPista;
import vista.MenuAdministrador;

public class ControladorGestionPista implements ActionListener {

	private GestionPista vista;

	public ControladorGestionPista(GestionPista v) {
		this.vista = v;
		this.vista.btnVolver.addActionListener(this);
		this.vista.btnHabilitar.addActionListener(this);
		this.vista.btnDeshabilitar.addActionListener(this);
		this.vista.btnEliminar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.vista.btnVolver) {
			this.vista.dispose();
			ControladorMenuAdministrador cma = new ControladorMenuAdministrador(new MenuAdministrador());
			cma.setAdministrador(this.getAdministrador());
			cma.setVisible(true);
			cma.setLocationRelativeTo(null);
		}

		if (e.getSource() == this.vista.btnHabilitar) {
			if ((this.vista.seleccionado == null) || (this.vista.seleccionado < 0)) {
				JOptionPane.showMessageDialog(this.vista, "No hay seleccionada ninguna pista", "Solicitud no procesada",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(this.vista,
						"Para poder gestionar una pista seleccionala, y pulse la operacion adecuada", "Ayuda",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				long cod = Long
						.parseLong(this.vista.tablaListaPistas.getValueAt(this.vista.seleccionado, 4).toString());
				String up = "UPDATE Pista SET Pista.estado = 1 WHERE Pista.cod_pista = " + cod;
				this.vista.bd.Update(up);
				JOptionPane.showMessageDialog(this.vista, "La pista ha sido habilitada satisfactoriamente",
						"Operacion aceptada", JOptionPane.INFORMATION_MESSAGE);
				this.vista.establecerModeloTabla();
			}
		}

		if (e.getSource() == this.vista.btnDeshabilitar) {
			if ((this.vista.seleccionado == null) || (this.vista.seleccionado < 0)) {
				JOptionPane.showMessageDialog(this.vista, "No hay seleccionada ninguna pista", "Solicitud no procesada",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(this.vista,
						"Para poder gestionar una pista seleccionala, y pulse la operacion adecuada", "Ayuda",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				long cod = Long
						.parseLong(this.vista.tablaListaPistas.getValueAt(this.vista.seleccionado, 4).toString());
				String up = "UPDATE Pista SET Pista.estado = 0 WHERE Pista.cod_pista = " + cod;
				this.vista.bd.Update(up);
				JOptionPane.showMessageDialog(this.vista, "La pista ha sido deshabilitada satisfactoriamente",
						"Operacion aceptada", JOptionPane.INFORMATION_MESSAGE);
				eliminarPartidos(cod);
				this.vista.establecerModeloTabla();
			}
		}

		if (e.getSource() == this.vista.btnEliminar) {
			if ((this.vista.seleccionado == null) || (this.vista.seleccionado < 0)) {
				JOptionPane.showMessageDialog(this.vista, "No hay seleccionada ninguna pista", "Solicitud no procesada",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(this.vista,
						"Para poder gestionar una pista seleccionala, y pulse la operacion adecuada", "Ayuda",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				long cod = Long
						.parseLong(this.vista.tablaListaPistas.getValueAt(this.vista.seleccionado, 4).toString());
				String del = "DELETE FROM Pista WHERE Pista.cod_pista = " + cod;
				this.vista.bd.Delete(del);
				JOptionPane.showMessageDialog(this.vista, "La pista ha sido eliminada satisfactoriamente",
						"Operacion aceptada", JOptionPane.INFORMATION_MESSAGE);
				this.vista.establecerModeloTabla();
			}
		}

	}

	private void eliminarPartidos(long cod) {
		String del = "DELETE FROM Partido WHERE Partido.Pista = " + cod;
		this.vista.bd.Delete(del);
	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

	public void setAdministrador(Administrador a) {
		this.vista.administrador = a;
	}

	public Administrador getAdministrador() {
		return this.vista.administrador;
	}

}
