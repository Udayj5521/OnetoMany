package one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGet {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 10);
		if (mobile != null) {
			List<Sim> sims = mobile.getSim();
			System.out.println(mobile.getName());
			System.out.println(mobile.getCost());
			System.out.println("------------------");
			for (Sim sim : sims) {
				System.out.println(sim.getId());
				System.out.println(sim.getProvider());
				System.out.println(sim.getType());
			}
		} else {
			System.out.println("No Data is exist");
		}
	}

}
