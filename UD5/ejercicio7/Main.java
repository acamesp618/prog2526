package UD5ejercicio7;

public class Main {
	public static void main (String [] args) {
		Vehiculo v = new Vehiculo("Seat", "600", 2000);
		v.mostrarDetalles();
		
		Coche c = new Coche("Seat", "2345", 2018, 5);
		c.mostrarDetalles();
		c.mover();
		
		Motocicleta m = new Motocicleta();
		m.mover();
			
	}
}	
	

