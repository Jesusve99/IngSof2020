package modelo;

import java.util.Date;
import java.util.List;

public class Pista {

	private long id;
	private String nombre;
	private String ubicacion;
	private String horaInicio;
	private String horaFin;
	private boolean estado;
	private static BD bd = new BD();
	// private int[] diasDisponibles;

	// Construir objeto Pista
	public Pista(String nombre, String ubi, String horarioApertura, String horarioCierre) {
		this.nombre = nombre;
		this.ubicacion = ubi;
		this.horaInicio = horarioApertura;
		this.horaFin = horarioCierre;
		this.estado = true;
	}

	public Pista(String nombre, String ubi, String horarioApertura, String horarioCierre, long id, Boolean estado) {
		this.nombre = nombre;
		this.ubicacion = ubi;
		this.horaInicio = horarioApertura;
		this.horaFin = horarioCierre;
		this.estado = estado;
		this.id = id;
	}

	// Metodo con el que podremos crear una Pista obteniendo todos los datos
	// actualizados de la BD
	public static Pista obtenerPista(String nombre) {
		String sel = "SELECT * FROM Pista WHERE Pista.Nombre =\"" + nombre + "\"";
		Object[] ob = bd.Select(sel).get(0);
		return new Pista(ob[0].toString(), ob[1].toString(), ob[2].toString(), ob[3].toString(),
				Long.parseLong(ob[4].toString()), Boolean.parseBoolean(ob[5].toString()));
	}
	
	//Metodo que devuelve el total de pistas que hay en la BD
	public static long getTotalPistas() {
		return Long.parseLong(bd.SelectEscalar("SELECT COUNT(cod_pista) FROM Pista").toString());
	}
	//Metodo que devuelve todos los nombre de las pistas con estado disponible
	public static String[] nombrePistasDisponibles() {
		List<Object[]> list =  bd.Select("SELECT Pista.Nombre From Pista where estado=1");
		String[] res = new String[list.size()];
		for(int i=0;i<list.size();i++) {
			res[i]=(String) list.get(i)[0];
		}
		return res;
	}

	// Metodo para introducir un objeto Pista en la BD
	public void agregarPista() {
		String sel = "INSERT INTO Pista(Nombre, Ubicacion, Hora_inicio, Hora_fin) VALUES" + " ('" + this.getNombre()
				+ "','" + this.getUbicacion() + "','" + this.getHoraInicio() + "','" + this.getHoraFin() + "')";
		bd.Insert(sel);
	}
	
	// Elimina la pista de la BD
	public void eliminarPista() {
		String del = "DELETE FROM Pista WHERE cod_pista = " + this.getId();
		bd.Delete(del);
	}	

	public long getId() {
		return id;
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

	public boolean getEstado() {
		return estado;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHorainicio(String horainicio) {
		this.horaInicio = horainicio;
	}

	public void setHorafin(String horafin) {
		this.horaFin = horafin;
	}

	public void deshabilitarPista() {
		this.estado = false;
	}

	public void habilitarPista() {
		this.estado = true;
	}

	// Actualiza el estado en la BD
	public void actualizarEstado() {
		String up = "UPDATE Pista SET Pista.estado = \"" + (this.getEstado() ? 1 : 0)+ "\" WHERE Pista.cod_pista = \"" + this.getId()+"\"";
		bd.Update(up);
	}

	// Devuelve TRUE si existe una pista que se va a crear identica a una creada en
	// la BD, en caso contrario devuelve FALSE
	public boolean existePistaEnBD() {
		String sel = "SELECT COUNT(Pista.cod_pista) FROM Pista WHERE Pista.Nombre =\"" + this.getNombre()
				+ "\" AND Pista.Ubicacion =\""+this.getUbicacion()+ "\"";
		long cnt = (long) bd.SelectEscalar(sel);
		return cnt == 1;
	}

}
