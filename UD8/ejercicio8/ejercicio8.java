package ejercicio8;

import java.util.Set;
import java.util.TreeSet;

public class ejercicio8 {

	public static void main(String[] args) {
		
		// Crear el conjunto
		
		Set<Integer> numeros = new TreeSet<>();
		
		// Añadir números en orden aleatorio
		
		numeros.add(6);
		numeros.add(4);
		numeros.add(9);
		numeros.add(1);
		
		// Recorrer e imprimir ordenado (menor a mayor)
		
		for (Integer num : numeros) {
			System.out.println(numeros); 
			//Aunque estén desordenados, TreeSet los ordena
		}
		
		
		// Haz lo mismo con nombres de alumnos
		
		Set<String> alumnos = new TreeSet<>();

		alumnos.add("Luis");
		alumnos.add("Ana");
		alumnos.add("Carlos");

		for (String alumno : alumnos) {
		    System.out.println(alumno);
		}
	}

}
