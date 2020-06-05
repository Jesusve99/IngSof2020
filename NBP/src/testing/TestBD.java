package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;

import org.junit.Test;

import modelo.BD;
import modelo.BDException;

public class TestBD {
	private BD bd = BD.getBD();

	@Test
	public void conexionException() {
		assertThrows(BDException.class, () -> {
			BD bd = BD.getBDPersonalizado("incorrecto", "incorrecto");
			String sel = "SELECT * FROM Partido";
			bd.Select(sel);
		});
	}

	@Test
	public void conexionCorrecta() {
		assertNotEquals(BD.connectToDatabase(), null);
	}

	@Test
	public void selectEscalarException0() {
		assertThrows(BDException.class, () -> {
			bd.SelectEscalar("");
		});
	}

	@Test
	public void selectEscalarException1() {
		assertThrows(BDException.class, () -> {
			bd.SelectEscalar("Select * From Pista 2");
		});

	}

	@Test
	public void selectEscalarException2() {
		assertThrows(BDException.class, () -> {
			bd.SelectEscalar(null);
		});
	}

	@Test
	public void selectEscalar() {
		String pis = ";";
		try {
			String sel = "INSERT INTO Pista(Nombre, Ubicacion, Hora_inicio, Hora_fin) VALUES" + " ('" + "pista2" + "','"
					+ "ubi" + "','" + "" + "','" + "" + "')";
			bd.Insert(sel);
			pis = (String) bd.SelectEscalar("Select Pista.Nombre From Pista where Pista.Nombre='pista2'");
		} catch (Exception e) {
			pis = (String) bd.SelectEscalar("Select Pista.Nombre From Pista where Pista.Nombre='pista2'");
		}
		assertEquals(pis, "pista2");
	}

	@Test
	public void selectException0() {
		assertThrows(BDException.class, () -> {
			bd.Select("");
		});
	}

	@Test
	public void selectException1() {
		assertThrows(BDException.class, () -> {
			bd.Select("Select * From Pista 2");
		});

	}

	@Test
	public void selectException2() {
		assertThrows(BDException.class, () -> {
			bd.Select(null);
		});
	}

	@Test
	public void select() {
		Object[] ob;
		try {
			String sel = "INSERT INTO Pista(Nombre, Ubicacion, Hora_inicio, Hora_fin) VALUES" + " ('" + "pista2" + "','"
					+ "ubi" + "','" + "" + "','" + "" + "')";
			bd.Insert(sel);
			ob = bd.Select("Select * From Pista where Pista.Nombre='pista2'").get(0);
		} catch (Exception e) {
			ob = bd.Select("Select * From Pista where Pista.Nombre='pista2'").get(0);
		}
		assertEquals((String) ob[0], "pista2");
		assertEquals((String) ob[1], "ubi");
	}

	@Test
	public void insertException0() {
		assertThrows(BDException.class, () -> {
			bd.Insert("");
		});
	}

	@Test
	public void insertException1() {
		assertThrows(BDException.class, () -> {
			bd.Insert("Select * From Pista 2");
		});

	}

	@Test
	public void insertException2() {
		assertThrows(BDException.class, () -> {
			bd.Insert(null);
		});
	}

	@Test
	public void insert() {
		Random r = new Random();
		Integer aux = r.nextInt(100);
		bd.Insert("INSERT INTO Pista(Nombre, Ubicacion, Hora_inicio, Hora_fin) VALUES" + " ('" + "pista"
				+ aux.toString() + "" + "','" + "ubi" + "','" + "" + "','" + "" + "')");
		String pis = (String) bd
				.SelectEscalar("Select Pista.Nombre From Pista where Pista.Nombre='pista" + aux.toString() + "'");
		assertEquals(pis, "pista" + aux.toString());
	}

	@Test
	public void deleteException0() {
		assertThrows(BDException.class, () -> {
			bd.Delete("");
		});
	}

	@Test
	public void deleteException1() {
		assertThrows(BDException.class, () -> {
			bd.Delete("Select * From Pista 2");
		});

	}

	@Test
	public void deleteException2() {
		assertThrows(BDException.class, () -> {
			bd.Delete(null);
		});
	}

	@Test
	public void delete() {
		Random r = new Random();
		Integer aux = r.nextInt(100);
		bd.Insert("INSERT INTO Pista(Nombre, Ubicacion, Hora_inicio, Hora_fin) VALUES" + " ('" + "pista"
				+ aux.toString() + "" + "','" + "ubi" + "','" + "" + "','" + "" + "')");
		bd.Delete("Delete From Pista where Pista.Nombre='pista" + aux.toString() + "'");
		assertThrows(BDException.class, () -> {
			bd.SelectEscalar("Select Pista.Nombre From Pista where Pista.Nombre='pista" + aux.toString() + "'");
		});
	}

	@Test
	public void updateException0() {
		assertThrows(BDException.class, () -> {
			bd.Update("");
		});
	}

	@Test
	public void updateException1() {
		assertThrows(BDException.class, () -> {
			bd.Update("Select * From Pista 2");
		});

	}

	@Test
	public void updateException2() {
		assertThrows(BDException.class, () -> {
			bd.Update(null);
		});
	}

	@Test
	public void update() {
		Random r = new Random();
		Integer aux = r.nextInt(100);
		Integer aux2 = r.nextInt(100);
		bd.Insert("INSERT INTO Pista(Nombre, Ubicacion, Hora_inicio, Hora_fin) VALUES" + " ('" + "pista"
				+ aux.toString() + "" + "','" + "ubi" + "','" + "" + "','" + "" + "')");
		bd.Update("UPDATE Pista SET Nombre='pista" + aux2.toString()
				+ "', Ubicacion='ubicacion', Hora_inicio='',Hora_fin='' Where Pista.Nombre='pista" + aux.toString()
				+ "'");
		Object[] ob = bd.Select("Select * From Pista where Pista.Nombre='pista" + aux2.toString() + "'").get(0);
		assertEquals((String) ob[0], "pista" + aux2.toString());
		assertEquals((String) ob[1], "ubicacion");
	}
}
