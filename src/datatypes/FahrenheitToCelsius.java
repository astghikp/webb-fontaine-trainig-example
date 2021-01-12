package datatypes;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fahrenheit degrees = ");

        if (scanner.hasNextFloat())
        {
            float FDegrees = scanner.nextFloat();
            float CDegrees = (FDegrees - 32) * 5/9;
            System.out.println(CDegrees);
        }
        else System.out.println("Please enter valid number");


    }
}
