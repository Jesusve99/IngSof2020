package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JTextField;


import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import com.mysql.cj.result.LocalTimeValueFactory;

public class Partido {
	
	private int idPista;
	private String fecha;
	private String hora;
	
	public Partido(JTextField id, JTextField f, JTextField h) {
		
		try {

			idPista = Integer.parseInt(id.getText());
			fecha = f.getText();
			hora = h.getText();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getIdPista() {
		return idPista;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
}
