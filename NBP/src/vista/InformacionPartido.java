package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import com.mysql.cj.xdevapi.Statement;

import controlador.ControladorInformacionPartido;
import modelo.BD;
import modelo.BDException;
import net.miginfocom.swing.MigLayout;
import net.proteanit.sql.DbUtils;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import java.awt.CardLayout;
import javax.swing.JTable;
import java.awt.Color;

public class InformacionPartido extends JFrame {

	private BD bd = new BD();
	private JPanel contentPane;
	private JTable tablaJugadores;
	private int idPartido = 1;
	private Connection c = null;
	private int totalJugadores;
	private String lugar;
	private String hora;
	/*
	 * CAMBIAR AQUI PARA HACERLO GENERAL A CUALQUIER ID DE PARTIDO
	 */
	private TableModel modelo = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		InformacionPartido v = new InformacionPartido();
		ControladorInformacionPartido c = new ControladorInformacionPartido(v);
		v.setVisible(true);
		v.setLocationRelativeTo(v);
	}

	/**
	 * Create the frame.
	 */
	public InformacionPartido() {
		
		// Operaciones con la BD
		operacionesBD(idPartido);
		//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[734px,grow]", "[grow][][grow][412px]"));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 1 1 3,grow");

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setColumnHeaderView(scrollPane_1);

		JPanel panelPartido = new JPanel();
		panelPartido.setBorder(new TitledBorder(null, "Partido:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_1.setViewportView(panelPartido);
		panelPartido.setLayout(new MigLayout("", "[56px][]", "[16px][][]"));

		JLabel lugar = new JLabel("Lugar:");
		panelPartido.add(lugar, "cell 0 0,alignx right,aligny top");

		JLabel lugarV = new JLabel(this.lugar);
		panelPartido.add(lugarV, "cell 1 0");

		JLabel hora = new JLabel("Hora del partido:");
		panelPartido.add(hora, "cell 0 1,alignx right");

		JLabel horaV = new JLabel(this.hora);
		panelPartido.add(horaV, "cell 1 1");

		JLabel totalJugadores = new JLabel("Total Jugadores:");
		panelPartido.add(totalJugadores, "cell 0 2,alignx right");
		JLabel totalJugadoresV = new JLabel();
		totalJugadoresV.setText(Integer.toString(this.totalJugadores));
		panelPartido.add(totalJugadoresV, "cell 1 2");

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_2);

		JPanel panelTablaJugadores = new JPanel();
		panelTablaJugadores
				.setBorder(new TitledBorder(null, "Jugadores:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_2.setViewportView(panelTablaJugadores);
		panelTablaJugadores.setLayout(new CardLayout(0, 0));

		tablaJugadores = new JTable();
		tablaJugadores.setEnabled(false);
		tablaJugadores.setRowSelectionAllowed(false);
		tablaJugadores.setModel(modelo);
		panelTablaJugadores.add(tablaJugadores, "name_262268824221600");
	}

	private void operacionesBD(int id) {
		try {
			c = bd.connectToDatabase();
			obtenerUbicacionPista(id);
			obtenerHoraPartido(id);
			this.totalJugadores = totalJugadores(id);
			tablaModelo(id);
		} catch (SQLException e) {
			throw new BDException("Error en las operaciones de obtener informacion del partido: " + e.getMessage());
		} finally {
			if (c != null) {
				try {
					c.close(); // Cerramos la conexion
				} catch (SQLException e) {
					throw new BDException("Error al cerrar la conexion con la BDD.");
				}
			}
		}
	}
	//SELECT datos de la pista en la que se juega
	private void obtenerUbicacionPista(int id) throws SQLException {
		java.sql.Statement pst = null;
		ResultSet rs = null;
		String sel = "SELECT Pista.Nombre, Pista.Ubicacion FROM Pista WHERE Pista.Nombre IN (SELECT Partido.Pista FROM Partido WHERE Partido.cod_partido ="+id+")";
		pst = c.createStatement();
		rs = pst.executeQuery(sel);
		if (rs.next()) {
			lugar = rs.getObject(1).toString()+". "+rs.getObject(2).toString();
		}
		rs.close();
		pst.close();
	}
	//SELECT datos de la hora del partido a la que se juega
	private void obtenerHoraPartido(int id) throws SQLException {
		java.sql.Statement pst = null;
		ResultSet rs = null;
		String sel = "SELECT Partido.Hora, Partido.Fecha FROM Partido WHERE Partido.cod_partido ="+ id;
		pst = c.createStatement();
		rs = pst.executeQuery(sel);
		if (rs.next()) {
			hora = rs.getObject(1).toString()+" el "+rs.getObject(2).toString();
		}
		rs.close();
		pst.close();
	}
	//COUNT del total de jugadores en el partido buscado
	private int totalJugadores(int id) throws SQLException {
		int count = 0;
		java.sql.Statement pst = null;
		ResultSet rs = null;
		String sel = "SELECT COUNT(Jugador.correo) FROM Jugador WHERE Jugador.correo IN (SELECT Jugador_Partido.ID_jug FROM Jugador_Partido WHERE Jugador_Partido.partido ="
				+ id + " AND Jugador_Partido.estado_solicitud = 1)";
		pst = c.createStatement();
		rs = pst.executeQuery(sel);
		if (rs.next()) {
			count = rs.getInt(1);
		}
		rs.close();
		pst.close(); // Cerramos recursos
		return count;
	}
	//SELECT de la info de los jugadores que hay ahora mismo en el partido
	private void tablaModelo(int id) throws SQLException {
		String sel = "SELECT Jugador.nick, Jugador.posicionfav, Jugador.Fecha_nacimiento FROM Jugador WHERE Jugador.correo IN (SELECT Jugador_Partido.ID_jug FROM Jugador_Partido WHERE Jugador_Partido.partido ="
				+ id + " AND Jugador_Partido.estado_solicitud = 1)";
		PreparedStatement pst = c.prepareStatement(sel);
		ResultSet rs = pst.executeQuery();
		modelo = DbUtils.resultSetToTableModel(rs);
		rs.close();
		pst.close(); // Cerramos recursos
	}

}
