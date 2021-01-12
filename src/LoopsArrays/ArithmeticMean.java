package LoopsArrays;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner arraySizeInput = new Scanner(in);

        int arraySize = 0;
        out.println("Input Integer number");
        if (arraySizeInput.hasNextInt()) {
            arraySize = arraySizeInput.nextInt();
        } else out.println("Number that you inputted is not Integer");
        double[] array = new double[arraySize];
        double countAll = 0;
        out.println("Your Array is:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * array.length;
            countAll += array[i];
            out.println(array[i]);

        }
        double arithmeticMean = countAll / array.length;
        out.println("Arithmetic Mean is =" + arithmeticMean);

    }
}
