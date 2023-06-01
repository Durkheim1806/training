package cursus.javase.labs.h13;

import cursus.javase.labs.h10.Android;
import cursus.javase.labs.h10.Person;
import org.junit.jupiter.api.Test;

class HouseTest {

    @Test
    public void testHouse() {

        House<Person> hp = new House<>();
        House<Android> ha = new House<>();
        Person piet = new Person("Piet", 35);
        hp.setHuman(piet);
        System.out.println(hp);
//        House<String> hs = new House<>(); // deze gaat niet
    }

}