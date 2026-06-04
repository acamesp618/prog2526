package ejercicio2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 {

	public static void main(String[] args) {
		Frame frame = new Frame("Ejercicio 2");
		
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setLayout(null);
		frame.setSize(300, 250); // Ancho, Alto
		frame.setVisible(true); // Por defecto es false y no se muestra
		
		// Control Salir
		Button salir = new Button("Salir");
		salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((Frame)salir.getParent()).dispose();
			}
		});
		
		//Añade el control al contenedor
		salir.setBounds(130, 50, 50, 30);
		
		// Control Salir
		Button limpiar = new Button("Limpiar");
		limpiar.setBounds(50, 200, 50, 30);
		
		
		frame.add(salir);
		frame.add(limpiar);
	}

}
