package Strings;

import org.testng.annotations.Test;

import java.util.Scanner;

public class FindByIndex {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        //get index
        int index = getPositiveInput(scanner);
        if(index <= stringInputted.length()-1) {
            System.out.println("The character in " + index + " place is: " + stringInputted.charAt(index-1));
        }
        else
            System.out.println(" Your index is bigger than string length" );


    }


  static int getPositiveInput(Scanner scanner) {
        System.out.println("Please enter positive Number for character");
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
}
