package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		 System.out.println("COMIENZO PROGRAMA PERSONA");

	        Scanner sc = new Scanner(System.in);

	        try {
	            // Pedimos la edad al usuario
	            System.out.print("Introduce la edad: ");
	            int edad = sc.nextInt();

	            // Llamamos al método que valida la edad
	            validarEdad(edad);

	            // Si no hay error, mostramos mensaje correcto
	            System.out.println("Edad válida: " + edad);

	        } catch (IllegalArgumentException ex) {
	            // Capturamos la excepción que lanzamos manualmente
	            System.out.println("Error: " + ex.getMessage());

	        } finally {
	            // Siempre se ejecuta
	            System.out.println("FIN PROGRAMA PERSONA");
	        }
	    }

	    public static void validarEdad(int edad) {

	        // Si la edad es menor que 0, lanzamos la excepción manualmente
	        if (edad < 0) {
	            throw new IllegalArgumentException("La edad no puede ser negativa");
	        }
	}

}
