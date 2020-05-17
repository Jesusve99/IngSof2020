package modelo;

import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.*;
//import javax.activation.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//USER:rWiO7EseHz
//PASS:vKa9rl8nd5
//https://remotemysql.com/phpmyadmin/db_structure.php?db=rWiO7EseHz

public class BD {
//	Atributos:
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://remotemysql.com:3306/rWiO7EseHz";
	private static String usernamedefault = "rWiO7EseHz";
	private static String passworddefault = "vKa9rl8nd5";
	private static ComboPooledDataSource datosConexion;

//	Constructores:
	
	public BD() {
		this(usernamedefault, passworddefault);
	}

	public BD(String user, String pass) {
		datosConexion = new ComboPooledDataSource();
		try {
			datosConexion.setDriverClass(driver);
			datosConexion.setJdbcUrl(URL);
			datosConexion.setUser(user);
			datosConexion.setPassword(pass);
		} catch (PropertyVetoException e) {
			throw new BDException("Error al acceder al driver");
		}
	}

//	Crea conexion con la BDD a partir de los datos almacenados en datosConexion:

	public static Connection connectToDatabase() {
		Connection connection = null;
		try {
			connection = datosConexion.getConnection();
		} catch (SQLException e) {
			throw new BDException("No se ha podido establecer conexion con la BDD");
		}
		return connection;
	}

//	Metodo para acceder al valor de la columna 1 fila 1:
	public Object SelectEscalar(String sel) {
		Connection con= null;
		ResultSet rset;
		Object res = null;
		try {
			con = connectToDatabase();
			Statement stmt = con.createStatement();
			rset = stmt.executeQuery(sel); //Realiza la instruccion SQL SELECT y el resultado se le referencia a rset
			rset.next(); // Como los objetos statement se generan en la fila 0, para acceder a la primera se ejecuta dicho metodo.
			res = rset.getObject(1); // Obtiene el valor de la columna pasada por argumento, en la actual fila (1), tras haber ejecutado el metodo next
			rset.close(); //Cerramos recursos
			stmt.close(); //Cerramos recursos
		} catch (SQLException e) {
			throw new BDException("Error en el SELECT: " + sel + ". " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close(); //Cerramos la conexion
				} catch (SQLException e) {
					throw new BDException("Error al cerrar la conexion con la BDD.");
				}
			}
		}
		return res;
	}

//	Metodo para hacer guardar una lista con toda la operacion del SELECT:
	public List<Object[]> Select(String sel) {
		Connection con = null;
		ResultSet rset;
		List<Object[]> lista = new ArrayList<Object[]>();
		try {
			con = connectToDatabase(); //Crea conexion con la BBD
			Statement stmt = con.createStatement();
			rset = stmt.executeQuery(sel); //Realiza la instruccion SQL SELECT y el resultado se le referencia a rset
			ResultSetMetaData meta = rset.getMetaData();
			int numCol = meta.getColumnCount(); //Total de columnas (las que hayamos seleccionado) que tiene la busqueda SELECT
			while (rset.next()) {
				Object[] tupla = new Object[numCol];
				for (int i = 0; i < numCol; ++i) {
					tupla[i] = rset.getObject(i + 1);
				} //Crea una tupla con toda la fila del SELECT, agrupando los datos que pertenecen al mismo objeto
				lista.add(tupla); //A�ade a la coleccion de datos seleccionados por el SELECT, tantos como filas
			}
			rset.close(); //Cerramos recursos
			stmt.close(); //Cerramos recursos
		} catch (SQLException e) {
			throw new BDException("Error en el SELECT: " + sel + ". " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close(); //Cerramos la conexion
				} catch (SQLException e) {
					throw new BDException("Error al cerrar la conexion con la BDD.");
				}
			}
		}
		return lista;
	}
	
//	Operacion INSERT para la BDD:
	public void Insert(String ins) {
		Connection con = null;
		try {
			con = connectToDatabase();//Se conecta a la BDD
			Statement stmt = con.createStatement(); //Crea a partir de la conexion un objeto Statement que se enlazar� a la BDD
			stmt.executeUpdate(ins); //Con dicha operacion en este objeto ejecutamos una instruccion SQL, el argumento que le entra es la propia instruccion SQL
			stmt.close(); //Cerramos los recursos
		} catch (SQLException e) {
			throw new BDException("Error en el INSERT: " + ins + ". " + e.getMessage());
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e){
					throw new BDException("No se ha podido cerrar la conexion correctamente");
				}
			}
		}
	}

//	Operacion DELETE para la BDD:
	public void Delete(String del) {
		Connection con = null;
		try {
			con = connectToDatabase(); //Se conecta a la BDD
			Statement stmt = con.createStatement(); //Crea a partir de la conexion un objeto Statement que se enlazar� a la BDD
			stmt.executeUpdate(del); //Con dicha operacion en este objeto ejecutamos una instruccion SQL, el argumento que le entra es la propia instruccion SQL
			stmt.close(); //Cerramos los recursos
		} catch (SQLException e) {
			throw new BDException("Error en el DELETE: " + del + ". " + e.getMessage());
		}finally {
			if(con != null) {
				try {
					con.close(); //Cerramos la conexion
				} catch (SQLException e){
					throw new BDException("No se ha podido cerrar la conexion correctamente");
				}
			}
		}
	}

//	Operacion UPDATE para la BDD:
	public void Update(String up) {
		Connection con = null;
		try {
			con = connectToDatabase(); //Se conecta a la BDD
			Statement stmt = con.createStatement(); //Crea a partir de la conexion un objeto Statement que se enlazar� a la BDD
			stmt.executeUpdate(up); //Con dicha operacion en este objeto ejecutamos una instruccion SQL, el argumento que le entra es la propia instruccion SQL
			stmt.close(); //Cerramos los recursos
		} catch (SQLException e) {
			throw new BDException("Error en el UPDATE: " + up + ". " + e.getMessage());
		} finally {
			if(con != null) {
				try {
					con.close(); //Cerramos la conexion
				} catch (SQLException e){
					throw new BDException("No se ha podido cerrar la conexion correctamente");
				}
			}
		}
	}

}