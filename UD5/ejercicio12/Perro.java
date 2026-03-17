package UD5ejercicio12;

public class Perro extends Animal {
	
	//Constructor
	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	//Metodo
	@Override
	public void hacerSonido() {
		System.out.println("Guau!");
	}
	
	@Override
	public String moverse() {
		return "Me muevo a 4 patas";
	}
}
