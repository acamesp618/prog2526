package ejercicio8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio8 {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false","fran", "Fr4n");
			System.out.println("¡Conexión exitosa!");
			
			con.close();
		
		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}

	}

}
