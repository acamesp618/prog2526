package UD5ejercicio11;

public class Main {

	public static void main(String[] args) {
		//Creamos algunos libros con sus atributos
		Libro elQuijote = new Libro("El Quijote", "Cervantes", "23596", 1885);
		Libro elPrincipito = new Libro("El Principito","Joan", "26974", 1930);
		
		System.out.println(elQuijote.toString());
		System.out.println(elQuijote); //Hace igual que el toString pero de forma explicita
		
		System.out.println(elQuijote.equals(elPrincipito)); 

	}

}
