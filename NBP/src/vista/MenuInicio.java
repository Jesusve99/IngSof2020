package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorMenuInicio;

public class MenuInicio extends JFrame {

	private JPanel contentPane;
	public JButton btnIniciarSesion;
	public JButton btnRegistrarse;
	public JButton btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ControladorMenuInicio c = new ControladorMenuInicio(new MenuInicio());
		c.setVisible(true);
		c.setLocationRelativeTo(null);
	}

	/**
	 * Create the frame.
	 */
	public MenuInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		btnIniciarSesion = new JButton("INICIAR SESI\u00D3N");
		btnIniciarSesion.setBounds(180, 93, 159, 45);
		contentPane.add(btnIniciarSesion);

		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setBounds(180, 167, 159, 45);
		contentPane.add(btnRegistrarse);

		JLabel lblNbp = new JLabel("NBP");
		lblNbp.setBackground(new Color(240, 240, 240));
		lblNbp.setForeground(new Color(0, 0, 0));
		lblNbp.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNbp.setBounds(225, 13, 66, 50);
		contentPane.add(lblNbp);

		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setForeground(new Color(0, 0, 0));
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBienvenido.setBounds(207, 54, 115, 16);
		contentPane.add(lblBienvenido);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(180, 238, 159, 45);
		contentPane.add(btnSalir);
	}

	public void salirAplicacion() {
		System.exit(0);
	}

}
