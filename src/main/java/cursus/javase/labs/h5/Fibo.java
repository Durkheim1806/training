package cursus.javase.labs.h5;

import java.util.Arrays;

public class Fibo {

    static void run(int n){
        int[] rij = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0){
                rij[i] = 0;
            } else if (i == 1){
                rij[i] = 1;
            } else{
                rij[i] = rij[i-1] + rij[i-2];
            }
        }
        System.out.println(Arrays.toString(rij));
    }

    public static void main(String[] args) {
        run(10);
    }
}
