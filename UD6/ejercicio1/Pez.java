package UD6ejercicio1;

public class Pez extends Animal implements Nadador{

	@Override
	public void nadar() {
		System.out.println("Me gusta nadar");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Glup, glup");
	}

	@Override
	public void moverse() {
		System.out.println("Me muevo nadando");
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Soy un pez");
	}

}
