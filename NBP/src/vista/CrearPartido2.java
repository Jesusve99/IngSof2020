package vista;

import java.awt.BorderLayout;


import modelo.BD;
import modelo.BDException;
import modelo.Partido;
import controlador.GestionPartido;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class CrearPartido2 extends JFrame {
	
	BD bd = new BD();
	private JPanel contentPane;
	public JTextField txtFecha;
	public JTextField txtHora;
	public JComboBox<String> comboBox;
	public JButton btnCancelar;
	public JButton btnCrearPartido;
	
	
	public CrearPartido2() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCrearPartido = new JLabel("CREAR PARTIDO");
		lblCrearPartido.setBounds(34, 13, 186, 51);
		lblCrearPartido.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblCrearPartido);
		
		JLabel lblFecha = new JLabel("Fecha :");
		lblFecha.setBounds(26, 60, 67, 45);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(124, 72, 106, 25);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		
		JLabel lblHoraInicio = new JLabel("Hora inicio :");
		lblHoraInicio.setBounds(26, 109, 96, 51);
		lblHoraInicio.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblHoraInicio);
		
		txtHora = new JTextField();
		txtHora.setBounds(124, 123, 106, 25);
		contentPane.add(txtHora);
		txtHora.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pista:");
		lblNewLabel_2.setBounds(251, 60, 47, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel_2);
			
		btnCrearPartido = new JButton("Crear Partido");
		btnCrearPartido.setBounds(290, 200, 130, 50);		
		contentPane.add(btnCrearPartido);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(150, 200, 130, 50);
		btnCancelar.setForeground(Color.BLACK);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_6 = new JLabel("hh:mm");
		lblNewLabel_6.setBounds(124, 148, 67, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("yyyy-mm-dd");
		lblNewLabel_7.setBounds(124, 100, 83, 13);
		contentPane.add(lblNewLabel_7);

		comboBox = new JComboBox<String>();
		comboBox.setMaximumRowCount(20);
		comboBox.setToolTipText("Elegir Pista...");
		comboBox.setBounds(290, 72, 113, 22);
		contentPane.add(comboBox);
	}
}
