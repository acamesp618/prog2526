package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir al usuario que introduzca 4 caracteres por teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 4 caracteres:");
		String entrada = sc.next(); // Leemos lo que escriba el usuario
		
		//Guardamos cada uno en una variable tipo char (carácter)
		char c1 = entrada.charAt(0);
		char c2 = entrada.charAt(1);
		char c3 = entrada.charAt(2);
		char c4 = entrada.charAt(3);
		
		// Imprimir el primero con el write
		// Escribe el byte directamente. ¡Ojo! Necesita un flush() para verse
		System.out.write(c1);
		System.out.flush();
		
		// Imprimir el segundo con print -> El estandar
		// Pega el carácter a lo que venga despues, sin saltar de linea
		System.out.print(c2);
		
		// Imprimir el tercero con println -> El comodo
		// Escribe el caracter y salta a la siguiente linea
		System.out.println(c3);
		
		// Imprimir el cuarto con printf -> El elegante (Formateado)
		// Permite incrustar el caracter dentro de un texto usando moldes
		System.out.printf("El ultimo caracter es: %c", c4);
		
		sc.close();
	}

}
