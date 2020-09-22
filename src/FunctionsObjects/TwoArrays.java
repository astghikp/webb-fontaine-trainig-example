package FunctionsObjects;

import java.util.Scanner;

public class TwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayAPI arrayApi1 = new ArrayAPI();
        ArrayAPI arrayApi2 = new ArrayAPI();
        // Get Arrays Length
        int length1 = arrayApi1.getPositiveInput(scanner, "First Array length");
        int length2 = arrayApi2.getPositiveInput(scanner, "Array length");
        //input Arrays
        int[] myArray1 = new int[length1];
        int[] myArray2 = new int[length2];
        //Array for Merged Arrays
        int[] mergedArray = new int[length2 + length1];
        //arrayApi.arrayInput(myArray, length);
        arrayApi1.arrayInputByUser(myArray1, length1);
        arrayApi2.arrayInputByUser(myArray2, length2);
        //Merge Arrays to one
        MergeArrays(myArray1, myArray2, mergedArray, length1, length2);
        // Arrays Arithmetic Mean
        ArithmeticMean(myArray1, myArray2, length1, length2);


    }

    static void MergeArrays(int[] array1, int[] array2, int[] mergedArray, int lengthFirst, int lengthSecond) {


        for (int i = 0; i < lengthFirst; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = lengthFirst; i < lengthFirst + lengthSecond; i++) {
            mergedArray[i] = array2[i - lengthFirst];

                    }
        ArrayAPI element = new ArrayAPI();
        element.arrayPrintOut(mergedArray, "Merged");

    }

    static void ArithmeticMean(int[] array1, int[] array2, int lengthFirst, int lengthSecond) {
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
