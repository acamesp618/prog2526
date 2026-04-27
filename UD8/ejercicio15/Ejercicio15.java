package ejercicio15;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio15 {

	public static void main(String[] args) {
		//Crear lista
		ArrayList<Integer> puntuaciones = new ArrayList<>();
		puntuaciones.add(450);
		puntuaciones.add(1200);
		puntuaciones.add(300);
		puntuaciones.add(800);
		puntuaciones.add(1500);
		puntuaciones.add(100);
		
		System.out.println("Orden original: " + puntuaciones);
		
		//Ordenar la lista de menor a mayor
		Collections.sort(puntuaciones);
		System.out.println("Lista ordenada: " + puntuaciones);
		
		// Maximo y minimo
		int max = Collections.max(puntuaciones);
		int min = Collections.min(puntuaciones);
		System.out.println("Máximo: " + max);
		System.out.println("Mínimo: " + min);
		
		//Mezclar
		Collections.shuffle(puntuaciones);
		System.out.println("Mezclado: " + puntuaciones);
	}

}
