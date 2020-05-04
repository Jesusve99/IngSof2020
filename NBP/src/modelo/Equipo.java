package modelo;

public class Equipo {
	
	private int tamano;
	private String nombre;
	private Jugador creador;
	
	public Equipo(int tamano, String nombre, Jugador creador) {
		this.tamano = tamano;
		this.nombre = nombre;
		this.creador = creador;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
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
