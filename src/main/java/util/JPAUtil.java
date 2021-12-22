package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("megaSenaPU");
	
	public static EntityManager criandoEM() {
		return factory.createEntityManager();
	}

}
