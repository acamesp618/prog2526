package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		// Pedir al usuario que introduzca varios caracteres por teclado
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce varios caracteres y despues pulse intro para finalizar:");
				String texto = sc.nextLine(); // Leemos lo que escriba el usuario
				//nextLine lee hasta que el usuario pulse intro
				
				//Hola mundo pidiendo el nombre
				
				System.out.println("Introduzca su nombre:");
				
				String nombre = sc.nextLine();
				
				System.out.println("Hola " + nombre + "!");
				
				sc.close();
		
	}

}
