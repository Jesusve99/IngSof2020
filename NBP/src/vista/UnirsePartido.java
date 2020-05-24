package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

public class UnirsePartido extends JFrame {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnirsePartido window = new UnirsePartido();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UnirsePartido() {
		initialize();
	}

	Connection conexion = null; // Creo la conexion
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnVerPartido;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BD baseDatos = new BD();
		conexion = baseDatos.connectToDatabase();
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnGenerarPartidos = new JButton("Generar Lista Partidos");
		btnGenerarPartidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // QUE PASA CUANDO PULSO EL BOTON DE GENERAR PARTIDO

				try {
					String codigo = "Select * from Partido";
					PreparedStatement pst = conexion.prepareStatement(codigo);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));

				} catch (Exception exp) {
					exp.printStackTrace();
				}

			}
		});
		btnGenerarPartidos.setBounds(46, 38, 164, 23);
		frame.getContentPane().add(btnGenerarPartidos);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 347, 279);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		textField = new JTextField();
		textField.setBounds(433, 96, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		lblNewLabel = new JLabel("ID Partido:");
		lblNewLabel.setBounds(375, 99, 48, 14);
		frame.getContentPane().add(lblNewLabel);

		btnVerPartido = new JButton("VerPartido");
		btnVerPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String codigo = "Select * from Partido where cod_partido= ?";
					PreparedStatement pst2 = conexion.prepareStatement(codigo);
					pst2.setString(1, textField.getText());
					ResultSet rs = pst2.executeQuery();

					if (rs.first()) {
						dispose();
						JOptionPane.showMessageDialog(null, "Bienvenido al partido", "Ingresastes",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "No existe el ID", "ERROR", JOptionPane.ERROR_MESSAGE);
					}

				} catch (Exception exp) {
					exp.printStackTrace();
				}

			}
		});
		btnVerPartido.setBounds(440, 140, 89, 23);
		frame.getContentPane().add(btnVerPartido);
	}

}
