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

	public Administrador(String corr) {
		Object[] ob = bd.Select("Select * From Administrador where correo = '" + correo + "';").get(0);
		this.correo = ob[0].toString();
		this.contrasena = ob[1].toString();
		this.ayuntamiento = ob[2].toString();
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
	
	public void setAyuntamiento() {
		if (datosInicioCorrecto()) {
			String sel = "SELECT Administrador.ayuntamiento FROM Administrador WHERE Administrador.correo =\""
					+ this.getCorreo() + "\"";
			ayuntamiento = bd.SelectEscalar(sel).toString();
		} else {
			throw new BDException("Datos de inicio incorrectos");
		}
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
