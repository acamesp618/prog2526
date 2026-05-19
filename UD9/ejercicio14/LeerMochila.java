package ejercicio14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeerMochila {

	public static void main(String[] args) {

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mochila.bin"));

            ArrayList<Item> mochila = (ArrayList<Item>) ois.readObject();

            ois.close();

            double valorTotal = 0;

            System.out.println("Contenido de la mochila:");

            for (Item item : mochila) {
                System.out.println(item);
                valorTotal += item.getValor();
            }

            System.out.println("Valor total: " + valorTotal);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada.");
            e.printStackTrace();
        }
    }

}
