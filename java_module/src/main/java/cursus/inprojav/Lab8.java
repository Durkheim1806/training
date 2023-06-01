package cursus.inprojav;

public class Lab8 {

    private static double delenDoor(double g1, double g2){
        double g3 = g1 / g2;
        return g3;
    }

    private static int delenDoor(int g1, int g2){
            int g3 = g1 / g2;
            return g3;
    }

    private static int delenDoorVerbeterd(int g1, int g2) {
        int g3 = 0;
        try {
            g3 = g1 / g2;
        } catch (ArithmeticException e){
            System.out.println("arithmetic error test derk");
        } catch (Exception e) {
            System.out.println("error test derk");
        }
        return g3;
    }

    private static void printIndexVanLijst(String[] lijst, int index){
        try {
            System.out.println(lijst[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index error test derk ");
        }

    }


    public static void main(String[] args) {

        System.out.println(delenDoorVerbeterd(10, 0));
//        System.out.println(delenDoor(10, 0));

        String[] lijst1 = {"lamp", "fiets"};

        printIndexVanLijst(lijst1, 3);
    }
}
