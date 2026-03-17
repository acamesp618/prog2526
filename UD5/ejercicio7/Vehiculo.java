package UD5ejercicio7;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	
	//Constructor
	public Vehiculo(String marca, String modelo, int anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	//Creamos un vehiculo generico
	Vehiculo (){
		
	}
	
	//Getter y Setter de la marca
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

	//Getter y Setter del modelo 
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Getter y Setter del año
	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	//Metodos
	public void mostrarDetalles() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + anio);
	}
	
	public void mover() {
		
	}
	
	
}
