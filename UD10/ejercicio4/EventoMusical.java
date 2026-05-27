package ejercicio4;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity
public class EventoMusical implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "SecuenciaDe10en10", strategy = GenerationType.SEQUENCE)
	//Secuencia de 10 en 10
	@SequenceGenerator(name = "SecuenciaDe10en10", allocationSize = 10)
	private Long id;
	private String nombre;
	private Date fecha;
	private BigDecimal recaudacion;
	private GeneroMusical genero;
	private List<Artista> artistasConfirmados;
	@Transient
	private int control;
	
	public enum GeneroMusical {
		POP, JAZZ, ROCK
	}
	
	
	public EventoMusical() {
		
	}
	
	public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion, GeneroMusical genero) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
		this.genero = genero;
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
	
	
	public GeneroMusical getGenero() {
		return genero;
	}

	public void setGenero(GeneroMusical genero) {
		this.genero = genero;
	}

	public BigDecimal getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(BigDecimal recaudacion) {
		this.recaudacion = recaudacion;
	}	
	
	public void agregarArtista(Artista artista) {
		artistasConfirmados.add(artista);
	}

}