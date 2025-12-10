package actividadesUD3;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
        int n = sc.nextInt();
        
        while (n!=0) {
        	if (n % 2 == 0)
        		System.out.println("Es un numero par");
        	else
        		System.out.println("No es un numero par");
        	if (n >= 0)
        		System.out.println("Es un numero positivo");
        	else
        		System.out.println("Es un numero negativo");
        	int cuadrado = n*n;
        	System.out.println("El cuadrado del numero es: "+ cuadrado);
        	
        	System.out.println("Introduce otro numero (0 para terminar): ");
        	n = sc.nextInt();
        }

	}

}
