package ejercicio3;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class EjemploCardLayout {

	public static void main(String[] args) {
		Frame frame = new Frame("CardLayout");
		
		CardLayout card = new CardLayout();

        frame.setLayout(card);

        Panel p1 = new Panel();
        p1.add(new Label("Tarjeta 1"));

        Panel p2 = new Panel();
        p2.add(new Label("Tarjeta 2"));

        frame.add(p1, "uno");
        frame.add(p2, "dos");

        card.show(frame, "uno");
        
        card.next(frame); // Para cambiar de una tarjeta a otra

        frame.setSize(300, 200);
        frame.setVisible(true);
	}

}
