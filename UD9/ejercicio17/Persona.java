package ejercicio17;
import java.io.Serializable;
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private int edad;
	private String direccion;
	private int telefono;
	
	public Persona(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) throws IllegalArgumentException{
		if (edad  < 0) {
			throw new IllegalArgumentException("La edad debe de ser mayor o igual a 0");
		}
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
    public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
    public String toString() {
        return "Persona{nombre: '" + nombre + "', edad: " + edad + "}";
    }

}
