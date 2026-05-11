package ejemplos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {

	public static void main(String[] args)  {
		File miFichero = new File("prueba.txt"); //Buscamos el fichero  
		try {
			FileWriter fw = new FileWriter(miFichero);
		} catch (IOException e) {
			e.printStackTrace();
		} //Podemos añadir el fichero dentro

	}

}
