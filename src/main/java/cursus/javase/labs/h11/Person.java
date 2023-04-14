package cursus.javase.labs.h11;

import cursus.javase.labs.h7.Gender;
import cursus.javase.labs.h7.PersonDiedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person extends Human {

    private Gender gender;
    private String name;
    private int age;
    public static String universalRights = "All humans are created equal.";
    private static int MAXIMUM_AGE = 130;

    private List<HistoryRecord> listHistoryRecords = new ArrayList<>();

    private int counter = 0;

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

    private class HistoryRecord {
        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "HistoryRecord{" +
                    "description='" + description + '\'' +
                    '}';
        }

        String description;
    }

    public void addHistory(String descr) {
        HistoryRecord newRecord = new HistoryRecord(descr);
        listHistoryRecords.add(counter, newRecord);
        counter++;
    }

    public void printHistory() {
        for (HistoryRecord HistoryRecords : listHistoryRecords) {
            System.out.println(HistoryRecords);
        }
    }

    @Override
    public String greet() {
        return "Hello, my name is: " + name + ". Nice to meet you!";
    }

    public Human createSubHuman() {
        Human subHuman = new Human() {
            @Override
            public String greet() {
                return "Sub is the best";
            }
        };
        return subHuman;
    }

    public void haveBirthday() {
        setAge(getAge() + 1);
    }


    @Override
    public String toString() {
        return this.name + "(" + this.age + ")" + " is " + this.gender;
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

    public List<HistoryRecord> getListHistoryRecords() {
        return listHistoryRecords;
    }
}
