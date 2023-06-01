package cursus.javase.labs.h10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static cursus.javase.labs.h7.Gender.MALE;

class PersonTest {

    @Test
    public void testPerson() {
        Person p = new Person("Jan", 45, MALE);
        Assertions.assertEquals(p.greet(), "Hello, my name is: Jan. Nice to meet you!");

    }
}