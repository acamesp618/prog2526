package ejercicio4;

import java.util.ArrayList;

public class ejercicio4 {

	public static void main(String[] args) {

        // Array de entrada (Strings)
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // Crear ArrayList de Double
        ArrayList<Double> notas = new ArrayList<>();

        // Conversión y añadir a la lista
        Double sumaNotas = 0.0;
        for (String notaTexto : notasEntrada) {
            notas.add(Double.valueOf(notaTexto)); //Añadimos en lista convirtiendolo a Double
            sumaNotas = sumaNotas + Double.valueOf(notaTexto); // Sumamos todas las notas
        }

        // Mostrar notas convertidas
        System.out.println("Lista de notas: " + notas);

        // Cálculo de la media
        double notaMedia = sumaNotas / notasEntrada.length;

        System.out.println("Nota media: " + notaMedia);

        // Filtrado de aprobados
        ArrayList<Double> aprobados = new ArrayList<>();

        for (Double nota : notas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        // Mostramos aprobados
        System.out.println("Notas aprobadas: " + aprobados);

	}

}
