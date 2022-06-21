package one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

public class TestGetAll {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT s FROM Sim s";

		javax.persistence.Query query = entityManager.createQuery(sql);

		List<Sim> sims = query.getResultList();

		for (Sim sim : sims) {
			System.out.println("Sim Id is : "+sim.getId());
			System.out.println("Sim Provider is : "+sim.getProvider());
			System.out.println("Sim Type is : "+sim.getType());
			System.out.println("-------------");
		}
	}

}
