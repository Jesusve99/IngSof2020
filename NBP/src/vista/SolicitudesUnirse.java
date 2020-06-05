package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import modelo.Jugador;
import modelo.Partido;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

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

		btnDenegar = new JButton("Denegar");

		JLabel lblTitulo = new JLabel("Solicitudes pendientes");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnVolver = new JButton("Volver");

		scrollPane = new JScrollPane();

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
		scrollPane.setViewportView(tablaSolicitudes);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
					.addGap(157))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAceptar, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnDenegar, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnVolver, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
							.addGap(4)))
					.addGap(9))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAceptar, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
							.addGap(13)
							.addComponent(btnDenegar, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
							.addGap(122)
							.addComponent(btnVolver, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
					.addGap(16))
		);
		contentPane.setLayout(gl_contentPane);
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
