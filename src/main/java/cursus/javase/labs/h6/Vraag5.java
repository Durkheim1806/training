package cursus.javase.labs.h6;

import java.util.Arrays;

public class Vraag5 {

    static long[] run(int n) {

        if (n > 94){
            n = 94;
        }

        long[] rij = new long[n];
        for (int i = 0; i < n; i++) {
            double g1 = Math.pow((1 + Math.sqrt(5)),i);
            double g2 = Math.pow((1 - Math.sqrt(5)),i);
            double g3 = (Math.pow(2,i) * Math.sqrt(5));
            long g4 = (long)((g1 - g2) / g3);
            rij[i] = g4;
        }
        return rij;
    }

    public static void main(String[] args) {

        long[] row1 = run(10000);
        for (long n : row1){
            System.out.println(n);
        }
    }
}
