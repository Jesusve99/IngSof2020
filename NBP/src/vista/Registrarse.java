package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.ControladorRegistro;
import modelo.BD;
import modelo.Demarcacion;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	public JTextField txtNombre;
	public JTextField txtApellidos;
	public JTextField txtCorreo;
	public JPasswordField jpassContrasena;
	public JTextField txtNick;
	public JTextField txtFechaNac;
	public JButton btnRegistrarse;
	public BD bd = new BD();
	public JComboBox<Demarcacion> cmbPosicion;
	public JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Registrarse v = new Registrarse();
		ControladorRegistro c = new ControladorRegistro(v);
		c.setVisible(true);
		c.setLocationRelativeTo(null);
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

		cmbPosicion = new JComboBox<Demarcacion>();
		cmbPosicion.setModel(new DefaultComboBoxModel<Demarcacion>(Demarcacion.values()));
		cmbPosicion.setBounds(378, 62, 116, 29);
		contentPane.add(cmbPosicion);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(113, 211, 126, 38);
		contentPane.add(btnVolver);

		btnRegistrarse = new JButton("Registrarse");
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
