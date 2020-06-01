package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Administrador;
import modelo.Jugador;
import vista.IniciarSesion;
import vista.MenuAdministrador;
import vista.MenuInicio;
import vista.MenuJugador;

public class ControladorIniciarSesion implements ActionListener {

	private IniciarSesion vista = new IniciarSesion();

	public ControladorIniciarSesion(IniciarSesion v) {
		this.vista = v;
		this.vista.btnEntrar.addActionListener(this);
		this.vista.btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/********** Entrar en el servicio de la aplicacion ******************/

		if (e.getSource() == vista.btnEntrar) {

			if ((!this.vista.textusuario.getText().isEmpty())
					&& (!(new String(this.vista.clave.getPassword()).isEmpty()))) {

				Administrador admin = new Administrador(this.vista.textusuario.getText(),
						new String(this.vista.clave.getPassword()));
				Jugador jug = new Jugador(this.vista.textusuario.getText(), new String(this.vista.clave.getPassword()));
				if (admin.correoRegistrado()) {
					if (admin.datosInicioCorrecto()) {

						this.vista.dispose();
						ControladorMenuAdministrador cma = new ControladorMenuAdministrador(new MenuAdministrador());
						cma.setVisible(true);
						cma.setLocationRelativeTo(null);

					} else {
						JOptionPane.showMessageDialog(this.vista,
								"Los datos de correo y contraseña no coinciden con los correctos",
								"Error al Iniciar Sesion", JOptionPane.ERROR_MESSAGE);
					}
				} else if (jug.correoRegistrado()) {
					if (jug.datosInicioCorrecto()) {

						this.vista.dispose();
						ControladorMenuJugador cmj = new ControladorMenuJugador(new MenuJugador());
						cmj.setVisible(true);
						cmj.setLocationRelativeTo(null);

					} else {
						JOptionPane.showMessageDialog(this.vista,
								"Los datos de correo y contraseña no coinciden con los correctos",
								"Error al Iniciar Sesion", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this.vista,
							"Correo no registrado, intente registrarse en la plataforma", "Error al Iniciar Sesion",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(this.vista, "Rellene ambos campos", "Error al Iniciar Sesion",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		/************ Volver a MenuInicio *********************/

		if (e.getSource() == this.vista.btnVolver) {
			this.vista.dispose();
			ControladorMenuInicio cm = new ControladorMenuInicio(new MenuInicio());
			cm.setVisible(true);
			cm.setLocationRelativeTo(null);
		}

	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}
}
