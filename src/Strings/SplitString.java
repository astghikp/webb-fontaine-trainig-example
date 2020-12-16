package Strings;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        //get index
        int index = getPositiveInput(scanner);
        //Check if index is bigger than text length
        StringBuilder stringSplit;
        while (index >stringInputted.length()) {
            System.out.println("Size is bigger than text length ");
            index = getPositiveInput(scanner);
        }


            stringSplit = splitStrings(stringInputted,index);
            System.out.println(" Split string:\n" + stringSplit);



    }

    static int getPositiveInput(Scanner scanner) {
        System.out.println("Please enter positive Number for Splitting size");
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

    static StringBuilder splitStrings(String string, int index) {
        StringBuilder splitString = new StringBuilder();

        for (int i = 0; i < string.length(); i += index) {
            // I found this great way in Google :) Es math operatorner@ achqis lav ban en))
            splitString.append(string, i, Math.min(string.length(), i + index)).append("\n");

        }
        return splitString;
    }
}
