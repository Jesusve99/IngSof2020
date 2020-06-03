package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.ControladorMenuInicio;
import controlador.ControladorMenuJugador;
import modelo.BD;
import net.proteanit.sql.DbUtils;

public class EliminarPartido extends JFrame {

	private JPanel contentPane;
	private JTable table;
	Connection conexion = null; //Creo la conexion
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnVerPartido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarPartido frame = new EliminarPartido();
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
	public EliminarPartido() {
		BD baseDatos = BD.getBD();
		conexion = baseDatos.connectToDatabase();
		//frame = new JFrame();
		getContentPane().setBackground(new Color(204, 255, 255));
		setBounds(100, 100, 572, 425);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnGenerarPartidos = new JButton("Generar Lista Partidos");
		btnGenerarPartidos.addActionListener(new ActionListener() {
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
		btnGenerarPartidos.setBounds(93, 28, 199, 36);
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
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuJugador p = new MenuJugador();
				ControladorMenuJugador c = new ControladorMenuJugador(p);
				p.setVisible(true);
			}
		});
		btnVolver.setBounds(404, 320, 104, 36);
		getContentPane().add(btnVolver);
		
		JButton btnEliminar = new JButton("Eliminar");
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String codigo = "Select id_anfitrion from Partido where cod_partido= ?";
					PreparedStatement pst2;
					pst2 = conexion.prepareStatement(codigo);
					pst2.setString(1, textField.getText());
					ResultSet rs = pst2.executeQuery();
					String id="ruben.goga2000@gmail.com";
					if(rs.first() && comparaAnfitrion(rs, id)) {
						String sql = "Delete from Partido where cod_partido=\""+textField.getText()+"\"";
						java.sql.Statement st = conexion.createStatement();
						st.executeUpdate(sql);					
						dispose();
						JOptionPane.showMessageDialog(null, "Partido eliminado","",JOptionPane.INFORMATION_MESSAGE);
					
						dispose();
						ControladorMenuJugador cm = new ControladorMenuJugador(new MenuJugador());
						cm.setVisible(true);
						cm.setLocationRelativeTo(null);
						
					}else {
						JOptionPane.showMessageDialog(null, "No existe el ID","ERROR",JOptionPane.ERROR_MESSAGE);
						dispose();
						EliminarPartido ep = new EliminarPartido();
						ep.setVisible(true);
						
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}

			private boolean comparaAnfitrion(ResultSet rs, String id) throws SQLException {
				return rs.getObject(1).equals(id);
			}
		});
		
		btnEliminar.setBounds(404, 149, 104, 36);
		getContentPane().add(btnEliminar);
		
	}
}
