package UD6ejercicio2;

public class Vaca extends AnimalBase implements Animal{

	public Vaca(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Muuuuu");
		
	}

	@Override
	public void comer() {
		System.out.println("Comiendo hierba...");
	}
	
}
