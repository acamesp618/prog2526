package ejercicio4;

import java.util.Scanner;

import ejercicio5.NumeroRepetido; //Importamos exception del ejercicio 5

public class Main {

	public static void main(String[] args) {
		try{
			introduceEnteros();
		} catch (IllegalArgumentException e) {
			e.printStackTrace(); // Nos muestra la traza
			System.out.println(e.getMessage()); // Imprime el mensaje del exception
		} finally {
			System.out.println("Fin");
		}
	}
	
	private static void introduceEnteros() throws IllegalArgumentException {
		int[] lista = new int[5]; // Creamos un array
		lista[0] = 0; // Introducimos los numeros en la lista
		lista[1] = 12;
		lista[2] = 2;
		lista[3] = 3;
		lista[4] = 40;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //Escaner para añadir el numero que queramos
		
		lista[2] = 40;
		
		//TODO: Invocar metodo y si devuelve true lanzar excepcion
		if (estaEnLista(lista, num))
			throw new NumeroRepetido("Numero repetido"); // Cambiamos por exception del ejercicio 5
		
		for(int e: lista) {
			System.out.println(e);
		}
		
	}
	
	// Crear metodo que diga si un numero está en una lista
	private static boolean estaEnLista(int [] lista, int num){
		for (int e: lista) {
			if (e == num)
				return true;
		}
		return false;
	}
}
