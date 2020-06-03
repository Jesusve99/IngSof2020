package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Jugador;
import vista.InformacionPartidoLista;
import vista.ListaPartidos;

public class ControladorInformacionPartidoLista implements ActionListener {

	private InformacionPartidoLista vista;

	public ControladorInformacionPartidoLista(InformacionPartidoLista v) {
		this.vista = v;
		this.vista.volverLista.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.vista.volverLista) {
			this.vista.dispose();
			ControladorListaPartidos clp = new ControladorListaPartidos(new ListaPartidos(this.getJugador()));
			clp.setVisible(true);
			clp.setLocationRelativeTo(null);
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
