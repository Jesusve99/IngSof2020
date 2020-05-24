package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorRegistro;
import controlador.ControladorIniciarSesion;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 319);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIniciarSesin = new JButton("INICIAR SESI\u00D3N");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Iniciarsesion is = new Iniciarsesion();
				ControladorIniciarSesion c = new ControladorIniciarSesion(is);
				is.setVisible(true);
				is.setLocationRelativeTo(null);
			}
		});
		btnIniciarSesin.setBounds(132, 83, 159, 45);
		contentPane.add(btnIniciarSesin);
		
		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ControladorRegistro cr = new ControladorRegistro(new Registrarse());
				cr.setVisible(true);
				cr.setLocationRelativeTo(null);
			}
		});
		btnRegistrarse.setBounds(132, 141, 159, 45);
		contentPane.add(btnRegistrarse);
		
		JLabel lblNbp = new JLabel("NBP");
		lblNbp.setBackground(new Color(240, 240, 240));
		lblNbp.setForeground(new Color(0, 0, 0));
		lblNbp.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNbp.setBounds(179, 13, 66, 50);
		contentPane.add(lblNbp);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setForeground(new Color(0, 0, 0));
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBienvenido.setBounds(167, 54, 115, 16);
		contentPane.add(lblBienvenido);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(132, 199, 159, 45);
		contentPane.add(btnSalir);
	}

}
