package datatypes;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number = ");


        if (scanner.hasNextInt()) {
            int numberInputted = scanner.nextInt();
            if (numberInputted > 0) {
                int multipliedNumber;
                for (int i = 1; i <= 9; i++) {
                    multipliedNumber = numberInputted * i;
                    System.out.println(numberInputted + "*" + i + "=" + multipliedNumber);
                }

            } else System.out.println("Number is not positive");
        } else System.out.println("Please enter correct Number");

    }
}
