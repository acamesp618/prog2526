package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos años crees que vivirás?");
		int edad = sc.nextInt(); // Lee un numero
		
		System.out.println("¿Cual es tu nombre?");
		String nombre = sc.nextLine(); // Lee hasta que pulsamos intro
		
		System.out.println("Hola " + nombre + ", los astros dicen que morirás a los "+ (edad + 10) + " por culpa de un cafe frio");

	}

}
