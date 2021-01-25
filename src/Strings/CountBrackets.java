package Strings;

import org.testng.annotations.Test;

import java.util.Scanner;

public class CountBrackets {
    @Test
    public void TestCountBrackets()
    {


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String stringInputted = StringUtils.stringInput(scanner);
        //Count brackets
        int openB = 0, closeB=0;
        for (int i=0; i<stringInputted.length(); i++)  // switchov karam anem? mi 2 dzev pordzeci chexav
        {
            if (stringInputted.charAt(i) == '(')
                openB++;
            else if (stringInputted.charAt(i) == ')')
                closeB++;
        }
        if(openB==closeB)
        System.out.println("Balanced");
        else System.out.println("Invalid");
    }
}
