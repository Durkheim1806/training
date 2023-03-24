package cursus.javase.labs.h5;

import java.util.Arrays;

public class Vraag9 {
    static long run(int n) {

        long[] rij = new long[n];
        for (int i = 0; i < n; i++) {
            double g1 = Math.pow((1 + Math.sqrt(5)),i);
            double g2 = Math.pow((1 - Math.sqrt(5)),i);
            double g3 = (Math.pow(2,i) * Math.sqrt(5));
            long g4 = (long)((g1 - g2) / g3);
            rij[i] = g4;
        }
        System.out.println(Arrays.toString(rij));
        return (long)rij[n-1];
    }

    static double goldenRatio(int g1){
        long g2 = run(g1);
        long g3 = run((g1-1));
        double g4 = (double)g2 / (double)g3;
        return g4;
    }

    public static void main(String[] args) {
        System.out.println(goldenRatio(45));
        System.out.println(goldenRatio(46));
        System.out.println(goldenRatio(47));
        System.out.println(goldenRatio(48));
        System.out.println(goldenRatio(49));

    }
}
