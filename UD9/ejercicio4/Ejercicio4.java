package ejercicio4;

import java.io.IOException;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		byte b[] = new byte[5]; //Crea un array de 5 caracteres
		try {
			System.in.read(b); // Podemos escribir todos los caracteres que queramos
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		String s = new String(b);
		System.out.println(s); // Sólo imprime los 5 primeros caracteres
	}

}

