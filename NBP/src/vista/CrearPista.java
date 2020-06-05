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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(40, 75, 80, 16);
		contentPane.add(lblNombre);

		JLabel lblUbicacion = new JLabel("Ubicaci\u00F3n :");
		lblUbicacion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUbicacion.setBounds(40, 104, 80, 16);
		contentPane.add(lblUbicacion);

		JLabel lblHoraDeApertura = new JLabel("Hora Apertura :");
		lblHoraDeApertura.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoraDeApertura.setBounds(40, 130, 131, 16);
		contentPane.add(lblHoraDeApertura);

		JLabel lblHoraDeCierre = new JLabel("Hora Cierre :");
		lblHoraDeCierre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoraDeCierre.setBounds(40, 159, 114, 16);
		contentPane.add(lblHoraDeCierre);

		Nombre = new JTextField();
		Nombre.setBounds(178, 72, 116, 22);
		contentPane.add(Nombre);
		Nombre.setColumns(10);

		Ubicacion = new JTextField();
		Ubicacion.setBounds(178, 101, 116, 22);
		contentPane.add(Ubicacion);
		Ubicacion.setColumns(10);

		HorarioApertura = new JTextField();
		HorarioApertura.setBounds(178, 127, 116, 22);
		contentPane.add(HorarioApertura);
		HorarioApertura.setColumns(10);

		HorarioCierre = new JTextField();
		HorarioCierre.setBounds(178, 156, 116, 22);
		contentPane.add(HorarioCierre);
		HorarioCierre.setColumns(10);
		
		btnCrearPista = new JButton("Crear Pista");
		btnCrearPista.setBounds(306, 208, 114, 32);
		contentPane.add(btnCrearPista);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(178, 208, 116, 32);
		contentPane.add(btnCancelar);

		JLabel lblCrearPista = new JLabel("CREAR PISTA");
		lblCrearPista.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCrearPista.setBounds(40, 13, 162, 32);
		contentPane.add(lblCrearPista);
		
		JLabel lblNewLabel = new JLabel("(hh:mm)");
		lblNewLabel.setBounds(304, 133, 80, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("(hh:mm)");
		lblNewLabel_1.setBounds(304, 162, 80, 13);
		contentPane.add(lblNewLabel_1);
	}
}
