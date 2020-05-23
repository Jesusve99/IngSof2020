package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import modelo.BDException;
import vista.InformacionPartido;

public class ControladorInformacionPartido implements ActionListener {

	private InformacionPartido vista = new InformacionPartido();
	private String idJugador = "jugador@";

	public ControladorInformacionPartido(InformacionPartido v) {
		this.vista = v;
		this.vista.unirsePartido.addActionListener(this);
		this.vista.volverLista.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.unirsePartido) {
			unirAPartido();
		}
	}
	public void unirAPartido() {
		try {
			if (partidoSolicitado(idJugador)) {
				throw new BDException("Ya has solicitado unirte");
			} else if (partidoUnido(idJugador)) {
				throw new BDException("Ya te has unido al partido");
			}
			if(partidoLleno(idJugador)) {
				throw new BDException("Lo siento, el partido ya está lleno");
			}
			String ins = "INSERT INTO Jugador_Partido (Jugador_Partido.ID_jug, Jugador_Partido.partido) VALUES (\""+idJugador+"\" ,"+this.vista.idPartido+")";
			this.vista.bd.Insert(ins);
			JOptionPane.showMessageDialog (this.vista, "Tu solicitud ha sido enviada adecuadamente", "Unirse al partido", JOptionPane.INFORMATION_MESSAGE);
		} catch (BDException er) {
			JOptionPane.showMessageDialog(this.vista, er.getMessage(), "Unirse al partido", JOptionPane.ERROR_MESSAGE);
		}
	}
	private boolean partidoSolicitado(String idJug) {
		String sel = "SELECT COUNT(Jugador_Partido.ID_jug) FROM Jugador_Partido WHERE Jugador_Partido.ID_jug = \""
				+ idJug + "\" AND Jugador_Partido.partido =" + this.vista.idPartido
				+ " AND Jugador_Partido.estado_solicitud = 0";
		long count = (long) this.vista.bd.SelectEscalar(sel);
		return (count == 1);
	}

	private boolean partidoUnido(String idJug) {
		String sel = "SELECT COUNT(Jugador_Partido.ID_jug) FROM Jugador_Partido WHERE Jugador_Partido.ID_jug = \""
				+ idJug + "\" AND Jugador_Partido.partido =" + this.vista.idPartido
				+ " AND Jugador_Partido.estado_solicitud = 1";
		long count = (long) this.vista.bd.SelectEscalar(sel);
		return (count == 1);
	}

	private boolean partidoLleno(String idJug) {
		String sel = "SELECT COUNT(Jugador_Partido.ID_jug) FROM Jugador_Partido WHERE Jugador_Partido.partido ="
				+ this.vista.idPartido + " AND Jugador_Partido.estado_solicitud = 1";
		long count = (long) this.vista.bd.SelectEscalar(sel);
		return (count == 10);
	}
}
