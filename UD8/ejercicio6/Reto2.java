package ejercicio6;

import java.util.Scanner;
import java.util.TreeSet;

public class Reto2 {

	public static void main(String[] args) {
		// RETO 2: El Ranking de Videojuegos
		
		Scanner sc = new Scanner(System.in);
		TreeSet<String> juegos = new TreeSet<>(); // Usamos TreeSet porque ordena automáticamente los elementos
		
		for (int i=0; i < 5; i++) {
			System.out.println("Introduce un videojuego: ");
			String juego = sc.nextLine();
			juegos.add(juego); // Añadimos a la lista el juego
		
		}
		
		System.out.println(juegos); // Los juegos aparecen por orden alfabético
	}
}
