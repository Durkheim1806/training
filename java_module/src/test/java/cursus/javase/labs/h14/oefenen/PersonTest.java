package cursus.javase.labs.h14.oefenen;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class PersonTest {

    @Test
    public void testHashMap() {
        Person pers1 = new Person("Piet", 30);
        Person pers2 = new Person("Piet", 30);

        Map<Person, String> map1 = new HashMap<>();
        map1.put(pers1, "1");
        map1.put(pers2, "2");

        Map<String, Person> map2 = new HashMap<>();
        map2.put("1", pers1);
        map2.put("2", pers2);

//        Set<Person> set1 = new HashSet<>();
//        set1.add(pers1);
//        set1.add(pers2);

        System.out.println(map1.size());
        System.out.println(map2.size());

    }

}