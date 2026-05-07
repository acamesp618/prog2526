package ejercicio2;

import java.io.FileWriter;

public class ExperimentoFlush {
    public static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        escritor.flush(); // Debemos añadir el flush
        
        System.out.println("He escrito en el archivo... ¿o no?");
        
        // El programa se queda esperando aquí para que no termine
        Thread.sleep(3000); // Espera 3 segundos
        
        // escritor.close(); // Debemos cerrar con close
        // No hemos puesto ni flush() ni close()
    }
}

// Se crea el archivo pero no contiene nada escrito en él