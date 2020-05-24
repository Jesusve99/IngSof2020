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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAdministrador extends JFrame{
	
	public MenuAdministrador() {
		getContentPane().setBackground(new Color(204, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblMenuAdministrador = new JLabel("Menu Administrador");
		lblMenuAdministrador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblMenuAdministrador.setBounds(12, 13, 408, 34);
		getContentPane().add(lblMenuAdministrador);
		
		JButton btnCrearPista = new JButton("Crear Pista");
		btnCrearPista.setBounds(38, 99, 133, 25);
		getContentPane().add(btnCrearPista);
		
		JButton btnEliminarPista = new JButton("Eliminar Pista");
		btnEliminarPista.setBounds(38, 137, 133, 25);
		getContentPane().add(btnEliminarPista);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Inicio i = new Inicio();
				i.setVisible(true);
			}
		});
		btnCerrarSesin.setBounds(241, 180, 143, 34);
		getContentPane().add(btnCerrarSesin);
		setBackground(new Color(153, 255, 255));
	}
}
