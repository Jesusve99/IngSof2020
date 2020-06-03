package modelo;

public abstract class Usuario {

	protected static BD bd = BD.getBD();
	protected String correo;
	protected String contrasena;

	public Usuario(String corr, String contra) {
		this(corr);
		contrasena = contra;
	}

	public Usuario(String corr) {
		correo = corr;
	}

	public Usuario() {

	}

	public abstract boolean correoRegistrado();

	public abstract boolean datosInicioCorrecto();

}
