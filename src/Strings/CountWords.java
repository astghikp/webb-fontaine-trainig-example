package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);

        // Find words in text
      //  int count = countTheWords(stringInputted);
          int count = countWordsBySplit(stringInputted);

        System.out.println("count = " + count);

    }
    static int countTheWords (String string)
    {
        char space= ' ';
        int counter = 1;
        for (int i=1; i< string.length(); i++)
        {
            if(string.charAt(i) == space)
               counter ++;
        }
        return  counter;
    }

    static  int countWordsBySplit (String string)  //after Google
    {
        String[] words = string.split("\\s+");
        return words.length;
    }

}
