package LoopsArrays;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CountElement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);
        out.println("Input length of Array");
        int length = 0;

        if (scanner.hasNextInt()) {
            length = scanner.nextInt();
        } else System.out.println("Please enter valid number");
        int [] myArray = new int[length];
        for (int i = 0; i < myArray.length; i++) {
            out.println("Enter " + (i + 1) + " number:");
            int arrayNumber = scanner.nextInt();
            myArray[i]= arrayNumber;
        }
        out.println("Input number");
        if (scanner.hasNextInt()) {
            int k = scanner.nextInt();
           for(int i=0; i<myArray.length; i++)
           {
               int counter =0;
               for(int j=i+1; j<myArray.length; j++)
               {
                   if (myArray[i]== myArray[j])
                       counter ++;
                   if (counter >k -1)
                       break;

               }
               if (counter == k -1 )
               {
                   out.println("The element is:" + myArray[i]);
                   break;
               }
           }


        } else out.println("Enter valid number");


    }
}
