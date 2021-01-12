package datatypes;

import java.util.Scanner;

public class FloatNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number = ");


        if (scanner.hasNextFloat())
        {
            float numberInputted = scanner.nextFloat();
            if (numberInputted == 0) {
                System.out.println("Zero");
            }
            else if (numberInputted < 0)
            {
                System.out.println("Negative");
            }
              else if (numberInputted > 1000000 )
              {
                System.out.println("large");
              }
              else if (numberInputted < 1)
            {
                System.out.println("small");
            }
              else  System.out.println("positive");
        }
        else System.out.println("Please enter correct Number");

    }
}
