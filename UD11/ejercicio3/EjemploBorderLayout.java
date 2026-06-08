package ejercicio3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class EjemploBorderLayout {

	public static void main(String[] args) {
		Frame frame = new Frame("BorderLayout");
		
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setSize(300, 250); // Ancho, Alto
		frame.setVisible(true); // Por defecto es false y no se muestra
		
		frame.setLayout(new BorderLayout());
		
		Button boton1 = new Button("Arriba");
		Button boton2 = new Button("Abajo");
		Button boton3 = new Button("Derecha");
		Button boton4 = new Button("Izquierda");
		Button boton5 = new Button("Centro");
		
		frame.add(boton1, BorderLayout.NORTH); // La posicion se indica al hacer add
		frame.add(boton2, BorderLayout.SOUTH);
		frame.add(boton3, BorderLayout.EAST);
		frame.add(boton4, BorderLayout.WEST);
		frame.add(boton5, BorderLayout.CENTER);
		
	}

}
