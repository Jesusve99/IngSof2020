package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorMenuAdministrador;
import modelo.Administrador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAdministrador extends JFrame {

	private JPanel contentPane;
	public JButton btnCrearPista;
	public JButton btnGestionPista;
	public JButton btnCerrarSesin;
	public JButton btnListaPistas;

	public Administrador administrador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ControladorMenuAdministrador c = new ControladorMenuAdministrador(new MenuAdministrador());
		c.setVisible(true);
		c.setLocationRelativeTo(null);
	}

	/**
	 * Create the frame.
	 */
	public MenuAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenuAdministrador = new JLabel("NBP");
		lblMenuAdministrador.setBounds(224, 24, 82, 39);
		lblMenuAdministrador.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblMenuAdministrador);

		btnCrearPista = new JButton("Crear pista");
		btnCrearPista.setBounds(66, 125, 145, 39);
		contentPane.add(btnCrearPista);

		btnGestionPista = new JButton("Gestionar Pistas");
		btnGestionPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionPista.setBounds(293, 125, 145, 39);
		contentPane.add(btnGestionPista);

		btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.setBounds(293, 217, 145, 37);
		contentPane.add(btnCerrarSesin);

		btnListaPistas = new JButton("Lista de pistas");
		btnListaPistas.setBounds(66, 216, 145, 39);
		contentPane.add(btnListaPistas);
		
		JLabel lblNewLabel = new JLabel("MEN\u00DA DE ADMINISTRADOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(158, 62, 234, 16);
		contentPane.add(lblNewLabel);

	}

	public void setAdministrador(Administrador admin) {
		administrador = admin;
	}
}
