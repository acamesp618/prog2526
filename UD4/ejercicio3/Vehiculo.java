package ejercicio3;

public class Vehiculo {
		// Atributos
		String matricula;
		String marca;
		int anioFabricacion;
		double precio;
		TipoVehiculo tipo;


		// Constructor con todos los atributos
		Vehiculo(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo) {
			this.matricula = matricula;
			this.marca = marca;
			this.anioFabricacion = anioFabricacion;
			this.precio = precio;
			this.tipo = tipo;
		}


		// Métodos
		void mostrarInformacion() {
			System.out.println("Matrícula: " + matricula);
			System.out.println("Marca: " + marca);
			System.out.println("Año fabricación: " + anioFabricacion);
			System.out.println("Precio: " + precio + " €");
			System.out.println("Tipo: " + tipo);
		}

		public boolean esAntiguo() {
		int anioActual = 2026;
		return (anioActual - anioFabricacion) > 10;
		}

		public void aplicarDescuento(double porcentaje) {
		precio = precio - (precio * porcentaje / 100);
		}
}

