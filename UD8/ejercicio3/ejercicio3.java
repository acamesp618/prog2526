package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		//Crear una lista de nombres:

			// Declara una variable de tipo List<String> e inicialízala como un objeto de la clase ArrayList<String>.
			
			List<String> nombres = new ArrayList<>();
			
			// Añade al menos 5 nombres iniciales a la lista utilizando el método add.
			nombres.add("Pedro");
			nombres.add("Juan");
			nombres.add("Fran");
			nombres.add("Maria");
			nombres.add("Lucia");
			
		// Mostrar los nombres:
			
			// Implementa un método que recorra la lista utilizando un bucle for-each y muestre cada nombre por consola.
			mostrarNombre(nombres); // El metodo se crea fuera del main
			
		// Añadir un nuevo nombre:
			Scanner sc = new Scanner(System.in);
			
			//Solicita al usuario que introduzca un nuevo nombre por teclado y añádelo a la lista.
			System.out.println("Introduce un nuevo nombre: ");
			String nuevoNombre = sc.nextLine();
			nombres.add(nuevoNombre);
			
			System.out.println(nombres);
			
		//Eliminar un nombre específico:

			// Solicita al usuario que introduzca el nombre que desea eliminar. Si el nombre existe en la lista, elimínalo utilizando el método remove. Si no existe, muestra un mensaje indicando que el nombre no se encuentra en la lista.
			System.out.println("Introduce el nombre que desea eliminar: ");
			String nuevoNombre2 = sc.nextLine();
			if (nombres.remove(nuevoNombre2)) {
				System.out.println("Nombre eliminado!");
			} else {
				System.out.println("Nombre no encontrado");
			};
			
			
			
		// Mostrar el número total de nombres:

			// Utiliza el método size para mostrar cuántos nombres hay actualmente en la lista.
			System.out.println("El número total de nombres es: " + nombres.size());
	}
	
	
	private static void mostrarNombre(List<String> lista) {
		for (String string: lista) {
			System.out.println(string);
		}
	}

}
