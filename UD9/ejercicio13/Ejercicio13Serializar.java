package ejercicio13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Ejercicio13Serializar {

	public static void main(String[] args) throws IOException {
		// Crear objeto
		Persona famoso = new Persona("Kiko", "Rivera", 38);
		
		// Guardamos en fichero
		try {
			FileOutputStream fichero = new FileOutputStream("persona.dat");
			ObjectOutputStream out = new ObjectOutputStream(fichero);
			
			out.writeObject(famoso);
			
			out.close();
			
			System.out.println("Persona guardada correctamente");
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al guardar");
			e.printStackTrace();
		}
		

	}

}
