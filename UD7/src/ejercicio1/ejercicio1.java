package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		System.out.println("COMIENZO PROGRAMA DIVISION");
		try {
			Scanner sc = new Scanner(System.in); //Pedimos los datos al usuario
			int dividendo = sc.nextInt();
			int divisor = sc.nextInt();
			System.out.println("Resultado :" + dividendo / divisor); 
		} catch (ArithmeticException ex) {
			System.out.println("Imposible dividir por 0");
		} finally {
			System.out.println("FIN PROGRAMA DIVISION");
		}

	}

}
