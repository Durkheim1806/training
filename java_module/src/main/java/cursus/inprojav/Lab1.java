package cursus.inprojav;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        double salaris = 3105.00;
        double indexatie = 1.0842;
        double nieuw_salaris = salaris * indexatie;
        double afgerond_nieuw_salaris = (double) Math.round(nieuw_salaris * 100) / 100;
        System.out.println("nieuw salaris: " + afgerond_nieuw_salaris);

        double gas_verbruik = 1459;
        double stroom_verbruik = 3448;
        double gas_prijs_vast = 2.37;
        double stroom_prijs_vast = 24.49;
        double stroom_prijs_variabel = 24.49;
        String contract;
        double maand_bedrag = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("heb je een vast of variabel contract?");
        contract = scan.next();
        System.out.println("contract: " + contract);

        if (contract.equals("vast")) {
            maand_bedrag = 19.44 + 24.49;
        } else if (contract.equals("variabel")) {
            maand_bedrag = stroom_verbruik * stroom_prijs_vast;
        } else {
            System.out.println("error");
        }


        System.out.println((double) Math.round(maand_bedrag * 100) / 100);
    }
}
