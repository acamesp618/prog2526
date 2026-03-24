package UD6ejercicio2;

public class Gato extends AnimalBase implements Animal{

	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Miau");
		
	}

	@Override
	public void comer() {
		System.out.println("Comiendo pienso de gato...");
		
	}

}
