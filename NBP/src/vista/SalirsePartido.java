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


public class SalirsePartido extends JFrame {

	//private JFrame frame;
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
					SalirsePartido frame = new SalirsePartido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	/*
	public SalirsePartido() {
		initialize();
	}
	*/

	/**
	 * Initialize the contents of the frame.
	 */
	public SalirsePartido() {
		setBounds(100, 100, 532, 335);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		BD baseDatos = new BD();
		conexion = baseDatos.connectToDatabase();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 81, 199, 129);
		getContentPane().add(scrollPane);
		
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
		getContentPane().add(btnGenerarPartidos);
		
		textField = new JTextField();
		textField.setBounds(246, 128, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Introduzca el ID del partido del que se quiere salir");
		lblNewLabel.setBounds(226, 64, 304, 51);
		getContentPane().add(lblNewLabel);
		
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
						String id="jugador@";
						String sql = "Delete from Jugador_Partido where partido=\""+textField.getText()+"\" and ID_jug=\""+id+"\"";
						java.sql.Statement st = conexion.createStatement();
						st.executeUpdate(sql);					
						dispose();
						SalirsePartido sp = new SalirsePartido();
						sp.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "No existe el ID","ERROR",JOptionPane.ERROR_MESSAGE);
						dispose();
						SalirsePartido sp = new SalirsePartido();
						sp.setVisible(true);
						
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnSalirPartido.setBounds(373, 127, 107, 23);
		getContentPane().add(btnSalirPartido);
		
		JButton btnVolverMP = new JButton("Volver");
		btnVolverMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantallaprincipal pp = new Pantallaprincipal();
				pp.setVisible(true);
				SalirsePartido.this.dispose();
			}
		});
		btnVolverMP.setBounds(391, 262, 89, 23);
		getContentPane().add(btnVolverMP);
	}
}
