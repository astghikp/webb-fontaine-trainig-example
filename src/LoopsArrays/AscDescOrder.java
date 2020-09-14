package LoopsArrays;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AscDescOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int arraySize = 0;

        out.println("Input length of Array");
        if (scanner.hasNextInt()) {
            arraySize = scanner.nextInt();

        } else out.println("Please enter valid number");
        int [] myArray = new int [arraySize];
        out.println("Input array");
            for (int i = 0; i < myArray.length; i++) {
                out.println("Enter " + (i + 1) + " number:\n");
                while (!scanner.hasNextInt()) {
                    out.println("Please enter valid number");
                    scanner.next();
                }
                myArray[i] = scanner.nextInt();
            }

            for (int i = 0; i < myArray.length - 1; i++) {
                for (int j = i + 1; j < myArray.length; j++) {
                    if (myArray[i] > myArray[j]) {
                        int element = myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = element;


                    }
                }
            }
            for ( int arrElement: myArray) {
                out.println("Array in ascending order:" + arrElement);
            }
            out.println("Array in descending order: ");
            for (int j = myArray.length - 1; j >= 0; j--) {
                out.println(myArray[j]);
            }


    }
}

