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
import java.awt.Color;

public class ListaPartidosAnfitrion extends JFrame {

	private JPanel contentPane;
	public JTable tablaListaPartidos;
	public static BD bd = BD.getBD();
	public JButton btnVolver;
	public JButton btnEntrarInfoPartido;

	public Jugador jugador;
	public Integer seleccionado;

	/**
	 * Create the frame.
	 */
	public ListaPartidosAnfitrion(Jugador j) {

		jugador = j;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(37, 274, 81, 38);

		btnEntrarInfoPartido = new JButton("Entrar");
		btnEntrarInfoPartido.setBounds(412, 274, 81, 38);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 51, 499, 210);

		JLabel lblTitulo = new JLabel("Lista Partidos");
		lblTitulo.setBounds(196, 13, 136, 25);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));

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
		contentPane.setLayout(null);
		scrollPane.setViewportView(tablaListaPartidos);
		contentPane.add(scrollPane);
		contentPane.add(lblTitulo);
		contentPane.add(btnVolver);
		contentPane.add(btnEntrarInfoPartido);
	}

	public void establecerModeloTabla() {

		DefaultTableModel modelo = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		modelo.setColumnIdentifiers(new String[] { "Pista", "Fecha", "Hora", "Anfitrion", "codPartido" });
		String sel = "SELECT Partido.Pista, Partido.Fecha, Partido.Hora, Partido.id_anfitrion, Partido.cod_partido FROM Partido WHERE Partido.id_anfitrion =\""
				+ jugador.getCorreo() + "\"";
		List<Object[]> ob = bd.Select(sel);
		for (Object[] o : ob) {
			sel = "SELECT Pista.Nombre FROM Pista WHERE Pista.cod_pista = " + o[0].toString();
			o[0] = bd.SelectEscalar(sel);
			modelo.addRow(o);
		}
		tablaListaPartidos.setModel(modelo);
	}
}
