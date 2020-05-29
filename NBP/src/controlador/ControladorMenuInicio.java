package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Iniciarsesion;
import vista.MenuInicio;
import vista.Registrarse;

public class ControladorMenuInicio implements ActionListener {

	private MenuInicio vista;

	public ControladorMenuInicio(MenuInicio v) {
		this.vista = v;
		this.vista.btnIniciarSesion.addActionListener(this);
		this.vista.btnRegistrarse.addActionListener(this);
		this.vista.btnSalir.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.btnIniciarSesion) {
			vista.dispose();
			Iniciarsesion is = new Iniciarsesion();
			ControladorIniciarSesion c = new ControladorIniciarSesion(is);
			c.setVisible(true);
			c.setLocationRelativeTo(null);
		}
		if (e.getSource() == vista.btnRegistrarse) {
			vista.dispose();
			ControladorRegistro c = new ControladorRegistro(new Registrarse());
			c.setVisible(true);
			c.setLocationRelativeTo(null);
		}
		if (e.getSource() == this.vista.btnSalir) {
			this.vista.salirAplicacion();
		}
	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

}
