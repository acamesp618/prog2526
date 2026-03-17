package UD5ejercicio2;

public class Persona {
	// Atributos
	private String nombre;
	private int edad;
	private double estatura;


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
	
	// Getter y Setter para nombre
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Getter y Setter para edad
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad=edad;
		}
	}
	
	// Getter y Setter para estatura
	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
}
