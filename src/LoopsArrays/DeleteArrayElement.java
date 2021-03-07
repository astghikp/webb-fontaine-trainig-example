package LoopsArrays;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DeleteArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("Input length of Array");
        int length = 0;
        if (scanner.hasNextInt()) {
            length = scanner.nextInt();
        } else {
            out.println("Please enter valid number");
        }
        int[] myArray = new int[length];
        out.println("Input array");
        for (int i = 0; i < myArray.length; i++) {
            out.println("Enter " + (i + 1) + " number:\n");
            while (!scanner.hasNextInt()) {
                out.println("Please enter valid number");
                scanner.next();
            }
            myArray[i] = scanner.nextInt();
        }

        out.println("Input index of element to be deleted:");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            if (index > 0 && index - 1 < myArray.length) {

                for (int j = index - 1; j < myArray.length; j++) {
                    if (j != myArray.length - 1) {
                        myArray[j] = myArray[j + 1];
                    } else myArray[j] = 0;

                }

            } else System.out.println("Please enter index less than array length and > 0");
        } else System.out.println("Please enter valid number");
        out.println("Your array is:");
        for (int i = 0; i < myArray.length - 1; i++) {
            out.println(myArray[i]);
        }

    }
}
