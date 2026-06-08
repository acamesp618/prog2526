package Ejemplos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploEvento {

	public static void main(String[] args) {
		Frame ventana = new Frame();
		ventana.setVisible(true);
		ventana.setSize(300, 150);
		ventana.setLayout(new FlowLayout());
		
		Button miBoton = new Button("Click aquí");
		
		ventana.add(miBoton);
		
		ActionListener escuchadorBoton = new MiListener();
		miBoton.addActionListener(new MiListener () {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Botón pulsado!");
				}
		});
	}

}
