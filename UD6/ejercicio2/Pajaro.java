package UD6ejercicio2;

public class Pajaro extends AnimalBase implements Animal, Volador{

	
	public Pajaro(String nombre) {
		super(nombre);
	}

	@Override
	public void volar() {
		System.out.println("Puedo volar");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Pio, pio");
	}

	@Override
	public void comer() {
		System.out.println("Comiendo alpiste...");
	}

}
