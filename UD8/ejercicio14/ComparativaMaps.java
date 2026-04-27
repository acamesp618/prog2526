package ejercicio14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ComparativaMaps {

	public static void main(String[] args) {
		//Creacion de las estructuras
		Map<String, Integer> aleatorio = new HashMap<>();
		
		Map<String, Integer> insercion = new LinkedHashMap<>();
		
		Map<String, Integer> alfabetico = new TreeMap<>();
		
		//Carga de datos
		aleatorio.put("Zoe", 85);
		aleatorio.put("Bernat", 92);
		aleatorio.put("Ana", 78);
		aleatorio.put("Mario", 88);
		
		insercion.put("Zoe", 85);
		insercion.put("Bernat", 92);
		insercion.put("Ana", 78);
		insercion.put("Mario", 88);
		
		alfabetico.put("Zoe", 85);
		alfabetico.put("Bernat", 92);
		alfabetico.put("Ana", 78);
		alfabetico.put("Mario", 88);
		
		//Ejecucion
		mostrarMapa(aleatorio, "HashMap (Aleatorio)");
		mostrarMapa(insercion, "LinkedHashMap (Inserción)");
		mostrarMapa(alfabetico, "TreeMap (Alfabético)");

	}
	
	public static void mostrarMapa(Map<String, Integer> mapa, String tipo) {
        System.out.println("\n" + tipo + ":");

        Iterator<Map.Entry<String, Integer>> it = mapa.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
	
	}
	
	//RESPUESTAS PREGUNTAS
	//HashMap: No respeta el orden, los nombres salen en orden aleatorio
	//LinkedHashMap: Sí respeta el orden de inserción.
	//TreeMap: Ordena las claves alfabéticamente
	//Caso práctico: TreeMap, porque mantiene los datos ordenados automáticamente por nombre.
}

