package ejemploMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploMap {

	public static void main(String[] args) {
		Map <Integer, String> m = new HashMap<>();
		m.put(123, "Teclado" );
		m.put(265, "Monitor" );
		m.put(369, "Torre" );
		m.put(489, "Torre" ); // Puede tener mismo valor, pero nunca misma clave
		System.out.println(m); // Para ver el mapa
		System.out.println(m.get(123)); // Para ver el valor de una clave en concreto
		System.out.println(m.get(1)); // Si no está la clave, imprime nulo
		System.out.println("Recorrido for-each:");
		
		Set<Integer> claves = m.keySet();
		for(Integer k : claves) {
			System.out.println(m.get(k));
		}
	}

}
