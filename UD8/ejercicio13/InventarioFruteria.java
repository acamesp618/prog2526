package ejercicio13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class InventarioFruteria {

	public static void main(String[] args) {
		// Creacion del mapa
		Map <String, Integer> frutas = new HashMap<>();
		
		// Carga de datos
		frutas.put("Plátanos", 32);
		frutas.put("Naranjas", 15);
		frutas.put("Melones", 26);
		frutas.put("Manzanas", 88);
		
		//Operaciones Básicas
		//Consulta
		System.out.println("Cantidad de naranjas: " + frutas.get("Naranjas"));
		
		//Actualización
		frutas.put("Manzanas", 100);
		
		//Verificacion
		if (frutas.containsKey("Mangos")) {
		} else {
			System.out.println("Producto no encontrado");
		}
		
		//Recorrido final
		Set<String> claves = frutas.keySet();
		for(String k : claves) {
			System.out.println("Clave: " + k + ", Valor: " + frutas.get(k));
		}
		
		//Recorrido con iterador
		Iterator<String> it = frutas.keySet().iterator();
		while (it.hasNext()) {
			String clave = it.next();
			System.out.println(clave + ": " + frutas.get(clave));
		}
		
		//PREGUNTAS DE REFLEXION
		//1. Se sobrescribe el valor anterior, porque en un HashMap las claves son unicas
		//2. Sí se puede usar int como clave (Java usa Integer), pero no es práctico para identificar fruttas
		//3. Porque el Map permite búsquedas directas (más rapidas), mientras que una ArrayList requiere recorrer todos los elementos
	}

}
