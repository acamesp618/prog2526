package ejercicio10;

import java.util.TreeSet;

import ejercicio1.Persona;

public class ejercicio10 {

	public static void main(String[] args) {
		
		Persona juan = new Persona("Juan", "López", 23);
		Persona maria = new Persona("Maria", "Gutierrez", 52);
		
		TreeSet<Persona> personas = new TreeSet<>(new ComparatorEdad());
		personas.add(maria);
		personas.add(juan);
		System.out.println(personas);
		
		
		
	}

}
