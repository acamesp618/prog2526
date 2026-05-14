package ejercicio13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Ejercicio13Deserializar {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try {
			// Abrimos el fichero
			FileInputStream fichero = new FileInputStream("persona.dat");
		
			// Creamos el flujo de lectura de objetos
			ObjectInputStream in = new ObjectInputStream(fichero);
			
			//Leer el objeto (hay que hacer casting)
			Persona p = (Persona) in.readObject();
			
			//Cerrar flujo
			in.close();
			
			// Mostramos el resultado
			System.out.println("Persona leída:");
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			System.out.println("Clase no encontrada");
			e.printStackTrace();
		}
		
		
		
	}

}
