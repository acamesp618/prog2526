package UD5ejercicio12;

public class Gato extends Animal{
	
	//Constructor
	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}
		
	//Metodo
	@Override
	public void hacerSonido() {
		System.out.println("Miau!");
	}
	
	@Override
	public String moverse() {
		return "Me muevo a 4 patas";
	}
}
