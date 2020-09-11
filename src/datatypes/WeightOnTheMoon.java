package datatypes;

import java.util.Scanner;

public class WeightOnTheMoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three numbers = ");


        if (scanner.hasNextFloat()) {

            float earthWeight = scanner.nextFloat();
            if (earthWeight > 0 && earthWeight <= 250) {
                float moonWeight = (float) (earthWeight * 0.17);
                System.out.println(moonWeight);
            } else System.out.println("Please get weight between 0 and 250 for flying to the moon");
        } else System.out.println("Please enter your correct weight");

    }
}
