package cursus.javase.labs.h6;

import java.util.Arrays;
import java.util.Scanner;

public class Vraag6 {

    public static void main(String[] args) {


/*        Scanner ScanDing = new Scanner(System.in);
        System.out.println("geef 10 nummers op:");
        int input = ScanDing.nextInt();
        String inputInteger = String.valueOf(input);
*/      String inputInteger = "1234567890";
        int[] rij1 = new int[inputInteger.length()];
        int sum = 0;
        for (int i = 0; i < rij1.length; i++) {
            Character s1 = inputInteger.charAt(i);
            String s2 = Character.toString(s1);
            int cijfer = Integer.parseInt(s2);
            rij1[i] = cijfer;
            sum += cijfer;
        }

        System.out.println(Arrays.toString(rij1));
        System.out.println(sum);

    }
}
