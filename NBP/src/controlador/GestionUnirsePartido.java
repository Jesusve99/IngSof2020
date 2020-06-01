package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import modelo.Jugador;
import modelo.Partido;
import vista.InformacionPartido;
import vista.MenuJugador;
import vista.UnirsePartido;

public class GestionUnirsePartido implements ActionListener {

	private UnirsePartido vista;
	private BD bd = new BD();

	public GestionUnirsePartido(UnirsePartido v) {
		this.vista = v;
		this.vista.btnGenerarPartidos.addActionListener(this);
		this.vista.btnVerPartido.addActionListener(this);
		this.vista.btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.btnGenerarPartidos) {
			generarPartido();
		} else if (e.getSource() == vista.btnVolver) {
			volverMenu();
		} else if (e.getSource() == vista.btnVerPartido) {
			verPartido();
		}

	}

	public void generarPartido() {

		String sel = "Select * from Partido";
		List<Object[]> partidos = bd.Select(sel);
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new String[] { "Partido", "Pista", "Fecha", "Hora", "Anfitrion" });
		for (int i = 0; i < partidos.size(); i++) {
			modelo.addRow(partidos.get(i));
		}
		this.vista.table.setModel(modelo);
	}

	public void volverMenu() {
		vista.dispose();
		MenuJugador p = new MenuJugador();
		p.setVisible(true);
	}

	public void verPartido() {
		long cod = Long.parseLong(vista.textField.getText());
		String sel = "Select * from Partido where cod_partido=" + cod;
		long existe = Long.parseLong(bd.SelectEscalar(sel).toString());
		if (existe > 0) {
			vista.dispose();
			ControladorInformacionPartido cip = new ControladorInformacionPartido(
					new InformacionPartido(Partido.obtenerPartido(cod)));
			cip.setJugador(this.vista.jugador);
			cip.setVisible(true);
			cip.setLocationRelativeTo(null);

		} else {
			JOptionPane.showMessageDialog(null, "No existe el ID", "ERROR", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

	public void setJugador(Jugador j) {
		this.vista.jugador = j;
	}

}
