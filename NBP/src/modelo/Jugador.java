package modelo;

public class Jugador extends Usuario {

	private String nick;
	private Demarcacion posicionfav;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	
	//Constructor para acceder a metodos para iniciar sesion
	public Jugador(String corr, String contra) {
		super(corr, contra);
		posicionfav = null;
		nick = "";
		nombre = "";
		apellidos = "";
		fechaNacimiento = "";
	}
	
	//Constructor para introducir todos los datos...Despues llamar a agregarJugador para introducir en BD
	public Jugador(String corr, String contra, String nick, Demarcacion demarc, String nombr, String apell,
			String fechaN) {
		super(corr, contra);
		this.posicionfav = demarc;
		this.nick = nick;
		this.nombre = nombr;
		this.apellidos = apell;
		this.fechaNacimiento = fechaN;
	}
	
	//Obtener objeto Jugador de la BD
	public static Jugador obtenerJugador(String correo) {
		Object[] ob = bd.Select("Select * From Jugador where correo = '" + correo + "';").get(0);
		return new Jugador(ob[0].toString(), ob[1].toString(), ob[2].toString(), Demarcacion.valueOf(ob[3].toString()), ob[4].toString(), ob[5].toString(), ob[6].toString());
	}
	
	//Insertar Jugador
	public void agregarJugador() {
		String ins = "INSERT INTO Jugador (Jugador.correo, Jugador.contra, Jugador.nick, Jugador.posicionfav, Jugador.nombre, Jugador.apellidos, Jugador.Fecha_nacimiento) VALUES (\""
				+ super.correo + "\", \"" +super.contrasena + "\", \"" + this.nick + "\", \""
				+ this.posicionfav.toString() + "\", \"" + this.nombre + "\", \"" + this.apellidos + "\", \""
				+ this.fechaNacimiento + "\")";
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
