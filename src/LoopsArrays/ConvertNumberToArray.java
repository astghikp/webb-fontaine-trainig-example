package LoopsArrays;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ConvertNumberToArray {    // I decided to leave this one as it was with ArrayList cause there will not be logical changes
    public static void main(String[] args) {
        ArrayList<Integer> Array = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        out.println("Input number to be Converted:");

        int i = 0;
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            while (number > 0) {
                int convert = number % 10;
                Array.add(convert);

                i++;
                number = number / 10;
            }
            out.println("Your Array is:\n");

            for (int j = i - 1; j >= 0; j--) {
                out.println(Array.get(j));
            }
        } else out.println("Please enter valid number");
    }
}
