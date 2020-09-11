package LoopsArrays;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ReverseArray {
    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        out.println("Input length of Array");

        if (scanner.hasNextInt()) {
            int length = scanner.nextInt();
            for (int i = 0; i < length; i++) {
                out.println("Enter " + (i + 1) + " number:");
                Integer arrayNumber = scanner.nextInt();
                myArray.add(arrayNumber);
            }
            out.println("Your reverse Array is:");

            for (int i=0; i<length/2; i++) {
                int temp = myArray.get(i);
                myArray.set(i, myArray.get(length-1-i));
                myArray.set(length-1-i, temp);


            }
            out.println(myArray);
        } else System.out.println("Please enter valid number");

    }
}
