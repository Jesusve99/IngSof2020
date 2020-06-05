package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.BD;

public class CrearPartido extends JFrame {

	BD bd = BD.getBD();
	private JPanel contentPane;
	public JTextField txtFecha;
	public JTextField txtHora;
	public JComboBox<String> comboBox;
	public JButton btnCancelar;
	public JButton btnCrearPartido;

	public CrearPartido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCrearPartido = new JLabel("CREAR PARTIDO");
		lblCrearPartido.setBounds(178, 23, 186, 51);
		lblCrearPartido.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblCrearPartido);

		JLabel lblFecha = new JLabel("Fecha :");
		lblFecha.setBounds(108, 91, 67, 45);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblFecha);

		txtFecha = new JTextField();
		txtFecha.setBounds(206, 103, 115, 25);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);

		JLabel lblHoraInicio = new JLabel("Hora inicio :");
		lblHoraInicio.setBounds(108, 128, 96, 51);
		lblHoraInicio.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblHoraInicio);

		txtHora = new JTextField();
		txtHora.setBounds(206, 141, 115, 25);
		contentPane.add(txtHora);
		txtHora.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Pista:");
		lblNewLabel_2.setBounds(108, 169, 47, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel_2);

		btnCrearPartido = new JButton("Crear Partido");
		btnCrearPartido.setBounds(346, 265, 132, 35);
		contentPane.add(btnCrearPartido);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(44, 265, 131, 35);
		btnCancelar.setForeground(Color.BLACK);
		contentPane.add(btnCancelar);

		JLabel lblNewLabel_6 = new JLabel("(hh:mm)");
		lblNewLabel_6.setBounds(354, 147, 67, 13);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("(yyyy-mm-dd)");
		lblNewLabel_7.setBounds(355, 107, 83, 13);
		contentPane.add(lblNewLabel_7);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(206, 179, 115, 25);
		comboBox.setMaximumRowCount(20);
		comboBox.setToolTipText("Elegir Pista...");
		contentPane.add(comboBox);
	}
}
