package cursus.javase.labs.h5;

import java.util.Arrays;

public class Vraag5 {

    static void run(int n){
        run(1,n);
    }

    static void runMath(int n) {
        int[] rij = new int[n];
        for (int i = 0; i < n; i++) {
            double g1 = Math.pow((1 + Math.sqrt(5)),i);
            double g2 = Math.pow((1 - Math.sqrt(5)),i);
            double g3 = (Math.pow(2,i) * Math.sqrt(5));
            int g4 = (int)((g1 - g2) / g3);
           rij[i] = g4;
        }
        System.out.println(Arrays.toString(rij));
    }

    static int runMathN(int n) {
            double g1 = Math.pow((1 + Math.sqrt(5)),n);
            double g2 = Math.pow((1 - Math.sqrt(5)),n);
            double g3 = (int)(Math.pow(2,n) * Math.sqrt(5));
            int g4 = (int)((g1 - g2) / g3);
            return g4;
    }

    static void run(int start, int n) {
        int[] rij = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0){
                rij[i] = start;
            } else if (i == 1){
                rij[i] = start;
            } else{
                rij[i] = rij[i-1] + rij[i-2];
            }
        }
        System.out.println(Arrays.toString(rij));
    }



    public static void main(String[] args) {
        run(10);
        run(4, 6);
        runMath(25);
        System.out.println(runMathN(6));
    }

}
