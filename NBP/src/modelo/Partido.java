package modelo;

import javax.swing.JTextField;

public class Partido {

	private long codPartido;
	private long idPista;
	private String fecha;
	private String hora;
	private String idAnfitrion;
	private static BD bd;
	
	//Construir objeto
	public Partido(long idPista, String fecha, String hora, String idAnfitrion) {
		this.idPista = idPista;
		this.fecha = fecha;
		this.hora = hora;
		this.idAnfitrion = idAnfitrion;
	}

	//Introducir objeto en la BD
	public void agregarPartido() {
		String ins = "INSERT INTO Partido (Partido.Pista, Partido.Fecha, Partido.Hora, Partido.id_anfitrion) VALUES "
				+ "('"+this.idPista+"','"+this.fecha +"','"+this.hora+"','"+this.idAnfitrion+"')";
	}
	
	//Obtener objeto de la BD
	public static Partido obtenerPartido(long cod) {
		Object[] ob = bd.Select("Select * From Partido where cod_partido = '" +cod+ "';").get(0);
		return new Partido((long)ob[1],(String)ob[2],(String)ob[3],(String)ob[4]);
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
