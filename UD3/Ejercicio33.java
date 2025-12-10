package actividadesUD3;

import java.util.Scanner;

public class Ejercicio33 {
	public static int maximo(int x, int y) {
		int resultado;
		if (x > y) {
			resultado=x;
		}else {
			resultado=y;
		}
		return(resultado);
	}
	public static int maximo(int x, int y, int  z) {
		int resultado;
		if ((x > y) && (x > z)) {
			resultado=x;
		}else if ((y > x) && (y > z)){
			resultado=y;
		}else {
			resultado=z;
		}
		return(resultado);
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
        int n1 = sc.nextInt();
        System.out.print("Escribe otro numero: ");
        int n2 = sc.nextInt();
        System.out.print("Escribe el ultimo numero (si no quiere mas escriba 0): ");
        int n3 = sc.nextInt();
        
		System.out.println("El mayor de los dos numeros es: "+ maximo(n1, n2));
		System.out.println("El mayor de los tres numeros es: "+ maximo(n1, n2, n3));
	}

}
