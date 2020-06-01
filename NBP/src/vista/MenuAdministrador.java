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

public class MenuAdministrador extends JFrame {

	private JPanel contentPane;
	public JButton btnCrearPista;
	public JButton btnEliminarPista;
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
		setBounds(100, 100, 450, 285);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenuAdministrador = new JLabel("Menu Administrador");
		lblMenuAdministrador.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMenuAdministrador.setBounds(40, 27, 216, 39);
		contentPane.add(lblMenuAdministrador);

		btnCrearPista = new JButton("Crear pista");
		btnCrearPista.setBounds(40, 89, 145, 34);
		contentPane.add(btnCrearPista);

		btnEliminarPista = new JButton("Eliminar pista");
		btnEliminarPista.setBounds(40, 136, 143, 34);
		contentPane.add(btnEliminarPista);

		btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.setBounds(259, 184, 134, 34);
		contentPane.add(btnCerrarSesin);

		btnListaPistas = new JButton("Lista de pistas");
		btnListaPistas.setBounds(40, 184, 145, 34);
		contentPane.add(btnListaPistas);

	}

	public void setAdministrador(Administrador admin) {
		administrador = admin;
	}

}
