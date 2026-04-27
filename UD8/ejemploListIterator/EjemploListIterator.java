package ejemploListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploListIterator {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("c");
		l.add("b");
		
		ListIterator<String> lit = l.listIterator();
		// Recorro hacia delante (el iterador se queda al final)
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		// Recorro hacia atrás, ya que el iterador está al final
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}

}
