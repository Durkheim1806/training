package cursus.javase.labs.h10;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.jboss.weld.environment.se.Weld;

import static cursus.javase.labs.h7.Gender.MALE;

@Slf4j
@Singleton
public class PersonApp {

    @Inject
    private PersonDAO dao;

    public static void main(String[] args) {

        try (SeContainer container = Weld.newInstance().initialize()) {
            PersonApp app = container.select(PersonApp.class).get();
            app.run();
        }

        /*EntityManagerFactory mySqlLocalhost = Persistence.createEntityManagerFactory("MySQL-localhost-jpa");
        EntityManager em = mySqlLocalhost.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        Person sjaak = new Person("Sjaak", 20, MALE);
        transaction.begin();
        em.persist(sjaak);
        transaction.commit();
        mySqlLocalhost.close();*/
    }

    private void run() {
        Person jan = new Person("Jan", 20, MALE);
        dao.insert(jan);

        Person p = dao.select(1);
        log.info(p.toString());
    }

}
