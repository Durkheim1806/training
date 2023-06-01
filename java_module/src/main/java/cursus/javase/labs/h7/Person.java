package cursus.javase.labs.h7;

public class Person {

    private Gender gender;
    private String name;
    private int age;
    public static String universalRights = "All humans are created equal.";

    private static int MAXIMUM_AGE = 130;

    public Person(String n, int a){
        setName(n);
        setAge(a);
        setGender(Gender.UNKNOWN);
    }
    public void haveBirthday(){
        setAge(getAge() + 1);
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
        if (age < MAXIMUM_AGE){
        this.age = age;
        } else{
            throw new PersonDiedException(null, null);
        }
    }

    public int getAge() {
        return age;
    }
}
