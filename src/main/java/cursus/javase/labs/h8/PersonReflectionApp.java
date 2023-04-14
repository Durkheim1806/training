package cursus.javase.labs.h8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflectionApp {

    public static void printFieldsWithReflection() {
        Class<Person> p = Person.class;
        for (Field f : p.getDeclaredFields()) {
            System.out.println(f.getName());
        }
    }

    public static void printMethodsWithReflection() {
        Class<Person> p = Person.class;
        for (Method m : p.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
    }

    public static void main(String[] args) {
        printFieldsWithReflection();
        printMethodsWithReflection();
    }

}
