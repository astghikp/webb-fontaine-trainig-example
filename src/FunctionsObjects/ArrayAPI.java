package FunctionsObjects;

import java.util.Scanner;

public class ArrayAPI {

// Check next positive input

    public static int getPositiveInput(Scanner scanner, String message) {
        System.out.println("Please enter positive Number for " + message);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter positive int number");
            scanner.next();
        }
        int input = scanner.nextInt();
        while (input <= 0) {
            System.out.println("Please enter positive int number");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter positive int number");
                scanner.next();

            }
            input = scanner.nextInt();
        }

        return input;
    }


    // input Array Method by Random
    public static void arrayInput(int[] arrayInp, int length) {
        for (int i = 0; i < arrayInp.length; i++) {
            arrayInp[i] = (int) (Math.random() * 100);

        }
        arrayPrintOut(arrayInp, "Random");

    }

    public static void arrayInput(double[] arrayInp, int length) {
        for (int i = 0; i < arrayInp.length; i++) {
            arrayInp[i] = Math.random() * 10;

        }
        for (double element : arrayInp) {
            System.out.println("Your Double Array is: " + element);
        }

    }

    //Input Array ByUser
    public static void arrayInputByUser(int[] arrayInp, int length) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayInp.length; i++) {
            int arrayElement = getPositiveInput(scanner, "array");
            arrayInp[i] = arrayElement;

        }
        arrayPrintOut(arrayInp, "Inputted");

    }

    public static void arrayPrintOut(int[] array, String message) {
        for (int element : array) {
            System.out.println("Your" + message + " Array is: " + element);
        }
    }

    public static int getArrayElementIndex(Scanner scanner, int length) {
        System.out.println("Please enter positive Number Less than Array length");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter positive int number");
            scanner.next();
        }
        int input = scanner.nextInt();
        while (input <= 0 && input <= length) {
            System.out.println("Please enter positive int number");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter positive int number");
                scanner.next();

            }
            input = scanner.nextInt();
        }

        return (input - 1);
    }

}
