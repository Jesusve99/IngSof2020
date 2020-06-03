package vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import modelo.BD;
import modelo.Jugador;
import modelo.Partido;

public class InformacionPartidoUnirse extends JFrame {

	public BD bd = BD.getBD();
	private JPanel contentPane;
	private JTable tablaJugadores;
	public JButton unirsePartido;
	public JButton volverLista;
	private String lugar = "";

	public Partido partido;
	public Jugador jugador;
	/*
	 * CAMBIAR AQUI PARA HACERLO GENERAL A CUALQUIER ID DE PARTIDO
	 */
	private DefaultTableModel modelo = null;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public InformacionPartidoUnirse(Partido p) {
		// Obtenemos los datos:
		partido = p;
		obtenerUbicacionPista((int) partido.getIdPista());

		// ---------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "name_16908185335300");

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setColumnHeaderView(scrollPane_1);

		JPanel panelPartido = new JPanel();
		panelPartido.setBackground(new Color(204, 255, 255));
		panelPartido.setBorder(new TitledBorder(null, "Partido:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_1.setViewportView(panelPartido);
		panelPartido.setLayout(new BoxLayout(panelPartido, BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panelPartido.add(panel);
		panel.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		JLabel lugar_1 = new JLabel("Lugar:");
		panel.add(lugar_1, "2, 2");

		JLabel valorLugar = new JLabel(lugar);
		panel.add(valorLugar, "4, 2");

		JLabel hora_1 = new JLabel("Hora del partido:");
		panel.add(hora_1, "2, 4");

		JLabel horaV = new JLabel(partido.getHora() + " el " + partido.getFecha());
		panel.add(horaV, "4, 4");

		JLabel totalJugadores_1 = new JLabel("Total Jugadores:");
		panel.add(totalJugadores_1, "2, 6");
		JLabel totalJugadoresV = new JLabel();
		panel.add(totalJugadoresV, "4, 6");
		totalJugadoresV.setText(Long.toString(totalJugadores((int) partido.getCodPartido())));

		unirsePartido = new JButton("Unirse");
		unirsePartido.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelPartido.add(unirsePartido);

		volverLista = new JButton("Volver");
		panelPartido.add(volverLista);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setViewportBorder(
				new TitledBorder(null, "Jugadores:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(scrollPane_2);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setMaximumSize(new Dimension(32706, 32767));
		scrollPane_2.setViewportView(scrollPane_3);

		tablaModelo((int) partido.getCodPartido());
		tablaJugadores = new JTable(modelo);
		tablaJugadores.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tablaJugadores.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tablaJugadores.setEnabled(false);
		tablaJugadores.setRowSelectionAllowed(false);
		scrollPane_3.setViewportView(tablaJugadores);
	}

	// SELECT datos de la pista en la que se juega
	private void obtenerUbicacionPista(int id) {
		String sel = "SELECT Pista.Nombre, Pista.Ubicacion FROM Pista WHERE Pista.cod_pista = " + id;
		List<Object[]> pista = bd.Select(sel);
		if (pista.size() > 0) {
			lugar = pista.get(0)[0].toString() + ". " + pista.get(0)[1];
		}
	}

	// COUNT del total de jugadores en el partido buscado
	private long totalJugadores(int id) {
		long count = 0;
		String sel = "SELECT COUNT(Jugador_Partido.ID_jug) FROM Jugador_Partido WHERE Jugador_Partido.partido =" + id
				+ " AND Jugador_Partido.estado_solicitud = 1";
		count = Long.parseLong(bd.SelectEscalar(sel).toString());
		return count;
	}

	// SELECT de la info de los jugadores que hay ahora mismo en el partido
	private void tablaModelo(int id) {
		String sel = "SELECT Jugador.nick, Jugador.posicionfav, Jugador.Fecha_nacimiento FROM Jugador WHERE Jugador.correo IN (SELECT Jugador_Partido.ID_jug FROM Jugador_Partido WHERE Jugador_Partido.partido ="
				+ id + " AND Jugador_Partido.estado_solicitud = 1)";
		modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new String[] { "Nick", "Posicion Favorita", "Fecha de nacimiento" });
		List<Object[]> jugadores = bd.Select(sel);
		for (int i = 0; i < jugadores.size(); i++) {
			modelo.addRow(jugadores.get(i));
		}
	}

}
