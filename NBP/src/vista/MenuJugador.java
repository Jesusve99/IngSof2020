package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Jugador;

public class MenuJugador extends JFrame {

	private JPanel contentPane;
	public JButton btnUnirseAPartido;
	public JButton btnCrearPartido;
	public JButton btnCerrarSesion;
	public JButton btnSalirPartido;
	public JButton btnListaPartidosAnfitrion;
	public JButton btnListaPartidos;

	public Jugador jugador;

	/**
	 * Create the frame.
	 */
	public MenuJugador() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		setContentPane(contentPane);

		JLabel lblNbp = new JLabel("NBP");
		lblNbp.setBounds(228, 25, 64, 27);
		lblNbp.setFont(new Font("Tahoma", Font.BOLD, 30));

		JLabel lblNeoBalompi = new JLabel("MEN\u00DA DE USUARIO");
		lblNeoBalompi.setBounds(193, 54, 165, 16);
		lblNeoBalompi.setFont(new Font("Tahoma", Font.BOLD, 14));

		btnUnirseAPartido = new JButton("UNIRSE A PARTIDO");
		btnUnirseAPartido.setBounds(287, 112, 165, 37);

		btnCrearPartido = new JButton("CREAR PARTIDO");
		btnCrearPartido.setBounds(58, 112, 165, 37);

		btnCerrarSesion = new JButton("CERRAR SESION");
		btnCerrarSesion.setBounds(287, 240, 165, 37);

		btnSalirPartido = new JButton("SALIR DE PARTIDO");
		btnSalirPartido.setBounds(58, 174, 165, 37);

		btnListaPartidos = new JButton("LISTA PARTIDOS");
		btnListaPartidos.setBounds(287, 174, 165, 37);

		btnListaPartidosAnfitrion = new JButton("GESTIONAR PARTIDOS");
		btnListaPartidosAnfitrion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListaPartidosAnfitrion.setBounds(58, 240, 165, 37);
		contentPane.setLayout(null);
		contentPane.add(btnCrearPartido);
		contentPane.add(btnSalirPartido);
		contentPane.add(btnListaPartidosAnfitrion);
		contentPane.add(btnCerrarSesion);
		contentPane.add(btnListaPartidos);
		contentPane.add(btnUnirseAPartido);
		contentPane.add(lblNeoBalompi);
		contentPane.add(lblNbp);

	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador j) {
		jugador = j;
	}
}
