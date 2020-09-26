package LoopsArrays;

import static java.lang.System.out;

public class TwoDimensionalToOne {
    public static void main(String[] args) {
        int[][] bigArray = new int[3][4];
        int fullLength = bigArray.length * bigArray[0].length;
        int[] myArray = new int[fullLength];
        int counter = 0;
        for (int i = 0; i < bigArray.length; i++) {
            for (int j = 0; j < bigArray[i].length; j++) {
                bigArray[i][j] = (int) (i + j + Math.random() * 10);
                out.println(bigArray[i][j]);
                myArray[counter] = bigArray[i][j];
                counter++;
            }
        }
        out.println("Two dimensional Array in one:");
        for (int arrElement : myArray) {
            out.println(arrElement);
        }
    }
}
