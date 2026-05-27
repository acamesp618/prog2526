package Ejercicio1Refuerzo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCoches {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		coche1.setColor("verde");
		
		Coche coche2 = new Coche();
		coche2.setColor("rojo");
		
		Coche coche3 = new Coche();
		coche3.setColor("negro");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
		EntityManager em = emf.createEntityManager();
		
		//Iniciar la transaccion
		em.getTransaction().begin();
		
		//Operaciones
		em.persist(coche1);
		em.persist(coche2);
		em.persist(coche3);
		
		//Finalizar la transaccion
		em.getTransaction().commit();
		
		//Cerrar conexion
		em.close();
		emf.close();
		
	}

}
