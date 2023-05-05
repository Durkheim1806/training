package cursus.javase.labs.h11;

import cursus.javase.labs.h10.Person;
import cursus.javase.labs.h10.PersonDAO;
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
    }

    private void run() {
        Person anna = new Person("Anna", 30, MALE);
        dao.insert(anna);

        Person p = dao.select(1);
        log.info(p.toString());
    }
}

