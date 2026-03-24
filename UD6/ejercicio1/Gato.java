package UD6ejercicio1;

public class Gato extends Animal implements Corredor{
	
	@Override
	public void correr() {
		System.out.println("Me gusta correr");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Miau");
		
	}

	@Override
	public void moverse() {
		System.out.println("Me muevo a 4 patas");
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Soy un gato");
		
	}
}
