package ejercicio10;

import java.util.Comparator;

import ejercicio1.Persona;

public class ComparatorApellido implements Comparator<Persona>{

	@Override
    public int compare(Persona p1, Persona p2) {
        return p1.getApellido().compareTo(p2.getApellido());
    }

}
