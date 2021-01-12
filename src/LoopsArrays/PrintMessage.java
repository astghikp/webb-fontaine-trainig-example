package LoopsArrays;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class PrintMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.println("Input Number for message to be printed");
        if (scanner.hasNextInt()) {
            int count = scanner.nextInt();
            while (count != -1) {
                if (count > 0) {
                    out.println("Input Message to be printed");
                    String message = scanner.next();
                    for (int i = 0; i < count; i++) {
                        out.println(message + (i + 1) + "\n");

                    }
                    out.println("Input Number for message to be printed");

                } else {
                    out.println("Number must be > 0");

                }
                if (scanner.hasNextInt())
                    count = scanner.nextInt();
                else {
                    out.println("Enter valid number and text");
                }


            }

        } else out.println("Enter valid number and text");
    }
}
