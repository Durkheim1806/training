package cursus.inprojav;

public class Lab3 {

    static public void print(String input){
        System.out.println(input + "!");
    }
    static public void printStart(){
        System.out.println("Print starten...");
        tafelVan7();

    }

    static public void printKlaar(){
        System.out.println("Print klaar");
    }

    static void tafelVan7(){
        int herhalingen = 10;
        for (int loop = 1; loop <= herhalingen; loop++) {
            System.out.println(loop * 7);
        }
    }

    public static void main(String[] args) {

        printStart();
        printKlaar();

    }
}
