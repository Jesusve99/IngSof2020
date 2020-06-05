package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import controlador.ControladorMenuAdministrador;
import modelo.Administrador;
import modelo.BD;
import net.proteanit.sql.DbUtils;

public class ListaPista extends JFrame {

	private JPanel contentPane;
	private JTable table;
	Connection conexion = null;

	public Administrador administrador;

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
		BD baseDatos = BD.getBD();
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

				} catch (Exception exp) {
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
				ControladorMenuAdministrador cma = new ControladorMenuAdministrador(new MenuAdministrador());
				cma.setAdministrador(getAdministrador());
				cma.setVisible(true);
				cma.setLocationRelativeTo(null);
			}
		});
		btnMenu.setBounds(482, 338, 97, 33);
		contentPane.add(btnMenu);
	}

	public void setAdministrador(Administrador a) {
		this.administrador = a;
	}

	public Administrador getAdministrador() {
		return this.administrador;
	}
}
