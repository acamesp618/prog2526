package UD5ejercicio8;

public class EmpleadoFijo extends Empleado { //Extend para que herede de Empleado
	//Atributo
	private double salarioMensual;
	
	public EmpleadoFijo (String nombre, double salarioMensual) {
		super(nombre); //llamamos al constructor padre
		this.salarioMensual = salarioMensual;
	}
	
	//Metodo
	public double calcularSalario() {
		return salarioMensual;
	}

}
