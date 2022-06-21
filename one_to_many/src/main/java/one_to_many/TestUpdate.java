package one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = new Mobile();
		mobile.setId(1);
		mobile.setName("MI");
		mobile.setCost(20000.00);

		Sim sim = new Sim();
		sim.setId(2);
		sim.setProvider("VI");
		sim.setType("3G");

		entityTransaction.begin();
		entityManager.merge(mobile);
		entityManager.merge(sim);
		entityTransaction.commit();
	}

}
