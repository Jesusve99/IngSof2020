package modelo;

public class Jugador extends Usuario {
	
	private String nick;
	private String posicionfav;
	private String nombre;
	private String apellidos;
	
	public Jugador(String correo, String contraseña, String nick, String posicionfav, String nombre, String apellidos) {
		super(correo, contraseña);
		this.nick = nick;
		this.posicionfav = posicionfav;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPosicionfav() {
		return posicionfav;
	}

	public void setPosicionfav(String posicionfav) {
		this.posicionfav = posicionfav;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
}
