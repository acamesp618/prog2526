package Ejemplos;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class EjemploMenu {

	public static void main(String[] args) {
		Frame ventana = new Frame();
		ventana.setVisible(true);
		ventana.setSize(800, 600);
		
		MenuBar barra = new MenuBar();
		Menu menu = new Menu("Fichero");
		MenuItem abrir = new MenuItem("Abrir");
		MenuItem salir = new MenuItem("Salir");
		
		menu.add(abrir);
		menu.add(salir);
		barra.add(menu);
		ventana.setMenuBar(barra);
		
	}

}
