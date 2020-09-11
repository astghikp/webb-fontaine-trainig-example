package datatypes;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {


        Scanner firstNumber = new Scanner(System.in);
        Scanner secondNumber = new Scanner(System.in);
        Scanner thirdNumber = new Scanner(System.in);
        System.out.println("Input three numbers = ");
        float biggestNumber, greatestNumber;

        if (firstNumber.hasNextFloat() && secondNumber.hasNextFloat() && thirdNumber.hasNextFloat()) {
            float number1 = firstNumber.nextFloat();
            float number2 = secondNumber.nextFloat();
            float number3 = thirdNumber.nextFloat();


            if (number1 > number2 && number1 > number3) {

                System.out.println("biggest number is: " + number1);

            } else {

                System.out.println("biggest number is: " + Math.max(number2, number3));
            }

        } else System.out.println("Please enter correct numbers");

    }


}
