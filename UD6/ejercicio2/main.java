package UD6ejercicio2;

public class main {

	public static void main(String[] args) {
		
		Perro perro = new Perro("Lucas");
		Gato gato = new Gato("Isidoro");
		Vaca vaca = new Vaca("Lola");
		Pajaro pajaro = new Pajaro("Paco");
		
		//Creamos un array de animales
		//Tipo[] nombre del array = nuevo Animal[numero de animales]
		Animal[] animales = new Animal[4];
		animales[0] = perro;
		animales[1] = gato;
		animales[2] = vaca;
		animales[3] = pajaro;
		
		//recorrer el array
		//for (tipo de dato / variable : array que queremos leer)
		for (Animal animal : animales) {
			//Comportamiento
			//Pasamos AnimalBase a tipo Animal
			AnimalBase animalBase = (AnimalBase)animal;
			animalBase.mostrarNombre();
			animal.hacerSonido();
			animal.comer();
			//Detecta si un animal puede volar y ejecuta su metodo
			if (animal instanceof Volador) {
				   ((Volador) animal).volar();
			}
		
		}

	}
}
