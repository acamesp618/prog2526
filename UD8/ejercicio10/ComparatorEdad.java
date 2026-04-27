package ejercicio10;

import java.util.Comparator;

import ejercicio1.Persona;

public class ComparatorEdad implements Comparator<Persona> {
	
	
	@Override
	public int compare(Persona p1, Persona p2) {
		if (p1.getEdad() == p2.getEdad())
			return 0;
		if (p1.getEdad() > p2.getEdad())
			return 1;
		else
			return -1;
	
		//Simplificado
		//@Override
		//public int compare(Persona p1, Persona p2) {
		    //return Integer.compare(p1.getEdad(), p2.getEdad());
		//}
	}

}
