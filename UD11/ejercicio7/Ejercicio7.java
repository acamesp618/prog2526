package ejercicio7;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio7 {

	public static void main(String[] args) {
		Frame frame = new Frame("Login");
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 180);
		frame.setVisible(true);		
		
		//Creamos usuario
		Label labelUsuario = new Label("Usuario:");
		TextField textoUsuario = new TextField(20);
		
		//Creamos contraseña
		Label labelPassword = new Label("Contraseña:");
		TextField textoPassword = new TextField(20);
		// Cuando escribes devuelve *
		textoPassword.setEchoChar('*');
		
		Button botonAceptar = new Button("Aceptar");
		Button botonBorrar = new Button("Borrar");
		Button botonSalir = new Button("Salir");
		
		ActionListener escuchadorCompartido = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == botonAceptar) {
					Dialog dialogo = new Dialog(frame, "Bienvenido", true);
					dialogo.setLayout(new FlowLayout());
					dialogo.setSize(220, 120);
					
					Label mensaje = new Label("Bienvenido " + textoUsuario.getText());
					Button cerrar = new Button("Cerrar");
					
					cerrar.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							dialogo.dispose();
						}
					});
					
					dialogo.add(mensaje);
					dialogo.add(cerrar);
					dialogo.setVisible(true);

				} else if (e.getSource() == botonBorrar) {
					textoUsuario.setText("");
					textoPassword.setText("");
					

				} else if (e.getSource() == botonSalir) {
					frame.dispose();
				}
			}
		};
		
		botonAceptar.addActionListener(escuchadorCompartido);
		botonBorrar.addActionListener(escuchadorCompartido);
		botonSalir.addActionListener(escuchadorCompartido);
		
		frame.add(labelUsuario);
		frame.add(textoUsuario);
		frame.add(labelPassword);
		frame.add(textoPassword);
		frame.add(botonAceptar);
		frame.add(botonBorrar);
		frame.add(botonSalir);
		
	}
}