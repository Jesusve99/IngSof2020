package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Jugador;
import vista.CrearPartido;
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
		this.vista.btnEliminarPartido.addActionListener(this);
		this.vista.btnCerrarSesion.addActionListener(this);
		this.vista.btnSalirPartido.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.vista.btnUnirseAPartido) {

			this.vista.dispose();
			GestionUnirsePartido gup = new GestionUnirsePartido(new UnirsePartido());
			gup.setJugador(this.vista.getJugador());
			gup.setVisible(true);
			gup.setLocationRelativeTo(null);
		}

		if (e.getSource() == this.vista.btnCrearPartido) {

			this.vista.dispose();
			CrearPartido c = new CrearPartido();
			c.setVisible(true);
			c.setLocationRelativeTo(null);
		}

		if (e.getSource() == this.vista.btnEliminarPartido) {

		}

		if (e.getSource() == this.vista.btnCerrarSesion) {

			this.vista.dispose();
			ControladorMenuInicio cm = new ControladorMenuInicio(new MenuInicio());
			cm.setVisible(true);
			cm.setLocationRelativeTo(null);

		}

		if (e.getSource() == this.vista.btnEliminarPartido) {

			this.vista.dispose();
			SalirsePartido s = new SalirsePartido();
			GestionSalirsePartido sp = new GestionSalirsePartido(s);
			sp.setVisible(true);
			sp.setLocationRelativeTo(null);

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
