package datatypes;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {


                Scanner firstNumber = new Scanner(System.in);
                Scanner secondNumber = new Scanner(System.in);
                Scanner thirdNumber = new Scanner(System.in);
                System.out.println("Input three numbers = ");
                float  biggestNumber, greatestNumber;

                if (firstNumber.hasNextFloat() && secondNumber.hasNextFloat() && thirdNumber.hasNextFloat())
                {
                    float number1 = firstNumber.nextFloat();
                    float number2 = secondNumber.nextFloat();
                    float number3 = thirdNumber.nextFloat();
                    if (number1 >= number2)
                    {
                        biggestNumber = number1;

                    }
                    else biggestNumber = number2;
                    if (biggestNumber >= number3)
                    {
                        greatestNumber = biggestNumber;

                    }
                    else
                        greatestNumber = number3;
                        System.out.println("The greatest number:"+ greatestNumber);

                }
                else System.out.println("Please enter correct numbers");

            }


}
