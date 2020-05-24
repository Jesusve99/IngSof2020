package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.GestionUnirsePartido;
import modelo.BD;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;


public class UnirsePartido extends JFrame{

	//private JFrame frame;
	public JTable table;
	public Connection conexion = null; //Creo la conexion
	public JTextField textField;
	private JLabel lblNewLabel;
	public JButton btnVerPartido;
	public JButton btnVolver;
	public JButton btnGenerarPartidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnirsePartido frame = new UnirsePartido();
					GestionUnirsePartido con = new GestionUnirsePartido(frame);
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
	public UnirsePartido() {
		initialize();
	}
	*/
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	public UnirsePartido() {
		BD baseDatos = new BD();
		conexion = baseDatos.connectToDatabase();
		//frame = new JFrame();
		getContentPane().setBackground(new Color(204, 255, 255));
		setBounds(100, 100, 572, 425);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnGenerarPartidos = new JButton("Generar Lista Partidos");
		/*btnGenerarPartidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //QUE PASA CUANDO PULSO EL BOTON DE GENERAR PARTIDO
				
				try {
					String codigo = "Select * from Partido";
					PreparedStatement pst = conexion.prepareStatement(codigo);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}catch (Exception exp){
					exp.printStackTrace();
				}
				
			}
		});
		*/
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
		/*btnVerPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String codigo = "Select * from Partido where cod_partido= ?";
					PreparedStatement pst2 = conexion.prepareStatement(codigo);
					pst2.setString(1, textField.getText());
					ResultSet rs = pst2.executeQuery();
					
					if(rs.first()) {
						dispose();
						InformacionPartido ip = new InformacionPartido();
						ip.setVisible(true);						
						//JOptionPane.showMessageDialog(null, "Bienvenido al partido","Ingresastes",JOptionPane.INFORMATION_MESSAGE);
						conexion.close();
					}else {
						JOptionPane.showMessageDialog(null, "No existe el ID","ERROR",JOptionPane.ERROR_MESSAGE);
						conexion.close();
					}
					
					
				} catch(Exception exp) {
					exp.printStackTrace();
				}
				
			}
		});
		*/
		btnVerPartido.setBounds(403, 138, 105, 20);
		getContentPane().add(btnVerPartido);
		
		btnVolver = new JButton("Volver");
		/*btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Pantallaprincipal p = new Pantallaprincipal();
				p.setVisible(true);
			}
		});
		*/
		btnVolver.setBounds(404, 320, 104, 36);
		getContentPane().add(btnVolver);
	}
}