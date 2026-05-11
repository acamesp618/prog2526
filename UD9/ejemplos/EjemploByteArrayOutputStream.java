package ejemplos;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class EjemploByteArrayOutputStream {
    public static void main(String[] args) {
        try {
            // Crear el stream en memoria
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
            //Sirve para escribir datos en memoria (en un array de bytes) en lugar
            // de enviarlos a un archivo o red

            // Escribir datos (como bytes)
            baos.write("Hola ".getBytes());
            baos.write("mundo".getBytes());
            baos.write("!!!!".getBytes());

            // Convertir a String
            String resultado = baos.toString();

            System.out.println("Contenido: " + resultado);

            // Obtener array de bytes
            byte[] datos = baos.toByteArray();
            System.out.println("Longitud en bytes: " + datos.length);
            
            //Ejemplo más visual
            ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
            baos1.write(65); // 'A'
            baos1.write(66); // 'B'
            baos1.write(67); // 'C'

            System.out.println(baos1.toString()); //ABC

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}