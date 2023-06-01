package cursus.javase.labs.h10;

public class Employee extends Person {
    public Employee(String n, int a) {
        super(n, a);
    }

    @Override
    public String greet() {
        return "I'm tired of working. This is inhuman!";
    }
}
