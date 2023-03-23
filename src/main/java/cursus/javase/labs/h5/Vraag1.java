package cursus.javase.labs.h5;

public class Vraag1 {

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


    public static void main(String[] args) {
        System.out.println(greatest(1,2));
    }
}
