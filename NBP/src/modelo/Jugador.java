package modelo;

public class Jugador extends Usuario {

	private String nick;
	private Demarcacion posicionfav;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;

	public Jugador(String corr, String contra) {
		super(corr, contra);
		posicionfav = null;
		nick = "";
		nombre = "";
		apellidos = "";
		fechaNacimiento = "";
	}

	public Jugador(String corr, String contra, String nick, Demarcacion demarc, String nombr, String apell,
			String fechaN) {
		super(corr, contra);
		this.posicionfav = demarc;
		this.nick = nick;
		this.nombre = nombr;
		this.apellidos = apell;
		this.fechaNacimiento = fechaN;
	}
	
	public static Jugador obtenerJugador(String correo) {
		Object[] ob = bd.Select("Select * From Jugador where correo = '" + correo + "';").get(0);
		Jugador jug = new Jugador(ob[0].toString(), ob[1].toString(), ob[2].toString(), Demarcacion.valueOf(ob[3].toString()), ob[4].toString(), ob[5].toString(), ob[6].toString());
		return jug;
	}
	
	public static void agregarJugador(Jugador j) {
		String ins = "INSERT INTO Jugador (Jugador.correo, Jugador.contra, Jugador.nick, Jugador.posicionfav, Jugador.nombre, Jugador.apellidos, Jugador.Fecha_nacimiento) VALUES (\""
				+ j.getCorreo() + "\", \"" + j.getContrasena() + "\", \"" + j.getNick() +"\", \""
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
