package ejercicio11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClubDeLectura {
	private Set<String> biblioteca;
	
	public ClubDeLectura() {
        biblioteca = new HashSet<>();
    }
	
	
	//Metodo
	
	public void agregaLibro(String libro) {
		biblioteca.add(libro);
	}
	
	public void mostrarBiblioteca() {
		Iterator<String> it = biblioteca.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/*
	REFLEXIÓN:

	1. ¿Por qué HashSet no garantiza un orden específico?
	Porque utiliza una tabla hash para almacenar los elementos, por lo que el orden
	depende del hash de cada elemento y no del orden de inserción.

	2. ¿Cuándo sería preferible usar un Iterator en lugar de un for-each?
	Cuando necesitamos eliminar elementos durante la iteración o tener más control
	del recorrido (por ejemplo, usando remove()).

	3. ¿Qué pasaría si intentamos modificar el Set mientras iteramos con for-each?
	Se produciría un ConcurrentModificationException, ya que no se permite modificar
	la colección mientras se está recorriendo con for-each.
	*/
	
}
