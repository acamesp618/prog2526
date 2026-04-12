package ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ejercicio1.Persona;

public class ejercicio2 {

	public static void main(String[] args) {
		// Copia el código del ejercicio anterior en una nueva clase para reutilizar la lista que creaste.
		
				List personas = new ArrayList();
				Persona fran = new Persona("Fran");
				Persona luis = new Persona("Luis");
				Persona marta = new Persona("Marta");
			
				personas.add(fran);
				personas.add(luis);
				personas.add(marta);
				
				
		
		// Copia las personas de la lista original a una nueva lista que sea una instancia de la clase LinkedList.
			List listaEnlazada = new LinkedList(personas);
			
			System.out.println(listaEnlazada);
			
				// Copia con el add
				List listaEnlazada2 = new LinkedList();
				for (Object x: personas) {
					listaEnlazada2.add(x);
				}
				
		// En la nueva lista, intercambia las personas de las posiciones primera y última.
			if(!listaEnlazada.isEmpty()) {
				int primero = 0;
				int ultimo = listaEnlazada.size() - 1;
				
				listaEnlazada.set(ultimo, listaEnlazada.get(primero));
				listaEnlazada.set(primero, listaEnlazada.get(ultimo));
				
			}
			
		// Modfica el nombre de la primera persona de la lista
		
		// Elimina de la lista la persona que ocupa la posición central
		
		// Imprime la lista después de cada apartado.
		
		// Recorre la lista con un for clásico (usándo índice) imprimiendo el nombre de cada persona
		
		// Crea una nueva persona, añádela a la lista y pregunta si la lista contiene a esa persona recien creada para confirmarlo
		
		// Vacía la lista y pregunta si está vacía para confirmarlo

	}

}
