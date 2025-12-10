package actividadesUD3;

import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int aciertos = 0;
        boolean correcto;

        do {
            int a = (int)(Math.random()*100)+1;
            int b = (int)(Math.random()*100)+1;
            int resultado = a + b;

            System.out.print(a + " + " + b + " = ");
            int respuesta = sc.nextInt();

            correcto = (respuesta == resultado);

            if (correcto) aciertos++;

        } while (correcto);

        System.out.println("Fallaste. Total aciertos: " + aciertos);
	}
}
