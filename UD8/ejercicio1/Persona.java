package ejercicio1;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	// Añadimos método equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass()!= obj.getClass()) return false;
		
		Persona otra = (Persona) obj;
		return nombre.equals(otra.nombre)
		// para comparar dos personas con nombre y apellido igual
		//&& apellido.equals(otra.apellido)
		;
	}
	
	// Añadimos el toString para que al devolver la persona, no imprima la referencia
	@Override
	public String toString() {
		return nombre + " " + apellido + " - " + edad;
	}
	
	// Metodo para comparar Personas
	@Override
	public int compareTo(Object o) {
		// String p1 = ;
		// String p2 = ;
		
		//p1.compareTo(p2)
		return this.getNombre().compareTo(((Persona)o).getNombre());
	}
	
	// hashCode
	@Override
	public int hashCode() {
		return nombre.hashCode();
	}
	
	

	

	
	
	
}