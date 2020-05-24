package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.mysql.cj.xdevapi.Statement;

import modelo.BD;
import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;


public class SalirsePartido {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	Connection conexion = null; //Creo la conexion
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalirsePartido window = new SalirsePartido();
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
	public SalirsePartido() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		BD baseDatos = new BD();
		conexion = baseDatos.connectToDatabase();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 81, 199, 129);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnGenerarPartidos = new JButton("Generar Lista Partidos");
		btnGenerarPartidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String codigo = "Select * from Jugador_Partido";
					PreparedStatement pst = conexion.prepareStatement(codigo);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}catch (Exception exp){
					exp.printStackTrace();
				}
				
			}
		});
		btnGenerarPartidos.setBounds(10, 29, 141, 23);
		frame.getContentPane().add(btnGenerarPartidos);
		
		textField = new JTextField();
		textField.setBounds(246, 128, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Introduzca el ID del partido del que se quiere salir");
		lblNewLabel.setBounds(226, 64, 304, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSalirPartido = new JButton("SalirPartido");
		btnSalirPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String codigo = "Select * from Jugador_Partido where partido= ?";
					PreparedStatement pst2;
					pst2 = conexion.prepareStatement(codigo);
					pst2.setString(1, textField.getText());
					ResultSet rs = pst2.executeQuery();
					if(rs.first()) {
						String id="hola@";
						String sql = "Delete from Jugador_Partido where partido=\""+textField.getText()+"\" and ID_jug=\""+id+"\"";
						java.sql.Statement st = conexion.createStatement();
						st.executeUpdate(sql);					
						conexion.close();
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
				
				
				
			}
		});
		btnSalirPartido.setBounds(391, 127, 89, 23);
		frame.getContentPane().add(btnSalirPartido);
	}
}
