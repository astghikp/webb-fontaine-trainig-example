package datatypes;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Input Number1");
        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Input operation (+ - / *)");
        Scanner operation = new Scanner(System.in);
        System.out.println ("Input Number 2");
        Scanner secondNumber = new Scanner(System.in);


        if (firstNumber.hasNextDouble() && operation.hasNext() && secondNumber.hasNextDouble()) {


            double number1 = firstNumber.nextDouble();

            String mathOperation = operation.next();

            double number2 = secondNumber.nextDouble();

            double result;
            switch (mathOperation) {
                case "+": {

                    result = number2 + number1;
                    System.out.println("Result =" + result);
                }
                break;
                case "-": {

                    result = number1 - number2;
                    System.out.println("Result =" + result);
                }
                break;
                case "*": {

                    result = number2 * number1;
                    System.out.println("Result =" + result);
                }
                break;
                case "/": {

                    result = number1 / number2;
                    System.out.println("Result =" + result);
                }
                break;
                default:System.out.println("Inputted operator is not correct");

            }
        }
        else System.out.println("Your inputted number in not correct");
    }
}
