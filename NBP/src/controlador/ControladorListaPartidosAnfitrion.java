package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Jugador;
import modelo.Partido;
import vista.ListaPartidosAnfitrion;
import vista.MenuJugador;
import vista.SolicitudesUnirse;

public class ControladorListaPartidosAnfitrion implements ActionListener {

	private ListaPartidosAnfitrion vista;

	public ControladorListaPartidosAnfitrion(ListaPartidosAnfitrion v) {
		this.vista = v;
		this.vista.btnEntrarInfoPartido.addActionListener(this);
		this.vista.btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.vista.btnEntrarInfoPartido) {
			if ((this.vista.seleccionado == null) || (this.vista.seleccionado < 0)) {
				JOptionPane.showMessageDialog(this.vista, "No hay seleccionado ningun partido",
						"Solicitud no procesada", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(this.vista,
						"Para poder acceder a las solicitudes pincha en alguna fila de los partidos que te aparecen y pulsa en Entrar",
						"Ayuda", JOptionPane.INFORMATION_MESSAGE);
			} else {
				this.vista.dispose();
				long cod = Long
						.parseLong(this.vista.tablaListaPartidos.getValueAt(this.vista.seleccionado, 4).toString());
				ControladorSolicitudesUnirse csu = new ControladorSolicitudesUnirse(
						new SolicitudesUnirse(Partido.obtenerPartido(cod)));
				csu.setJugador(this.getJugador());
				csu.setVisible(true);
				csu.setLocationRelativeTo(null);
			}
		}

		if (e.getSource() == this.vista.btnVolver) {
			this.vista.dispose();
			ControladorMenuJugador cmj = new ControladorMenuJugador(new MenuJugador());
			cmj.setJugador(this.getJugador());
			cmj.setVisible(true);
			cmj.setLocationRelativeTo(null);
		}

	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

	public Jugador getJugador() {
		return this.vista.jugador;
	}

	public void setJugador(Jugador j) {
		this.vista.jugador = j;
	}

}
