package Strings;

import org.testng.annotations.Test;

import java.util.Scanner;

public class StringStarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        //Input text for Search
        String searchText = StringUtils.stringInput(scanner);
        if (stringInputted.startsWith(searchText))
            System.out.println(stringInputted + " starts with "+ searchText);
        else System.out.println(stringInputted + " doesn't start with " + searchText);
    }


}


