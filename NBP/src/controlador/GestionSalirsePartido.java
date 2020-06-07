package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import modelo.Jugador;
import vista.MenuJugador;
import vista.SalirsePartido;
import modelo.Partido;

public class GestionSalirsePartido implements ActionListener {
	private SalirsePartido vista = new SalirsePartido();
	private Jugador jugador;

	private BD bd = BD.getBD();

	public GestionSalirsePartido(SalirsePartido v) {
		this.vista = v;
		this.vista.btnGenerarPartidos.addActionListener(this);
		this.vista.btnSalirPartido.addActionListener(this);
		this.vista.btnVolverMP.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.btnGenerarPartidos) {
			generarPartido();
		} else if (e.getSource() == vista.btnSalirPartido) {
			salirPartido();
		} else if (e.getSource() == vista.btnVolverMP) {
			volverMP();
		}

	}

	private void generarPartido() {
		DefaultTableModel modelo = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		modelo.setColumnIdentifiers(new String[] { "Jugador", "Partido" });
		String sel = "Select * from Jugador_Partido where ID_jug= \"" + jugador.getCorreo()
				+ "\" AND estado_solicitud = 1";
		List<Object[]> ob = this.bd.Select(sel);
		for (Object[] o : ob) {
			modelo.addRow(o);
		}
		this.vista.table.setModel(modelo);

		JOptionPane.showMessageDialog(null,
				"Para salirse el partido introduzca el Id correspondiente al partido del que se quiere salir",
				"Se ha salido correctamente", JOptionPane.INFORMATION_MESSAGE);
	}

	private void salirPartido() {
		if(vista.textField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Por favor complete los datos del id partido", "ERROR AL SALIRSE PARTIDO!!",
					JOptionPane.ERROR_MESSAGE);
		}else {
			long id = Long.parseLong(vista.textField.getText());
			if(Partido.existePartido(id)) {
				JOptionPane.showMessageDialog(null, "Ese id de partido no existe, por favor introduzca un id correcto", "ERROR AL SALIRSE PARTIDO!!",
						JOptionPane.ERROR_MESSAGE);
			}else {
			
				String del = "Delete from Jugador_Partido where partido=\"" + vista.textField.getText() + "\" and ID_jug=\""
						+ jugador.getCorreo() + "\"";
				this.bd.Delete(del);
				String sel = "SELECT Partido.id_anfitrion FROM Partido WHERE Partido.cod_partido = "
						+ vista.textField.getText();
				String anfitrion = bd.SelectEscalar(sel).toString();
				if (anfitrion.equalsIgnoreCase(jugador.getCorreo())) {
					del = "DELETE FROM Partido WHERE Partido.cod_partido = " + vista.textField.getText();
					bd.Delete(del);
					JOptionPane.showMessageDialog(null, "Al ser el anfitrion, el partido ha sido eliminado",
							"Se ha salido correctamente", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Ya no pertenece a dicho partido", "Se ha salido correctamente",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		
	}

	private void volverMP() {
		vista.dispose();
		ControladorMenuJugador cmp = new ControladorMenuJugador(new MenuJugador());
		cmp.setJugador(jugador);
		cmp.setVisible(true);
		cmp.setLocationRelativeTo(null);
	}

	public void setVisible(boolean b) {
		this.vista.setVisible(b);
	}

	public void setLocationRelativeTo(Component c) {
		this.vista.setLocationRelativeTo(c);
	}

	public void setJugador(Jugador j) {
		this.jugador = j;
	}
}
