package LoopsArrays;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DeletArrayElement {
    public static void main(String[] args) {
        ArrayList<Integer> Array = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        out.println("Input length of Array");

        if (scanner.hasNextInt()) {
            int length = scanner.nextInt();
            for (int i = 0; i < length; i++) {
                out.println("Enter " + (i + 1) + " number:");
                if (scanner.hasNextInt()) {
                    Integer arrayNumber = scanner.nextInt();
                    Array.add(arrayNumber);
                } else {
                    out.println("Please enter valid number");
                    return;
                }
            }
            out.println("Input index of element to be deleted:");
            if (scanner.hasNextInt()) {
                int index = scanner.nextInt();
                if (index > 0 && index < length - 1) {
                    out.println("Your array is:");
                    for (int j = 0; j < length; j++) {
                        if (j != index - 1)
                            out.println(Array.get(j));
                    }
                } else System.out.println("Please enter index less than array length and > 0");
            } else System.out.println("Please enter valid number");

        } else System.out.println("Please enter valid number");
    }
}
