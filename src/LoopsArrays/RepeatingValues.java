package LoopsArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatingValues {
    public static void main(String[] args) {
        int[] firstArray = {5, 4, 34, -6, 42, 34};
        int[] secondArray = {4, 8, 15, 16, 23, 42, 815, 5};
        ArrayList<Integer> myArray = new ArrayList<>();


        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for (int i : firstArray) {
            boolean contains = false;
            for (int j : secondArray) {
                if (i == j) {
                    contains = true;
                    break;
                }
            }
            if (contains)
                myArray.add(i);

        }
        System.out.println(" The repeating values are:" + myArray);
    }
}
