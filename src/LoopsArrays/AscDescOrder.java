package LoopsArrays;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AscDescOrder {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        out.println("Input length of Array");

        if (scanner.hasNextInt()) {
            int length = scanner.nextInt();
            for (int i = 0; i < length; i++) {
                out.println("Enter " + (i + 1) + " number:\n");
                Integer arrayNumber = scanner.nextInt();
                myArray.add(arrayNumber);
            }

            for (int j = 0; j < length - 1; j++) {
                for (int i = j + 1; i < length; i++) {
                    if (myArray.get(j) > myArray.get(i)) {
                        int element = myArray.get(j);
                        myArray.set(j, myArray.get(i));
                        myArray.set(i, element);

                    }
                }
            }
            out.println("Array in ascending order:" + myArray);
            out.println("Array in descending order: ");
            for (int j = length - 1; j >= 0; j--) {
                out.println(myArray.get(j));
            }

        } else System.out.println("Please enter valid number");
    }
}

