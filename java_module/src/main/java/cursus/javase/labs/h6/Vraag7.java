package cursus.javase.labs.h6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Vraag7 {

    static int[][] createArray(){
        Random rand = new Random();
        List<Integer> givenList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int[][] matrix = new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                int randomIndex = rand.nextInt(givenList.size());
                int numberPicked = givenList.get(randomIndex);
                matrix[i][j] = numberPicked;
                givenList.remove(randomIndex);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix1 = createArray();
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
    }
}
