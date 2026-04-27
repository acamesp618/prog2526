package ejercicio12;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ejercicio12 {
	public static void main(String[] args) {

        // Crear lista
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);

        System.out.println("Lista original: " + numeros);

        // Crear iterador
        ListIterator<Integer> it = numeros.listIterator();

        // Recorrido hacia adelante
        System.out.println("\nRecorrido hacia adelante:");
        while (it.hasNext()) {
            int num = it.next();
            System.out.println("Índice: " + it.previousIndex() + " Valor: " + num);

            // Multiplicar por 2 si es mayor que 50
            if (num > 50) {
                it.set(num * 2);
            }
        }

        System.out.println("Lista después de modificar (>50 *2): " + numeros);

        // Recorrido hacia atrás
        System.out.println("\nRecorrido hacia atrás:");
        while (it.hasPrevious()) {
            int num = it.previous();
            System.out.println("Índice: " + it.nextIndex() + " Valor: " + num);

            // Añadir 25 si es menor que 30
            if (num < 30) {
                it.add(25);
            }
        }

        System.out.println("Lista final: " + numeros);
    }
}
