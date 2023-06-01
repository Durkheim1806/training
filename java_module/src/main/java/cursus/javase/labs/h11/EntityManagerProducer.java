package cursus.javase.labs.h11;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

@Singleton
public class EntityManagerProducer {

    @Produces
    public EntityManager em() {
        return Persistence.createEntityManagerFactory("MySQL-localhost-jpa").createEntityManager();
    }
}
