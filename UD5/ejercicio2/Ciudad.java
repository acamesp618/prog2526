package UD5ejercicio2;

public class Ciudad {

	public static void main(String[] args) {
		
		Persona juan = new Persona("Juan", 30, 1.80);
		//juan.nombre = "Juana";
		juan.setNombre("Juana");
		
		System.out.println(juan.getNombre());
		
		juan.setEdad(-1);
		System.out.println(juan.getEdad());
	}
}	