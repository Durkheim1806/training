package cursus.javase.labs.h11;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

@Dependent
public class PersonDAO {

    private EntityManager em;

    @Inject
    public PersonDAO(EntityManager em) {
        this.em = em;
    }

    public void insert(Person person) {

        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(person);
            transaction.commit();
        } catch (Exception e) {

        }


    }

    public Person select(int id) {
//        EntityManagerFactory mySqlLocalhost = Persistence.createEntityManagerFactory("MySQL-localhost-jpa");
//        EntityManager em = mySqlLocalhost.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Person p = em.find(Person.class, id);
        transaction.commit();

//        mySqlLocalhost.close();

        return p;
    }

}
