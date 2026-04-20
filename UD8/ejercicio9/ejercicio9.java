package ejercicio9;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import ejercicio1.Persona;

public class ejercicio9 {

	public static void main(String[] args) {
		
		SortedSet<Persona> personas = new TreeSet<>();
		// SortedSet no admite duplicados, TreeSet ordena en orden natural
		Persona jacobo = new Persona("Jacobo", "López", 32);
		personas.add(jacobo);
		Persona simon = new Persona("Simon", "Jimenez", 18);
		personas.add(simon);
		Persona maria = new Persona("Maria", "Marquez", 23);
		personas.add(maria);
		Persona simon2 = new Persona("Simon", "Campos", 85);
		personas.add(simon2);
		
		
		System.out.println(personas);
		
		System.out.println(jacobo.compareTo(simon));// Devuelve numero en negativo porque simon es más grande que jacobo
		System.out.println(simon.compareTo(simon2));// Devuelve 0 porque son iguales
		
		// Copia a las personas a una nueva coleccion donde permanezcan ordenadas
		Set<Persona> listaInsercion = new LinkedHashSet<>(personas);
		System.out.println("Coleccion ordenada: " + listaInsercion);
	}

}
