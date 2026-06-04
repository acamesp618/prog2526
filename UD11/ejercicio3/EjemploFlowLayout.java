package ejercicio3;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class EjemploFlowLayout {

	public static void main(String[] args) {
Frame frame = new Frame("FlowLayout");
		
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setSize(300, 250); // Ancho, Alto
		frame.setVisible(true); // Por defecto es false y no se muestra
		
		frame.setLayout(new FlowLayout());
		
		Button boton1 = new Button("Hola");
		Button boton2 = new Button("Hola2");
		Button boton3 = new Button("Hola3");
		Button boton4 = new Button("Hola4");
		
		frame.add(boton1);
		frame.add(boton2);
		frame.add(boton3);
		frame.add(boton4);

	}

}
