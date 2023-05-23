package cursus.javase.labs.h11;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.jboss.weld.environment.se.Weld;

import java.util.List;

import static cursus.javase.labs.h7.Gender.FEMALE;

@Slf4j
@Singleton
public class PersonApp {

    @Inject
    private PersonDAO personDAO;

    @Inject
    private AdDAO addDAO;

    public static void main(String[] args) {

        try (SeContainer container = Weld.newInstance().initialize()) {
            PersonApp app = container.select(PersonApp.class).get();
            app.run();
        }
    }

    private void run() {
        Person anna = new Person("Anna", 30, FEMALE);
        personDAO.insert(anna);

        Ad kiteboard = new Ad("kite board");
        Ad north_kite = new Ad("north kite");
        kiteboard.setOwner(anna);
        north_kite.setOwner(anna);
        addDAO.insert(kiteboard);
        addDAO.insert(north_kite);

        Person person1 = personDAO.select(2);
        List<Person> personList = personDAO.findAll();
//        log.info(person1.toString());
        log.info(personList.toString());

    }
}

