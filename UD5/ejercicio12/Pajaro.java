package UD5ejercicio12;

public class Pajaro extends Animal {
	
	//Constructor
	public Pajaro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	//Metodo
	@Override
	public void hacerSonido() {
		System.out.println("Pio Pio!");
	}
	
	@Override
	public String moverse() {
		return "Me muevo volando";
	}
}
