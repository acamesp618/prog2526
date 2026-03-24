package UD6ejercicio1;

public class Pajaro extends Animal implements Volador {

	@Override
	public void volar() {
		System.out.println("Me gusta volar");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Pio, pio");
	}

	@Override
	public void moverse() {
		System.out.println("Me muevo volando");
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Soy un pajaro");
	}

}
