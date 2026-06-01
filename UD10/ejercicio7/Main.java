package ejercicio7;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ejercicio7.EventoMusical.GeneroMusical;


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
		
		/*
		// EJERCICIO 6
		em.getTransaction().begin();
		
		//Modificar el primer evento usando el identificador
		EventoMusical evento1 = em.find(EventoMusical.class, 1L);

		if (evento1 != null) {
		    evento1.setNombre(evento1.getNombre().toUpperCase());
		}
		
		//Modificar el segundo evento con JPQL estática
		Query query = em.createNamedQuery("EventoMusical.actualizarNombre");

		query.setParameter("nuevoNombre", "DAVID BISBAL");
		query.setParameter("nombreActual", "David Bisbal");

		query.executeUpdate();
		
		//Modificar el segundo evento con JPQL dinamica
		Query query = em.createQuery(
			    "UPDATE EventoMusical e SET e.nombre = :nuevoNombre WHERE e.nombre = :nombreActual"
			);

			query.setParameter("nuevoNombre", "BAD BUNNY");
			query.setParameter("nombreActual", "Bad Bunny");

			query.executeUpdate();
	
		em.getTransaction().commit();
		
		*/
		//ACTIVIDAD 7
		// Iniciar transacción
		em.getTransaction().begin();

		// Buscar el evento original
		EventoMusical original = em.find(EventoMusical.class, 1L);

		if (original != null) {

		    // Crear copia
		    EventoMusical copia = new EventoMusical(
		            original.getNombre(),
		            original.getFecha(),
		            original.getRecaudacion(),
		            original.getGenero());

		    // Guardar la copia (obtendrá un nuevo ID)
		    em.persist(copia);

		    // Eliminar el original
		    em.remove(original);
		}
		
		// Guardar cambios
		em.getTransaction().commit();
		
		//Eliminar con JPQL estática
		em.getTransaction().begin();

		Query query = em.createNamedQuery("EventoMusical.eliminarPorNombre");

		query.setParameter("nombre", "DAVID BISBAL");

		query.executeUpdate();

		em.getTransaction().commit();
		
		//Eliminar con JPQL dinámica
		em.getTransaction().begin();

		Query query = em.createQuery(
		    "DELETE FROM EventoMusical e WHERE e.nombre = :nombre"
		);

		query.setParameter("nombre", "BAD BUNNY");

		query.executeUpdate();

		em.getTransaction().commit();
		
		// ---------
		
	
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