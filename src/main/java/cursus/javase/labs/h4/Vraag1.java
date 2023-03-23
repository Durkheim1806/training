package cursus.javase.labs.h4;

import java.util.Scanner;

public class Vraag1 {

    public static boolean elevenProof(String reknr) throws IllegalArgumentException{
        boolean geldig = false;
        int sum = 0;
        int factor = 9;
        for (int loop = 0; loop < reknr.length(); loop++){
            int reknrloop = Character.getNumericValue(reknr.charAt(loop));
            sum += (reknrloop * factor);
            factor--;
        }

        try{
        if (sum % 11 == 0){
            geldig = true;
        } else {
            throw new IllegalArgumentException("test derk exception");
        }} catch (IllegalArgumentException e){
            System.out.println(e);
            }
        return geldig;
    }

    public static void main(String[] args) {

/*
        boolean geldig2 = elevenProof("736160221");
        boolean geldig3 = elevenProof("123456789");
        boolean geldig4 = elevenProof("123456788");

        System.out.println(geldig2);
        System.out.println(geldig3);
        System.out.println(geldig4);
*/
        String reknr;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wat is het rekening nummer?");
        reknr = scan.next();
        System.out.println("rekening nummer is geldig: " + elevenProof(reknr));
    }
}
