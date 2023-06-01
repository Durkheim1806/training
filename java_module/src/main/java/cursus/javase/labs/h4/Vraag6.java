package cursus.javase.labs.h4;

import java.util.Scanner;

public class Vraag6 {

    static void hourglass(int n) throws EvenNumberException {
        if (n % 2 != 0) {
            String[][] matrix = new String[n][n];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0) {
                        System.out.print("*");
                    } else if (i == n) {
                        System.out.print("*");
                    } else if (i == j) {
                        System.out.print("*");
                    } else if (i + j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            throw new EvenNumberException("Het nummer is even.");
        }
    }


    public static void main(String[] args) {
        boolean klaar = false;
        while (klaar == false) {
            try {
                Scanner ScanDing = new Scanner(System.in);
                System.out.println("Geef een nummer: ");
                int input = ScanDing.nextInt();
                hourglass(input);
                klaar = true;
            } catch (EvenNumberException e) {
                System.out.println(e);
            }
        }
    }
}
