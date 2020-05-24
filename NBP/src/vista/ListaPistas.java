package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class ListaPistas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPistas frame = new ListaPistas();
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
	public ListaPistas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListasDelSistema = new JLabel("PISTAS DEL SISTEMA :");
		lblListasDelSistema.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblListasDelSistema.setBounds(110, 13, 256, 16);
		contentPane.add(lblListasDelSistema);
		
		JButton btnGenerarPistas = new JButton("Generar pistas");
		btnGenerarPistas.setBounds(146, 53, 155, 35);
		contentPane.add(btnGenerarPistas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 101, 334, 158);
		contentPane.add(scrollPane);
	}
}
