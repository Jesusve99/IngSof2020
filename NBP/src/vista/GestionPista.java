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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblTitulo = new JLabel("GESTIONAR PISTA:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JScrollPane scrollPane = new JScrollPane();

		btnVolver = new JButton("Volver");

		btnHabilitar = new JButton("Habilitar");

		btnDeshabilitar = new JButton("Deshabilitar");

		btnEliminar = new JButton("Eliminar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(32)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTitulo))
						.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnVolver, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(btnHabilitar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnDeshabilitar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnEliminar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblTitulo)
						.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(45).addComponent(scrollPane,
								GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(68)
								.addComponent(btnHabilitar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addGap(59)
								.addComponent(btnDeshabilitar, GroupLayout.PREFERRED_SIZE, 33,
										GroupLayout.PREFERRED_SIZE)
								.addGap(56)
								.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(24, Short.MAX_VALUE)));

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
		scrollPane.setViewportView(tablaListaPistas);
		contentPane.setLayout(gl_contentPane);
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
