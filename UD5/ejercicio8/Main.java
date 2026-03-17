package UD5ejercicio8;

public class Main {

	public static void main(String[] args) {
		
		Empleado [] empleados = new Empleado[6];
		
		empleados[0] = new EmpleadoFijo("Luisa", 2000);
		empleados[1] = new EmpleadoPorHoras("Pedro", 80, 15);
		empleados[2] = new EmpleadoFijo("Mateo", 1500);
		empleados[3] = new EmpleadoFijo("Jose", 1700);
		empleados[4] = new EmpleadoPorHoras("Pablo", 70, 15);
		empleados[5] = new EmpleadoPorHoras("Marta", 55, 15);
		
		for (Empleado e : empleados) {
			System.out.println("Nombre: " + e.getNombre() + " - Salario: " + e.calcularSalario());
		}
	}

}
