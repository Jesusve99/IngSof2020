package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.ControladorMenuInicio;

public class Iniciarsesion extends JFrame {

	private JPanel contentPane;
	public JTextField textusuario;
	public JPasswordField clave;
	public JButton btnEntrar;
	public JButton Salir;
	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { Iniciarsesion is = new
	 * Iniciarsesion(); ControladorIniciarSesion c = new
	 * ControladorIniciarSesion(is); is.setVisible(true);
	 * is.setLocationRelativeTo(null); }
	 */

	/**
	 * Create the frame.
	 */
	public Iniciarsesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 302);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIniciarSesin = new JLabel("INICIAR SESI\u00D3N");
		lblIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIniciarSesin.setBounds(40, 30, 198, 25);
		contentPane.add(lblIniciarSesin);

		JLabel lblCorreo = new JLabel("Correo :");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreo.setBounds(60, 88, 56, 16);
		contentPane.add(lblCorreo);

		JButton btnSalir = new JButton("Volver");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ControladorMenuInicio cm = new ControladorMenuInicio(new MenuInicio());
				cm.setVisible(true);
				cm.setLocationRelativeTo(null);
			}
		});
		btnSalir.setBounds(60, 197, 128, 31);
		contentPane.add(btnSalir);

		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(223, 197, 128, 30);
		contentPane.add(btnEntrar);

		textusuario = new JTextField();
		textusuario.setBounds(164, 85, 130, 22);
		contentPane.add(textusuario);
		textusuario.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(60, 117, 107, 31);
		contentPane.add(lblContrasea);

		clave = new JPasswordField();
		clave.setBounds(164, 120, 130, 22);
		contentPane.add(clave);
	}
}
