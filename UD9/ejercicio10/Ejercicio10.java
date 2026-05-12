package ejercicio10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		//Crear Fichero 
		File miFichero = new File("c:\\Users\\07_1DAW_Alum\\ejercicio10.txt");
		
		// Preguntar si existe (si no, muestra mensaje y sale)
		if (miFichero.exists()) {
			System.out.println("Archivo encontrado: " + miFichero.getName());
			System.out.println("Ruta absoluta: " + miFichero.getAbsolutePath());
			
			//Escribimos en el fichero
			FileWriter fw = new FileWriter(miFichero, true); //true, añade al fichero lo que le mandemos
			// si quitamos true, sobreescribe el fichero
			fw.write("Hola");
			fw.close(); //Cerramos
			
			//Leemos el fichero
			FileReader fr = new FileReader(miFichero);
			int unByte;
			while ((unByte = fr.read()) != -1) {
				System.out.print(unByte + " ");
			}
			fr.close();
			
		} else {
			System.out.println("El archivo no existe.");
		}
		
	}

}
