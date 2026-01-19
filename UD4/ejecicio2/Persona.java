package ejecicio2;

public class Persona {
	// Atributos
	String nombre;
	int edad;
	double estatura;
	Sexo sexo;

	//Constructores
	Persona() {
	this("anónimo", 18, 1.70, Sexo.NO_BINARIO);
	}

	Persona(String nombre, int edad, double estatura, Sexo sexo) {
	this.nombre = nombre;
	this.edad = edad;
	this.estatura = estatura;
	this.sexo = sexo;
	}

	Persona(String nombre) {
	this(nombre, 18, 1.70, Sexo.NO_BINARIO);
	}

}
