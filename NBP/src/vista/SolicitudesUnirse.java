package vista;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import modelo.Jugador;
import modelo.Partido;
import java.awt.Color;

public class SolicitudesUnirse extends JFrame {

	public static BD bd = BD.getBD();
	private JPanel contentPane;
	public JButton btnAceptar;
	public JButton btnDenegar;
	public JButton btnVolver;
	public JTable tablaSolicitudes;
	private JScrollPane scrollPane;

	public Partido partido;
	public Jugador jugador;
	public Integer seleccionado;

	/**
	 * Create the frame.
	 */
	public SolicitudesUnirse(Partido p) {
		partido = p;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(429, 72, 81, 36);

		btnDenegar = new JButton("Denegar");
		btnDenegar.setBounds(429, 121, 81, 36);

		JLabel lblTitulo = new JLabel("Solicitudes pendientes");
		lblTitulo.setBounds(89, 26, 273, 36);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(429, 279, 77, 36);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 75, 405, 240);

		tablaSolicitudes = new JTable();
		tablaSolicitudes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seleccionado = tablaSolicitudes.rowAtPoint(e.getPoint());
			}
		});
		establecerModeloTabla();
		tablaSolicitudes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tablaSolicitudes.getColumn("Correo").setMinWidth(0);
		tablaSolicitudes.getColumn("Correo").setMaxWidth(0);
		tablaSolicitudes.getColumn("Correo").setPreferredWidth(0);
		contentPane.setLayout(null);
		scrollPane.setViewportView(tablaSolicitudes);
		contentPane.add(scrollPane);
		contentPane.add(lblTitulo);
		contentPane.add(btnVolver);
		contentPane.add(btnAceptar);
		contentPane.add(btnDenegar);
	}

	public void establecerModeloTabla() {

		DefaultTableModel modelo = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		modelo.setColumnIdentifiers(new String[] { "Nick", "Posicion Favorita", "Correo" });
		String sel = "SELECT Jugador.nick, Jugador.posicionfav, Jugador.correo FROM Jugador WHERE Jugador.correo IN (SELECT Jugador_Partido.ID_jug FROM Jugador_Partido WHERE Jugador_Partido.partido ="
				+ partido.getCodPartido() + " AND Jugador_Partido.estado_solicitud = 0)";
		List<Object[]> ob = bd.Select(sel);
		for (Object[] o : ob) {
			modelo.addRow(o);
		}
		tablaSolicitudes.setModel(modelo);
	}
}
