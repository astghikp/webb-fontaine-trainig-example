package Strings;

import java.util.Scanner;

public class StringEnds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        //Input text for Search
        String searchText = StringUtils.stringInput(scanner);
        if (stringInputted.endsWith(searchText)) {
            System.out.println(stringInputted + " ends with "+ searchText);
        } else System.out.println(stringInputted + " doesn't end with " + searchText);
    }
}
