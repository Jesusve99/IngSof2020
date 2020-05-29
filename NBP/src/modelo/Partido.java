package modelo;

public class Partido {

	private long codPartido;
	private long idPista;
	private String fecha;
	private String hora;
	private String idAnfitrion;
	private static BD bd = new BD();

	// Construir objeto
	public Partido(long idPista, String fecha, String hora, String idAnfitrion) {
		this.idPista = idPista;
		this.fecha = fecha;
		this.hora = hora;
		this.idAnfitrion = idAnfitrion;
	}

	// Construir objeto con los valores obtenidos del metodo estatico para tener los
	// datos completos del partido en local
	public Partido(long codPartido, long idPista, String fecha, String hora, String idAnfitrion) {
		this.codPartido = codPartido;
		this.idPista = idPista;
		this.fecha = fecha;
		this.hora = hora;
		this.idAnfitrion = idAnfitrion;
	}

	// Introducir objeto en la BD
	public void agregarPartido() {
		String ins = "INSERT INTO Partido (Pista, Fecha, Hora, id_anfitrion) VALUES (" + this.getIdPista() + ", \""
				+ this.getFecha() + "\", \"" + this.getHora() + "\", \"" + this.getIdAnfitrion() + "\")";
		bd.Insert(ins);
	}

	// Obtener objeto de la BD
	public static Partido obtenerPartido(long cod) {
		Object[] ob = bd.Select("Select * From Partido where cod_partido = '" + cod).get(0);
		return new Partido((long) ob[0], (long) ob[1], ob[2].toString(), ob[3].toString(), (String) ob[4].toString());
	}

	public static long getTotalPartidos() {
		return Long.parseLong(bd.SelectEscalar("SELECT COUNT(cod_partido) FROM Partido").toString());
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

	public String getHora() {
		return hora;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setIdAnfitrion(String idAnfitrion) {
		this.idAnfitrion = idAnfitrion;
	}

	// Devuelve TRUE si el anfitrion ha creado ningún otro partido en ese día, en
	// caso contrario devuelve FALSE
	public boolean anfitrionOtroPartido() {
		String sel = "SELECT COUNT(Partido.cod_partido) WHERE Partido.Fecha =\"" + this.getFecha()
				+ "\" AND Partido.id_anfitrion =" + this.getIdAnfitrion();
		long cnt = (long) bd.SelectEscalar(sel);
		return cnt == 0;
	}

	// Devuelve TRUE si la pista está sin utilizar en ese dia y hora, en caso
	// contrario devuelve FALSE
	public boolean pistaDisponibleTiempo() {
		String sel = "SELECT COUNT(Partido.cod_partido) WHERE Partido.Fecha =\"" + this.getFecha()
				+ "\" AND Partido.Hora =\"" + this.getHora() + "\" AND Partido.Pista =" + this.getIdPista();
		long cnt = (long) bd.SelectEscalar(sel);
		return cnt == 0;
	}
}
