package modelo;

public class Administrador extends Usuario {

	private String ayuntamiento;
	
	//Constructor para comprobar inicio sesion
	public Administrador(String corr, String contra) {
		super(corr, contra);
		ayuntamiento = "NO DEFINIDO";
	}
	//Constructor del objeto
	public Administrador(String corr, String contra, String ayun) {
		super(corr, contra);
		ayuntamiento = ayun;
	}
	//Sacar de la BD
	public static Administrador obtenerAdministrador(String correo) {
		Object[] ob = bd.Select("Select * From Administrador where correo = '" + correo + "';").get(0);
		return new Administrador(ob[0].toString(),ob[1].toString(),ob[2].toString());
	}
	//Insertar a la BD
	public void agregarAdministrador() {
		String ins = "INSERT INTO Administrador (Administrador.correo, Administrador.contra, Administrador.ayuntamiento) VALUES (\""
				+ super.correo + "\", \"" + super.contrasena + "\", " + this.ayuntamiento +"\")";
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
