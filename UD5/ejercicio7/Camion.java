package UD5ejercicio7;

public class Camion extends Vehiculo{
	private float capacidadCarga;
	
	Camion (String marca, String modelo, int anio, float capacidadCarga){
		super(marca, modelo, anio);
		this.capacidadCarga = capacidadCarga;
	}
	
	//Metodos
		public void mostrarDetalles() {
			super.mostrarDetalles(); // Para adquirir los detalles principales de vehiculo
			System.out.println("Capacidad Carga: " + capacidadCarga); //Añadimos los nuevos detalles
		}
		
		public void mover() {
			System.out.println("Me muevo a 4 ruedas");
			
		}
}
