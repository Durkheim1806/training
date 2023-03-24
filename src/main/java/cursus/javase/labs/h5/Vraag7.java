package cursus.javase.labs.h5;

import java.util.Arrays;

public class Vraag7 {
    static int run(int n) {

        int[] rij = new int[n];
        for (int i = 0; i < n; i++) {
            double g1 = Math.pow((1 + Math.sqrt(5)),i);
            double g2 = Math.pow((1 - Math.sqrt(5)),i);
            double g3 = (Math.pow(2,i) * Math.sqrt(5));
            int g4 = (int)((g1 - g2) / g3);
            rij[i] = g4;
        }
        System.out.println(Arrays.toString(rij));
        return rij[n-1];
    }

    public static void main(String[] args) {
        System.out.println("return is: " + run(6));
    }
}
