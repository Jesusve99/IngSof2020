package vista;

import java.awt.BorderLayout;


import modelo.BD;
import modelo.BDException;
import modelo.Partido;
import controlador.GestionPartido;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class CrearPartido extends JFrame {
	
	Connection conexion = null;
	BD bd = new BD();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	private static boolean coincideHora(String hora, SortedSet<String> horas) {
		boolean ok = false;
		for(String h : horas) {
			ok = h.equals(hora);
		}
		return ok;
	}
	
	private static int compararFechas(String f1, String f2) {
		Date d1 = convertir(f1);
		Date d2 = convertir(f2);
		
		return d1.compareTo(d2);
		
	}

	@SuppressWarnings("deprecation")
	private static Date convertir(String f1) {
		Date d = null;
		int y, m, dy;
		try (Scanner sc = new Scanner(f1)){
			sc.useDelimiter("-");
			sc.useLocale(Locale.ENGLISH);
			y = sc.nextInt();
			m = sc.nextInt();
			dy = sc.nextInt();
			d = new Date(y, m, dy);
		}catch(Exception e) {
			e.getMessage();
		}
		return d;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearPartido frame = new CrearPartido();
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
	public CrearPartido() {
		
		conexion = bd.connectToDatabase();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 301);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearPartido = new JLabel("CREAR PARTIDO");
		lblCrearPartido.setBounds(34, 13, 186, 51);
		lblCrearPartido.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblCrearPartido);
		
		JLabel lblFecha = new JLabel("Fecha :");
		lblFecha.setBounds(26, 72, 47, 45);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblFecha);
		
		textField = new JTextField();
		textField.setBounds(114, 83, 106, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblHoraInicio = new JLabel("Hora inicio :");
		lblHoraInicio.setBounds(23, 105, 96, 51);
		lblHoraInicio.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblHoraInicio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 118, 106, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Pista :");
		lblNewLabel_2.setBounds(26, 143, 58, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 153, 106, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		try {	
			DefaultTableModel model = new DefaultTableModel();
			
			model.addColumn("cod_pista");
			model.addColumn("Nombre");
			model.addColumn("Ubicacion");
			model.addColumn("Hora_inicio");
			model.addColumn("Hora_fin");
			
			String [] datos = new String[5];
			
			conexion = BD.connectToDatabase();
			
			String sql = "SELECT * FROM Pista;";
			Statement pst = conexion.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery(sql);
			
			while(rs.next()) {
				datos[0] = rs.getObject(1).toString();
				datos[1] = rs.getObject(2).toString();
				datos[2] = rs.getObject(3).toString();
				datos[3] = rs.getObject(4).toString();
				datos[4] = rs.getObject(5).toString();
				model.addRow(datos);
			}
			
			dispose();
			//rs.close();
			//pst.close();
			
			JButton btnCrearPartido = new JButton("Crear Partido");
			btnCrearPartido.setBounds(277, 195, 124, 45);
			
			btnCrearPartido.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						
						conexion = BD.connectToDatabase();
						
						String sql = "SELECT Hora_Inicio, Hora_Fin FROM Pista WHERE cod_pista = ?";
						
						PreparedStatement pst = conexion.prepareStatement(sql);
						pst.setInt(1, Integer.parseInt(textField_2.getText()));
												
						ResultSet rs = pst.executeQuery();
						
						String [] o = new String[2];
						
						if(rs.next()) {
							o[0] = rs.getObject(1).toString();
							o[1] = rs.getObject(2).toString();
						}
						
						dispose();
						//rs.close();
						//pst.close();
						
						String sql1 = "SELECT Hora FROM Partido WHERE Pista = ?";
						
						pst = conexion.prepareStatement(sql1);
						pst.setString(1, textField_2.getText());
						
						rs = pst.executeQuery();
						
						SortedSet<String> horas = new TreeSet<>();
						
						while(rs.next()) {
							horas.add(rs.getObject(1).toString());
						}
												
						rs.close();
						pst.close();
						
						if(compararFechas(textField.getText(), o[0]) < 0 || compararFechas(textField.getText(), o[1]) > 0 
								|| coincideHora(textField_1.getText(), horas)) {
							throw new BDException("Partido fuera de fecha");
						}
						
						String sql2 = "INSERT INTO Partido(Pista, Fecha, Hora) "
								+ "VALUES (\""+textField_2.getText()+"\",\""+textField.getText()+"\",\""+textField_1.getText()+"\")";
						Statement st = conexion.createStatement();
						
						st.executeUpdate(sql2);
						
						st.close();
						
					}catch(Exception ee) {
						System.out.println(ee.getMessage());
					}
					
				}

			});
			contentPane.add(btnCrearPartido);
			
			table = new JTable();
			table.setBounds(241, 69, 185, 109);
			
			table.setModel(model);
			
			contentPane.add(table);
			
			rs.close();
			pst.close();
			
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	protected void crearPartido(JTextField hora, JTextField fecha, JTextField pista) {
		Partido partido = new Partido(pista, fecha, hora);
		CrearPartido v = new CrearPartido();
		GestionPartido gP = new GestionPartido(v);
		//Redirigir a Menu
		dispose();
		
	}

	protected void cancelar() {
		dispose();
		MenuAdministrador mad = new MenuAdministrador();
		mad.setVisible(true);
	}
}
