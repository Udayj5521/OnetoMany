package one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = new Mobile();
		mobile.setName("IPhone");
		mobile.setCost(70000.00);

		Sim sim = new Sim();
		sim.setProvider("Airtel");
		sim.setType("4g");

		Sim sim1 = new Sim();
		sim1.setProvider("JIO");
		sim1.setType("4G");

		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityTransaction.commit();

	}

}
