package ejercicio10;

import java.util.SortedSet;
import java.util.TreeSet;

import ejercicio1.Persona;

public class ejercicio10 {

	public static void main(String[] args) {
		
		SortedSet<Persona> porEdad = new TreeSet<>(new ComparatorEdad());
		SortedSet<Persona> porApellido = new TreeSet<>(new ComparatorApellido());
		SortedSet<Persona> completo = new TreeSet<>(new ComparatorApellidoNombreEdad());

		Persona juan = new Persona("Juan", "López", 23);
		Persona maria = new Persona("Maria", "Gutierrez", 52);
		Persona ana = new Persona("Ana", null, 30);

		porEdad.add(juan);
		porEdad.add(maria);
		porEdad.add(ana);

		porApellido.add(juan);
		porApellido.add(maria);
		porApellido.add(ana);

		completo.add(juan);
		completo.add(maria);
		completo.add(ana);

		System.out.println("Por edad: " + porEdad);
		System.out.println("Por apellido: " + porApellido);
		System.out.println("Completo: " + completo);
		
		
		
	}

}
