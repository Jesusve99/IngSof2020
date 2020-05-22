package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Pista;

public class frmCrearPista extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Ubicacion;
	private JTextField HorarioApertura;
	private JTextField HorarioCierre;
	private JTextField DiasDisponibles;
	private JTextField Id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCrearPista frame = new frmCrearPista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmCrearPista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(26, 27, 56, 16);
		contentPane.add(lblNombre);
		
		JLabel lblUbicacion = new JLabel("Ubicaci\u00F3n:");
		lblUbicacion.setBounds(26, 56, 59, 16);
		contentPane.add(lblUbicacion);
		
		JLabel lblHoraDeApertura = new JLabel("Hora de Apertura:");
		lblHoraDeApertura.setBounds(26, 82, 114, 16);
		contentPane.add(lblHoraDeApertura);
		
		JLabel lblHoraDeCierre = new JLabel("Hora de Cierre:");
		lblHoraDeCierre.setBounds(26, 111, 114, 16);
		contentPane.add(lblHoraDeCierre);
		
		Nombre = new JTextField();
		Nombre.setBounds(152, 24, 116, 22);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		Ubicacion = new JTextField();
		Ubicacion.setBounds(152, 53, 116, 22);
		contentPane.add(Ubicacion);
		Ubicacion.setColumns(10);
		
		HorarioApertura = new JTextField();
		HorarioApertura.setBounds(152, 79, 116, 22);
		contentPane.add(HorarioApertura);
		HorarioApertura.setColumns(10);
		
		HorarioCierre = new JTextField();
		HorarioCierre.setBounds(152, 108, 116, 22);
		contentPane.add(HorarioCierre);
		HorarioCierre.setColumns(10);
		
		JButton btnCrearPista = new JButton("Crear Pista");
		btnCrearPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearPista(Id, Nombre, Ubicacion, HorarioApertura, HorarioCierre, DiasDisponibles);
			}
		});
		btnCrearPista.setBounds(323, 215, 97, 25);
		contentPane.add(btnCrearPista);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancelar();
			}
			
			
		});
		btnCancelar.setBounds(214, 215, 97, 25);
		contentPane.add(btnCancelar);
		
		JLabel lblDiasDisponibles = new JLabel("D\u00EDas Disponibles:");
		lblDiasDisponibles.setBounds(26, 138, 114, 16);
		contentPane.add(lblDiasDisponibles);
		
		DiasDisponibles = new JTextField();
		DiasDisponibles.setBounds(152, 135, 116, 22);
		contentPane.add(DiasDisponibles);
		DiasDisponibles.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(26, 167, 56, 16);
		contentPane.add(lblId);
		
		Id = new JTextField();
		Id.setBounds(152, 164, 116, 22);
		contentPane.add(Id);
		Id.setColumns(10);
	}

	protected void crearPista(JTextField id, JTextField nombre, JTextField ubicacion, JTextField horarioApertura,
			JTextField horarioCierre, JTextField diasDisponibles) {
		Pista pista = new Pista(id, nombre, ubicacion, horarioApertura, horarioCierre);
		GestionPista gP = new GestionPista();
		gP.obtenerPista(pista);
	}

	protected void cancelar() {
		System.exit(0);
	}
}
