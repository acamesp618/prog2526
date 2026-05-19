package ejercicio14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Mochila {

	public static void main(String[] args) {

        ArrayList<Item> mochila = new ArrayList<>();

        mochila.add(new Item("Espada", 3.5, 150));
        mochila.add(new Item("Poción", 0.5, 50));
        mochila.add(new Item("Escudo", 5.0, 200));
        mochila.add(new Item("Mapa", 0.2, 20));
        mochila.add(new Item("Anillo", 0.1, 500));

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("mochila.bin"));

            oos.writeObject(mochila);

            oos.close();

            System.out.println("Mochila guardada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
            e.printStackTrace();
        }
    }

}
