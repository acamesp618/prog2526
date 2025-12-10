package actividadesUD3;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio23 {

	public static void main(String[] args) {
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int a = random.nextInt();
		int b = random.nextInt();
		
		int min, max;
		
		if (a<b) {
			min=a;
			max=b;
		} else {
			min=b;
			max=a;
		}
		
		System.out.println("Introduce un número dentro del rango [" + min + ", "+ max + "]");
		
		System.out.println("Numero: ");
		int n = sc.nextInt();
	}

}
