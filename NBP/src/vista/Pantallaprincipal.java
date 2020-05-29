package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.ControladorMenuInicio;
import controlador.GestionSalirsePartido;
import controlador.GestionUnirsePartido;

public class Pantallaprincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantallaprincipal frame = new Pantallaprincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pantallaprincipal() {
		getContentPane().setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 401);
		getContentPane().setLayout(null);

		JLabel lblNbp = new JLabel("NBP");
		lblNbp.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNbp.setBounds(209, 26, 64, 27);
		getContentPane().add(lblNbp);

		JLabel lblNeoBalompi = new JLabel("Neo Balompi\u00E9");
		lblNeoBalompi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNeoBalompi.setBounds(189, 53, 115, 16);
		getContentPane().add(lblNeoBalompi);

		JButton btnUnirseAPartido = new JButton("UNIRSE A PARTIDO");
		btnUnirseAPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UnirsePartido up = new UnirsePartido();
				GestionUnirsePartido c = new GestionUnirsePartido(up);
				up.setVisible(true);
			}
		});
		btnUnirseAPartido.setBounds(163, 92, 153, 37);
		getContentPane().add(btnUnirseAPartido);

		JButton btnCrearPartido = new JButton("CREAR PARTIDO");
		btnCrearPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CrearPartido c = new CrearPartido();
				c.setVisible(true);
			}
		});
		btnCrearPartido.setBounds(163, 142, 153, 37);
		getContentPane().add(btnCrearPartido);

		JButton btnEliminarPartido = new JButton("ELIMINAR PARTIDO");
		btnEliminarPartido.setBounds(163, 192, 153, 37);
		getContentPane().add(btnEliminarPartido);

		JButton btnCerrarSesion = new JButton("CERRAR SESION");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ControladorMenuInicio cm = new ControladorMenuInicio(new MenuInicio());
				cm.setVisible(true);
				cm.setLocationRelativeTo(null);
			}
		});
		btnCerrarSesion.setBounds(163, 292, 153, 37);
		getContentPane().add(btnCerrarSesion);

		JButton btnNewButton = new JButton("SALIR DE PARTIDO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SalirsePartido s = new SalirsePartido();
				GestionSalirsePartido sp = new GestionSalirsePartido(s);
				s.setVisible(true);
			}
		});
		btnNewButton.setBounds(163, 242, 153, 37);
		getContentPane().add(btnNewButton);
	}
}
