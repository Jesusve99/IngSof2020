package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Pista;
import vista.CrearPista;
import vista.ListaPista;
import vista.MenuAdministrador;
import vista.MenuJugador;

public class ControladorCrearPista implements ActionListener {
	private CrearPista vista;

	public ControladorCrearPista(CrearPista v) {
		this.vista = v;
		this.vista.btnCrearPista.addActionListener(this);
		this.vista.btnCancelar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.btnCancelar) {
			ControladorMenuAdministrador pp = new ControladorMenuAdministrador(new MenuAdministrador());
			pp.setVisible(true);
			pp.setLocationRelativeTo(null);
			this.vista.dispose();
		} else if (e.getSource() == vista.btnCrearPista) {
			String nombre = vista.Nombre.getText();
			String ubicacion = vista.Ubicacion.getText();
			String horarioApertura = vista.HorarioApertura.getText() + ":00";
			String horarioCierre = vista.HorarioCierre.getText() + ":00";
			if (nombre.equals("") || ubicacion.equals("") || horarioApertura.equals("") || horarioCierre.equals("")) {
				JOptionPane.showMessageDialog(null, "Rellene todos los datos por favor.", "ERORR CREAR PISTA!!!!",
						JOptionPane.ERROR_MESSAGE);
			} else {
				Pista pista = new Pista(nombre, ubicacion, horarioApertura, horarioCierre);
				if (pista.nombreIgual()) {
					JOptionPane.showMessageDialog(null, "Ese nombre ya esta en uso.", "ERORR CREAR PISTA!!!!",
							JOptionPane.ERROR_MESSAGE);
				} else {
					// Redirigir a Menu
					this.vista.dispose();
					JOptionPane.showMessageDialog(null, "Pista creada con exito", "creacion de pista completada",
							JOptionPane.INFORMATION_MESSAGE);
					ListaPista l = new ListaPista();
					l.setVisible(true);
				}
			}
		}
	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

}
