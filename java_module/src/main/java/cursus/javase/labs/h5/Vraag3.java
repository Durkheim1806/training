package cursus.javase.labs.h5;

public class Vraag3 {

    static int factorial( int input){
        if (input < 1){
            return 1;
        }
        return input * factorial(input -1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
