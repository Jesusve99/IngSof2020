package modelo;

import java.util.Date;

public class Pista {
	
	private String nombre;
	private String ubicacion;
	private Date horainicio;
	private Date horafin;
	
	public Pista(String nombre, String ubicacion, Date horainicio, Date horafin) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.horainicio = horainicio;
		this.horafin = horafin;
	}

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
