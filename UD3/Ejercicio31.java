package actividadesUD3;

import java.util.Scanner;

public class Ejercicio31 {
	
	public static void variosSaludos(int n) {
		for(int i=0; i<n; i+=1) {
		System.out.println("Hola");}
	}
	public static void main(String[] args) {
		System.out.println("Invocacion con literal 3:");
		variosSaludos(3);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
        int n = sc.nextInt();
        variosSaludos(n);
        
        System.out.println("Invocacion con valor doble de n:");
		variosSaludos(n*2);
        
	}

}
