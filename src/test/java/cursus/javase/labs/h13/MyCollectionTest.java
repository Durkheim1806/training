package cursus.javase.labs.h13;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MyCollectionTest {

    @Test
    public void testMyCollection() {
        MyCollection<Integer> col1 = new MyCollection<>(Integer.class);
        col1.add(1);
        col1.add(2);
        col1.add(3);
        col1.add(4);
        col1.add(5);
        System.out.println(Arrays.toString(col1.getArray()));

        MyCollection<String> col2 = new MyCollection<>(String.class);
        col2.add("een");
        col2.add("twee");
        col2.add("drie");
        col2.add("vier");
        col2.add("vijf");
        System.out.println(Arrays.toString(col2.getArray()));
    }

}