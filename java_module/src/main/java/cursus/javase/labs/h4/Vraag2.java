package cursus.javase.labs.h4;


public class Vraag2 {

    private static int printTable(int getal){
        for (int loop = 1; loop <= 10; loop++){
            System.out.println(loop + " x " + getal + " = " + getal * loop);
        }
        if(getal < 10) {
            return printTable(++getal);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {

        printTable(1);
    }
}
