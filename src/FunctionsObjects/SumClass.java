package FunctionsObjects;

public class SumClass {
    public static void main(String[] args) {
        int sumOfArguments = sum(45, 89, -6);
        double sumOfDoubleArguments = sum(5.3, 4.3, 1.2);
        int sumOfVarArgs = sum(45, 86, 23, 45, 12, 45);

        System.out.println("sumOfArguments = " + sumOfArguments);
        System.out.println("sumOfDoubleArguments = " + sumOfDoubleArguments);
        System.out.println("sumOfVarArgs = " + sumOfVarArgs);

    }


    static int sum(int fistNumber, int secondNumber, int thirdNumber) {
        return (fistNumber + secondNumber + thirdNumber);
    }

    static double sum(double fistNumber, double secondNumber, double thirdNumber) {
        return (fistNumber + secondNumber + thirdNumber);
    }

    static int sum(int... numbers) {
        int count = 0;
        for (int element : numbers) {
            count += element;
        }
        return count;

    }

}
