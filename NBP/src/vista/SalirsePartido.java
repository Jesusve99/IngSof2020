package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.GestionSalirsePartido;
import modelo.BD;


public class SalirsePartido extends JFrame {

	//private JFrame frame;
	public JTable table;
	public JTextField textField;
	public Connection conexion = null; //Creo la conexion
	public JButton btnGenerarPartidos;
	public JButton btnSalirPartido;
	public JButton btnVolverMP;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalirsePartido frame = new SalirsePartido();
					GestionSalirsePartido sp= new GestionSalirsePartido(frame);
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
		getContentPane().setBackground(new Color(204, 255, 255));
		setBounds(100, 100, 532, 335);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		BD baseDatos = new BD();
		conexion = baseDatos.connectToDatabase();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 83, 229, 178);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnGenerarPartidos = new JButton("Generar Lista Partidos");
		/*
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
		*/
		btnGenerarPartidos.setBounds(44, 38, 173, 32);
		getContentPane().add(btnGenerarPartidos);
		
		textField = new JTextField();
		textField.setBounds(355, 109, 117, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Partido del que desea salir");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(284, 38, 203, 58);
		getContentPane().add(lblNewLabel);
		
		btnSalirPartido = new JButton("Salir Partido");
		/*
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
		*/
		btnSalirPartido.setBounds(327, 156, 117, 32);
		getContentPane().add(btnSalirPartido);
		
		btnVolverMP = new JButton("Menu");
		/*
		btnVolverMP.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				Pantallaprincipal pp = new Pantallaprincipal();
				pp.setVisible(true);
				dispose();
				//SalirsePartido.this.dispose();
			}
		});
		*/
		btnVolverMP.setBounds(395, 252, 107, 25);
		getContentPane().add(btnVolverMP);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblId.setBounds(294, 110, 56, 16);
		getContentPane().add(lblId);
	}
}
