package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.ControladorMenuJugador;

public class MenuJugador extends JFrame {

	private JPanel contentPane;
	public JButton btnUnirseAPartido;
	public JButton btnCrearPartido;
	public JButton btnEliminarPartido;
	public JButton btnCerrarSesion;
	public JButton btnSalirPartido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ControladorMenuJugador cmj = new ControladorMenuJugador(new MenuJugador());
		cmj.setVisible(true);
		cmj.setLocationRelativeTo(null);
	}

	/**
	 * Create the frame.
	 */
	public MenuJugador() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 401);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblNbp = new JLabel("NBP");
		lblNbp.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNbp.setBounds(209, 26, 64, 27);
		getContentPane().add(lblNbp);

		JLabel lblNeoBalompi = new JLabel("Neo Balompi\u00E9");
		lblNeoBalompi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNeoBalompi.setBounds(189, 53, 115, 16);
		contentPane.add(lblNeoBalompi);

		btnUnirseAPartido = new JButton("UNIRSE A PARTIDO");
		btnUnirseAPartido.setBounds(163, 92, 153, 37);
		contentPane.add(btnUnirseAPartido);

		btnCrearPartido = new JButton("CREAR PARTIDO");
		btnCrearPartido.setBounds(163, 142, 153, 37);
		contentPane.add(btnCrearPartido);

		btnEliminarPartido = new JButton("ELIMINAR PARTIDO");
		btnEliminarPartido.setBounds(163, 192, 153, 37);
		contentPane.add(btnEliminarPartido);

		btnCerrarSesion = new JButton("CERRAR SESION");
		btnCerrarSesion.setBounds(163, 292, 153, 37);
		contentPane.add(btnCerrarSesion);

		btnSalirPartido = new JButton("SALIR DE PARTIDO");
		btnSalirPartido.setBounds(163, 242, 153, 37);
		contentPane.add(btnSalirPartido);

	}
}
