package UD6ejercicio2;

public abstract class AnimalBase implements Animal {
	
	protected String nombre;
	
	public AnimalBase(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarNombre() {
		System.out.println("Nombre: " + nombre);
	}
}
