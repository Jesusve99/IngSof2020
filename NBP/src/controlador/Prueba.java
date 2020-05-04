package controlador;

import java.util.List;

import modelo.BD;
import modelo.Jugador;

public class Prueba {

	public static void main(String[] args) {
		BD mibd = new BD();
		
		List<Object[]> lista = mibd.Select("SELECT * FROM Jugador WHERE correo = 'prueba@';");
		Object[] ob =  lista.get(0);
		String email = (String) ob[0];
		String contrasena = (String) ob[1];
		
		System.out.println(email);
		System.out.println(contrasena);
		
	}

}
