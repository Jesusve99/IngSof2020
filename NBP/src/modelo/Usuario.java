package modelo;

import java.util.List;

public abstract class Usuario {

	
	public Usuario() {
		//Usuario con Registro Basico
	}
	abstract boolean estaenBD();
	
	abstract boolean iniciosesion(String contra);
	
}
