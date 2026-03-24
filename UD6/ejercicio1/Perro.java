package UD6ejercicio1;

public class Perro extends Animal implements Corredor{

	@Override
	public void correr() {
		System.out.println("Corre a 4 patas");
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
