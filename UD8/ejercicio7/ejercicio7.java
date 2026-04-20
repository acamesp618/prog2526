package ejercicio7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ejercicio7 {

	public static void main(String[] args) {
		// Crear un conjunto vacío
		Set<String> alumnos = new LinkedHashSet<>();
		
		// Agregar nombre de alumnos
		
		alumnos.add("Adrian");
		alumnos.add("Pedro");
		alumnos.add("Luis");
		alumnos.add("Ana");
		alumnos.add("Cristina");
		
		// Imprime el conjunto para ver su contenido
		
		System.out.println(alumnos); //Imprime el valor
		
		// Añade un nombre repetido
		
		alumnos.add("Pedro");
		
		System.out.println(alumnos); // No permite duplicados
		
		// Añade un null
		
		alumnos.add(null);
		
		System.out.println(alumnos); // Permite valores nulos, pero solo 1 al no permitir duplicados
		
		// Recorre el conjunto imprimento sus elementos en orden
		
		for (String alumno : alumnos) {
			System.out.println("D. " + alumno);
		}
		
		// El LinkedHashSet mantiene el orden de inserción
		// El HashSet no garantiza ningun orden, puede aparecer aleatorio
		Set<String> alumnosHash = new HashSet<>();
		alumnosHash.add("Adrian");
		alumnosHash.add("Pedro");
		alumnosHash.add("Luis");
		alumnosHash.add("Ana");
		alumnosHash.add("Cristina");
		
		System.out.println("List HashSet: " + alumnosHash);
	}

}