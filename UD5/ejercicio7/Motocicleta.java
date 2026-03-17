package UD5ejercicio7;

public class Motocicleta extends Vehiculo {
	private boolean tieneSidecar;
	
	
	Motocicleta (String marca, String modelo, int anio, boolean tieneSidecar) {
		super(marca, modelo, anio); // Para adquirir los atributos 
		this.tieneSidecar = tieneSidecar;
	}
	
	Motocicleta (){
		
	}
	
	//Metodos
	public void mostrarDetalles() {
		super.mostrarDetalles(); // Para adquirir los detalles principales de vehiculo
		System.out.println("Sidecar: " + tieneSidecar);
	}
	
	public void mover() {
		System.out.println("Me muevo a 2 ruedas");
		
	}
	
}
