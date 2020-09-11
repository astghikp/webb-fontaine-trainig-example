package datatypes;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number = ");

        if (scanner.hasNextInt()) {
            int numberInputted = scanner.nextInt();
            if (numberInputted > 0 && numberInputted < 8) {
                switch (numberInputted) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }

            } else System.out.println("Not weekday number is entered");
        } else System.out.println("Please enter valid number");
    }
}
