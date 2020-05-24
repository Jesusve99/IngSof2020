package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Administrador;
import modelo.Jugador;
import vista.InformacionPartido;
import vista.Iniciarsesion;
import vista.MenuAdmin;
import vista.Pantallaprincipal;

public class ControladorIniciarSesion implements ActionListener {
	private Iniciarsesion vista = new Iniciarsesion();

	public ControladorIniciarSesion(Iniciarsesion v) {
		this.vista = v;
		this.vista.btnEntrar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionperfoemedad");
		if (e.getSource() == vista.btnEntrar) {
			System.out.println("action");
			char[] contrasena = vista.clave.getPassword();
			String clave = new String(contrasena);
			
			Administrador ad = new Administrador(vista.textusuario.getText(),clave);
			Jugador jug = new Jugador(vista.textusuario.getText(),clave);
			
			if(!ad.correoRegistrado() && !jug.correoRegistrado()) {//No existe en la BD
				System.out.println("niunoniotro");
				JOptionPane.showMessageDialog(null, "Usuario o Contrasena incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
				vista.textusuario.setText("");
				vista.clave.setText("");
				vista.textusuario.requestFocus();
			}else if(jug.datosInicioCorrecto()) {
				System.out.println("jugador");
				vista.dispose();
				JOptionPane.showMessageDialog(null, "Bienvenido al sistema,Jugador","Ingresaste",JOptionPane.INFORMATION_MESSAGE);
				Pantallaprincipal p = new Pantallaprincipal();
				p.setVisible(true);
			}else if(ad.datosInicioCorrecto()){
				System.out.println("admin");
				vista.dispose();
				MenuAdmin mad = new MenuAdmin();
				mad.setVisible(true);
				//Es un admin
			}
		}
	}
}
