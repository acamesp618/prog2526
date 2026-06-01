package ejercicio10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio10 {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false",
                    "fran",
                    "Fr4n");

            Statement stmt = con.createStatement();

            // Borrar todos los registros
            stmt.executeUpdate("DELETE FROM producto");

            // Insertar nuevos productos
            stmt.executeUpdate(
                    "INSERT INTO producto VALUES " +
                    "(1,'manzana','Manzanas golden',50,'Francia')");

            stmt.executeUpdate(
                    "INSERT INTO producto VALUES " +
                    "(2,'pera','Peras conferencia',25,'Espana')");

            stmt.executeUpdate(
                    "INSERT INTO producto VALUES " +
                    "(3,'uva','Uvas gourmet',30,'Espana')");

            System.out.println("Productos insertados correctamente");
            
            //Modificar el precio de la pera
            stmt.executeUpdate(
            	    "UPDATE producto SET precio = 20 WHERE nombre = 'pera'"
            	);

            	System.out.println("Precio de la pera actualizado");

            stmt.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Error al acceder a la base de datos");
        }
    }
}