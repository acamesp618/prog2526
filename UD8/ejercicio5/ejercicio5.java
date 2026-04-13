package ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class ejercicio5 {

	public static void main(String[] args) {
		//1. Crea un conjunto vacío de números enteros
		Set<Integer> numerosEnteros = new HashSet<Integer>();
		
		//2. Agrega los primeros 5 números naturales al conjunto
		numerosEnteros.add(1);
		numerosEnteros.add(2);
		numerosEnteros.add(3);
		numerosEnteros.add(4);
		numerosEnteros.add(5);
		
		
		//3. Imprime el conjunto para ver su contenido
		System.out.println(numerosEnteros);
			//Imprime el valor añadido
		
		//4. Añade un número repetido
		numerosEnteros.add(4);
			//No permite añadir duplicados
		
		//5. Añade un null
		numerosEnteros.add(null);
			//Si permite añadir valores nulos
		
		//6. Crea un nuevo conjunto con los dos primeros numeros primos y comprueba si este nuevo conjunto es un subconjunto del anterior
		Set<Integer> numerosEnteros2 = new HashSet<Integer>();
		numerosEnteros2.add(2);
		numerosEnteros2.add(3);
		numerosEnteros.containsAll(numerosEnteros2);
		
		//7. Declara una lista con el modificador final, inicializándola con los valores del primer conjunto.
	}

}
