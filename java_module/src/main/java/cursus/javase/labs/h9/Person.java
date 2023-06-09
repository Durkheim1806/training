package cursus.javase.labs.h9;

import cursus.javase.labs.h7.Gender;
import cursus.javase.labs.h7.PersonDiedException;

import java.util.Objects;

public class Person {
    private Gender gender;
    private String name;
    private int age;
    public static String universalRights = "All humans are created equal.";
    private static int MAXIMUM_AGE = 130;

    public Person() {
        this("Dummy");
    }

    public Person(String n) {
        setName(n);
    }

    public Person(String n, int a) {
        setName(n);
        setAge(a);
        setGender(Gender.UNKNOWN);
    }

    public Person(String n, int a, Gender g) {
        setName(n);
        setAge(a);
        setGender(g);
    }

    public void haveBirthday() {
        setAge(getAge() + 1);
    }

    public void finalize() throws Throwable {

    }

    @Override
    public String toString() {
        return this.name + "(" + this.age + ")" + " is " + this.gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && gender == person.gender && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, age);
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < MAXIMUM_AGE) {
            this.age = age;
        } else {
            throw new PersonDiedException(null, null);
        }
    }

    public int getAge() {
        return age;
    }
}
