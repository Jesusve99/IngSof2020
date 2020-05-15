package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

import modelo.BD;
import net.proteanit.sql.DbUtils;

public class PartidoInformacion {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PartidoInformacion window = new PartidoInformacion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public PartidoInformacion() throws SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		
		BD connection = new BD();
		int id_partido = 1; 
		String select = "SELECT Jugador.nick 'Nick', Jugador.posicionfav 'Posicion Favorita' FROM Jugador WHERE Jugador.correo_jug IN (SELECT Jugador_Partido.ID_jug FROM Jugador_Partido WHERE Jugador_Partido.partido ="+id_partido+")";
		frame = new JFrame();
		frame.setBounds(100, 100, 835, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setBounds(92, 80, 630, 413);
		Connection c = BD.connectToDatabase();
		PreparedStatement stmt = c.prepareStatement(select);
		ResultSet rset = stmt.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rset));
		rset.close();
		stmt.close();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(table);
		
		JButton btonUnirse = new JButton("Unirse");
		btonUnirse.setBounds(708, 13, 97, 25);
		btonUnirse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btonUnirse);
	}
}
