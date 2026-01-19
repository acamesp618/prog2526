package ejecicio1;

public class Ciudad {

	public static void main(String[] args) {
		// Personas con constructor por defecto
		Persona pepe = new Persona();
		Persona paco = new Persona();


		// Personas con constructor con parámetros
		Persona ana = new Persona("Ana", 25, 1.65);
		Persona juan = new Persona("Juan", 30, 1.80);


		// Persona solo con nombre
		Persona maria = new Persona("María");


		// Modificar atributos mediante métodos
		ana.cumplirAnios();
		juan.crecer(0.02);


		// Imprimir personas
		System.out.println(pepe);
		System.out.println(paco);
		System.out.println(ana);
		System.out.println(juan);
		System.out.println(maria);

	}

}
