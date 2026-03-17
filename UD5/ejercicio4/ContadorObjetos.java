package UD5ejercicio4;

class ContadorObjetos {
	static int totalObjetos = 0;
	
	//Constructor
	public ContadorObjetos() {
		totalObjetos += 1;
	}
	
	
	//Métodos
	static void mostrarTotalObjetos() {
		System.out.println("El numero total de objetos creados es: " + totalObjetos);
	}

	
}
