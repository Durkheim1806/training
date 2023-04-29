package cursus.javase.labs.h13;

import java.util.Arrays;

public class MyIntCollection {

    private int[] array = new int[4];

    private int nextEmptyOfArray;

    public void add(int number) {
        if (nextEmptyOfArray >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[nextEmptyOfArray] = number;
        nextEmptyOfArray++;
    }

    public int[] getArray() {
        return array;
    }
}
