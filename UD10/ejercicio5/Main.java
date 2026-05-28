package ejercicio5;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ejercicio5.EventoMusical.GeneroMusical;


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
		
		Artista bisbal = new Artista();
		bisbal.setNombre("David Bisbal");
		bisbal.setPais("España");
		conciertoBisbal.agregarArtista(bisbal);
		
		Artista badBunny = new Artista();
		badBunny.setNombre("Bad Bunny");
		badBunny.setPais("España");
		conciertoBadBunny.agregarArtista(badBunny);
		
		//Abrir conexión
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
		EntityManager em = emf.createEntityManager();
		
		//Iniciatros la transaccion
		//em.getTransaction().begin();
		
		//Operaciones
		//em.persist(conciertoEstopa);
		//em.persist(conciertoBisbal);
		
		//Finalizar la transaccion: salvar la información
		//em.getTransaction().commit();
		
		//ACTIVIDAD 5
		//Imprime primer evento utilizando el identificador
		EventoMusical evento1 = em.find(EventoMusical.class, 1);
		System.out.println(evento1.getNombre());
		
		//Consulta Estatica
		Query query = em.createNamedQuery("EventoMusical.buscarPorNombre");
		
		//Consulta Dinámica
		Query query2 = em.createQuery("SELECT e FROM EventoMusical e WHERE e.nombre = :nombre");
		
		//Ejecucion
		List<EventoMusical> lista = query.getResultList();
		// ---------
		
		//Cerramos conexion
		em.close();
		emf.close();
		
		
		
		
	}

}
