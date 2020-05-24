package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.BD;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class ListaPista extends JFrame {

	private JPanel contentPane;
	private JTable table;
	Connection conexion = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPista frame = new ListaPista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListaPista() {
		BD baseDatos = new BD();
		conexion = baseDatos.connectToDatabase();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGenerarListaPistas = new JButton("Generar Lista Pistas");
		btnGenerarListaPistas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String codigo = "Select * from Pista";
					PreparedStatement pst = conexion.prepareStatement(codigo);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}catch (Exception exp){
					exp.printStackTrace();
				}
			}
		});
		btnGenerarListaPistas.setBounds(133, 30, 199, 39);
		contentPane.add(btnGenerarListaPistas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 82, 400, 289);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdmin m = new MenuAdmin();
				m.setVisible(true);
			}
		});
		btnMenu.setBounds(482, 338, 97, 33);
		contentPane.add(btnMenu);
	}
}
