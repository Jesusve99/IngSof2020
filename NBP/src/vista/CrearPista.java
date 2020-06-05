package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Administrador;

public class CrearPista extends JFrame {

	private JPanel contentPane;
	public JTextField Nombre;
	public JTextField Ubicacion;
	public JTextField HorarioApertura;
	public JTextField HorarioCierre;
	public JButton btnCrearPista;
	public JButton btnCancelar;

	public Administrador administrador;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { CrearPista frame = new CrearPista();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */
	/**
	 * Create the frame.
	 */
	public CrearPista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(91, 99, 80, 16);
		contentPane.add(lblNombre);

		JLabel lblUbicacion = new JLabel("Ubicaci\u00F3n :");
		lblUbicacion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUbicacion.setBounds(91, 128, 80, 16);
		contentPane.add(lblUbicacion);

		JLabel lblHoraDeApertura = new JLabel("Hora Apertura :");
		lblHoraDeApertura.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoraDeApertura.setBounds(91, 154, 131, 16);
		contentPane.add(lblHoraDeApertura);

		JLabel lblHoraDeCierre = new JLabel("Hora Cierre :");
		lblHoraDeCierre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoraDeCierre.setBounds(91, 183, 114, 16);
		contentPane.add(lblHoraDeCierre);

		Nombre = new JTextField();
		Nombre.setBounds(217, 99, 116, 22);
		contentPane.add(Nombre);
		Nombre.setColumns(10);

		Ubicacion = new JTextField();
		Ubicacion.setBounds(217, 128, 116, 22);
		contentPane.add(Ubicacion);
		Ubicacion.setColumns(10);

		HorarioApertura = new JTextField();
		HorarioApertura.setBounds(217, 154, 116, 22);
		contentPane.add(HorarioApertura);
		HorarioApertura.setColumns(10);

		HorarioCierre = new JTextField();
		HorarioCierre.setBounds(217, 183, 116, 22);
		contentPane.add(HorarioCierre);
		HorarioCierre.setColumns(10);
		
		btnCrearPista = new JButton("Crear Pista");
		btnCrearPista.setBounds(338, 254, 114, 41);
		contentPane.add(btnCrearPista);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(63, 255, 116, 39);
		contentPane.add(btnCancelar);

		JLabel lblCrearPista = new JLabel("CREAR PISTA");
		lblCrearPista.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCrearPista.setBounds(187, 26, 162, 32);
		contentPane.add(lblCrearPista);
		
		JLabel lblNewLabel = new JLabel("(hh:mm)");
		lblNewLabel.setBounds(355, 156, 80, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("(hh:mm)");
		lblNewLabel_1.setBounds(355, 185, 80, 13);
		contentPane.add(lblNewLabel_1);
	}
}
