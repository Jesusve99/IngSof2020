package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import org.w3c.dom.events.MouseEvent;

import modelo.Jugador;
import vista.SolicitudesUnirse;

public class ControladorSolicitudesUnirse implements ActionListener {

	private SolicitudesUnirse vista;

	public ControladorSolicitudesUnirse(SolicitudesUnirse v) {
		this.vista = v;
		this.vista.btnAceptar.addActionListener(this);
		this.vista.btnDenegar.addActionListener(this);
		this.vista.btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.vista.btnAceptar) {
			if ((this.vista.seleccionado == null) || (this.vista.seleccionado < 0)) {
				JOptionPane.showMessageDialog(this.vista, "No hay seleccionado ningun Jugador",
						"Solicitud no procesada", JOptionPane.ERROR_MESSAGE);

			} else if (partidoLleno()) {
				JOptionPane.showMessageDialog(this.vista, "Ya esta lleno el partido", "Solicitud no procesada",
						JOptionPane.ERROR_MESSAGE);
			} else {
				String idJug = this.vista.tablaSolicitudes.getValueAt(this.vista.seleccionado, 2).toString();
				String up = "UPDATE Jugador_Partido SET Jugador_Partido.estado_solicitud = 1 WHERE Jugador_Partido.ID_jug = "
						+ idJug;
				this.vista.bd.Update(up);
				this.vista.establecerModeloTabla();
			}
		}

		if (e.getSource() == this.vista.btnDenegar) {

		}

		if (e.getSource() == this.vista.btnVolver) {

		}
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setJugador(Jugador j) {
		this.vista.jugador = j;
	}

	private boolean partidoLleno() {
		String sel = "SELECT COUNT(Jugador_Partido.ID_jug) FROM Jugador_Partido WHERE Jugador_Partido.partido ="
				+ this.vista.partido.getCodPartido() + " AND Jugador_Partido.estado_solicitud = 1";
		long count = (long) this.vista.bd.SelectEscalar(sel);
		return (count == 10);
	}

}
