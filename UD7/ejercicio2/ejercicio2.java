package ejercicio2;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
System.out.println("COMIENZO PROGRAMA DIVISION");
        
        try {
        	// Creamos el Scanner para leer datos del usuario
            Scanner sc = new Scanner(System.in);

            // Pedimos los valores
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt();

            // Llamamos al método dividir (puede lanzar excepciones)
            int resultado = dividir(dividendo, divisor);

            // Mostramos el resultado
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException ex) {
            // Capturamos la excepción de división por cero
            System.out.println("Error: imposible dividir por 0");

        } catch (IOException ex) {
            // Capturamos la excepción comprobada (obligatoria)
            System.out.println("Error de entrada/salida (IOException)");

        } finally {
            // Este bloque siempre se ejecuta
            System.out.println("FIN PROGRAMA DIVISION");
        }
    }

    public static int dividir(int a, int b) throws IOException {
    	//Aquí se realiza la división
    	//Si b es 0, se lanzará automáticamente ArithmeticExcepcion
        return a / b;
    }

}
