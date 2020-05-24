package modelo;

public class Equipo {

	private static int MAX_JUG = 10;
	private String nombre;
	private int tamano;
	private Jugador creador;

	public Equipo(String nombre, Jugador creador) {
		this.tamano = 1;
		this.nombre = nombre;
		this.creador = creador;
	}
	public Equipo(int tamano, String nombre, Jugador creador) {
		if (tamano > MAX_JUG) {
			throw new BDException("Superado el limite maximo de jugadores en un equipo");
		}
		this.tamano = tamano;
		this.nombre = nombre;
		this.creador = creador;
	}

	public int getTamano() {
		return tamano;
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

	public void incrementarTamano() {
		++tamano;
	}

}
