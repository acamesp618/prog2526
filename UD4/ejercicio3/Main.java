package ejercicio3;

public class Main {
	public static void main(String[] args) {

		// Crear vehículos
		Vehiculo v1 = new Vehiculo("1234ABC", "Toyota", 2010, 8000, TipoVehiculo.TURISMO);
		Vehiculo v2 = new Vehiculo("5678DEF", "Yamaha", 2018, 4500, TipoVehiculo.MOTOCICLETA);
		Vehiculo v3 = new Vehiculo("9999GHI", "Volvo", 2005, 15000, TipoVehiculo.CAMION);


		// Mostrar información inicial
		v1.mostrarInformacion();
		v2.mostrarInformacion();
		v3.mostrarInformacion();


		// Comprobar si son antiguos
		System.out.println("¿v1 es antiguo? " + v1.esAntiguo());
		System.out.println("¿v2 es antiguo? " + v2.esAntiguo());
		System.out.println("¿v3 es antiguo? " + v3.esAntiguo());


		// Demostrar referencias
		Vehiculo copia = v1;
		copia.aplicarDescuento(10);


		// Mostrar información tras descuento
		System.out.println("Después de aplicar descuento:");
		v1.mostrarInformacion();
		v2.aplicarDescuento(5);
		v3.aplicarDescuento(15);
		v2.mostrarInformacion();
		v3.mostrarInformacion();
		}
}
