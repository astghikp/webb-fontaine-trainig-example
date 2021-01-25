package Strings;

import java.util.Scanner;

public  class StringUtils {

    public static String stringInput (Scanner scanner)
    {
        System.out.println("Please enter Text: ");
        StringBuilder stringInputted = new StringBuilder(scanner.next());
        stringInputted.append(scanner.nextLine());
        return stringInputted.toString();
    }



}
