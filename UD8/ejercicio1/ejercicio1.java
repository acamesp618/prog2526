package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ejercicio1 {

	public static void main(String[] args) {
		
		// Crear una lista sin ninguna referencia (nula)
		List personas = null;
		System.out.println(personas); //Imprime null
		
		// Asignarle una nueva lista vacía que sea una instancia de la clase ArrayList
		personas = new ArrayList();
		System.out.println(personas); //Imprime lista vacia
		
		// Añadir 3 personas (tipo Persona) en la lista
		Persona fran = new Persona("Fran");
		Persona luis = new Persona("Luis");
		Persona marta = new Persona("Marta");
		
		personas.add(fran);
		personas.add(luis);
		personas.add(marta);
		
		System.out.println(personas); //Imprimimos y vemos que están en orden
		
		
		// Obtener la última persona de la lista e imprimirla por consola
		System.out.println(personas.getLast());
		
		// Modifica el nombre de la primera persona de la lista
		Persona persona;
		persona = (Persona)personas.getFirst(); // De normal devuelve como objeto, entre parentesis para que devuelva tipo Persona
		persona.setNombre("Paco");
			// En una linea
		((Persona)personas.getFirst()).setNombre("Paco");
		
		// Elimina de la lista la persona que ocupa la posicion central
		int posicionCentral = (personas.size() / 2) - 1; // Le restamos uno para que al redondear coja siempre el central
		personas.remove(posicionCentral);
		
		System.out.println(personas);

		// Imprime la lista despues de cada apartado
		
		
		// Recorre la lista con un FOR clásico (usando indice) imprimiendo el nombre de cada persona
		for (int i = 0; i < personas.size(); i++) { // (Comienzo bucle, finalización y de cuanto en cuanto)
			System.out.println(personas.get(i));
		}
		
		// Crea una nueva persona, añadela a la lista y pregunta si la lista contiene a esa persona recien creada para confirmarlo
		Persona ana = new Persona("Ana");
		personas.add(ana);
		
		if (personas.contains(ana))
			System.out.println("La persona: " + ana + " está en la lista");
		
		System.out.println(personas);

		//Vacia la lista y pregunta si está vacia para confirmarlo
		personas.clear();
		
		if (personas.isEmpty())
			System.out.println("La lista está vacía");
		
		System.out.println(personas);

	}

}
