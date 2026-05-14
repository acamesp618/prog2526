package ejercicio12;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		// Crea un nuevo fichero llamado "abecedario.txt"
		File fichero = new File("abecedario.txt");

		try {

			// Si existe, eliminarlo
			if (fichero.exists()) {

				fichero.delete();
				System.out.println("Fichero eliminado.");

			}

			// Crear acceso aleatorio
			RandomAccessFile raf = new RandomAccessFile(fichero, "rw");

			// Escribir "defg"
			raf.writeBytes("defg");

			// Mostrar contenido inicial
			raf.seek(0);

			System.out.println("Contenido inicial:");

			int caracter;

			while ((caracter = raf.read()) != -1) {

				System.out.print((char) caracter);

			}

			System.out.println();

			
			// Añadir "abc" al principio
			// Leer contenido actual byte a byte
			raf.seek(0);

			byte[] contenido = new byte[(int) raf.length()];
			raf.read(contenido);

			// Volver al inicio
			raf.seek(0);

			// Escribir "abc"
			raf.writeBytes("abc");

			// Escribir contenido anterior
			raf.write(contenido);

			// Añadir "hij" al final
			raf.seek(raf.length());

			raf.writeBytes("hij");

			
			// Sustituir vocales por * directamente en el fichero
		

			raf.seek(0);

			while ((caracter = raf.read()) != -1) {

				char letra = (char) caracter;

				if ("aeiouAEIOU".indexOf(letra) != -1) {

					// Retroceder una posición
					raf.seek(raf.getFilePointer() - 1);

					// Sustituir por *
					raf.writeByte('*');

				}

			}

			// Mostrar contenido final
			raf.seek(0);

			System.out.println("\nContenido final:");

			while ((caracter = raf.read()) != -1) {

				System.out.print((char) caracter);

			}

			raf.close();

		} catch (IOException e) {

			System.out.println("Error con el fichero.");
			e.printStackTrace();

		}

	}

}
