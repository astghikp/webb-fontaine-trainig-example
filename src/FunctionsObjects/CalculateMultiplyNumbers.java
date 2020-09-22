package FunctionsObjects;

import java.util.Scanner;

public class CalculateMultiplyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input n
        int number = getCorrectInput(scanner);
        //Multiply till n and return Final count
        int finalCount = multiplyTillN(number);
        System.out.println("finalCount is = " + finalCount);

    }


    static int getCorrectInput(Scanner scanner) {   // I was thinking to make a separate class for inputs etc but for this time I left it this way
        System.out.println("Please enter positive Number for N");
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

    static int multiplyTillN(int number) {
        if (number == 1)
            return 1;
        else
            return (number * multiplyTillN(number - 1));
    }
}