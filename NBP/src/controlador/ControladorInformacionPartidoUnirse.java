package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.BDException;
import modelo.Jugador;
import vista.InformacionPartidoUnirse;
import vista.UnirsePartido;

public class ControladorInformacionPartidoUnirse implements ActionListener {

	private InformacionPartidoUnirse vista;

	public ControladorInformacionPartidoUnirse(InformacionPartidoUnirse v) {
		this.vista = v;
		this.vista.unirsePartido.addActionListener(this);
		this.vista.volverLista.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.unirsePartido) {
			unirAPartido();
		}
		if (e.getSource() == this.vista.volverLista) {
			this.vista.dispose();
			ControladorUnirsePartido gup = new ControladorUnirsePartido(new UnirsePartido());
			gup.setJugador(this.vista.jugador);
			gup.setVisible(true);
			gup.setLocationRelativeTo(null);
		}
	}

	public void unirAPartido() {
		try {
			if (partidoSolicitado(this.vista.jugador.getCorreo())) {
				throw new BDException("Ya has solicitado unirte");
			} else if (partidoUnido(this.vista.jugador.getCorreo())) {
				throw new BDException("Ya te has unido al partido");
			}
			if (partidoLleno(this.vista.jugador.getCorreo())) {
				throw new BDException("Lo siento, el partido ya está lleno");
			}
			String ins = "INSERT INTO Jugador_Partido (Jugador_Partido.ID_jug, Jugador_Partido.partido) VALUES (\""
					+ this.vista.jugador.getCorreo() + "\" ," + this.vista.partido.getCodPartido() + ")";
			this.vista.bd.Insert(ins);
			JOptionPane.showMessageDialog(this.vista, "Tu solicitud ha sido enviada adecuadamente", "Unirse al partido",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (BDException er) {
			JOptionPane.showMessageDialog(this.vista, er.getMessage(), "Unirse al partido", JOptionPane.ERROR_MESSAGE);
		}
	}

	private boolean partidoSolicitado(String idJug) {
		String sel = "SELECT COUNT(Jugador_Partido.ID_jug) FROM Jugador_Partido WHERE Jugador_Partido.ID_jug = \""
				+ idJug + "\" AND Jugador_Partido.partido =" + this.vista.partido.getCodPartido()
				+ " AND Jugador_Partido.estado_solicitud = 0";
		long count = (long) this.vista.bd.SelectEscalar(sel);
		return (count == 1);
	}

	private boolean partidoUnido(String idJug) {
		String sel = "SELECT COUNT(Jugador_Partido.ID_jug) FROM Jugador_Partido WHERE Jugador_Partido.ID_jug = \""
				+ idJug + "\" AND Jugador_Partido.partido =" + this.vista.partido.getCodPartido()
				+ " AND Jugador_Partido.estado_solicitud = 1";
		long count = (long) this.vista.bd.SelectEscalar(sel);
		return (count == 1);
	}

	private boolean partidoLleno(String idJug) {
		String sel = "SELECT COUNT(Jugador_Partido.ID_jug) FROM Jugador_Partido WHERE Jugador_Partido.partido ="
				+ this.vista.partido.getCodPartido() + " AND Jugador_Partido.estado_solicitud = 1";
		long count = (long) this.vista.bd.SelectEscalar(sel);
		return (count == 10);
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
