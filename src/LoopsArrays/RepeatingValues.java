package LoopsArrays;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class RepeatingValues {
    public static void main(String[] args) {
        int[] firstArray = {5, 4, 34, -6, 42, 34};
        int[] secondArray = {4, 8, 15, 16, 23, 42, 815};
        int [] myArray = new int[firstArray.length];
        int count = 0;

        for (int i : firstArray) {
            boolean contains = false;
            for (int j : secondArray) {
                if (i == j) {
                    contains = true;
                    break;
                }
            }
            if (contains)
            {

                myArray[count] =i;
                count++;
            }

        }
        for ( int i=0; i< count; i++) {
            out.println("The repeating values are:" + myArray[i]);
        }
    }
}