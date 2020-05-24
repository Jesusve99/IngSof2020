package modelo;

public abstract class Usuario {
	
	protected static BD bd = new BD();
	protected String correo;
	protected String contrasena;
	
	public Usuario(String corr, String contra) {
		correo = corr;
		contrasena = contra;
	}
	
	public abstract boolean correoRegistrado();
	
	public abstract boolean datosInicioCorrecto();
	
}
