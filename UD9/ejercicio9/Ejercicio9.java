package ejercicio9;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Crear objeto File
		File miFichero = new File("notas.txt");

			// Comprobar si existe
			if (miFichero.exists()) {

				System.out.println("Archivo encontrado: " + miFichero.getName());
				System.out.println("Ruta absoluta: " + miFichero.getAbsolutePath());

			} else {

				System.out.println("El archivo no existe.");
				try {
					// Crear archivo automáticamente
					if (miFichero.createNewFile()) {
						System.out.println("Archivo creado correctamente.");
						System.out.println("Ruta absoluta: " + miFichero.getAbsolutePath());
					} else {
						System.out.println("No se pudo crear el archivo.");
					}
				}

				catch (IOException e) {

					System.out.println("Error al trabajar con el archivo.");
					e.printStackTrace();
				}
			}
	}
}