package FunctionsObjects;

import java.util.Scanner;

public class IncreaseArrayBy2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayAPI arrayApi = new ArrayAPI();
        // Get Array Length
        int length = arrayApi.getPositiveInput(scanner, "Array length");
        //input Array
        int[] myArray = new int[length];
        //arrayApi.arrayInput(myArray, length);
        arrayApi.arrayInputByUser(myArray, length);
        //Double Array
        DoubleArrays(myArray, length);


    }

    static void DoubleArrays(int[] arrayInp, int length)  // I can put this function to other Array functions if that would be better
    {

        for (int element : arrayInp) {

            element *= 2;
            System.out.println("Your Array Encreased by 2 is:" + element);
        }
    }
}
