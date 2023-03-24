package cursus.javase.labs.h6;

import java.util.Arrays;

public class Vraag4 {

    static void multiply(long[] input, int multiplier){
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i] * multiplier;
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args) {

        long[] row = {3,5,3,1};
        System.out.println(Arrays.toString(row));
        multiply(row, 3);
    }
}
