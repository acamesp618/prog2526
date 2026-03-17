package UD5ejercicio12;

public class Main {

	public static void main(String[] args) {
		
		Animal perro = new Perro ("Lucas", 5);
		perro.mostrarInformacion();
		perro.hacerSonido();
		perro.moverse();
		
		Animal gato = new Gato ("Rodolfo", 7);
		gato.mostrarInformacion();
		gato.hacerSonido();
		gato.moverse();
		
		Animal pajaro = new Pajaro ("Paco", 2);
		pajaro.mostrarInformacion();
		pajaro.hacerSonido();
		pajaro.moverse();

	}

}
