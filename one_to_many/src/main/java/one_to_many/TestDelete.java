package one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile m = entityManager.find(Mobile.class, 1);
		if( m != null) {
			entityTransaction.begin();
			entityManager.remove(m);
			entityTransaction.commit();
		}
		else {
			System.out.println("No record to delete");
		}
	}

}
