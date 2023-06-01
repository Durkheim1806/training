package cursus.javase.labs.h10;

import cursus.javase.labs.h12.MyAnnotation;

public class Android extends Human implements Chargable {

    private int level = 0;

    @Override
    public String greet() {
        return "I'm only half human, but human still.... My energy level is " + level + "%";
    }

    @Override
    public int charge(int amount) {
        int newAmount = getLevel() + amount;
        setLevel(newAmount);
        return newAmount;
    }

    @MyAnnotation
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (this.level + level <= 100) {
            this.level = level;
        } else {
            throw new RuntimeException("The charge is rejected.");
        }
    }
}
