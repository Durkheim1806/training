package cursus.javase.labs.h14;

import java.util.*;

public class PersonProgram {

    public static void main(String[] args) {
        Person p1 = new Person("Piet", 10);
        Person p2 = new Person("Anna", 20);
        Person p3 = new Person("Anna", 20);
        Person p4 = new Person("Fred", 30);


        Set<Person> set1 = new HashSet<>();
        set1.add(p1);
        set1.add(p2);
        set1.add(p3);
        System.out.println(set1.size());
        System.out.println(set1.toArray()[0]);
        System.out.println(set1.toArray()[1]);

        Set<Person> set2 = new TreeSet<>();
        set2.add(p2);
        set2.add(p1);
        set2.add(p3);
        System.out.println(set2.toArray()[0]);
        System.out.println(set2.toArray()[1]);

        Map<String, Person> map1 = new TreeMap<>();
        map1.put("1", p1);
        map1.put("2", p2);
        map1.put("3", p3);
        map1.put("4", p4);
        System.out.println(map1.get("4"));
    }
}
