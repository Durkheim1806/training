package cursus.javase.labs.h10;

import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Singleton
public class PersonDAO {


    public void insert(Person person) {

        EntityManagerFactory mySqlLocalhost = Persistence.createEntityManagerFactory("MySQL-localhost-jpa");
        EntityManager em = mySqlLocalhost.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(person);
        transaction.commit();

        mySqlLocalhost.close();
    }

    public Person select(int id) {
        EntityManagerFactory mySqlLocalhost = Persistence.createEntityManagerFactory("MySQL-localhost-jpa");
        EntityManager em = mySqlLocalhost.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Person p = em.find(Person.class, id);
        transaction.commit();

        mySqlLocalhost.close();

        return p;
    }

}
