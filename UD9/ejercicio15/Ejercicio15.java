package ejercicio15;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Ejercicio15 {

	public static void main(String[] args) {
		try {
            // 1. Crear la factoría y el constructor de documentos
           File file = new File("config.xml");
           DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
           DocumentBuilder builder = factory.newDocumentBuilder();
           
            // 2. Parsear el archivo XML
           Document documento = builder.parse(file);
           System.out.println("Documento parseado!");

            // Opcional pero recomendado: Normaliza el árbol XML
            documento.getDocumentElement().normalize();

            // 3. Obtener el elemento raíz (<configuracion>)
            Element raiz = documento.getDocumentElement();
            
            System.out.println("Elemento raíz: " + raiz.getNodeName());
            
            // 4. Obtener los hijos de <base-datos>
            NodeList listaBaseDatos = raiz.getElementsByTagName("base-datos");
            
            // Tomamos el primero
            Node nodoBaseDatos = listaBaseDatos.item(0);
            System.out.println(nodoBaseDatos.getChildNodes());
            
            // 5. Vamos a ver sus hijos directos
            NodeList hijos = nodoBaseDatos.getChildNodes();

            System.out.println("\nNúmero de hijos detectados: " + hijos.getLength());
            
            System.out.println("--- Listando hijos ---");
           
            // Mostrar todos los nodos
            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);
                
                // Solo elementos reales
                if (hijo.getNodeType() == Node.ELEMENT_NODE) {

                    Element elemento = (Element) hijo;

                    System.out.println(
                            "Hijo " + i
                            + " -> Tipo: " + hijo.getNodeType()
                            + " | Nombre: " + hijo.getNodeName()
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
