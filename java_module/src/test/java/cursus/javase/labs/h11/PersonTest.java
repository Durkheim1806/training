package cursus.javase.labs.h11;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    public void testPerson() {
        Person p = new Person("Kees", 45);
        p.addHistory("eerste record");
        p.addHistory("tweede");
        p.printHistory();
        System.out.println(p.createSubHuman().greet());
    }

}