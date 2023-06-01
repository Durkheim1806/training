package cursus.inprojav;

public class Lab5 {

    public static void print(){
        System.out.println("*********************");
    }

    public static void print(String b){
        System.out.println(b);
    }

    public static void print(String b, boolean ut){
        if(ut == true) {
            System.out.println(b + "!");
        }
        else if(ut == false){
            System.out.println(b);
        }
    }

    public static void tafelVan(int grondTal){
        int herhalingen = 10;
        for (int loop = 1; loop <= herhalingen; loop++) {
            int berekend = vermenigvuldingen(loop , grondTal);
            String berekend_voor_print = String.valueOf(berekend);
            print(berekend_voor_print, true);
        }
    }

    public static int vermenigvuldingen(int g1, int g2){
        int g3 = g1 * g2;
        return g3;
    }

    public static void main(String[] args) {

        int herhalingen = 10;
        for(int loop = 1; loop <= herhalingen; loop++){
            tafelVan(loop);
        }
    }
}

