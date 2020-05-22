package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Partido {
	
	//private int id;
	private Date fecha;
	private Date hora;
	
	public Partido(JTextField fecha, JTextField hora) {
		
		try {
			fecha = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(fecha.getText());
			hora = hora.getText();
			

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	
}
