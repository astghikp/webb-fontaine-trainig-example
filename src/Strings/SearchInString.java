package Strings;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        //Input text for Search
        String searchText = StringUtils.stringInput(scanner);
        if(stringInputted.contains(searchText)) {
            System.out.println("Text contains "+ searchText);
        } else System.out.println(" Text is not contains " + searchText);
    }
}
