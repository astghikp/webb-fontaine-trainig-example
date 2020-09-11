package LoopsArrays;

import java.util.Arrays;

public class TwoArraysDifference {
    public static void main(String[] args) {
        int[] firstArray = {5, 4, 34, -6, 12, 34};
        int[] secondArray = {4, 8, 15, 16, 23, 42, 815};


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
            if (!contains)
                System.out.println(" First Arrays doesn't contain number: " + i);
        }

    }
}
