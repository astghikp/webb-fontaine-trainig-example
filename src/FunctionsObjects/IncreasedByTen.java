package FunctionsObjects;

import java.util.Scanner;

public class IncreasedByTen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Get Array Length */
        int length = ArrayAPI.getPositiveInput(scanner, "Array length");
        //Get Element index
        int indexOfElement = ArrayAPI.getArrayElementIndex(scanner, length);
        //input Array
        double[] myArray = new double[length];
        //arrayApi.arrayInput(myArray, length);
        ArrayAPI.arrayInput(myArray, length);
        //Increase Array by 10%
        IncreaseArrayElementByIndex(myArray, indexOfElement);

    }

    static void IncreaseArrayElementByIndex(double[] array, int index) {
        array[index] += array[index] * 0.1;
        for (int i = 0; i < array.length; i++) {
            if (i == index)
                System.out.println("Element " + (index + 1) + " is Increased by 10%" + array[i]);
            else
                System.out.println("Your Array Element " + (i + 1) + " is: " + array[i]);
        }

    }
}
