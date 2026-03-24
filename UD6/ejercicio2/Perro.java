package UD6ejercicio2;

public class Perro extends AnimalBase implements Animal{

	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Guau");
		
	}

	@Override
	public void comer() {
		System.out.println("Comiendo pienso de perro...");
		
	}
	
}
