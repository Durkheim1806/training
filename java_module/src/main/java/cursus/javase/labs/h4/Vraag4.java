package cursus.javase.labs.h4;

public class Vraag4 {

    static void hourglass(int n) {
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
            System.out.println("Het nummer is even");
        }
    }

    public static void main(String[] args) {
        hourglass(21);
    }
}
