package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.ControladorUnirsePartido;
import modelo.Jugador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		ControladorUnirsePartido c = new ControladorUnirsePartido(new UnirsePartido());
		c.setVisible(true);
		c.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public UnirsePartido() {

		// frame = new JFrame();
		getContentPane().setBackground(new Color(204, 255, 255));
		setBounds(100, 100, 540, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		btnGenerarPartidos = new JButton("Generar Lista Partidos");
		btnGenerarPartidos.setBounds(100, 13, 199, 36);
		getContentPane().add(btnGenerarPartidos);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 62, 380, 253);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		textField = new JTextField();
		textField.setBounds(404, 117, 104, 26);
		getContentPane().add(textField);
		textField.setColumns(10);

		lblNewLabel = new JLabel("ID Partido :");
		lblNewLabel.setBounds(418, 90, 104, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblNewLabel);

		btnVerPartido = new JButton("VerPartido");
		btnVerPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVerPartido.setBounds(404, 151, 104, 35);
		getContentPane().add(btnVerPartido);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(404, 268, 104, 36);
		getContentPane().add(btnVolver);

	}
}