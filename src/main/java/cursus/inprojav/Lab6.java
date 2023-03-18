package cursus.inprojav;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Lab6 {

    private static int berekenGemiddelde(int[] cijfers){
        int sum = 0;
        for (int loop = 0; loop < cijfers.length; loop++) {
            sum = sum + cijfers[loop];
        }
        return sum / cijfers.length;
    }

    private static int geefLaagste(int[] cijfers){
        int laagste = cijfers[0];
        for (int loop = 0; loop < cijfers.length; loop++){
            if(laagste > cijfers[loop]){
                laagste = cijfers[loop];
            }
        }
        return laagste;
    }

    private static void controleerLijstOpRange(int[] cijfers){
        int[] cijfersNietInRange = new int[cijfers.length];
        for (int loop = 0; loop < cijfers.length; loop++){
            int cijferControle = cijfers[loop];
            if(cijferControle < 10 || cijferControle > 100){
                System.out.println("cijfer met index: " + loop + " en getal: " + cijferControle + " zit niet in range");
            }
        }
    }

    private static int[] maakEenLijst(int lengte){
        int[] lijst = new int[lengte];
        for (int loop = 0; loop < lengte; loop++) {
            lijst[loop] = new Random().nextInt(10, 100);
        }
        return lijst;
    }

    public static void main(String[] args) {

/*      int[] cijfers = new int[5];
        cijfers[0] = 70;
        cijfers[1] = 5;
        cijfers[2] = 20;
        cijfers[3] = 110;
        cijfers[4] = 10;
*/
        int[] cijfers = maakEenLijst(3);

        for (int loop = 0; loop < cijfers.length; loop++) {
            System.out.println(cijfers[loop]);
        }

        System.out.println("Het gemiddelde is: " + berekenGemiddelde(cijfers));
        System.out.println("Het laagste getal is: " + geefLaagste(cijfers));
        controleerLijstOpRange(cijfers);




    }
}

