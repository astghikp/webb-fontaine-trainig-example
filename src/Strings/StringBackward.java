package Strings;

import java.util.Scanner;

public class StringBackward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        // Get string backward
        String backString = stringBack(stringInputted);
        System.out.println("String backward = " + backString);
    }
    static String stringBack(String string)
    {
        if (string.isEmpty())
            return string;
        return stringBack(string.substring(1)) + string.charAt(0);
    }
}
