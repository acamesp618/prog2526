package ejercicio2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;


public class EventoMusical implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private Date fecha;
	private BigDecimal recaudacion;
	private GeneroMusical genero;
	private List<Artista> artistas;
	
	public enum GeneroMusical {
		POP, JAZZ, ROCK
	}
	
	
	public EventoMusical() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(BigDecimal recaudacion) {
		this.recaudacion = recaudacion;
	}	
	
	public void agregarArtista(Artista artista) {
		artistas.add(artista);
	}

}