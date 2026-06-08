package ejercicio4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ejercicio4 {

    public static void main(String[] args) {

        Frame frame = new Frame("Ascensor");

        frame.setSize(200, 200);
        frame.setLayout(new GridLayout(2, 2));

        frame.add(new Button("4"));
        frame.add(new Button("3"));
        frame.add(new Button("2"));
        frame.add(new Button("1"));

        frame.setVisible(true);
    }
}