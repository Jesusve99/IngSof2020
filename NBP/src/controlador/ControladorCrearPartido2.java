package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import modelo.Jugador;
import modelo.Partido;
import modelo.Pista;
import vista.CrearPartido2;
import vista.MenuJugador;

public class ControladorCrearPartido2 implements ActionListener {
	private CrearPartido2 vista;
	private Jugador jugador;

	public ControladorCrearPartido2(CrearPartido2 v) {
		this.vista = v;
		this.vista.btnCancelar.addActionListener(this);
		this.vista.btnCrearPartido.addActionListener(this);
		this.vista.comboBox.setModel(new DefaultComboBoxModel<String>(Pista.nombrePistasDisponibles()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.btnCancelar) {
			ControladorMenuJugador pp = new ControladorMenuJugador(new MenuJugador());
			pp.setJugador(this.getJugador());
			pp.setVisible(true);
			pp.setLocationRelativeTo(null);
			this.vista.dispose();
		} else if (e.getSource() == vista.btnCrearPartido) {
			try {
				String fecha = vista.txtFecha.getText();
				String hora = vista.txtHora.getText() + ":00";
				Date d = construirDate(fecha, hora);
				String nombre = vista.comboBox.getSelectedItem().toString();
				Pista p = Pista.obtenerPista(nombre);
				String[] ocupadas = Partido.horasOcupadas(fecha, p.getId());
				if (fechaNoPasada(d)) {
					if (dentroHorario(hora, p.getHoraInicio(), p.getHoraFin())) {
						if (!coincideHora(hora, ocupadas)) {
							Partido partido = new Partido(p.getId(), fecha, hora, jugador.getCorreo());
							partido.agregarPartido();
							ControladorMenuJugador pp = new ControladorMenuJugador(new MenuJugador());
							pp.setVisible(true);
							this.vista.dispose();
						} else {
							JOptionPane.showMessageDialog(this.vista, "Ya existe un partido a esa hora");
							vista.txtFecha.setText("");
							vista.txtHora.setText("");
						}
					} else {
						JOptionPane.showMessageDialog(this.vista,
								"El rango horario debe estar entre:" + p.getHoraInicio() + "-" + p.getHoraFin());
						vista.txtFecha.setText("");
						vista.txtHora.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(this.vista, "La fecha ha pasado ya tt");
					vista.txtFecha.setText("");
					vista.txtHora.setText("");
				}

			} catch (Exception error) {
				JOptionPane.showMessageDialog(this.vista, "Completa los datos correctamente");
				vista.txtFecha.setText("");
				vista.txtHora.setText("");
			}
		}
	}

	private boolean coincideHora(String hora, String[] ocupadas) {
		boolean res = false;
		int i = 0;
		while (i < ocupadas.length && !res) {
			if (ocupadas[i].equals(hora)) {
				res = true;
			}
			i++;
		}
		return res;
	}

	private boolean dentroHorario(String fpartido, String finicio, String ffin) {
		String[] sp = fpartido.split(":");
		String[] si = finicio.split(":");
		String[] sf = ffin.split(":");
		if (Integer.parseInt(si[0]) <= Integer.parseInt(sp[0]) && Integer.parseInt(sf[0]) >= Integer.parseInt(sp[0])) {
			return true;
		} else {
			return false;
		}
	}

	private boolean fechaNoPasada(Date date) {
		Date actual = new Date();
		return actual.before(date);
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

	public Jugador getJugador() {
		return this.jugador;
	}

	private Date construirDate(String fecha, String hora) {
		String[] sf = fecha.split("-");
		String[] sh = hora.split(":");
		Date df = new Date();
		df.setYear(Integer.parseInt(sf[0]) - 1900);
		df.setMonth(Integer.parseInt(sf[1]) - 1);
		df.setDate(Integer.parseInt(sf[2]));
		df.setHours(Integer.parseInt(sh[0]));
		df.setMinutes(Integer.parseInt(sh[1]));
		df.setSeconds(0);
		return df;
	}
}
