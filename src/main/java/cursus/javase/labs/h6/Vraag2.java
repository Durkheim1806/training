package cursus.javase.labs.h6;

public class Vraag2 {
    public static void main(String[] args) {

        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        System.out.println(row[4]);
    }
}
