package vista;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Administrador;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class MenuAdministrador extends JFrame{
	
	public MenuAdministrador() {
		getContentPane().setBackground(new Color(204, 255, 255));
		this.setSize(800,600);
		getContentPane().setLayout(null);
		
		Label label = new Label("MENU ADMINISTRADOR :");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 25));
		label.setBounds(220, 41, 376, 55);
		getContentPane().add(label);
		
		Panel Crear = new Panel();
		Crear.setBackground(new Color(64, 224, 208));
		Crear.setBounds(295, 165, 200, 70);
		getContentPane().add(Crear);
		Crear.setLayout(null);
		
		JLabel lblCrear = new JLabel("        Crear Pista");
		lblCrear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCrear.setBounds(10, 5, 180, 54);
		Crear.add(lblCrear);
		
		Panel Eliminar = new Panel();
		Eliminar.setBackground(new Color(255, 0, 51));
		Eliminar.setForeground(Color.WHITE);
		Eliminar.setBounds(295, 276, 200, 70);
		getContentPane().add(Eliminar);
		Eliminar.setLayout(null);
		
		JLabel lblEliminar = new JLabel("      Eliminar Pista");
		lblEliminar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEliminar.setBounds(10, 11, 180, 48);
		Eliminar.add(lblEliminar);
		
		Panel CerrarSesion = new Panel();
		CerrarSesion.setBackground(new Color(51, 255, 102));
		CerrarSesion.setBounds(572, 473, 200, 70);
		getContentPane().add(CerrarSesion);
		CerrarSesion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("      Cerrar Sesion");
		lblNewLabel.setBounds(12, 13, 180, 48);
		CerrarSesion.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		Crear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				CrearPista cp = new CrearPista();
				cp.setVisible(true);
			}
		});
		Eliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				EliminarPista cp = new EliminarPista();
				cp.setVisible(true);
			}
		});
		CerrarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Iniciarsesion is = new Iniciarsesion();
				is.setVisible(true);
			}
		});
	}
}
