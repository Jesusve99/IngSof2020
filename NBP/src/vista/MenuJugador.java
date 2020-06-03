package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Jugador;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
		setBounds(100, 100, 507, 299);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		setContentPane(contentPane);

		JLabel lblNbp = new JLabel("NBP");
		lblNbp.setFont(new Font("Tahoma", Font.BOLD, 30));

		JLabel lblNeoBalompi = new JLabel("Neo Balompi\u00E9");
		lblNeoBalompi.setFont(new Font("Tahoma", Font.BOLD, 15));

		btnUnirseAPartido = new JButton("UNIRSE A PARTIDO");

		btnCrearPartido = new JButton("CREAR PARTIDO");

		btnCerrarSesion = new JButton("CERRAR SESION");

		btnSalirPartido = new JButton("SALIR DE PARTIDO");

		btnListaPartidos = new JButton("LISTA PARTIDOS");

		btnListaPartidosAnfitrion = new JButton("GESTIONAR PARTIDOS");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(55)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnCrearPartido, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
										.addComponent(btnSalirPartido, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
								.addGap(86))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnListaPartidosAnfitrion)
								.addPreferredGap(ComponentPlacement.RELATED)))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCerrarSesion, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
						.addComponent(btnListaPartidos, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
						.addComponent(btnUnirseAPartido, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
				.addGap(78))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(197)
						.addComponent(lblNeoBalompi, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE).addGap(203))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(219)
						.addComponent(lblNbp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(232)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(25)
						.addComponent(lblNbp, GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNeoBalompi, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCrearPartido, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(btnUnirseAPartido, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSalirPartido, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(btnListaPartidos, GroupLayout.PREFERRED_SIZE, 37,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnListaPartidosAnfitrion, GroupLayout.PREFERRED_SIZE, 37,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCerrarSesion, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
						.addGap(90)));
		contentPane.setLayout(gl_contentPane);

	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador j) {
		jugador = j;
	}
}
