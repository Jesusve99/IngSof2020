package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import modelo.Administrador;
import modelo.BD;
import modelo.Jugador;
import modelo.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Iniciarsesion extends JFrame {

	private JPanel contentPane;
	private JTextField textusuario;
	private JPasswordField clave;
	private JButton btnEntrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iniciarsesion frame = new Iniciarsesion();
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
	public Iniciarsesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 302);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIniciarSesin = new JLabel("INICIAR SESI\u00D3N :");
		lblIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIniciarSesin.setBounds(60, 30, 198, 25);
		contentPane.add(lblIniciarSesin);
		
		JLabel lblCorreo = new JLabel("Correo :");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreo.setBounds(60, 88, 56, 16);
		contentPane.add(lblCorreo);
		
		JButton btnSalir = new JButton("Volver");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Inicio ini = new Inicio();
				ini.setVisible(true);	
			}
		});
		btnSalir.setBounds(60, 197, 128, 31);
		contentPane.add(btnSalir);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				char[] contrasena = clave.getPassword();
				String clavefinal = new String(contrasena);
				
				Administrador ad = new Administrador(textusuario.getText());
				Jugador jug = new Jugador(textusuario.getText());
				
				if(!ad.estaenBD() && !jug.estaenBD()) {//No existe en la BD
					JOptionPane.showMessageDialog(null, "Usuario o Contrasena incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
					textusuario.setText("");
					clave.setText("");
					textusuario.requestFocus();
				}else if(jug.iniciosesion(clavefinal)) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema,Jugador","Ingresaste",JOptionPane.INFORMATION_MESSAGE);
					Pantallaprincipal p = new Pantallaprincipal();
					p.setVisible(true);
				}else if(ad.iniciosesion(clavefinal)){
					dispose();
					//JOptionPane.showMessageDialog(null, "Bienvenido al sistema,Administrador","Ingresaste",JOptionPane.INFORMATION_MESSAGE);
					MenuAdministrador mad = new MenuAdministrador();
					mad.setVisible(true);
					//Es un admin
				}
			}

			
		});
		btnEntrar.setBounds(223, 197, 128, 30);
		contentPane.add(btnEntrar);
		
		textusuario = new JTextField();
		textusuario.setBounds(164, 85, 130, 22);
		contentPane.add(textusuario);
		textusuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(60, 117, 107, 31);
		contentPane.add(lblContrasea);
		
		clave = new JPasswordField();
		clave.setBounds(164, 120, 130, 22);
		contentPane.add(clave);
	}
}
