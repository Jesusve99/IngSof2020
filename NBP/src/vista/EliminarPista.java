package vista;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import modelo.BD;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;

public class EliminarPista extends JFrame{
	private JTable table;
	private JTextField txtNombre;
	
	public EliminarPista() {
		getContentPane().setBackground(new Color(204, 255, 255));
		this.setSize(548,359);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELIMINAR PISTA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(178, 13, 190, 54);
		getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(40, 65, 450, 219);
		Connection c = BD.connectToDatabase();
		PreparedStatement stmt;
		try {
			stmt = c.prepareStatement("Select Nombre, Ubicacion, Hora_inicio, Hora_fin, cod_pista From Pista");
			ResultSet rset = stmt.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rset));
			rset.close();
			stmt.close();
		}catch (SQLException e) {
			e.getMessage();
		}
		getContentPane().add(table);
		
		//txtNombre = new JTextField();
		//txtNombre.setText("       Nombre                                   Ubicación                                   Hora Inicio                                   Hora Fin                                   Codigo");
		//txtNombre.setBounds(53, 56, 685, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
	
		
	}
}
