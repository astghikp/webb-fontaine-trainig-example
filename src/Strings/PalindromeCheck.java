package Strings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        //check if the word is palindrome
        palindromeWord(stringInputted);

    }

    static void palindromeWord(String string)
    {
        boolean isPalindrome = false;
        for (int i=0; i<string.length()/2; i++)
        {
            isPalindrome = string.charAt(i) == string.charAt(string.length() - 1 - i);
        }
         if(isPalindrome)
             System.out.println(" Your word is palindrome" );
         else System.out.println("Your word is not palindrome");
    }
}
