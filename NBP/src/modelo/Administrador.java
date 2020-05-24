package modelo;

public class Administrador extends Usuario {

	private String ayuntamiento;

	public Administrador(String corr, String contra) {
		super(corr, contra);
		ayuntamiento = "NO DEFINIDO";
	}

	public Administrador(String corr, String contra, String ayun) {
		super(corr, contra);
		ayuntamiento = ayun;
	}

	public static Administrador obtenerAdministrador(String corr) {
		Object[] ob = bd.Select("Select * From Administrador where correo = '" + corr + "';").get(0);
		Administrador admin = new Administrador(ob[0].toString(), ob[1].toString(), ob[2].toString());
		return admin;
	}
	
	public void agregarAdministrador(Administrador admin) {
		String ins = "INSERT INTO Administrador (Administrador.correo, Administrador.contra, Administrador.ayuntamiento) VALUES (\""
				+ admin.getCorreo() + "\", \"" + admin.getContrasena() + "\", " + admin.getContrasena() + "\", \""
				+ admin.getAyuntamiento() + "\")";
		bd.Insert(ins);
	}

	public String getCorreo() {
		return this.correo;
	}

	private String getContrasena() {
		return this.contrasena;
	}

	public String getAyuntamiento() {
		return this.ayuntamiento;
	}
	
	public void setAyuntamiento(String ayun) {
		this.ayuntamiento = ayun;
	}

	public boolean correoRegistrado() {
		String sel = "SELECT COUNT(Administrador.correo) FROM Administrador WHERE Administrador.correo =\""
				+ this.getCorreo() + "\"";
		long count = (long) bd.SelectEscalar(sel);
		return count == 1;
	}

	public boolean datosInicioCorrecto() {
		String sel = "SELECT COUNT(Administrador.correo) FROM Administrador WHERE Administrador.correo =\""
				+ this.getCorreo() + "\" AND Administrador.contra = \"" + this.getContrasena() + "\"";
		long count = (long) bd.SelectEscalar(sel);
		return count == 1;
	}

}
