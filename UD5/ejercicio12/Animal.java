package UD5ejercicio12;

public abstract class Animal {
	//Atributos
	protected String nombre;
	protected int edad;
	
	
	//Constructor
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Metodos
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	//El método hacerSonido es abstract para la clase Animal
	//No sabemos qué sonido hace al no ser ningún animal específico
	public abstract void hacerSonido();
	
	//El método moverse es abstract para la clase Animal
	//No sabemos cómo se mueve al no ser ningún animal específico
	public abstract String moverse();
}
