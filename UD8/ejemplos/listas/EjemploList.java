package ejemplos.listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

	public static void main(String[] args) {
		List lista = new ArrayList(); //Creamos la lista
		lista.add(7); // Añadir elementos
		lista.add(2);
		lista.add(7); // Puede contener elementos repetidos
		lista.add(5);
		
		System.out.println(lista); 
		
		// Comparamos con un array
		int [] array = new int[4]; // Para crear un array primero añadimos el tipo y luego los [], a la derecha añadimos el tamaño
		array[0]= 7; // Para añadir valor se coloca a través del indice
		array[1]= 2;
		array[2]= 7;
		array[3]= 5;
		
		System.out.println(array); // Imprimir el array hace que imprima la referencia
	}

}
