package LoopsArrays;

import java.util.ArrayList;

public class TwoDimensionalToOne {
    public static void main(String[] args) {
        int[][] bigArray = new int[3][4];
        ArrayList<Integer> myArray = new ArrayList<>();

        for (int i = 0; i < bigArray.length; i++) {
            for (int j = 0; j < bigArray[i].length; j++) {
                bigArray[i][j] = (int) (i + j + Math.random()*10);
                myArray.add(bigArray[i][j]);
            }
        }
        System.out.println(myArray);

    }
}
