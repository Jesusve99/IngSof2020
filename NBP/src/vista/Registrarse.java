package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.GestionPista;
import modelo.BD;
import modelo.Demarcacion;
import modelo.Jugador;
import modelo.Pista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.BD;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtCorreo;
	private JPasswordField jpassContrasena;
	private JTextField txtNick;
	private JTextField txtFechaNac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
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
	public Registrarse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 323);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRegistrarse = new JLabel("REGISTRARSE");
		lblRegistrarse.setForeground(new Color(0, 0, 0));
		lblRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegistrarse.setBounds(43, 13, 161, 31);
		contentPane.add(lblRegistrarse);

		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(43, 68, 74, 16);
		contentPane.add(lblNombre);

		JLabel lblApellidos = new JLabel("Apellidos :");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(43, 97, 74, 16);
		contentPane.add(lblApellidos);

		JLabel lblCorreo = new JLabel("Correo :");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreo.setBounds(43, 126, 74, 16);
		contentPane.add(lblCorreo);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(43, 155, 92, 16);
		contentPane.add(lblContrasea);

		JLabel lblPosicinFavorita = new JLabel("<html>Posici\u00F3n favorita :</html>");
		lblPosicinFavorita.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPosicinFavorita.setBounds(292, 49, 65, 45);
		contentPane.add(lblPosicinFavorita);

		JLabel lblNombreUsuario = new JLabel("<html>Nombre Usuario :</html>");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombreUsuario.setBounds(292, 94, 74, 38);
		contentPane.add(lblNombreUsuario);

		txtNombre = new JTextField();
		txtNombre.setBounds(147, 65, 116, 22);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellidos = new JTextField();
		txtApellidos.setBounds(147, 94, 116, 22);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(147, 123, 116, 22);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);

		jpassContrasena = new JPasswordField();
		jpassContrasena.setBounds(147, 153, 116, 22);
		contentPane.add(jpassContrasena);

		txtNick = new JTextField();
		txtNick.setBounds(378, 97, 116, 29);
		contentPane.add(txtNick);
		txtNick.setColumns(10);

		final JComboBox cmbPosicion = new JComboBox();
		// cmbPosicion.setModel(new DefaultComboBoxModel(new String[] {"Portero",
		// "Defensa", "Centrocampista", "Delantero"}));
		cmbPosicion.setModel(new DefaultComboBoxModel(Demarcacion.values()));
		cmbPosicion.setBounds(378, 62, 116, 29);
		contentPane.add(cmbPosicion);

		JButton btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Iniciarsesion i = new Iniciarsesion();
				i.setVisible(true);
			}
		});
		btnIniciarSesion.setBounds(113, 211, 126, 38);
		contentPane.add(btnIniciarSesion);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {

				BD bd = new BD();
				String correobd = "SELECT * FROM Usuario WHERE email = '" + txtCorreo.getText() + "';";

				// String posicion = cmbPosicion.getSelectedItem().toString();
				Demarcacion pos = (Demarcacion) cmbPosicion.getSelectedItem();

				char[] contrasena = jpassContrasena.getPassword();
				String contraFinal = new String(contrasena);

				if (txtCorreo.getText().equals(correobd)) {
					dispose();
					JOptionPane.showMessageDialog(null, "Ya existe una cuenta con este correo", "Error al registrarse",
							JOptionPane.ERROR_MESSAGE);
					txtCorreo.setText("");
					txtCorreo.requestFocus();

				} else {

					Jugador j = new Jugador(txtCorreo.getText(), contraFinal, txtNick.getText(), pos,
							txtNombre.getText(), txtApellidos.getText(), txtFechaNac.getText());

					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido a NBP", "Cuenta creada con exito",
							JOptionPane.INFORMATION_MESSAGE);
					Iniciarsesion i = new Iniciarsesion();
					i.setVisible(true);
				}
			}
		});
		btnRegistrarse.setBounds(285, 211, 126, 38);
		contentPane.add(btnRegistrarse);

		JLabel lblFechaDeNacimiento = new JLabel("<html>Fecha de Nacimiento :</html>");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaDeNacimiento.setBounds(292, 130, 85, 45);
		contentPane.add(lblFechaDeNacimiento);

		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(379, 139, 116, 28);
		contentPane.add(txtFechaNac);
		txtFechaNac.setColumns(10);

	}
}
