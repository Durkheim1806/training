package cursus.inprojav;

public class Lab7 {

    private static String geefKortsteNaam(String[] lijst){
        String kortsteNaam = lijst[0];
        for(int loop = 0; loop < lijst.length; loop++){
            if(lijst[loop].length() < kortsteNaam.length()){
                kortsteNaam = lijst[loop];
            }
        }
        return kortsteNaam;
    }

    public static void main(String[] args) {

        String[] naamCollegas = new String[4];
        naamCollegas[0] = "Corne";
        naamCollegas[1] = "Sander";
        naamCollegas[2] = "Leon";
        naamCollegas[3] = "Daniel";

        System.out.println(geefKortsteNaam(naamCollegas));

    }


}
