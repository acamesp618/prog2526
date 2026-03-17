package UD5ejercicio11;

public class Libro {
	//Atributos
	private String titulo;
	private String autor;
	private String isbn;
	private int anioPublicacion;
	
	//Constructor
	public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
	}
	
	// Getter y Setter para acceder a los atributos al ser privados
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	
	//Metodos
	@Override // Saber que vamos a sobreescribir
	public String toString() { //Nos devuelve representacion de cadenas de la clase
		return "Título: [" + titulo + "], Autor: [" + autor + "], ISBN: [" + isbn + "], Año: [" + anioPublicacion + "]"; 
		//Al estar dentro del paquete podemos usar el propio atributo
	}
	
	@Override
	//Compara el isbn de un libro con otro
	public boolean equals(Object obj) {
		return this.isbn == ((Libro)obj).isbn;
	}
}
