package ejercicio4;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ejercicio4.EventoMusical.GeneroMusical;


public class Main {

	public static void main(String[] args) {
		EventoMusical conciertoEstopa = new EventoMusical("Puro Latino", 
				new Date(2026, 7, 12), new BigDecimal (10000), GeneroMusical.POP);
		
		EventoMusical conciertoBisbal = new EventoMusical("David Bisbal", 
				new Date(2026, 11, 2), new BigDecimal (125000), GeneroMusical.POP);
		
		EventoMusical conciertoBadBunny = new EventoMusical("Bad Bunny", 
				new Date(2026, 8, 21), new BigDecimal (2530000), GeneroMusical.POP);
		
		Artista estopa = new Artista();
		estopa.setNombre("Estopa");
		estopa.setPais("España");
		conciertoEstopa.agregarArtista(estopa);
		
		//Abrir conexión
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
		EntityManager em = emf.createEntityManager();
		
		//Iniciatros la transaccion
		em.getTransaction().begin();
		
		//Operaciones
		em.persist(conciertoEstopa);
		
		//Finalizar la transaccion: salvar la información
		em.getTransaction().commit();
		
		//Cerramos conexion
		em.close();
		emf.close();
		
		
	}

}
