package ejecicio1;

public class Persona {
	// Atributos
	String nombre;
	String apellido;
	int edad;
	double estatura;


	// Constructor por defecto
	Persona() {
	this.nombre = "anónimo";
	this.edad = 18;
	this.estatura = 1.70;
	}


	// Constructor con todos los parámetros
	Persona(String nombre, int edad, double estatura) {
	this.nombre = nombre;
	this.edad = edad;
	this.estatura = estatura;
	}


	// Constructor solo con nombre
	Persona(String nombre) {
	this(nombre, 18, 1.70);
	}
	
	//Constructor con apellido y dia de la semana
	Persona(String nombre, String apellido, int edad, double estatura) {
		this(nombre + apellido, edad, estatura);
		this.apellido = apellido;
	}


	// Métodos
	void saludar() {
		System.out.println("Hola, mi nombre es" + nombre);
	}
	
	void cumplirAnios() {
		edad = edad + 1;
	}
	
	void crecer(double incremento) {
		estatura = estatura + incremento;
	}
	
	void cambiarNombre (String nuevoNombre) {
		nombre = nuevoNombre;
	}
}
