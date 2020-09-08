package datatypes;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inches value = ");

        if (scanner.hasNextDouble())
        {
            double inches = scanner.nextDouble();
            if ( inches > 0) {
                double meters = inches * (0.0254);
                System.out.println(meters);
            }
            else  System.out.println("You're entered negative number");
        }
        else System.out.println("Please enter valid and positive number");
    }
}
