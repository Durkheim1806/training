package cursus.inprojav;

public class Lab9 {

    public static void main(String[] args) {

        String naam = "Roald";
        naam = naam.concat(" Dahl");
        System.out.println(naam);
        boolean spaties = naam.contains(" ");
        System.out.println(spaties);
        boolean eindigtMetSpatie = naam.endsWith(" ");
        System.out.println(eindigtMetSpatie);
        boolean komtOvereenMetRoaldDahl = naam.equals("Roald Dahl");
        System.out.println(komtOvereenMetRoaldDahl);
        boolean komtOvereenMetrOaldDAHL = naam.equalsIgnoreCase("roald dahl");
        System.out.println(komtOvereenMetrOaldDAHL);
        int i = 4;
    }
}
