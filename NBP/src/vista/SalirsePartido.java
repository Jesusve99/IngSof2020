package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class SalirsePartido extends JFrame {

	// private JFrame frame;
	public JTable table;
	public JTextField textField;
	public JButton btnGenerarPartidos;
	public JButton btnSalirPartido;
	public JButton btnVolverMP;

	/**
	 * Initialize the contents of the frame.
	 */
	public SalirsePartido() {
		getContentPane().setBackground(new Color(204, 255, 255));
		setBounds(100, 100, 540, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 64, 379, 251);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		btnGenerarPartidos = new JButton("Generar Lista Partidos");
		btnGenerarPartidos.setBounds(103, 13, 187, 38);
		getContentPane().add(btnGenerarPartidos);

		textField = new JTextField();
		textField.setBounds(403, 122, 105, 25);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Partido del que desea salir");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(284, 38, 203, 58);
		getContentPane().add(lblNewLabel);

		btnSalirPartido = new JButton("Salir Partido");
		btnSalirPartido.setBounds(403, 155, 105, 38);
		getContentPane().add(btnSalirPartido);

		btnVolverMP = new JButton("Menu");
		btnVolverMP.setBounds(405, 265, 105, 38);
		getContentPane().add(btnVolverMP);
		
		JLabel lblId = new JLabel("ID Partido :");
		lblId.setBounds(416, 93, 81, 20);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblId);
	}
}
