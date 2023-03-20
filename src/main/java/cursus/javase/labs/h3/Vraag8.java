package cursus.javase.labs.h3;

public class Vraag8 {

    public static void main(String[] args) {

        int overflow = 2147483647 + 1;
        long geenOverflow = (long)(2147483647) + 1;
        System.out.println(overflow);
        System.out.println(geenOverflow);
    }
}
