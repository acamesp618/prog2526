package ejercicio4;

import java.util.ArrayList;

public class ejercicio4 {

	public static void main(String[] args) {

        // Array de entrada (Strings)
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // Crear ArrayList de Double
        ArrayList<Double> notas = new ArrayList<>();

        // Conversión (Parsing) y añadir a la lista
        for (String notaTexto : notasEntrada) {
            Double nota = Double.parseDouble(notaTexto); // o Double.valueOf(notaTexto)
            notas.add(nota);
        }

        // Mostrar notas convertidas
        System.out.println("Lista de notas: " + notas);

        // 3. Cálculo de la media
        double suma = 0.0;

        for (Double nota : notas) {
            suma += nota; // aquí ocurre el unboxing automáticamente
        }

        double media = suma / notas.size();
        System.out.println("Nota media: " + media);

        // 4. Filtrado de aprobados
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
