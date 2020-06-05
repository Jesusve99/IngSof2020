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
		setBounds(100, 100, 540, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIniciarSesin = new JLabel("INICIAR SESI\u00D3N");
		lblIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIniciarSesin.setBounds(171, 49, 198, 25);
		contentPane.add(lblIniciarSesin);

		JLabel lblCorreo = new JLabel("Correo :");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreo.setBounds(136, 135, 56, 16);
		contentPane.add(lblCorreo);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(97, 240, 114, 38);
		contentPane.add(btnVolver);

		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(318, 240, 114, 38);
		contentPane.add(btnEntrar);

		textusuario = new JTextField();
		textusuario.setBounds(228, 132, 130, 22);
		contentPane.add(textusuario);
		textusuario.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(136, 164, 107, 31);
		contentPane.add(lblContrasea);

		clave = new JPasswordField();
		clave.setBounds(228, 168, 130, 22);
		contentPane.add(clave);
	}
}
