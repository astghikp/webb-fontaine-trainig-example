package datatypes;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number = ");


        if (scanner.hasNextInt())
        {
            int numberInputted = scanner.nextInt();
            if (numberInputted % 2 == 0) {
                System.out.println("Number is Even");
            }
            else System.out.println("Number is Odd");
        }
        else System.out.println("Please enter correct Number");

        System.out.println("Bye!");
    }
}
