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
	private BD bd;
	//private int[] diasDisponibles;
	
	//Construir objeto
	public Pista(String nombre, String ubi, String horarioApertura, String horarioCierre) {
		this.nombre = nombre;
		this.ubicacion = ubi;
		this.horainicio = horarioApertura;
		this.horafin = horarioCierre;
	}
	//Sacar objeto de BD
	public Pista(String nombre) {
		Object[] ob = bd.Select("Select * From Jugador where correo = '"+ nombre +"';").get(0);
		this.nombre = (String) ob[0];
		this.ubicacion = (String) ob[1];
		this.horainicio = (String) ob[2];
		this.horafin = (String) ob[3];
	}
	//Metodo para introducir un objeto
	public void insertarPista() {
		bd.Insert("INSERT INTO Pista(Nombre, Ubicacion, Hora_inicio, Hora_fin) VALUES"
				+ " ('"+this.nombre+"','"+this.ubicacion+"','"+this.horainicio+"','"+this.horafin+"')");
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
