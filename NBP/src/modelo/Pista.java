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
	private String horainicio;
	private String horafin;
	//private int[] diasDisponibles;

	public Pista(JTextField nombre2, JTextField ubicacion2, JTextField horarioApertura, JTextField horarioCierre) {
		try {
			nombre = nombre2.getText();
			ubicacion = ubicacion2.getText();
			horainicio = horarioApertura.getText();
			horafin = horarioCierre.getText();
			
			//int pos = 0;
			//int dias = Integer.parseInt(diasDisponibles2.getText());
			
		/*	while(dias > 0) {
				diasDisponibles[pos] = dias%10;
				pos++;
			}
			
			diasDisponibles = Arrays.copyOf(diasDisponibles, pos);*/
		} catch (Exception e) {
			e.getMessage();
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

	public String getHorainicio() {
		return horainicio;
	}

	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}

	public String getHorafin() {
		return horafin;
	}

	public void setHorafin(String horafin) {
		this.horafin = horafin;
	}
	
}
