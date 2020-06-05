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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Administrador;
import modelo.BD;

public class GestionPista extends JFrame {

	private JPanel contentPane;
	public JTable tablaListaPistas;
	public BD bd = BD.getBD();
	public JButton btnVolver;
	public JButton btnHabilitar;
	public JButton btnDeshabilitar;
	public JButton btnEliminar;

	public Integer seleccionado;
	public Administrador administrador;

	/**
	 * Create the frame.
	 */
	public GestionPista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 449);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblTitulo = new JLabel("GESTIONAR PISTAS");
		lblTitulo.setBounds(147, 28, 199, 22);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 70, 452, 309);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(495, 307, 99, 37);

		btnHabilitar = new JButton("Habilitar");
		btnHabilitar.setBounds(495, 99, 99, 40);

		btnDeshabilitar = new JButton("Deshabilitar");
		btnDeshabilitar.setBounds(495, 171, 99, 43);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(495, 239, 99, 41);

		tablaListaPistas = new JTable();
		tablaListaPistas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seleccionado = tablaListaPistas.rowAtPoint(e.getPoint());
			}
		});
		establecerModeloTabla();
		tablaListaPistas.getColumn("codPartido").setMinWidth(0);
		tablaListaPistas.getColumn("codPartido").setMaxWidth(0);
		tablaListaPistas.getColumn("codPartido").setPreferredWidth(0);
		contentPane.setLayout(null);
		scrollPane.setViewportView(tablaListaPistas);
		contentPane.add(scrollPane);
		contentPane.add(lblTitulo);
		contentPane.add(btnHabilitar);
		contentPane.add(btnVolver);
		contentPane.add(btnEliminar);
		contentPane.add(btnDeshabilitar);
	}

	public void establecerModeloTabla() {

		DefaultTableModel modelo = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		modelo.setColumnIdentifiers(
				new String[] { "Nombre", "Ubicacion", "Horario inicio", "Horario fin", "codPartido", "Estado" });
		String sel = "SELECT * FROM Pista";
		List<Object[]> ob = bd.Select(sel);
		for (Object[] o : ob) {
			sel = "SELECT Pista.estado FROM Pista WHERE Pista.cod_pista = " + o[4].toString();
			Boolean estado = Boolean.parseBoolean(bd.SelectEscalar(sel).toString());
			if (estado) {
				o[5] = "Habilitada";
			} else {
				o[5] = "Deshabilitada";
			}
			modelo.addRow(o);
		}
		tablaListaPistas.setModel(modelo);
	}
}
