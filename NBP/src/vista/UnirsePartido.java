package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.GestionUnirsePartido;
import modelo.Jugador;

public class UnirsePartido extends JFrame {

	// private JFrame frame;
	public JTable table;
	public JTextField textField;
	private JLabel lblNewLabel;
	public JButton btnVerPartido;
	public JButton btnVolver;
	public JButton btnGenerarPartidos;
	
	public Jugador jugador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		GestionUnirsePartido c = new GestionUnirsePartido(new UnirsePartido());
		c.setVisible(true);
		c.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public UnirsePartido() {

		// frame = new JFrame();
		getContentPane().setBackground(new Color(204, 255, 255));
		setBounds(100, 100, 572, 425);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		btnGenerarPartidos = new JButton("Generar Lista Partidos");
		btnGenerarPartidos.setBounds(81, 24, 199, 36);
		getContentPane().add(btnGenerarPartidos);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 77, 344, 279);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		textField = new JTextField();
		textField.setBounds(404, 105, 104, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		lblNewLabel = new JLabel("ID Partido :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(404, 78, 104, 14);
		getContentPane().add(lblNewLabel);

		btnVerPartido = new JButton("VerPartido");
		btnVerPartido.setBounds(403, 138, 105, 20);
		getContentPane().add(btnVerPartido);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(404, 320, 104, 36);
		getContentPane().add(btnVolver);

	}
}