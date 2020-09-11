package LoopsArrays;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CountElement {
    public static void main(String[] args) {


        int[] myArray = {4, 8, 15, 16, 23, 42, 815, 5, 42, 42, 42};
        HashMap<Integer, Integer> count_map = new HashMap<>(); // googled again :)
        for (int value : myArray) {
            if (count_map.get(value) != null) {
                int counter = count_map.get(value);
                count_map.put(value, counter + 1);
            } else {
                count_map.put(value, 1);
            }
        }
        out.println("Input number");
        Scanner scanner = new Scanner(in);
        if (scanner.hasNextInt()) {
            int k = scanner.nextInt();
            boolean hasKElement = false;
            for (int i : count_map.keySet())   //google again
            {
                if (k > 0 && count_map.get(i) == k) {
                    out.println("Elements that appears " + k + "times is:" + i);
                    hasKElement = true;
                }

            }
            if (!hasKElement) out.println("There's not element in massive for " + k + " times");
        } else out.println("Enter valid number");


    }
}
