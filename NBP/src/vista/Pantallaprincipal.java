package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantallaprincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantallaprincipal frame = new Pantallaprincipal();
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
	public Pantallaprincipal() {
		getContentPane().setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 447);
		getContentPane().setLayout(null);
		
		JLabel lblNbp = new JLabel("NBP");
		lblNbp.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNbp.setBounds(209, 26, 64, 27);
		getContentPane().add(lblNbp);
		
		JLabel lblNeoBalompi = new JLabel("Neo Balompi\u00E9");
		lblNeoBalompi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNeoBalompi.setBounds(189, 53, 115, 16);
		getContentPane().add(lblNeoBalompi);
		
		JButton btnUnirseAPartido = new JButton("UNIRSE A PARTIDO");
		btnUnirseAPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UnirsePartido up = new UnirsePartido();
				up.setVisible(true);				
			}
		});
		btnUnirseAPartido.setBounds(163, 92, 153, 37);
		getContentPane().add(btnUnirseAPartido);
		
		JButton btnCrearPartido = new JButton("CREAR PARTIDO");
		btnCrearPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CrearPartido c = new CrearPartido();
				c.setVisible(true);
			}
		});
		btnCrearPartido.setBounds(163, 142, 153, 37);
		getContentPane().add(btnCrearPartido);
		
		JButton btnEliminarPartido = new JButton("ELIMINAR PARTIDO");
		btnEliminarPartido.setBounds(163, 192, 153, 37);
		getContentPane().add(btnEliminarPartido);
		
		JButton btnCerrarSesion = new JButton("CERRAR SESION");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Inicio i = new Inicio();
				i.setVisible(true);	
			}
		});
		btnCerrarSesion.setBounds(163, 292, 153, 37);
		getContentPane().add(btnCerrarSesion);
		
		JButton btnNewButton = new JButton("SALIR DE PARTIDO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SalirsePartido s = new SalirsePartido();
				s.setVisible(true);	
			}
		});
		btnNewButton.setBounds(163, 242, 153, 37);
		getContentPane().add(btnNewButton);
	}
}
