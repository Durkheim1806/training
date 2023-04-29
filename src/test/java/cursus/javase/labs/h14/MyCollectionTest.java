package cursus.javase.labs.h14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MyCollectionTest {

    @Test
    public void testCollectionImplementationMethods() {
        MyCollection col1 = new MyCollection(String.class, 4);
        col1.add("twee");
        col1.add("drie");
        Assertions.assertTrue(col1.contains("twee"));
        System.out.println(col1.contains("vier"));

        MyCollection col2 = new MyCollection(Person.class, 4);
        Person p1 = new Person("Piet", 40);
        col2.add(p1);
        Person p2 = new Person("Anna", 50);
        col2.add(p2);
        Assertions.assertTrue(col2.contains(p2));

        for (Object person : col2) {
            System.out.println(person);
        }

        System.out.println(Arrays.toString(col2.toArray()));

        Person p3 = new Person("Fred", 60);
        Person p4 = new Person("Bella", 70);
        col2.add(p3);
        col2.add(p4);
        System.out.println(Arrays.toString(col2.toArray()));
        col2.remove(p3);
        System.out.println(Arrays.toString(col2.toArray()));
    }

}