package ejercicio3;

import java.math.BigDecimal;
import java.sql.Date;

import ejercicio3.EventoMusical.GeneroMusical;


public class Main {

	public static void main(String[] args) {
		EventoMusical conciertoEstopa = new EventoMusical("Puro Latino", 
				new Date(2026, 7, 12), new BigDecimal (10000), GeneroMusical.POP);
		
		Artista estopa = new Artista();
		estopa.setNombre("Estopa");
		estopa.setPais("España");
		conciertoEstopa.agregarArtista(estopa);

	}

}
