package UD5ejercicio8;

public class EmpleadoPorHoras extends Empleado{ //Extend para que herede de Empleado
	private int horasTrabajadas;
	private double precioHora;
	
	//Constructor con parámetro
	public EmpleadoPorHoras (String nombre, int horasTrabajadas, double precioHora) {
		super(nombre); //llamamos al constructor padre
		this.horasTrabajadas = horasTrabajadas;
		this.precioHora = precioHora;
	}
	
	public double calcularSalario() {
		return horasTrabajadas * precioHora;
	}
	
}
