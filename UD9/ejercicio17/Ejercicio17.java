package ejercicio17;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		try {
		// Creamos lista de contactos
		ArrayList<Persona> contactos = new ArrayList<>();
		
		contactos.add(new Persona("Adrian Campos", "Calle Cañitos", 693251124));
		contactos.add(new Persona("Fran Gomez", "Avenida de España", 632522145));
		contactos.add(new Persona("Maria Lopez", "Calle Alcantara", 696336698));
		
		//Creamos el documento XML
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documento = builder.newDocument(); // Documento en blanco
        
        // Nodo raiz
        Element raiz = documento.createElement("contactos");
        documento.appendChild(raiz);
        
        //Añadimos personas al XML
        for (Persona p : contactos) {
        	Element persona = documento.createElement("persona");
        	
        	Element nombre = documento.createElement("nombre");
        	nombre.setTextContent(p.getNombre());
        	
        	Element edad = documento.createElement("edad");
        	edad.setTextContent(String.valueOf(p.getEdad()));
        	
        	Element direccion = documento.createElement("direccion");
        }
        
        
        
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}