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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import modelo.Jugador;

public class ListaPartidos extends JFrame {

	private JPanel contentPane;
	public JTable tablaListaPartidos;
	public static BD bd = BD.getBD();
	public JButton btnVolver;
	public JButton btnEntrarInfoPartido;

	public Jugador jugador;
	public Integer seleccionado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the frame.
	 */
	public ListaPartidos(Jugador j) {

		jugador = j;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnVolver = new JButton("Volver");

		btnEntrarInfoPartido = new JButton("Entrar");

		JScrollPane scrollPane = new JScrollPane();

		JLabel lblTitulo = new JLabel("Lista Partidos:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(22)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE).addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGap(412)))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnVolver, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
						.addComponent(btnEntrarInfoPartido, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 90,
								Short.MAX_VALUE))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(23).addComponent(
								lblTitulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnVolver,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(32)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE).addGap(34))
						.addGroup(gl_contentPane
								.createSequentialGroup().addGap(137).addComponent(btnEntrarInfoPartido,
										GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))));

		tablaListaPartidos = new JTable();
		tablaListaPartidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seleccionado = tablaListaPartidos.rowAtPoint(e.getPoint());
			}
		});
		establecerModeloTabla();
		tablaListaPartidos.getColumn("codPartido").setMinWidth(0);
		tablaListaPartidos.getColumn("codPartido").setMaxWidth(0);
		tablaListaPartidos.getColumn("codPartido").setPreferredWidth(0);
		scrollPane.setViewportView(tablaListaPartidos);
		contentPane.setLayout(gl_contentPane);
	}

	public void establecerModeloTabla() {

		DefaultTableModel modelo = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		modelo.setColumnIdentifiers(new String[] { "Pista", "Fecha", "Hora", "Anfitrion", "codPartido" });
		String sel = "SELECT Partido.Pista, Partido.Fecha, Partido.Hora, Partido.id_anfitrion, Partido.cod_partido FROM Partido WHERE Partido.cod_partido IN (SELECT Jugador_Partido.partido FROM Jugador_Partido WHERE Jugador_Partido.ID_jug =\""
				+ jugador.getCorreo() + "\" AND Jugador_Partido.estado_solicitud = 1)";
		List<Object[]> ob = bd.Select(sel);
		for (Object[] o : ob) {
			sel = "SELECT Pista.Nombre FROM Pista WHERE Pista.cod_pista = " + o[0].toString();
			o[0] = bd.SelectEscalar(sel);
			modelo.addRow(o);
		}
		tablaListaPartidos.setModel(modelo);
	}
}
