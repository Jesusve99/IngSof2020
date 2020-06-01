package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Administrador;
import vista.CrearPista;
import vista.EliminarPista;
import vista.ListaPista;
import vista.MenuAdministrador;
import vista.MenuInicio;

public class ControladorMenuAdministrador implements ActionListener {

	private MenuAdministrador vista = new MenuAdministrador();

	public ControladorMenuAdministrador(MenuAdministrador v) {
		this.vista = v;
		this.vista.btnCrearPista.addActionListener(this);
		this.vista.btnEliminarPista.addActionListener(this);
		this.vista.btnCerrarSesin.addActionListener(this);
		this.vista.btnListaPistas.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.vista.btnCrearPista) {
			this.vista.dispose();
			CrearPista c = new CrearPista();
			c.setVisible(true);
		}

		if (e.getSource() == this.vista.btnEliminarPista) {
			this.vista.dispose();
			EliminarPista ep = new EliminarPista();
			ep.setVisible(true);
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
			l.setVisible(true);
		}

	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

	public void setAdministrador(Administrador admin) {
		this.vista.administrador = admin;
	}

}
