package ejercicio9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio9 {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false","fran", "Fr4n");
			System.out.println("¡Conexión exitosa!");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(
					"Select * FROM producto ORDER BY precio DESC");
			
			System.out.println("Listado de todos los productos: ");
			
			while (rs.next()) {
				System.out.println("Producto " + rs.getString("nombre"));
			}
			
			con.close();
		
		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}

	}

}
