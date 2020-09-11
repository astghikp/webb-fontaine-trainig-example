package LoopsArrays;

import static java.lang.System.out;

public class ArithmeticMean {
    public static void main(String[] args) {
        double[] array = new double[10];
        double countAll = 0;
        out.println("Your Array is:\n");
        for (int i = 0; i < 10; i++) {
            array[i] = Math.random() * 10;
            countAll += array[i];
            out.println(array[i]);

        }
        double arithmeticMean = countAll / 10;
        out.println("Arithmetic Mean is =" + arithmeticMean);

    }
}
