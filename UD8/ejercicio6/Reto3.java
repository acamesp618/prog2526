package ejercicio6;

import java.util.LinkedHashSet;

public class Reto3 {

	public static void main(String[] args) {
		// RETO 3: La Memoria de Pez
		
		LinkedHashSet<String> colores = new LinkedHashSet<>(); 
		//Usamos LinkedHashSet porque no permite duplicados y mantiene el orden de inserción
		
		colores.add("Rojo");
		colores.add("Azul");
		colores.add("Verde");
		colores.add("Amarillo");
		colores.add("Morado");
		
		System.out.println("Colores en orden de inserción: " + colores);
		

	}

}
