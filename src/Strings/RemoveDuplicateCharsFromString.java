
package Strings;

import java.util.Scanner;

public class RemoveDuplicateCharsFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        //remove duplicates
        String withoutDuplicates = removeDuplicate(stringInputted);
        System.out.println("withoutDuplicates = " + withoutDuplicates);
    }
    public static String removeDuplicate(String string)
    {

        StringBuilder newString = new StringBuilder();
        for(int i=0; i< string.length(); i++)
        {
            if(!newString.toString().contains(String.valueOf(string.charAt(i))))
            {
                newString.append(string.charAt(i));
            }

            
        }
        return newString.toString();
    }
}
