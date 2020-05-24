package modelo;

import javax.swing.JTextField;

public class Partido {

	private long codPartido;
	private long idPista;
	private String fecha;
	private String hora;
	private String idAnfitrion;

	public Partido(long idPista, String fecha, String hora, String idAnfitrion) {
		this.idPista = idPista;
		this.fecha = fecha;
		this.hora = hora;
		this.idAnfitrion = idAnfitrion;
	}
	public static void agregarPartido(Partido p) {
		String ins = "INSERT INTO Partido (Partido.Pista, Partido.Fecha, Partido.Hora, Partido.id_anfitrion) VALUES ("+p.getIdPista()+", "+")";
	}
	
	public long getCodPartido() {
		return this.codPartido;
	}
	public String getIdAnfitrion() {
		return this.idAnfitrion;
	}
	
	public long getIdPista() {
		return idPista;
	}

	public String getFecha() {
		return fecha;
	}
	
	public void setCodPartido() {
		
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
