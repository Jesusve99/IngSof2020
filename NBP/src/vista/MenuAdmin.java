package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorMenuInicio;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin();
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
	public MenuAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 285);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuAdministrador = new JLabel("Menu Administrador");
		lblMenuAdministrador.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMenuAdministrador.setBounds(40, 27, 216, 39);
		contentPane.add(lblMenuAdministrador);
		
		JButton btnCrearPista = new JButton("Crear pista");
		btnCrearPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CrearPista c = new CrearPista();
				c.setVisible(true);
			}
		});
		btnCrearPista.setBounds(40, 89, 145, 34);
		contentPane.add(btnCrearPista);
		
		JButton btnEliminarPista = new JButton("Eliminar pista");
		btnEliminarPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EliminarPista ep = new EliminarPista();
				ep.setVisible(true);
			}
		});
		btnEliminarPista.setBounds(40, 136, 143, 34);
		contentPane.add(btnEliminarPista);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ControladorMenuInicio cm = new ControladorMenuInicio(new MenuInicio());
				cm.setVisible(true);
				cm.setLocationRelativeTo(null);
			}
		});
		btnCerrarSesin.setBounds(259, 184, 134, 34);
		contentPane.add(btnCerrarSesin);
		
		JButton btnNewButton = new JButton("Lista de pistas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ListaPista l = new ListaPista();
				l.setVisible(true);
			}
		});
		btnNewButton.setBounds(40, 184, 145, 34);
		contentPane.add(btnNewButton);
	}

}
