package modelo;

import java.util.List;

public class Jugador extends Usuario {

	private String nick;
	private Demarcacion posicionfav;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;

	public Jugador(String corr, String contra) {
		super(corr, contra);
		posicionfav = null;
		nombre = "";
		apellidos = "";
		fechaNacimiento = "";
	}

	public Jugador(String corr, String contra, String nick, Demarcacion demarc, String nombr, String apell,
			String fechaN) {
		super(corr, contra);
		posicionfav = demarc;
		nombre = nombr;
		apellidos = apell;
		fechaNacimiento = fechaN;
	}
	
	public static Jugador obtenerJugador(String correo) {
		Object[] ob = bd.Select("Select * From Jugador where correo = '" + correo + "';").get(0);
		Jugador jug = new Jugador(ob[0].toString(), ob[1].toString(), ob[2].toString(), Demarcacion.valueOf(ob[3].toString()), ob[4].toString(), ob[5].toString(), ob[6].toString());
		return jug;
	}
	
	public static void agregarJugador(Jugador j) {
		String ins = "INSERT INTO Jugador (Jugador.correo, Jugador.contra, Jugador.nick, Jugador.posicionfav, Jugador.nombre, Jugador.apellidos, Jugador.Fecha_nacimiento) VALUES (\""
				+ j.getCorreo() + "\", \"" + j.getContrasena() + "\", \"" + j.getNick() + "\", \""
				+ j.getPosicionfav().toString() + "\", \"" + j.getNombre() + "\", \"" + j.getApellidos() + "\", \""
				+ j.getFechaNacimiento() + "\")";
		bd.Insert(ins);
	}

	public String getCorreo() {
		return correo;
	}

	private String getContrasena() {
		return contrasena;
	}

	public String getNick() {
		return nick;
	}

	public Demarcacion getPosicionfav() {
		return posicionfav;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setJugador() {
		if (datosInicioCorrecto()) {
			String sel = "SELECT Jugador.nick, Jugador.posicionfav, Jugador.nombre, Jugador.apellidos, Jugador.Fecha_nacimiento FROM Jugador WHERE Jugador.correo =\""
					+ this.getCorreo() + "\"";
			List<Object[]> datosJug = bd.Select(sel);
			Object[] datos = datosJug.get(0);
			this.nick = datos[0].toString();
			this.posicionfav = Demarcacion.valueOf(datos[1].toString());
			this.nombre = datos[2].toString();
			this.apellidos = datos[3].toString();
			this.fechaNacimiento = datos[4].toString();
		} else {
			throw new BDException("Datos de inicio incorrectos");
		}
	}

	public boolean correoRegistrado() {
		String sel = "SELECT COUNT(Jugador.correo) FROM Jugador WHERE Jugador.correo =\"" + this.getCorreo() + "\"";
		long count = (long) bd.SelectEscalar(sel);
		return count == 1;
	}

	public boolean datosInicioCorrecto() {
		String sel = "SELECT COUNT(Jugador.correo) FROM Jugador WHERE Jugador.correo =\"" + this.getCorreo()
				+ "\" AND Jugador.contra = \"" + this.getContrasena() + "\"";
		long count = (long) bd.SelectEscalar(sel);
		return count == 1;
	}
}
