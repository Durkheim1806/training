package cursus.javase.labs.h13;

import cursus.javase.labs.h10.Human;

public class House<T extends Human> {

    public T human;

    @Override
    public String toString() {
        return "House{" +
                "human=" + human +
                '}';
    }
}

