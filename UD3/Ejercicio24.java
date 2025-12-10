package actividadesUD3;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe la edad del alumno: ");
        int n = sc.nextInt();
        
        int max = 0, min = n;
        
        while (n != -1) {
        	
        	if (n>max)
        		max = n;
        	else
        		min = n;
        	
        	System.out.print("Escribe la edad de otro alumno: ");
            n = sc.nextInt();
        }
        System.out.print("El rango de edades es: ["+ min + ", "+ max +"]");
	}
}
