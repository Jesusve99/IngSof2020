package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import javax.swing.JTextField;

public class Pista {
	
	private int id;
	private String nombre;
	private String ubicacion;
	private Date horainicio;
	private Date horafin;
	//private int[] diasDisponibles;

	public Pista(JTextField id2, JTextField nombre2, JTextField ubicacion2, JTextField horarioApertura, JTextField horarioCierre) {
		try {
			id = Integer.parseInt(id2.getText());
			nombre = nombre2.getText();
			ubicacion = ubicacion2.getText();
			horainicio = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(horarioApertura.getText());
			horafin = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(horarioCierre.getText());
			
			//int pos = 0;
			//int dias = Integer.parseInt(diasDisponibles2.getText());
			
		/*	while(dias > 0) {
				diasDisponibles[pos] = dias%10;
				pos++;
			}
			
			diasDisponibles = Arrays.copyOf(diasDisponibles, pos);*/
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	/*public int getDiasDisponibles() {
		int dias;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<diasDisponibles.length; i++) {
			sb.append(diasDisponibles[i]);
		}
		dias = Integer.parseInt(sb.toString());
		return dias;
	}*/

	/*public void setDiasDisponibles(int[] diasDisponibles) {
		this.diasDisponibles = diasDisponibles;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getHorainicio() {
		return horainicio;
	}

	public void setHorainicio(Date horainicio) {
		this.horainicio = horainicio;
	}

	public Date getHorafin() {
		return horafin;
	}

	public void setHorafin(Date horafin) {
		this.horafin = horafin;
	}
	
}
