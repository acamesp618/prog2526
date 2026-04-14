package ejercicio6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Reto1 {

	public static void main(String[] args) {
		// RETO 1: Control de Aduanas
		Scanner sc = new Scanner(System.in);
		Set<String> paises = new HashSet<>(); // Usamos un HashSet porque no permite elementos repetidos
		
		for (int i=0; i < 5; i++) {
			System.out.println("Introduce un país: ");
			String pais = sc.nextLine(); // Añadimos el pais a una variable
			
			if (paises.contains(pais)) { // Vemos si la lista paises contiene el pais escrito
				System.out.println("¡Ese ya pasó por la frontera!");
			} else {
				paises.add(pais); // Si no está, se añade a la lista
			}
		}
		
		System.out.println("Paises unicos: " + paises.size());

	}

}
