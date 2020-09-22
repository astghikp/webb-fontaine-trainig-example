package FunctionsObjects;

import java.util.Scanner;

public class FindFibonacciElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input Number index
        int number = getCorrectInput(scanner);
        // Get number
        int numberByIndex = findElement(number);
        System.out.println("Fibonacci number By Index = " + numberByIndex);


    }

    static int getCorrectInput(Scanner scanner) {
        System.out.println("Please enter positive Number for Fibonacci element");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter positive number");
            scanner.next();
        }
        int input = scanner.nextInt();
        while (input <= 0) {
            System.out.println("Please enter positive  number");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter positive number");
                scanner.next();

            }
            input = scanner.nextInt();
        }

        return input;
    }

    static int findElement(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        return findElement(index - 1) + findElement(index - 2);
    }


}
