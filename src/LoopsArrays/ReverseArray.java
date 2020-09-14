package LoopsArrays;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ReverseArray {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);
        out.println("Input length of Array");
        int length = 0;

        if (scanner.hasNextInt()) {
            length = scanner.nextInt();
        } else System.out.println("Please enter valid number");
            int [] myArray = new int[length];
            for (int i = 0; i < myArray.length; i++) {
                out.println("Enter " + (i + 1) + " number:");
                int arrayNumber = scanner.nextInt();
                myArray[i]= arrayNumber;
            }
            out.println("Your reverse Array is:");

            for (int i=0; i<length/2; i++) {
                int temp = myArray[i];
                myArray[i] = myArray[length-1-i];
                myArray[length-1-i] = temp;


            }
        for ( int i=0; i< myArray.length; i++) {
            out.println("Array in reverse:"+ myArray[i]);
        }


    }
}
