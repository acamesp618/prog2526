package ejemplos.Set;

import java.util.HashSet;
import java.util.Set;

import ejercicio1.Persona;

public class ejemploComparar {

	public static void main(String[] args) {
		Set<Persona> personas = new HashSet<>();
		personas.add(new Persona("Fran"));
		personas.add(new Persona("Ana"));
		System.out.println(personas);

	}

}
