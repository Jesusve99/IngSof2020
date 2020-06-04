package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.BD;
import modelo.Jugador;
import net.proteanit.sql.DbUtils;
import vista.MenuJugador;
import vista.SalirsePartido;

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
		try {
			String codigo = "Select * from Jugador_Partido where ID_jug= \"" + jugador.getCorreo() + "\"";
			PreparedStatement pst = vista.conexion.prepareStatement(codigo);
			ResultSet rs = pst.executeQuery();
			vista.table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	private void salirPartido() {
		try {
			String codigo = "Select * from Jugador_Partido where partido= ?";
			PreparedStatement pst2;
			pst2 = vista.conexion.prepareStatement(codigo);
			pst2.setString(1, vista.textField.getText());
			ResultSet rs = pst2.executeQuery();
			if (rs.first()) {
				String sql = "Delete from Jugador_Partido where partido=\"" + vista.textField.getText()
						+ "\" and ID_jug=\"" + jugador.getCorreo() + "\"";
				java.sql.Statement st = vista.conexion.createStatement();
				st.executeUpdate(sql);
				String sel = "SELECT Partido.id_anfitrion FROM Partido WHERE Partido.cod_partido = "
						+ vista.textField.getText();
				String anfitrion = bd.SelectEscalar(sel).toString();
				if (anfitrion.equalsIgnoreCase(jugador.getCorreo())) {
					String del = "DELETE FROM Partido WHERE Partido.cod_partido = " + vista.textField.getText();
					bd.Delete(del);
					JOptionPane.showMessageDialog(null, "Al ser el anfitrion, el partido ha sido eliminado",
							"Se ha salido correctamente", JOptionPane.OK_OPTION);
				} else {
					JOptionPane.showMessageDialog(null, "Ya no pertenece a dicho partido", "Se ha salido correctamente",
							JOptionPane.INFORMATION_MESSAGE);
				}

			} else {
				JOptionPane.showMessageDialog(null, "No existe el ID", "ERROR", JOptionPane.ERROR_MESSAGE);
				vista.dispose();
				GestionSalirsePartido gsp = new GestionSalirsePartido(new SalirsePartido());
				gsp.setJugador(jugador);
				gsp.setVisible(true);
				gsp.setLocationRelativeTo(null);
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
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
