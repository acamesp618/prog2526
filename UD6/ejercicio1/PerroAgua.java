package UD6ejercicio1;

public class PerroAgua extends Animal implements Corredor, Nadador {

	@Override
	public void nadar() {
		System.out.println("Me gusta nadar");
		
	}

	@Override
	public void correr() {
		System.out.println("Me gusta correr");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Guau");
	}

	@Override
	public void moverse() {
		System.out.println("Me muevo a 4 patas");
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Soy un perro");
	}

}
