package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import modelo.Administrador;
import modelo.BDException;
import modelo.Demarcacion;
import modelo.Jugador;
import modelo.Usuario;
import vista.IniciarSesion;
import vista.MenuInicio;
import vista.Registrarse;

public class ControladorRegistro implements ActionListener {

	private Registrarse vista;
	private modelo.Jugador userJug;

	public ControladorRegistro(Registrarse v) {
		this.vista = v;
		this.vista.btnRegistrarse.addActionListener(this);
		this.vista.cmbPosicion.addItemListener(null);
		this.vista.btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.btnRegistrarse) {
			try {
				if (correoUtilizado()) {
					throw new BDException(
							"Ya existe una cuenta creada con dicho correo. Utilice otro o pruebe iniciar sesion.");
				}
				if (!correoValido()) {
					throw new BDException("Correo utilizado con formato no valido.");
				}
				if (!contrasenaValida()) {
					throw new BDException(
							"Contraseña no valida. Debe tener al menos 8 caracteres, y de ellos al menos 1 mayuscula, 1 digito y 1 minuscula.");
				}

				if (this.vista.txtCorreo.getText().isEmpty()
						|| new String(this.vista.jpassContrasena.getPassword()).isEmpty()
						|| this.vista.txtNombre.getText().isEmpty() || this.vista.txtApellidos.getText().isEmpty()
						|| this.vista.txtFechaNac.getText().isEmpty() || this.vista.txtNick.getText().isEmpty()) {
					throw new BDException("Rellena todos los campos. Detectado campos vacios.");
				}
				Demarcacion posicionFav = (Demarcacion) this.vista.cmbPosicion.getSelectedItem();
				userJug = new Jugador(this.vista.txtCorreo.getText(),
						new String(this.vista.jpassContrasena.getPassword()), this.vista.txtNick.getText(), posicionFav,
						this.vista.txtNombre.getText(), this.vista.txtApellidos.getText(),
						this.vista.txtFechaNac.getText());
				userJug.agregarJugador();
				this.vista.dispose();
				JOptionPane.showMessageDialog(this.vista, "Bienvenido a NBP", "Registro con exito!",
						JOptionPane.INFORMATION_MESSAGE);
				ControladorIniciarSesion cis = new ControladorIniciarSesion(new IniciarSesion());
				cis.setVisible(true);
				cis.setLocationRelativeTo(null);
			} catch (BDException err) {
				JOptionPane.showMessageDialog(this.vista, err.getMessage(), "Error al registrarse",
						JOptionPane.ERROR_MESSAGE);
			}

		}

		if (e.getSource() == this.vista.btnVolver) {
			this.vista.dispose();
			ControladorMenuInicio cm = new ControladorMenuInicio(new MenuInicio());
			cm.setVisible(true);
			cm.setLocationRelativeTo(null);
		}

	}

	public boolean correoUtilizado() {
		Usuario userJug = new Jugador(this.vista.txtCorreo.getText(),
				new String(this.vista.jpassContrasena.getPassword()));
		Usuario userAdmin = new Administrador(this.vista.txtCorreo.getText(),
				new String(this.vista.jpassContrasena.getPassword()));
		return userJug.correoRegistrado() || userAdmin.correoRegistrado();
	}

	public boolean correoValido() {
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$");
		Matcher mather = pattern.matcher(this.vista.txtCorreo.getText());
		return mather.find();
	}

	public boolean contrasenaValida() {
		Pattern pattern = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{6,20}$");
		Matcher mather = pattern.matcher(new String(this.vista.jpassContrasena.getPassword()));
		return mather.find();
	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

}
