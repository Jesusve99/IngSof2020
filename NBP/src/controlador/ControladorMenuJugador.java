package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Jugador;
import vista.CrearPartido2;
import vista.ListaPartidos;
import vista.ListaPartidosAnfitrion;
import vista.MenuInicio;
import vista.MenuJugador;
import vista.SalirsePartido;
import vista.UnirsePartido;

public class ControladorMenuJugador implements ActionListener {

	private MenuJugador vista;

	public ControladorMenuJugador(MenuJugador v) {

		this.vista = v;
		this.vista.btnUnirseAPartido.addActionListener(this);
		this.vista.btnCrearPartido.addActionListener(this);
		this.vista.btnCerrarSesion.addActionListener(this);
		this.vista.btnSalirPartido.addActionListener(this);
		this.vista.btnListaPartidos.addActionListener(this);
		this.vista.btnListaPartidosAnfitrion.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.vista.btnUnirseAPartido) {

			this.vista.dispose();
			ControladorUnirsePartido gup = new ControladorUnirsePartido(new UnirsePartido());
			gup.setJugador(this.vista.getJugador());
			gup.setVisible(true);
			gup.setLocationRelativeTo(null);
		}

		if (e.getSource() == this.vista.btnCrearPartido) {
			this.vista.dispose();
			// CrearPartido c = new CrearPartido();
			// c.setVisible(true);
			// c.setLocationRelativeTo(null);
			ControladorCrearPartido2 c = new ControladorCrearPartido2(new CrearPartido2());
			c.setJugador(this.vista.getJugador());
			c.setLocationRelativeTo(null);
			c.setVisible(true);
		}

		if (e.getSource() == this.vista.btnCerrarSesion) {

			this.vista.dispose();
			ControladorMenuInicio cm = new ControladorMenuInicio(new MenuInicio());
			cm.setVisible(true);
			cm.setLocationRelativeTo(null);

		}

		if (e.getSource() == this.vista.btnSalirPartido) {

			this.vista.dispose();
			GestionSalirsePartido sp = new GestionSalirsePartido(new SalirsePartido());
			sp.setJugador(this.vista.getJugador());
			sp.setVisible(true);
			sp.setLocationRelativeTo(null);

		}

		if (e.getSource() == this.vista.btnListaPartidos) {
			this.vista.dispose();
			JOptionPane.showMessageDialog(this.vista,
					"Solo te aparecerán los partidos a los que ya estes unido y tu solicitud haya sido aceptada",
					"Solicitud no procesada", JOptionPane.INFORMATION_MESSAGE);
			ControladorListaPartidos clp = new ControladorListaPartidos(new ListaPartidos(this.vista.getJugador()));
			clp.setVisible(true);
			clp.setLocationRelativeTo(null);
		}

		if (e.getSource() == this.vista.btnListaPartidosAnfitrion) {
			this.vista.dispose();
			JOptionPane.showMessageDialog(this.vista,
					"Solo te aparecerán los partidos de los cuales tu eres el anfitrion", "Gestion Partidos",
					JOptionPane.INFORMATION_MESSAGE);
			ControladorListaPartidosAnfitrion clpa = new ControladorListaPartidosAnfitrion(
					new ListaPartidosAnfitrion(this.vista.getJugador()));
			clpa.setVisible(true);
			clpa.setLocationRelativeTo(null);
		}

	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

	public void setJugador(Jugador j) {
		this.vista.setJugador(j);
	}

}
