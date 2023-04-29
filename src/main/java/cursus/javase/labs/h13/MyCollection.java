package cursus.javase.labs.h13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyCollection<T> {
    private T[] array;

    public MyCollection(Class<T> clazz) {
        array = (T[]) Array.newInstance(clazz, 4);
    }

    private int nextEmptyOfArray;

    public void add(T element) {
        if (nextEmptyOfArray >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[nextEmptyOfArray] = element;
        nextEmptyOfArray++;
    }

    public T[] getArray() {
        return array;
    }
}
