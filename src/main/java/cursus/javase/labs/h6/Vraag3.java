package cursus.javase.labs.h6;

import java.util.Arrays;

public class Vraag3 {

    static long[] doubleSizeArray(long[] input){
        long[] newArray = new long[input.length * 2];
        for (int i = 0; i < input.length; i++) {
            newArray[i] = input[i];
        }
        return newArray;
    }

    public static void main(String[] args) {

        long[] row = {3,5,3,1};
        System.out.println(Arrays.toString(row));
        long[] row2 = doubleSizeArray(row);
        System.out.println(Arrays.toString(row2));
    }
}
