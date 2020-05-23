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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCrearPartido = new JLabel("Crear Partido");
		lblCrearPartido.setBounds(36, 10, 117, 25);
		lblCrearPartido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblCrearPartido);
		
		JLabel lblHoraInicio = new JLabel("Hora de inicio");
		lblHoraInicio.setBounds(36, 112, 78, 16);
		lblHoraInicio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblHoraInicio);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(36, 83, 34, 16);
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblFecha);
		
		textField = new JTextField();
		textField.setBounds(126, 109, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 80, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Pista");
		lblNewLabel_2.setBounds(36, 48, 27, 16);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 48, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		try {	
			DefaultTableModel model = new DefaultTableModel();
			
			//model.addColumn(columnName);
			model.addColumn("Nombre");
			model.addColumn("Ubicacion");
			model.addColumn("Hora_inicio");
			model.addColumn("Hora_fin");
			
			String [] datos = new String[4];
			
			conexion = BD.connectToDatabase();
			
			String sql = "SELECT * FROM Pista;";
			Statement pst = conexion.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery(sql);
			
			while(rs.next()) {
				datos[0] = rs.getString(1);
				datos[1] = rs.getString(2);
				datos[2] = rs.getString(3);
				datos[3] = rs.getString(4);
				model.addRow(datos);
			}
			
			dispose();
			rs.close();
			pst.close();
			
			JButton btnCrearPartido = new JButton("Crear Partido");
			
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
						rs.close();
						pst.close();
						
						String sql1 = "SELECT Hora FROM Partido WHERE Pista = ?";
						
						pst = conexion.prepareStatement(sql1);
						pst.setString(1, textField_2.getText());
						
						rs = pst.executeQuery();
						
						SortedSet<String> horas = new TreeSet<>();
						
						int i=0;
						while(rs.next()) {
							horas.add(rs.getObject(i).toString());
							i++;
						}
						
						if(compararFechas(textField.getText(), o[0]) < 0 || compararFechas(textField.getText(), o[1]) > 0 
								|| coincideHora(textField_1.getText(), horas)) {
							throw new BDException("Partido fuera de fecha");
						}
						
						String sql2 = "INSERT INTO Partido(Pista, Fecha, Hora) "
								+ "VALUES (\""+textField_2.getText()+"\",\""+textField.getText()+"\",\""+textField_1.getText()+"\")";
						Statement st = conexion.createStatement();
						
						st.executeUpdate(sql2);
						
					}catch(Exception ee) {
						System.out.println(ee.getMessage());
					}
					
				}

			});
			
			btnCrearPartido.setBounds(287, 215, 109, 25);
			contentPane.add(btnCrearPartido);
			
			table = new JTable();
			table.setBounds(410, 52, 0, 0);
			
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
