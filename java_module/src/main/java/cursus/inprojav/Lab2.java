package cursus.inprojav;

public class Lab2 {

    public static void main(String[] args) {

        System.out.println("loop1: ");
        int iteratie = 1;
        while(iteratie <= 10){
            System.out.println(iteratie * 7);
            iteratie++;
        }

        System.out.println("loop2: ");
        int herhalingen = 10;
        for (int loop = 1; loop <= herhalingen; loop++) {
            System.out.println(loop * 7);
        }

        System.out.println("loop3: ");
        int herhalingen2 = 10;
        for (int loop = 1; loop <= herhalingen2; loop++) {
            System.out.println(loop * 8);
        }
    }
}
