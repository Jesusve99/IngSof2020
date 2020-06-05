package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Administrador;
import modelo.Pista;
import vista.CrearPista;
import vista.ListaPista;
import vista.MenuAdministrador;

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
			pp.setAdministrador(this.getAdministrador());
			pp.setVisible(true);
			pp.setLocationRelativeTo(null);
			this.vista.dispose();

		}
		if (e.getSource() == vista.btnCrearPista) {
			String nombre = vista.Nombre.getText();
			String ubicacion = vista.Ubicacion.getText();
			String horarioApertura = vista.HorarioApertura.getText() + ":00";
			String horarioCierre = vista.HorarioCierre.getText() + ":00";
			if (nombre.isEmpty() || ubicacion.isEmpty() || horarioApertura.isEmpty() || horarioCierre.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Rellene todos los datos por favor.", "ERORR CREAR PISTA!!!!",
						JOptionPane.ERROR_MESSAGE);
			} else {
				Pista pista = new Pista(nombre, ubicacion, horarioApertura, horarioCierre);
				if (pista.nombreIgual()) {
					JOptionPane.showMessageDialog(null, "Ese nombre ya esta en uso.", "ERORR CREAR PISTA!!!!",
							JOptionPane.ERROR_MESSAGE);
				} else {
					pista.agregarPista();
					this.vista.dispose();
					JOptionPane.showMessageDialog(null, "Pista creada con exito", "creacion de pista completada",
							JOptionPane.INFORMATION_MESSAGE);
					ListaPista l = new ListaPista();
					l.setAdministrador(this.getAdministrador());
					l.setVisible(true);
					l.setLocationRelativeTo(null);
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

	public void setAdministrador(Administrador a) {
		this.vista.administrador = a;
	}

	public Administrador getAdministrador() {
		return this.vista.administrador;
	}

}
