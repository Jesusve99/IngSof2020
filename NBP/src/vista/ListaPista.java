package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controlador.ControladorMenuAdministrador;
import modelo.Administrador;
import modelo.BD;

public class ListaPista extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public BD bd = BD.getBD();

	public Administrador administrador;

	/**
	 * Create the frame.
	 */
	public ListaPista() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnGenerarListaPistas = new JButton("Generar Lista Pistas");
		btnGenerarListaPistas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel modelo = new DefaultTableModel() {
					@Override
					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				modelo.setColumnIdentifiers(
						new String[] { "Nombre", "Ubicacion", "Hora apertura", "Hora cierre", "codPartido", "Estado" });
				String sel = "Select * from Pista";
				List<Object[]> ob = bd.Select(sel);
				for (Object[] o : ob) {
					Boolean estado = Boolean.parseBoolean(o[5].toString());
					if (estado) {
						o[5] = "Habilitada";
					} else {
						o[5] = "Deshabilitada";
					}
					modelo.addRow(o);
				}
				table.setModel(modelo);
				table.getColumn("codPartido").setMinWidth(0);
				table.getColumn("codPartido").setMaxWidth(0);
				table.getColumn("codPartido").setPreferredWidth(0);
			}
		});
		btnGenerarListaPistas.setBounds(109, 30, 199, 39);
		contentPane.add(btnGenerarListaPistas);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 82, 545, 289);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JButton btnMenu = new JButton("Men\u00FA");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ControladorMenuAdministrador cma = new ControladorMenuAdministrador(new MenuAdministrador());
				cma.setAdministrador(getAdministrador());
				cma.setVisible(true);
				cma.setLocationRelativeTo(null);
			}
		});
		btnMenu.setBounds(405, 30, 100, 39);
		contentPane.add(btnMenu);
	}

	public void setAdministrador(Administrador a) {
		this.administrador = a;
	}

	public Administrador getAdministrador() {
		return this.administrador;
	}
}
