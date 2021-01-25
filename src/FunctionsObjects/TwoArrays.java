package FunctionsObjects;

import java.util.Scanner;

public class TwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get Arrays Length
        int length1 = ArrayAPI.getPositiveInput(scanner, "First Array length");
        int length2 = ArrayAPI.getPositiveInput(scanner, "Array length");
        //input Arrays
        int[] myArray1 = new int[length1];
        int[] myArray2 = new int[length2];
        //Array for Merged Arrays
        int[] mergedArray = new int[length2 + length1];
        //arrayApi.arrayInput(myArray, length);
        ArrayAPI.arrayInputByUser(myArray1, length1);
        ArrayAPI.arrayInputByUser(myArray2, length2);
        //Merge Arrays to one
        mergeArrays(myArray1, myArray2, mergedArray, length1, length2);
        // Arrays Arithmetic Mean
        arithmeticMean(myArray1, myArray2, length1, length2);


    }

    static void mergeArrays(int[] array1, int[] array2, int[] mergedArray, int lengthFirst, int lengthSecond) {


        for (int i = 0; i < lengthFirst; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = lengthFirst; i < lengthFirst + lengthSecond; i++) {
            mergedArray[i] = array2[i - lengthFirst];

                    }

        ArrayAPI.arrayPrintOut(mergedArray, "Merged");

    }

    static void arithmeticMean(int[] array1, int[] array2, int lengthFirst, int lengthSecond) {
        double counter = 0;
        for (int element : array1) {
            counter += element;
        }
        for (int element : array2) {
            counter += element;
        }
        System.out.println("Arrays Arithmetical Mean is: " + counter / (lengthFirst + lengthSecond));
    }
}
