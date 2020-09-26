package FunctionsObjects;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fistSide = getCorrectInput(scanner);
        double secondSide = getCorrectInput(scanner);
        double thirdSide = getCorrectInput(scanner);
        //Check Triangle to be correct
        while (!checkTriangleSides(fistSide, secondSide, thirdSide)) {
            fistSide = getCorrectInput(scanner);
            secondSide = getCorrectInput(scanner);
            thirdSide = getCorrectInput(scanner);

        }
        //Calculate Triangle Area
        double triangleAreaValue = triangleAreaCounter(fistSide, secondSide, thirdSide);
        System.out.println("triangle Area Value is = " + triangleAreaValue);


    }

    static double getCorrectInput(Scanner scanner) {
        System.out.println("Please enter positive Number for Triangle side");
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter positive number");
            scanner.next();
        }
        double input = scanner.nextDouble();
        while (input <= 0) {
            System.out.println("Please enter positive  number");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter positive number");
                scanner.next();

            }
            input = scanner.nextDouble();
        }

        return input;
    }

    static boolean checkTriangleSides(double firstSide, double secondSide, double thirdSide) {
        boolean isTriangle;
        if ((firstSide + secondSide) > thirdSide && (firstSide + thirdSide) > secondSide && (secondSide + thirdSide) > firstSide)
            isTriangle = true;
        else {
            System.out.println(" That's not a Triangle please try again :)");
            isTriangle = false;
        }
        return isTriangle;
    }

    static double triangleAreaCounter(double firstSide, double secondSide, double thirdSide) {
        double p = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }
}
