package cursus.javase.labs.h5;

public class Vraag2 {

    static int greatest(int a, int b){
        int c = 0;
        if(a > b){
            return a;
        } else if (b > a){
            return b;
        } else {
            return 0;
        }
    }

    static int greatest(int[] lijst){
        int biggest = lijst[0];
        for(int loop = 0; loop < lijst.length; loop++){
            if (biggest < lijst[loop]){
                biggest = lijst[loop];
            }
        }
        return biggest;
    }

    public static void main(String[] args) {
        int lijst1[] = {3, 5, 1, 15};
        System.out.println(greatest(1,2));
        System.out.println(greatest(lijst1));

    }
}
