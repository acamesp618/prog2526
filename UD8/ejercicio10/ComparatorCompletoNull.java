package ejercicio10;

import java.util.Comparator;

import ejercicio1.Persona;

public class ComparatorCompletoNull implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        String a1 = p1.getApellido();
        String a2 = p2.getApellido();

        // Personas sin apellido primero
        if (a1 == null && a2 != null) return -1;
        if (a1 != null && a2 == null) return 1;
        if (a1 == null && a2 == null) return 0;

        int res = a1.compareTo(a2);

        if (res == 0) {
            res = p1.getNombre().compareTo(p2.getNombre());
        }

        if (res == 0) {
            res = Integer.compare(p1.getEdad(), p2.getEdad());
        }

        return res;
    }
}