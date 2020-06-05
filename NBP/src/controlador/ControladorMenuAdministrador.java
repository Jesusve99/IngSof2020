package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Administrador;
import vista.CrearPista;
import vista.GestionPista;
import vista.ListaPista;
import vista.MenuAdministrador;
import vista.MenuInicio;

public class ControladorMenuAdministrador implements ActionListener {

	private MenuAdministrador vista = new MenuAdministrador();

	public ControladorMenuAdministrador(MenuAdministrador v) {
		this.vista = v;
		this.vista.btnCrearPista.addActionListener(this);
		this.vista.btnGestionPista.addActionListener(this);
		this.vista.btnCerrarSesin.addActionListener(this);
		this.vista.btnListaPistas.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.vista.btnCrearPista) {
			this.vista.dispose();
			CrearPista c = new CrearPista();
			c.setAdministrador(this.getAdministrador());
			c.setVisible(true);
			c.setLocationRelativeTo(null);
		}

		if (e.getSource() == this.vista.btnGestionPista) {
			this.vista.dispose();
			ControladorGestionPista cgp = new ControladorGestionPista(new GestionPista());
			cgp.setAdministrador(this.getAdministrador());
			cgp.setVisible(true);
			cgp.setLocationRelativeTo(null);
		}

		if (e.getSource() == this.vista.btnCerrarSesin) {
			this.vista.dispose();
			ControladorMenuInicio cmi = new ControladorMenuInicio(new MenuInicio());
			cmi.setVisible(true);
			cmi.setLocationRelativeTo(null);
		}

		if (e.getSource() == this.vista.btnListaPistas) {
			this.vista.dispose();
			ListaPista l = new ListaPista();
			l.setAdministrador(this.getAdministrador());
			l.setVisible(true);
			l.setLocationRelativeTo(null);
		}

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
