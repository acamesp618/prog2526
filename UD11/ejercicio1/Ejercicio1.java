package ejercicio1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("Ejemplo AWT");
	
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setLayout(null);
		frame.setSize(300, 250); // Ancho, Alto
		frame.setVisible(true); // Por defecto es false y no se muestra
		
		// Control Salir
		Button salir = new Button("Salir");
		
		//Añade el control al contenedor
		salir.setBounds(50, 50, 50, 30);
		
		// Control Salir
		Button limpiar = new Button("Limpiar");
		limpiar.setBounds(100, 50, 50, 30);
		
		//Control Texto
		TextField texto = new TextField("Escribe algo...");
		texto.setBounds(50, 90, 100, 30);
		
		
		frame.add(salir);
		frame.add(limpiar);
		frame.add(texto);

	
		

	}
}
