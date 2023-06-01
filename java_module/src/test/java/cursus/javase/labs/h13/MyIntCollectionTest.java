package cursus.javase.labs.h13;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MyIntCollectionTest {

    @Test
    public void testMyIntCollection() {
        MyIntCollection col = new MyIntCollection();
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);
        col.add(5);
        col.add(6);
        col.add(7);
        col.add(8);
        col.add(9);
        System.out.println(Arrays.toString(col.getArray()));
    }

}