package cursus.javase.labs.h14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection<T> implements Collection<T>, Iterable<T> {

    private T[] array;

    public MyCollection(Class<T> clazz, int capacity) {
        array = (T[]) Array.newInstance(clazz, capacity);
    }

    private int nextEmptyOfArray;


    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size() && array[currentIndex] != null;
            }

            @Override
            public T next() {
                return array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;

    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size());
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < size())
            // Make a new array of a's runtime type, but my contents:
            return (T1[]) Arrays.copyOf(array, size(), a.getClass());
        System.arraycopy(array, 0, a, 0, size());
        if (a.length > size())
            a[size()] = null;
        return a;
    }

    public boolean add(T element) {
        if (nextEmptyOfArray >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[nextEmptyOfArray] = element;
        nextEmptyOfArray++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        T[] new_array = Arrays.copyOf(array, (size() - 1)); // this is ugly, but for now I don't know another way to make a copy of the array with size - 1
        for (int i = 0, k = 0; i < size(); i++) {
            if (!(array[i] == o)) {
                new_array[k] = array[i];
                k++;
            }
        }
        array = new_array;
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public T[] getArray() {
        return array;
    }
}
