package cursus.javase.labs.h8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static cursus.javase.labs.h7.Gender.MALE;

class PersonTest {
    @Test
    static void testPerson() {
        Person p = new Person("Jan", 45, MALE);
        Assertions.assertEquals(p, "Jan (45) is MALE");
    }

}