package cursus.javase.labs.h7;

import org.junit.jupiter.api.Test;

public class TestPerson {

    @Test
    static void testPerson() {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday(); // person gets one year older
        System.out.println(p.getAge());
        System.out.println(Person.universalRights);
        p.setAge(131);
    }

    public static void main(String[] args) {
        testPerson();
    }
}
