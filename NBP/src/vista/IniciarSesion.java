package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.ControladorIniciarSesion;

public class IniciarSesion extends JFrame {

	private JPanel contentPane;
	public JTextField textusuario;
	public JPasswordField clave;
	public JButton btnEntrar;
	public JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		ControladorIniciarSesion cis = new ControladorIniciarSesion(new IniciarSesion());
		cis.setVisible(true);
		cis.setLocationRelativeTo(null);
	}

	/**
	 * Create the frame.
	 */
	public IniciarSesion() {
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

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(60, 197, 128, 31);
		contentPane.add(btnVolver);

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
