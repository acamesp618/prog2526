package actividadesUD3;

import java.util.Scanner;

public class Ejercicio32 {
	public static int maximo(int x, int y) {
		int resultado;
		if (x > y) {
			resultado=x;
		}else {
			resultado=y;
		}
		return(resultado);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
        int n1 = sc.nextInt();
        System.out.print("Escribe otro numero: ");
        int n2 = sc.nextInt();
        
		System.out.println("El mayor de los numeros es: "+ maximo(n1, n2));

	}

}
