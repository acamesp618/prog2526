package UD5ejercicio7;

public class Coche extends Vehiculo {
	private int numPuertas;
	
	Coche (String marca, String modelo, int anio, int numPuertas) {
		super(marca, modelo, anio); // Para adquirir los atributos 
		this.numPuertas = numPuertas;
	}
	
	//Metodos
	public void mostrarDetalles() {
		super.mostrarDetalles(); // Para adquirir los detalles principales de vehiculo
		System.out.println("Nº puertas: " + numPuertas); //Añadimos los nuevos detalles
	}
	
	public void mover() {
		System.out.println("Me muevo a 4 ruedas");
		
	}
}
