package modelo;

public class Equipo {
	
	private int tamaño;
	private String nombre;
	private Jugador creador;
	
	public Equipo(int tamaño, String nombre, Jugador creador) {
		this.tamaño = tamaño;
		this.nombre = nombre;
		this.creador = creador;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getCreador() {
		return creador;
	}

	public void setCreador(Jugador creador) {
		this.creador = creador;
	}
	
}
