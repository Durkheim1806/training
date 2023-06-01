package cursus.inprojav;

public class Lab4 {


    static public void print(String input, boolean uitroepteken){
        if(uitroepteken == true) {
            System.out.println(input + "!");
        }
        else if(uitroepteken == false){
            System.out.println(input);
        }
    }
    static public void printStart(){
        print("Print starten...", true);
        tafelVan7();

    }

    static public void printKlaar(){
        print("Print klaar", false);
    }

    static void tafelVan7(){
        int herhalingen = 10;
        for (int loop = 1; loop <= herhalingen; loop++) {
            print(String.valueOf(loop * 7), true);
        }
    }

    public static void main(String[] args) {

        printStart();
        printKlaar();

    }

}
